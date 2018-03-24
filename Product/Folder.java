/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

public class Folder extends Product {
    private String brand;
    private String origin;
    
    public Folder(String code, String description, double price, String brand, String origin) {
        super.setCode(code);
        super.setDescription(description);
        super.setPrice(price);
        this.setBrand(brand);
        this.setOrigin(origin);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Brand: " + this.getBrand());
        System.out.println("Origin: " + this.getOrigin());
    }
    
    public String getBrand() {
        return brand;
    }

    public final void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOrigin() {
        return origin;
    }

    public final void setOrigin(String origin) {
        this.origin = origin;
    }
}