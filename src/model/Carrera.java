package model;

import java.util.Random;

public class Carrera {
    private String ganador;
    private int kmTotales, nVueltas;
    private Coche coche1, coche2;

    public Carrera() {
    }

    public void iniciarCarrera(Coche coche1, Coche coche2) {
        Random random = new Random();
        kmTotales = random.nextInt(796) + 5;//Genera un numero aleatorio entre 5 y 800
        System.out.println("La carrera tiene " + kmTotales + " km en total.");
        nVueltas = random.nextInt(100) + 1;//Genera un numero aleatorio entre 1 y 100
        System.out.println("La carrera tiene " + nVueltas + " vueltas en total.");
        int vueltas = 1;
        for (int i = 0; i <= nVueltas; i++) {
            System.out.println();
            System.out.println("------Vuelta " + vueltas + "------");
            System.out.println();
            System.out.println("Acelera el coche 1");
            coche1.acelerar();
            System.out.println("Acelera el coche 2");
            coche2.acelerar();
            vueltas++;
            if (coche1.getKmRecorridos() >= kmTotales || coche2.getKmRecorridos() >= kmTotales) {
                System.out.println("¡ La carrera ha finalizado !");
                break;
            }
        }
        int vueltasExtra = 0;
        while (coche1.getKmRecorridos() < kmTotales && coche2.getKmRecorridos() < kmTotales) {
            vueltasExtra++;
            System.out.println("Vuelta extra" + vueltasExtra);
            System.out.println("Acelera el coche 1");
            coche1.acelerar();
            System.out.println("Acelera el coche 2");
            coche2.acelerar();
            if (coche1.getKmRecorridos() > kmTotales || coche2.getKmRecorridos() > kmTotales) {
                ganador();
                break;

            }
        }
        ganador();
    }

    public void ganador() {
        if (coche1.getKmRecorridos() > coche2.getKmRecorridos() && coche1.getKmRecorridos() >= kmTotales) {
            System.out.println("El ganador de la carrera ha sido el coche con matricula " + coche1.getMatricula());
        } else if (coche2.getKmRecorridos() > coche1.getKmRecorridos() && coche2.getKmRecorridos() >= kmTotales) {
            System.out.println("El ganador de la carrera ha sido el coche con matricula " + coche2.getMatricula());
        }
        System.out.println("¡ENHORABUENA!");
    }

    public Carrera(Coche coche1, Coche coche2, int kmTotales, int nVueltas) {
        this.coche1 = coche1;
        this.coche2 = coche2;
        this.kmTotales = kmTotales;
        this.nVueltas = nVueltas;

    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public int getKmTotales() {
        return kmTotales;
    }

    public void setKmTotales(int kmTotales) {
        this.kmTotales = kmTotales;
    }

    public int getnVueltas() {
        return nVueltas;
    }

    public void setnVueltas(int nVueltas) {
        this.nVueltas = nVueltas;
    }
}
