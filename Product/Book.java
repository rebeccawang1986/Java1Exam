/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;
    
public class Book extends Product {
    private String author;
    private String title;
    
    public Book(String code, String description, double price, String title, String author) {
        super.setCode(code);
        super.setDescription(description);
        super.setPrice(price);
        this.setAuthor(author);
        this.setTitle(title);
    }
    
    @Override
    public void print() {
        super.print();
        System.out.println("Title: " + this.getTitle());
        System.out.println("Author: " + this.getAuthor());
    }

    public String getAuthor() {
        return author;
    }

    public final void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public final void setTitle(String title) {
        this.title = title;
    }
    
    
}
