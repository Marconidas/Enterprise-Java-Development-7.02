import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.HashSet;
import java.util.Set;

public class BattleTest {
    @org.junit.Test
    @Test
    public void testBattleResultIsRandom() {
        // Ejecutamos la batalla 10 veces
        Set<String> winners = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            Character oponente1 = new Wizard("Mago1");
            Character oponente2 = new Warrior("Guerrero1");
            Character ganador = simulateBattle(oponente1, oponente2);
            if (ganador != null) {
                winners.add(ganador.getName());
            }
        }
        // Verificar que hay diferentes ganadores
        assertTrue(winners.size() > 1, "El resultado de la batalla no parece ser aleatorio, siempre hay el mismo ganador.");
    }
    // Simula la batalla y devuelve el ganador o null si es empate
    private Character simulateBattle(Character oponente1, Character oponente2) {
        while (oponente1.isAlive() && oponente2.isAlive()) {
            oponente1.attack(oponente2);
            if (oponente2.isAlive()) {
                oponente2.attack(oponente1);
            }
        }
        if (oponente1.isAlive()) {
            return oponente1;
        } else if (oponente2.isAlive()) {
            return oponente2;
        } else {
            return null; // Empate
        }
    }
}