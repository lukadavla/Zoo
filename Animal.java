package ge.sdsu.davla;

public class Animal {
    private String species;
    private int age;
    private String gender;
    private String healthStatus;

    public Animal(String species, int age, String gender, String healthStatus) {
        this.species = species;
        this.age = age;
        this.gender = gender;
        this.healthStatus = healthStatus;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }
}
