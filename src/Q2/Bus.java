package Q2;

public class Bus implements Transportation {
    private int price = 300;

    public int getPrice(){
        return this.price;
    }

    public String getName(){
        return "Bus";
    }
}
