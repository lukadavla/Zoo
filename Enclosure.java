package ge.sdsu.davla;

import ge.sdsu.davla.Animal;

import java.util.*;

public class Enclosure {
    private int enclosureId;
    private String enclosureName;

    private int capacity;
    private ArrayList<Animal> animals;

    public Enclosure(){
        enclosureId = 0;
        enclosureName = "nothing";
        capacity = 0;
        animals = new ArrayList<>();

    }

    public Enclosure(int enclosureId, String enclosureName, int capacity, ArrayList<Animal> animals) {
        this.enclosureId = enclosureId;
        this.enclosureName = enclosureName;
        this.capacity = capacity;
        this.animals = animals;
    }

    public int getEnclosureId() {
        return enclosureId;
    }

    public void setEnclosureId(int enclosureId) {
        this.enclosureId = enclosureId;
    }

    public String getEnclosureName() {
        return enclosureName;
    }

    public void setEnclosureName(String enclosureName) {
        this.enclosureName = enclosureName;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

}
