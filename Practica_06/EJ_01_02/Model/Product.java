package Ejercicio.ShoppingCart.Model;

import java.util.ArrayList;
import java.util.List;

// es el historial de compras
public class PurchaseHistory {
    protected List<List<Product>> purchase;

    public PurchaseHistory() {
        purchase = new ArrayList<List<Product>>();
    }

    public void addProduct(List<Product> product) {
        purchase.add(new ArrayList<>(product));
    }

    public List<List<Product>> getPurchase() {
        return purchase;
    }
}
