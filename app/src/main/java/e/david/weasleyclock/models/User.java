package e.david.weasleyclock.models;

public class User {

    private String username;
    private String password;
    private OurLocation displayedOurLocation;
    private OurLocation workOurLocation;
    private OurLocation homeOurLocation;
    private String otherLocation;
    private String family;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public OurLocation getWorkOurLocation() {
        return workOurLocation;
    }

    public void setWorkOurLocation(OurLocation workOurLocation) {
        this.workOurLocation = workOurLocation;
    }

    public OurLocation getHomeOurLocation() {
        return homeOurLocation;
    }

    public void setHomeOurLocation(OurLocation homeOurLocation) {
        this.homeOurLocation = homeOurLocation;
    }

    public String getOtherLocation() {
        return otherLocation;
    }

    public void setOtherLocation(String otherLocation) {
        this.otherLocation = otherLocation;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public OurLocation getDisplayedOurLocation() {
        return displayedOurLocation;
    }

    public void setDisplayedOurLocation(OurLocation displayedOurLocation) {
        this.displayedOurLocation = displayedOurLocation;
    }

    public User(String username, String password, OurLocation displayedOurLocation, OurLocation workOurLocation, OurLocation homeOurLocation, String otherLocation, String family) {
        this.username = username;
        this.password = password;
        this.displayedOurLocation = displayedOurLocation;
        this.workOurLocation = workOurLocation;
        this.homeOurLocation = homeOurLocation;
        this.otherLocation = otherLocation;
        this.family = family;
    }

    @Override
    public String toString() {
        return "{" +
                "username:'" + username + '\'' +
                ", password:'" + password + '\'' +
                ", displayedLocation:" + displayedOurLocation.getLocationName() +
                ", workLocation:" + workOurLocation.getLocationName() +
                ", homeLocation:" + homeOurLocation.getLocationName() +
                ", otherLocation:'" + otherLocation + '\'' +
                ", family:'" + family + '\'' +
                '}';
    }
}
