package perezvonish.whereisyourseat.domain.building;

import perezvonish.whereisyourseat.domain.floor.Floor;

import java.util.ArrayList;
import java.util.UUID;

public class Building {
    private final UUID id;
    public String title;
    public String address;
    public ArrayList<Floor> floors;


    public Building(UUID id, String title) {
        this.id = (id != null) ? id : UUID.randomUUID();
        this.title = title;
    }

    public UUID getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAddress() {
        return this.address;
    }

    public ArrayList<Floor> getFloors() {
        return this.floors;
    }
}

