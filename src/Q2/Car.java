package Q2;

public class Car implements Transportation {
    private int price = 500;

    public int getPrice(){
        return this.price;
    }

    public String getName(){
        return "Car";
    }
}
