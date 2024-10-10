package Ejercicio.ShoppingCart.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShoppingCar {
    protected List<Product> products;
    protected double discount;
    protected double sendPackage;


    public ShoppingCar() {
        this.products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public double totalCost() {
        double total = 0;
        for (Product product : this.products) {
            total += product.getPrice();
        }

        total = total - ((this.discount)*total)/100;
        total += this.sendPackage;

        return total;
    }

    public void applyDiscount() {
        Random rand = new Random();
        int num = rand.nextInt(5) + 1;

        if (num == 1) {
            System.out.println("Descuento obtenido");
            this.discount = 35;
        }
    }

    public void applySendPackage() {
        Random rand = new Random();
        int num = rand.nextInt(5) + 1;
        if (num == 1) {
            System.out.println("Envio gratis obtenido");
            this.sendPackage = 0;
        }
        else {
            System.out.println("Costo del envio: 20" );
            this.sendPackage = 20;
        }
    }

    public void emptyShoppingCarts() {
        products.clear();
    }
}