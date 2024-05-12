package ge.sdsu.davla;

import ge.sdsu.davla.Enclosure;

public interface Visitor {
    public void buyTicket();
    public void visitEnclosure(Enclosure enclosure);
    public void viewFavoriteAnimals();
}
