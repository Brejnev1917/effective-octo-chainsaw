import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BonusServiceUnregisteredTest {

    @Test
    void calculate() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 10_000;
        boolean registered = false;
        long expected = 1;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @Test
    void Bonuscalculate() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
}