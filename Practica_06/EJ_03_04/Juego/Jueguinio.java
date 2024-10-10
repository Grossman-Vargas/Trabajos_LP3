package Juego;

import Entidades.Enemigo;
import Entidades.Entity;
import Entidades.Jugador;
import Inventario.InventarioMenu;
import Inventario.Objetos.Hechizo;
import Inventario.Objetos.Utilitie;

import java.util.Scanner;

public class Jueguinio {
    Jugador J1;
    Enemigo J2;
    int turno = 1;
    protected InventarioMenu inventario;
    protected InventarioMenu inventario2;
    Scanner sc = new Scanner(System.in);

    public void funcionalidades_inventario(int opc) {
        switch (opc) {
            case 1:

                J1.getInventario().imprimirInventario();
                break;

            case 2:

                System.out.print("Ingresa el nombre del objeto a eliminar: ");
                String name = sc.nextLine();
                J1.getInventario().eliminarInventario(J1.getInventario().buscarInventario(name));
                break;

            default:

                System.out.println("Opción no válida.");
                break;

        }
    }

    public void funcionalidades(int opc) {

        switch (opc) {

            case 1:

                J1.atacar(J2);
                turno++;

                break;

            case 2:

                System.out.print("Ingresa el nombre del hechizo a usar: ");
                String objName = sc.nextLine();
                Hechizo obj = (Hechizo) J1.getInventario().buscarInventario(objName);

                if (obj != null) {

                    if (obj.tipo() == true) {
                        J1.curarse(obj.get_stat());
                    } else {
                        J1.atacar(J2);
                    }

                }

                break;

            case 3:

                System.out.println(inventario2);
                int opc_02 = inventario2.validar_opcion();
                funcionalidades_inventario(opc_02);

            default:

                System.out.println("Opción no válida.");
                break;

        }

    }


    public Jueguinio(Jugador J1, Enemigo J2, InventarioMenu inventario, InventarioMenu inventario2) {
        if(J1 == null || J2 == null){

            System.out.println("Objetos vacios detectados :v crea bien el juego pe.");
            System.exit(0);

        }

        this.J1 = J1;
        this.J2 = J2;
        this.inventario = inventario;
        this.inventario2 = inventario2;

    }

    public void game(){
        while (J1.get_vida() >=0 && J2.get_vida() >=0){
            if(turno % 2 != 0){
                System.out.println(inventario);
                int opc = inventario.validar_opcion();
                funcionalidades(opc);
            } else {
                J2.accionar(J1);
                turno++;
            }
        }
    }


}
