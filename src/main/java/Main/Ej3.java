package Main;

import Entidades.Alumno;
import Servicio.ServiAlumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ServiAlumno servicioAlumno = new ServiAlumno();
        ArrayList<Alumno> alumnos = new ArrayList();

        String opc = "";
        
        
        alumnos.add(servicioAlumno.crearAlumno());

        while (!opc.equals("n")) {
            System.out.println("Desea agregar otro alumno s/n");
            opc = leer.next();
            if (opc.equals("s")) {
                alumnos.add(servicioAlumno.crearAlumno());
            } else {
                System.out.println("Operacion Finalizada");
            }
        }

        System.out.println("Ingrese el nombre de un alumno a buscar");
        String nombreBuscar = leer.next();
        
        Iterator<Alumno> it = alumnos.iterator();
        
        while (it.hasNext()) {
            Alumno aux = it.next();
            
            if(aux.getNombres().equals(nombreBuscar)) {
                System.out.println("El promedio es: " + servicioAlumno.notaFinal(aux));
            }
            
        }


    }

}
