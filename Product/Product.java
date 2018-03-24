/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

public class Product implements IPrintable {
    private String code;
    private String description;
    private double price;

    @Override
    public void print() {
        System.out.println("Code: " + this.getCode());
        System.out.println("Description: " + this.getDescription());
        System.out.println("Price: " + this.getPrice());
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
