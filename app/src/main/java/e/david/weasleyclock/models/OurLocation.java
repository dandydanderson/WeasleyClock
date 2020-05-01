package e.david.weasleyclock.models;

public class OurLocation {

    private String locationName;
    private String gmapsLocation;

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getGmapsLocation() {
        return gmapsLocation;
    }

    public void setGmapsLocation(String gmapsLocation) {
        this.gmapsLocation = gmapsLocation;
    }

    public OurLocation(String locationName) {
        this.locationName = locationName;
    }
}
