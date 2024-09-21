import java.util.UUID;
public abstract class Character implements Attacker{
        private String id;
        private String name;
        private int hp;
        private boolean isAlive;

        // Constructor
        public Character(String name, int hp) {
            this.id = UUID.randomUUID().toString();  // Genera un ID único
            this.name = name;
            this.hp = hp;
            this.isAlive = true;
        }

        // Getters
        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getHp() {
            return hp;
        }

        public boolean isAlive() {
            return isAlive;
        }

        // Setters
        public void setHp(int hp) {
            this.hp = hp;
            if (this.hp <= 0) {
                this.hp = 0;
                this.isAlive = false;
            }
        }

        public void setAlive(boolean isAlive) {
            this.isAlive = isAlive;
        }

    /* Método abstracto que las subclases deberán implementar
    public void attack(Character opponent) {

    }*/

}
