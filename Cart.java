package system;
import  java.util.*;
public class Cart {
  public ArrayList<Item>Items=new ArrayList<>();
    public void add(String name,int quantity){
        Item item =new Item(name,quantity);
        boolean found=false;
        for(Item i :Items)
        {
          if(i.name.equals(name)) {
            i.quantity += quantity;
            found=true;
          }

        }if(!found)
        Items.add(item);


    }

    public boolean validate()
    {
      return (Items.isEmpty());
    }
}
