package e.david.weasleyclock.models;

import java.util.ArrayList;
import java.util.List;

public class Family {

    private String familyName;
    private List<User> familyMembers = new ArrayList<User>();

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public List<User> getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(List<User> familyMembers) {
        this.familyMembers = familyMembers;
    }

    static void addMember (User user, Family family){
        family.getFamilyMembers().add(user);
    }


}
