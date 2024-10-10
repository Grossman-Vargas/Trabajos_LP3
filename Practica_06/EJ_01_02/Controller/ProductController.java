package Ejercicio.ShoppingCart.Controller;

import Ejercicio.ShoppingCart.Model.Product;
import Ejercicio.ShoppingCart.View.ViewProduct;

import java.util.ArrayList;
import java.util.List;

public class ProductController {
    protected List<Product> products;
    protected ViewProduct viewProduct;

    public ProductController(List<Product> products, ViewProduct viewProduct) {
        this.products = products;
        this.viewProduct = viewProduct;
    }

    public void listProducts() {
        viewProduct.showProductsTotality(products);
    }
}
