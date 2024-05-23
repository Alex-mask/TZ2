import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class EmptyTest {
    private static List<Integer> numbers;

    @BeforeAll
    static void setupAll() {
        System.out.println("Тестирование...");
        String filename = "numbers.txt";
        NumberOperations.loadNumbersFromFile(filename);
        numbers = NumberOperations.numbers;
    }

    @BeforeEach
    void setupEach() {
        System.out.println("Начало теста...");
    }

    @Test
    void testNumbers() {
        assertNotEquals(0, numbers.size(), "Пустой файл");
    }

    @BeforeEach
    void tearDownEach() {
        System.out.println("Тест пройден");
    }
}
