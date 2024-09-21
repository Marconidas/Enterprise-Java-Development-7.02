 import java.util.Random;

    public class Warrior extends Character implements Attacker {
        private int stamina;
        private int strength;

        // Constructor
        public Warrior(String name) {
            super(name, new Random().nextInt(101) + 100);  // HP entre 100 y 200
            this.stamina = new Random().nextInt(41) + 10;  // Stamina entre 10 y 50
            this.strength = new Random().nextInt(10) + 1;  // Fuerza entre 1 y 10
        }

        // Getters
        public int getStamina() {
            return stamina;
        }

        public int getStrength() {
            return strength;
        }

        // Setters
        public void setStamina(int stamina) {
            this.stamina = stamina;
        }

        public void setStrength(int strength) {
            this.strength = strength;
        }

        // Implementación del método attack()
        @Override
        public void attack(Character opponent) {
            Random random = new Random();
            if (stamina >= 5 && random.nextBoolean()){
                // Ataque pesado
                int damage = strength;
                opponent.setHp(opponent.getHp() - damage);
                stamina -= 5;
                System.out.println(getName() + " realiza un ataque pesado, infligiendo " + damage + " de daño.");
            } else if (stamina >= 1) {
                // Ataque débil
                int damage = strength / 2;
                opponent.setHp(opponent.getHp() - damage);
                stamina += 1;  // Recupera 1 de stamina
                System.out.println(getName() + " realiza un ataque débil, infligiendo " + damage + " de daño.");
            } else {
                // No puede atacar, recupera stamina
                stamina += 2;
                System.out.println(getName() + " no tiene suficiente stamina y no puede atacar, recupera 2 de stamina.");
            }

        }

    }