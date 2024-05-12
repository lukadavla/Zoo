package ge.sdsu.davla;

import java.util.*;
public class RegularVisitor implements Visitor {
    private int visitorId;
    private String name;
    private String membershipType;

    private ArrayList<String> favouriteAnimals;

    public RegularVisitor(int visitorId, String name, String membershipType, ArrayList<String> favouriteAnimals) {
        this.visitorId = visitorId;
        this.name = name;
        this.membershipType = membershipType;
        this.favouriteAnimals = favouriteAnimals;
    }

    public RegularVisitor() {
        visitorId = 0;
        name = "noname";
        membershipType = "noMembershipType";
        favouriteAnimals = new ArrayList<>();

    }


    public int getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(int visitorId) {
        this.visitorId = visitorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public ArrayList<String> getFavouriteAnimals() {
        return favouriteAnimals;
    }

    public void setFavouriteAnimals(ArrayList<String> favouriteAnimals) {
        this.favouriteAnimals = favouriteAnimals;
    }

    @Override
    public void buyTicket() {
        System.out.println(name + " has bought a ticket.");
    }

    @Override
    public void visitEnclosure(Enclosure enclosure) {
        System.out.println(name + " visited " + enclosure.getEnclosureName());
    }

    @Override
    public void viewFavoriteAnimals() {
        System.out.println("Favorite animals of " + name + ":");
        for (String animal : favouriteAnimals) {
            System.out.println(animal.toString());
        }
    }

    public void addFavoriteAnimal(Animal animal) {
        favouriteAnimals.add(String.valueOf(animal));
    }

    @Override
    public String toString() {
        return "RegularVisitor{" +
                "visitorId=" + visitorId +
                ", name='" + name + '\'' +
                ", membershipType='" + membershipType + '\'' +
                ", favouriteAnimals=" + favouriteAnimals +
                '}';
    }


}




