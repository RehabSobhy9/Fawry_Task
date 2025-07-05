package system;
import  java.time.LocalDate;
public class ExpirableProduct extends Product{
    public LocalDate productionDate;
    public int  expirationDuration;


    public ExpirableProduct(String name, float price, int quantity,boolean shipping,double weight,LocalDate productionDate,int expirationDuration) {
        super(name, price, quantity,shipping,weight);
        this.productionDate=productionDate;
        this.expirationDuration=expirationDuration;
    }
}
