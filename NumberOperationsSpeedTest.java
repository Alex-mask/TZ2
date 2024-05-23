import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class NumberOperationsSpeedTest {
    private static List<Integer> numbers;
    private long startTime;
    private long endTime;

    @BeforeAll
    static void setupAll() {
        System.out.println("Тестирование...");
        String filename = "/Users/dk/Desktop/tz2/tz2/src/numbers.txt";
        NumberOperations.loadNumbersFromFile(filename);
        numbers = NumberOperations.numbers;
    }

    @BeforeEach
    void setupEach() {
        System.out.println("Начало теста...");
    }

    @Test
    void testTimeMin() {
        System.out.println("Функция поиска минимума:");
        startTime = System.nanoTime();
        NumberOperations._min(numbers);
        endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.printf("Время выполнения для файла длиной %d равно %.6f секунд.%n", numbers.size(), elapsedTime / 1e9);
        assertTrue(elapsedTime >= 0); // Проверка на корректность времени
    }

    @Test
    void testTimeMax() {
        System.out.println("Функция поиска максимума:");
        startTime = System.nanoTime();
        NumberOperations._max(numbers);
        endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.printf("Время выполнения для файла длиной %d равно %.6f секунд.%n", numbers.size(), elapsedTime / 1e9);
        assertTrue(elapsedTime >= 0); // Проверка на корректность времени
    }

    @Test
    void testTimeSum() {
        System.out.println("Функция поиска суммы чисел:");
        startTime = System.nanoTime();
        NumberOperations._sum(numbers);
        endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.printf("Время выполнения для файла длиной %d равно %.6f секунд.%n", numbers.size(), elapsedTime / 1e9);
        assertTrue(elapsedTime >= 0); // Проверка на корректность времени
    }

    @Test
    void testTimeMult() {
        System.out.println("Функция поиска произведения чисел:");
        startTime = System.nanoTime();
        NumberOperations._mult(numbers);
        endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.printf("Время выполнения для файла длиной %d равно %.6f секунд.%n", numbers.size(), elapsedTime / 1e9);
        assertTrue(elapsedTime >= 0); // Проверка на корректность времени
    }

    @BeforeEach
    void tearDownEach() {
        System.out.println("Тест пройден");
    }
}