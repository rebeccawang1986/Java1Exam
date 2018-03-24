/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

import java.util.ArrayList;
public class Inventory {
    private static final ArrayList<Product> productList = new ArrayList<Product>();
    
    public static void addProduct(Product p) {
        productList.add(p);
    }
    
    public static void removeProductAtCode(String code) {
       for(int i=0; i<productList.size(); i++)
       {
           Product p = productList.get(i);
           if((p.getCode()).equals(code))
               productList.remove(i);
       }
    }
    
    public static Product getProduct(String code) {
       Product p = null ;
       for(int i=0; i<productList.size(); i++)
       {
           p = productList.get(i);
           if((p.getCode()).equals(code))
               return p;
       }
       System.out.println("Can't find the product with Code: " + code);
       return p;
    }
    
    public static void printInventory() {
        System.out.println("Current Inventory");
        System.out.println("-----------------");
        productList.forEach((p) -> {
            p.print();
            System.out.println("");
        }); 
    }
}
