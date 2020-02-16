package Q2;

public class Train implements Transportation {
    private int price = 400;

    public int getPrice(){
        return this.price;
    }

    public String getName(){
        return "Train";
    }
}
