package e.david.weasleyclock.models;

public class User {

    private String username;
    private String password;
    private Location displayedLocation;
    private Location workLocation;
    private Location homeLocation;
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

    public Location getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(Location workLocation) {
        this.workLocation = workLocation;
    }

    public Location getHomeLocation() {
        return homeLocation;
    }

    public void setHomeLocation(Location homeLocation) {
        this.homeLocation = homeLocation;
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

    public Location getDisplayedLocation() {
        return displayedLocation;
    }

    public void setDisplayedLocation(Location displayedLocation) {
        this.displayedLocation = displayedLocation;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", displayedLocation='" + displayedLocation + '\'' +
                '}';
    }


}
