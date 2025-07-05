package service;

import system.Product;
import system.ShippedItems;

import java.util.ArrayList;

public class ShippingService {
    ArrayList<ShippedItems> shippedProducts=new ArrayList<>();
    private double totalWeight=0;
    public void addNew(ShippedItems item)
    {
        shippedProducts.add(item);
    }
   public void ShipmentNotes()
   {     System.out.println("**********Shipment Notes******");
       if(shippedProducts.isEmpty())
           System.out.println("No Shipped Products");
  else
       for(ShippedItems i:shippedProducts)
       {
           System.out.println(i.quantity+"x "+i.getName()+"    "+i.getWeight()+"g");
           totalWeight+=i.getWeight()*i.quantity;
       }
       System.out.println("Total package weight "+totalWeight+"g");
   }



}
