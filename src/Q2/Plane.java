package Q2;

public class Plane implements Transportation {
    private int price = 1000;

    public int getPrice(){
        return this.price;
    }

    public String getName(){
        return "Plane";
    }
}
