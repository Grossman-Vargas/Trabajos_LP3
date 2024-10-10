import Ejercicio.ShoppingCart.Controller.CarController;
import Ejercicio.ShoppingCart.Controller.ProductController;
import Ejercicio.ShoppingCart.Model.Product;
import Ejercicio.ShoppingCart.Model.ShoppingCar;
import Ejercicio.ShoppingCart.View.ViewCar;
import Ejercicio.ShoppingCart.View.ViewProduct;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1000, 10);
        Product p2 = new Product("Mouse", 50, 20);
        Product p3 = new Product("Teclado", 70, 15);

        List<Product> productos = new ArrayList<>();
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);

        ViewProduct productoVista = new ViewProduct();
        ViewCar carritoVista = new ViewCar();

        ProductController productController = new ProductController(productos, productoVista);
        ShoppingCar shoppingCar = new ShoppingCar();
        CarController carController = new CarController(shoppingCar, carritoVista);

        productController.listProducts();
        carController.agregarProductoAlCarrito(p1);
        carController.agregarProductoAlCarrito(p2);
        carController.mostrarCarrito();
        carController.realizarCompra();

    }
}