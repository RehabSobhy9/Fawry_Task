import  system.*;
import service.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Controller controller=new Controller();
        ShippingService shippingService=new ShippingService();

        LocalDate d=LocalDate.now();
        ExpirableProduct p1=new ExpirableProduct("Cheese",20,2,true,50,d,5);
        Product p2=new Product("Tv",200,1,true,900);
        Product p3=new Product("Mobile card",500,2,false,10);
        controller.addNewProduct(p1);
        controller.addNewProduct(p2);
        controller.addNewProduct(p3);
        Customer customer1=new Customer("Customer1",1000);
        Cart cart=new Cart();

           controller.ProductValidate("Cheese",3);
            cart.add("Mobile card",2);



    }
}