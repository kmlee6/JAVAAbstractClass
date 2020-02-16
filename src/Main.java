import Q1.*;
import Q2.*;

public class Main {
    static int q1_budget = 100;
    static int q1_target = 100;

    static int q2_budget = 500;

    public static void main(String[] args){

        System.out.println("<<Question 1>>");
        Cock cock = new Cock();
        Hen hen = new Hen();
        Chicken chicken = new Chicken();

        int cock_price = cock.getPrice();
        int hen_price = hen.getPrice();
        int chicken_price = chicken.getPrice();

        for(int i=0; i<=100; i++){
            for(int j=0; j<=100; j++){
                for(int k=0; k<=100; k++){
                    if(cock_price*i+hen_price*j+chicken_price*k==q1_budget && i+j+k==q1_target){
                        System.out.println(String.format("Cock: %d, Hen: %d, Chicken: %d", i, j, k));
                    }
                }
            }
        }

        System.out.println("<<Question 2>>");
        Car car = new Car();
        Bus bus = new Bus();
        Train train = new Train();
        Plane plane = new Plane();

        String chosen = ".... no cannot go back...";

        if(car.getPrice()<=q2_budget){
            chosen = car.getName();
        }
        else if(bus.getPrice()<=q2_budget){
            chosen = bus.getName();
        }
        else if(train.getPrice()<=q2_budget){
            chosen = train.getName();
        }
        else if(plane.getPrice()<=q2_budget){
            chosen = plane.getName();
        }

        System.out.println("Can back Beijing by "+chosen);
    }
}
