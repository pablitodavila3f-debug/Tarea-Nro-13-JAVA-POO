// App.java 
public class App {
    public static void main(String[] args) {

        // Creación de dos objetos Mascota
        Mascota mascota1 = new Mascota("Max", "Perro", 3);
        Mascota mascota2 = new Mascota("Luna", "Hamster", 2);

        // Mostrar información de cada mascota
        mascota1.mostrarInfo();
        mascota2.mostrarInfo(); 
    }
}
