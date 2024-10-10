package Ejercicio.ShoppingCart.View;

import Ejercicio.ShoppingCart.Model.Product;

import java.util.List;

public class ViewProduct {
    public void showProductsTotality(List<Product> productos) {
        System.out.println("Productos disponibles:");
        for (Product p : productos) {
            System.out.println(p.getName() + " precio " + p.getPrice());
        }
    }
}
