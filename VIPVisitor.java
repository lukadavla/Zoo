package ge.sdsu.davla;

public class VIPVisitor implements Visitor {
    private int vipId;
    private String name;
    private int specialAccesslevel;

    public VIPVisitor(){
        vipId = 0;
        name = "nothing";
        specialAccesslevel = 0;
    }

    public VIPVisitor(int vipId, String name, int specialAccesslevel) {
        this.vipId = vipId;
        this.name = name;
        this.specialAccesslevel = specialAccesslevel;
    }

    public int getVipId() {
        return vipId;
    }

    public void setVipId(int vipId) {
        this.vipId = vipId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpecialAccesslevel() {
        return specialAccesslevel;
    }

    public void setSpecialAccesslevel(int specialAccesslevel) {
        this.specialAccesslevel = specialAccesslevel;
    }

    @Override
    public void buyTicket() {
        System.out.println(name + " has nought a ticket.");
    }

    @Override
    public void visitEnclosure(Enclosure enclosure) {
        System.out.println(name + " visited " + enclosure.getEnclosureName());

    }

    @Override
    public void viewFavoriteAnimals() {

    }
}
