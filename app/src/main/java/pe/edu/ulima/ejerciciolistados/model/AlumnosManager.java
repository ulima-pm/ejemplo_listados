package pe.edu.ulima.ejerciciolistados.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sodm on 4/28/2017.
 */

public class AlumnosManager {
    public List<Alumno> obtenerAlumnos(){
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Luis Bernal", 20));
        alumnos.add(new Alumno("Rocio Peña", 22));

        return alumnos;
    }
}
