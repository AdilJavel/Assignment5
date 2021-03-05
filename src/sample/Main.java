package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {
        //1Task
        Animal monkey = new Animal() {
            @Override
            public void MakeSound() {
                System.out.println("Oof");
            }
        };
        monkey.Scream("OOP is Life");

        //2Task
        try {
            Car car1 = Car.class.newInstance();
            Car car = car1.getClass().newInstance();
            Field name = car.getClass().getDeclaredField("name");
            Field year = car.getClass().getDeclaredField("year");
            name.setAccessible(true);
            year.setAccessible(true);
            name.set(car, "Lamborghini Aventador");
            year.set(car, 2011);
            car.carInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
