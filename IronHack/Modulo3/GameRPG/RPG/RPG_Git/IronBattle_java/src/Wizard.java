import java.util.Random;

public class Wizard extends Character implements Attacker {
    private int mana;          // Recurso para lanzar hechizos
    private int intelligence;  // Potencia de los hechizos

    // Constructor parametrizado
    public Wizard(String name) {
        super(name, randomHp(50, 100));  // HP entre 50 y 100 para Wizard
        this.mana = randomStat(10, 50);        // Mana entre 10 y 50
        this.intelligence = randomStat(1, 50); // Inteligencia entre 1 y 50
    }

    // Getters y Setters
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    // Implementación del método attack()
    @Override
    public void attack(Character opponent) {
        Random random = new Random();
        int damage = 0;

        if (mana >= 5 && random.nextBoolean()) {
            // Fireball
            damage = intelligence;
            mana -= 5;
            opponent.setHp(opponent.getHp() - damage);
            System.out.println(getName() + " lanza una bola de fuego " + opponent.getName() + " haciendo " + damage + " de daño!");
        } else if (mana >= 1) {
            // Staff Hit
            damage = 2;
            mana += 1;
            opponent.setHp(opponent.getHp() - damage);
            System.out.println(getName() + " realiza un golpe de bastón " + opponent.getName() + " haciendo " + damage + " de daño!");
        } else {
            // No attack, just recover mana
            mana += 2;
            System.out.println(getName() + " no tiene suficiente mana y no puede atacar, recupera 2 de mana.");
        }

    }

    // Método auxiliar para generar valores aleatorios
    public static int randomStat(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static int randomHp(int min, int max) {
        return randomStat(min, max);
    }
}
