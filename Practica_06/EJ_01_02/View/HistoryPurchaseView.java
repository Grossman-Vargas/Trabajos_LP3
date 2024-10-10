package Ejercicio.ShoppingCart.View;

import Ejercicio.ShoppingCart.Model.Product;

import java.util.List;

public class HistoryPurchasesView {
    public void showHistoryPurchasesView(List<List<Product>> compras) {
        System.out.println("Historial de compras:");
        for (List<Product> compra : compras) {
            for (Product p : compra) {
                System.out.println(p.getName() + " - " + p.getPrice());
            }
            System.out.println("----");
        }
    }
}