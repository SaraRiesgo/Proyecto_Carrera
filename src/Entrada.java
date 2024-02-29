import model.Carrera;
import model.Coche;

public class Entrada {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Skoda", "Fabia", "4573JMP", 90, 130, 0, 0);
        Coche coche2 = new Coche("Kia", "Ceed", "9642HBD", 110, 150, 0, 0);
        System.out.println("Datos de los participantes:");
        System.out.println();
        System.out.println("Datos del participante 1:");
        coche1.mostrarDatos();
        System.out.println();
        System.out.println("Datos del participante 2:");
        coche2.mostrarDatos();
        System.out.println();
        Carrera carrera = new Carrera(coche1, coche2, 0, 0);
        System.out.println("----- ¡ COMIENZA LA CARRERA ! -----");
        carrera.iniciarCarrera(coche1, coche2);


    }
}
