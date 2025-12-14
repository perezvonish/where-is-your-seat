package perezvonish.whereisyourseat.domain.color;

import java.util.UUID;

public class Color {
    private final UUID id;

    public Integer red;
    public Integer green;
    public Integer blue;

    Color(UUID id, Integer red, Integer green, Integer blue) {
        this.id = id;
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
}
