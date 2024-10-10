package Ejercicio.ShoppingCart.Controller;

import Ejercicio.ShoppingCart.Model.Product;
import Ejercicio.ShoppingCart.Model.ShoppingCar;
import Ejercicio.ShoppingCart.View.ViewCar;

public class CarController {
    private ShoppingCar carrito;
    private ViewCar carritoVista;

    public CarController(ShoppingCar carrito, ViewCar carritoVista) {
        this.carrito = carrito;
        this.carritoVista = carritoVista;
    }

    public void agregarProductoAlCarrito(Product producto) {
        carrito.addProduct(producto);
    }

    public void eliminarProductoDelCarrito(Product producto) {
        carrito.removeProduct(producto);
    }

    public void mostrarCarrito() {
        carritoVista.ShowProductsPurchaseStore(carrito.getProducts());
    }

    public void realizarCompra() {

        carrito.applyDiscount();
        carrito.applySendPackage();

        double total = carrito.totalCost();

        carritoVista.showAll(total);
        carrito.emptyShoppingCarts();
    }
}
