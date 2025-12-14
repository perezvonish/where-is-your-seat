package perezvonish.whereisyourseat.domain.floor;

import perezvonish.whereisyourseat.domain.building.Building;

import javax.annotation.Nullable;
import java.util.UUID;

public class Floor {
    private final UUID id;
    @Nullable() public Building building;

    public UUID getId() {
        return this.id;
    }

    public Floor(UUID id,  @Nullable Building building) {
        this.id = (id != null) ? id : UUID.randomUUID();
        this.building = building;
    }

    public Building getBuilding() {
        return this.building;
    }
}
