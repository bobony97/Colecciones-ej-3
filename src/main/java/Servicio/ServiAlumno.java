package Servicio;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiAlumno {
    
   
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alumno crearAlumno() {

        ArrayList<Integer> notas = new ArrayList();

        System.out.println("Ingrese el nombre del alumno");
        String nombres = leer.next();
        System.out.println("");

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota");
            notas.add(leer.nextInt());

        }
          
        return new Alumno(nombres, notas);
    }

    public double notaFinal(Alumno nuevoAlumno) {

        return (nuevoAlumno.getNotas().get(0)+nuevoAlumno.getNotas().get(1)+nuevoAlumno.getNotas().get(2)) / 3;

    }

}
