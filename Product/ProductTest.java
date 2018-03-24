/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

import static Product.Inventory.addProduct;
import static Product.Inventory.getProduct;
import static Product.Inventory.printInventory;
import static Product.Inventory.removeProductAtCode;

public class ProductTest {

    public static void main(String[] args) {
        Book b = new Book("1A4B", "a weird book", 19.95, "Weirdness in Action", "Pete Jones");
        Book c = new Book("2B!2B", "another book", 21.95, "The Nature of Devils", "Joan Crawford");
        Folder folder = new Folder("444A", "A blue folder", 2.99, "Royal", "China");
        
        addProduct(b);
        addProduct(c);
        addProduct(folder);
        printInventory();
        
        Product p = getProduct("1A4B");
        System.out.println("I'm going to buy: " + p.getCode());
        removeProductAtCode("1A4B");
        
        System.out.println("I'm going to buy: " + folder.getCode());
        removeProductAtCode("444A");
        System.out.println("");
        printInventory();
    }
}
