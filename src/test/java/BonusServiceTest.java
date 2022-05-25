import static org.junit.jupiter.api.Assertions.*;
public class BonusServiceTest {

        @org.junit.jupiter.api.Test
        void shouldCalculateForRegisteredAndUnderLimit() {
            BonusService service = new BonusService();

            // подготавливаем данные:
            long amount = 1000;
            boolean registered = true;
            long expected = 30;

            // вызываем целевой метод:
            long actual = service.calculate(amount, registered);

            // производим проверку (сравниваем ожидаемый и фактический):
            assertEquals(expected, actual);
        }

        @org.junit.jupiter.api.Test
        void shouldCalculateForRegisteredAndOverLimit() {
            BonusService service = new BonusService();

            // подготавливаем данные:
            long amount = 1_000_000;
            boolean registered = true;
            long expected = 500;

            // вызываем целевой метод:
            long actual = service.calculate(amount, registered);

            // производим проверку (сравниваем ожидаемый и фактический):
            assertEquals(expected, actual);
        }

    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000;
        boolean registered = false;
        long expected = 10;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndRightUpToTheLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 16_634;
        boolean registered = true;
        long expected = 499;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredAndRightUpToTheLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 49_900;
        boolean registered = false;
        long expected = 499;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndALittleOverTheLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 16_700;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredAndALittleOverTheLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 50_100;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    }
