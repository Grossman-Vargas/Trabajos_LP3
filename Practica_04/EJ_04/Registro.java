package EJ_04;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Registro {

    private List<Estudiante> estudiantes;

    public Registro() {

        this.estudiantes = new ArrayList<>();

    }

    public void agregarEstudiante(Estudiante estudiante) {

        if (estudiante == null) {

            throw new IllegalArgumentException("Objeto sin valor.");

        }

        estudiantes.add(estudiante);

    }


    public Estudiante buscarEstudiante(String nombre) {

        if (nombre == null || nombre.isEmpty()) {

            throw new IllegalArgumentException("Buscando sin nombre xd.");

        }

        for (Estudiante estudiante : estudiantes) {

            if (nombre.equals(estudiante.getNombre())) {

                return estudiante;

            }

        }

        throw new NoSuchElementException("No se encontró ningun estudiante de nombre -> " + nombre);

    }

}
