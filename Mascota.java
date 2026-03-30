/*
Tarea Nro. 13: Creación de una clase "Mascota" con atributos y métodos
Nombre: Pablo Dávila
Fecha: 29/03/2026
*/
// Mascota.java
public class Mascota { 

    // Atributos 
    String nombre;
    String especie;
    int edad;

    // Constructor
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    // Método mostrarInfo()
    public void mostrarInfo() {
        System.out.println("Nombre:  " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad:    " + edad + " años"); 
        System.out.println("----------------------------");
    }
}
