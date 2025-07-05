package system;

public  class Product   {
    public String name;
    private double price;
    public int quantity;
   public boolean shipping;
    public double weight;
    public Product(String name, float price, int quantity,boolean shipping,double weight) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.shipping=shipping;
        this.weight=weight;

    }

    public double getPrice() {
        return price;
    }

}
