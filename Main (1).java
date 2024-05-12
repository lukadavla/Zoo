package ge.sdsu.davla;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Animal lion = new Animal("lion" , 27 , "male" , "okay");
        Animal sheep = new Animal("sheep" , 12 , "female" , "not okay");
        ArrayList<Animal> regular = new ArrayList<>();
        ArrayList<Animal> vip = new ArrayList<>();
        regular.add(lion);
        vip.add(sheep);
        ArrayList<String> favouriteAnimals = new ArrayList<>();
        RegularVisitor nika  = new RegularVisitor(21 , "nika" , "regural" , favouriteAnimals);


    }
}
