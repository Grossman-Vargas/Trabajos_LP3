package Juego;

import Entidades.Enemigo;
import Entidades.Entity;
import Entidades.Jugador;
import Inventario.InventarioMenu;

public class Jueguinio {
    Jugador J1;
    Enemigo J2;
    int turno = 1;
    protected InventarioMenu inventario;

    public void funcionalidades_inventario(int opc){
        switch (opc){
            case 1:
                J1.getInventario().imprimirInventario();
                break;
            case 2:
                //in gresar nombre; xdxdxdxd
                String name = "";
                J1.getInventario().eliminarInventario(J1.getInventario().buscarInventario(name));
        }

    }

    public void funcionalidades(int opc){
        switch(opc){
            case 1:
                J1.getInventario().imprimirInventario();
                break;
            case 2:

                break;

            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
    }


    public Jueguinio(Entity J1, Entity J2, InventarioMenu inventario) {
        if(J1 == null || J2 == null){

            System.out.println("Objetos vacios detectados :v crea bien el juego pe.");
            System.exit(0);

        }

        this.J1 = J1;
        this.J2 = J2;
        this.inventario = inventario;

    }

    public void game(){
        if(turno % 2 != 0){
            System.out.println(inventario);
            int opc = inventario.validar_opcion();
        }
    }

}
