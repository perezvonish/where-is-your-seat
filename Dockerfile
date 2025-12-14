# === Build stage ==============================================================
FROM eclipse-temurin:25-jdk AS build

WORKDIR /app

# Кешируем wrapper и зависимости
COPY gradlew gradlew
COPY gradle gradle
COPY build.gradle settings.gradle ./

# Правы на gradlew (Windows любит их отбрасывать)
RUN chmod +x gradlew

# Прогреваем зависимости (если есть, подтянутся из gradle cache слоя)
RUN ./gradlew --no-daemon build -x test || true

# Копируем исходники и собираем
COPY src src
RUN ./gradlew --no-daemon clean bootJar -x test

# === Runtime stage ============================================================
# Можно было бы взять jre-образ, но чтобы не упасть на редких тегах — используем jdk.
FROM eclipse-temurin:25-jdk

WORKDIR /app

# Переменные окружения по умолчанию (можешь переопределять через compose/.env)
ENV SERVER_PORT=8080 \
    SPRING_PROFILES_ACTIVE=local

# Копируем fat-jar
ARG JAR_FILE=build/libs
COPY --from=build /app/${JAR_FILE}/*.jar app.jar

EXPOSE 8080

# Запуск
ENTRYPOINT ["java","-jar","/app/app.jar"]
