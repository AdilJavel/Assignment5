package sample;

public class Car {
    private String name;
    private int year;
    public void CarSound() {
        System.out.println("Wroom, Wroom");
    }
    public void carInfo() {
        System.out.println("Car named " + name + " been created in " + year);
    }
}
