package service;

import system.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Controller  {
    ArrayList<Product> allProducts=new ArrayList<>();
    ShippingService shippingService=new ShippingService();
    boolean shipping=false;
    int shippingCost;
    double total =0;
    public void addNewProduct(Product product)
    {  boolean found=false;
          for(Product i:allProducts){
              if(i.name.equals(product.name))
              { i.quantity+=product.quantity;
                  found=true;
              }

          }
          if(!found)allProducts.add(product);

    }

     public void ProductValidate (String Name,int quantity)
     {
         boolean found=false;

         for( Product i:allProducts)
         {
             if(i.name.equals(Name)&&i.quantity>=quantity) {
                 found = true;
                 i.quantity -= quantity;

                 if (i instanceof ExpirableProduct) {
                     ExpirableProduct p = (ExpirableProduct) i;
                     if (p.productionDate.plusDays(p.expirationDuration).isBefore(LocalDate.now()))
                         found = false;
                 }
             }
             if(found) {
//      System.out.println(Name+"  "+i.name+"   price  "+i.weight+" "+"quant"+quantity);
                 total += (i.getPrice() * quantity);
                 if(i.shipping) {

                     shippingService.addNew(new ShippedItems(i.name, i.weight * quantity, quantity));
                shipping=true;
                 }
                 break;
             }

         }
           if(!found)
               throw new RuntimeException("Item Not found");




     }
    public void checkout (Customer customer, Cart cart)
    {

       if(cart.validate())
       {
           throw new RuntimeException("Cart is Empty ");
       }
       if(customer.getBalance()<total)
       {
           throw new RuntimeException("Balance is insufficient");
       }

       shippingService.ShipmentNotes();
       System.out.println("***********Checkout Receipt**********");
        for (Item i:cart.Items)
        {   //System.out.println(i.name);
            for(Product p:allProducts)
            {
                if(i.name.equals(p.name))
                   System.out.println(i.quantity+"    "+i.name+"   "+p.getPrice()*i.quantity);
            }
        }


        if(shipping)shippingCost=30;
        else
            shippingCost=0;
        System.out.println("-------------------------");
        System.out.println("subtotal    "+total);
        total+=shippingCost;
        System.out.println("Shipment    "+shippingCost);
        System.out.println("Total   "+total);
    }
}
