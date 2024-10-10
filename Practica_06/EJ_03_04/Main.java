
import Entidades.Enemigo;
import Entidades.Jugador;
import Inventario.InventarioJug;
import Inventario.InventarioMenu;
import Inventario.Objetos.Hechizo;
import Inventario.Objetos.Utilitie;
import Inventario.Objetos.Weapon;
import Juego.Jueguinio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        InventarioMenu menuJugador = new InventarioMenu();
        InventarioMenu menuInventario = new InventarioMenu();

        menuJugador.agregar_funcion("Atacar");
        menuJugador.agregar_funcion("Usar Hechizo");
        menuJugador.agregar_funcion("Abrir el menu del inventario");

        menuInventario.agregar_funcion("Ver el inventario");
        menuInventario.agregar_funcion("Botar objeto");

        Jugador J1 = new Jugador("Grossman", 100, 1);

        Enemigo E1 = new Enemigo("Loaiza", 80, 1);

        Utilitie thinkpad = new Weapon("Thinkpad", 10, true);
        Utilitie curacion = new Hechizo("Juguito", true, 15);
        Utilitie danio = new Hechizo("Danio", false, 15);

        J1.getInventario().agregarInventario(thinkpad);
        J1.getInventario().agregarInventario(curacion);
        J1.getInventario().agregarInventario(danio);

        Jueguinio juego = new Jueguinio(J1, E1, menuJugador, menuInventario);
        juego.game();


    }
}
