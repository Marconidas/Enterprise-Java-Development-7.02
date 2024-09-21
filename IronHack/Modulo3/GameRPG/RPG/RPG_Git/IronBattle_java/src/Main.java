import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear contrincantes
        Scanner scanner = new Scanner(System.in);
        String genero = "";
        String nombre = "";
        while (!genero.toLowerCase().equals("g") && !genero.toLowerCase().equals("m")){
            System.out.println("Introduce la raza del primer contrincante (M para Mago o G para Guerrero): ");
            genero = scanner.nextLine();
        }
        System.out.println("Que nombre desea ponerle?: ");
        nombre = scanner.nextLine();
        Character oponente1 = null;
        Character oponente2 = null;
        switch (genero.toLowerCase()){
            case "m":
                oponente1 = new Wizard(nombre);
                System.out.println("Se ha creado el primer contrincante que es un mago");
                break;
            case "g":
                oponente1 = new Warrior(nombre);
                System.out.println("Se ha creado el primer contrincante que es un guerrero");
                break;
        }
        genero ="";
        while (!genero.toLowerCase().equals("g") && !genero.toLowerCase().equals("m")){
            System.out.println("Introduce la raza del segundo contrincante (M para Mago o G para Guerrero): ");
            genero = scanner.nextLine();
        }
        System.out.println("Que nombre desea ponerle?: ");
        nombre = scanner.nextLine();
        switch (genero.toLowerCase()){
            case "m":
                oponente2 = new Wizard(nombre);
                System.out.println("Se ha creado el segundo contrincante que es un mago");
                break;
            case "g":
                oponente2 = new Warrior(nombre);
                System.out.println("Se ha creado el segundo contrincante que es un guerrero");
                break;
        }
        // Batalla
        batalla(oponente1,oponente2);

    }
    public static void batalla(Character oponente1,Character oponente2){
        // Batalla por rondas
        while (oponente1.isAlive() && oponente2.isAlive()) {
            System.out.println("\n---- Nueva Ronda ----");
            oponente1.attack(oponente2);
            oponente2.attack(oponente1);
            System.out.println(oponente1.getName() + " tiene " + oponente1.getHp() + " HP.");
            System.out.println(oponente2.getName() + " tiene " + oponente2.getHp() + " HP.");
        }
        // Determinar el ganador
        if (oponente1.isAlive() && !oponente2.isAlive()) {
            System.out.println(oponente1.getName() + " ha ganado la batalla.");
        } else if (oponente2.isAlive() && !oponente1.isAlive()) {
            System.out.println(oponente2.getName() + " ha ganado la batalla.");
        } else {
            System.out.println("¡Es un empate!");
            System.out.println("Repetiremos el combate");
            batalla(oponente1,oponente2);
        }
    }
}