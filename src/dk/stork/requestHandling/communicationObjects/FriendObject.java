package dk.stork.requestHandling.communicationObjects;

import java.io.Serializable;

/**
 * @author morten, johannes
 */
public class FriendObject implements Serializable {
    private int id;
    private String name;
    private Location location;

    public FriendObject(int id, String name, Location location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
