package system;

public class ShippedItems  implements GetInformation {
  private double weight;
  private String name;
  public  int quantity;

    public ShippedItems(String name,double weight,int quantity)
    {
        this.name=name;
        this.weight=weight;
        this.quantity=quantity;

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }
}
