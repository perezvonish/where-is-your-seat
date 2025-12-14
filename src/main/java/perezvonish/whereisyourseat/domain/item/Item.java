package perezvonish.whereisyourseat.domain.item;

import java.util.UUID;

public class Item {
    private final UUID id;

    public ItemType type;

    Item(UUID id,  ItemType type) {
        this.id = (id != null) ? id : UUID.randomUUID();
        this.type = type;
    }
}
