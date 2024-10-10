package Ejercicio.ShoppingCart.View;

import Ejercicio.ShoppingCart.Model.Product;

import java.util.List;

public class ViewCar {
    public void ShowProductsPurchaseStore(List<Product> productos) {
        System.out.println("Productos en el carrito:");
        for (Product p : productos) {
            System.out.println(p.getName() + " - " + p.getPrice());
        }
    }

    public void showAll(double total) {
        System.out.println("Total: " + total);
    }

}