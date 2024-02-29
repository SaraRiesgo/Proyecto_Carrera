package model;

import java.util.Scanner;

public class Coche {
    private String marca, modelo, matricula;
    private int cv, cc, velocidad;
    private int kmRecorridos;

    public Coche() {
    }

    public Coche(String marca, String modelo, String matricula, int cv, int cc, int velocidad, int kmRecorridos) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cc = cc;
        this.cv = cv;
        this.velocidad = velocidad;
        this.kmRecorridos = kmRecorridos;
    }

    public void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Matrícula: " + matricula);
        System.out.println("CV: " + cv);
        System.out.println("CC: " + cc);

    }

    public void acelerar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuanto quieres acelerar?");
        int aumentoVelocidad = scanner.nextInt();
        if (aumentoVelocidad < 10) {
            aumentoVelocidad = 10;
        }
        if (cv > 100) {
            velocidad += (int) (Math.random() * aumentoVelocidad) + velocidad;
        } else if (cv < 100) {
            velocidad += (int) (Math.random() * aumentoVelocidad);

        }
        kmRecorridos += (int) (velocidad * 0.5);
        System.out.println("Velocidad que lleva ahora el coche: " + velocidad);
        System.out.println("Los kilometros recorridos del coche son " + kmRecorridos + "km");
    }

    public String getMarca() {

        return marca;
    }

    public void setMarca(String marca) {

        this.marca = marca;
    }

    public String getModelo() {

        return modelo;
    }

    public void setModelo(String modelo) {

        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {

        this.matricula = matricula;
    }

    public int getCv() {

        return cv;
    }

    public void setCv(int cv) {

        this.cv = cv;
    }

    public int getCc() {

        return cc;
    }

    public void setCc(int cc) {

        this.cc = cc;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {

        this.velocidad = velocidad;
    }

    public double getKmRecorridos() {

        return kmRecorridos;
    }

    public void setKmRecorridos(int kmRecorridos) {

        this.kmRecorridos = kmRecorridos;
    }
}
