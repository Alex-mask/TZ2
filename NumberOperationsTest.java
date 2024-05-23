import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class NumberOperationsTest {
    private static List<Integer> numbers;

    @BeforeAll
    static void setupAll() {
        System.out.println("Тестирование...");
        NumberOperations.loadNumbersFromFile("numbers.txt");
        numbers = NumberOperations.numbers;
    }

    @BeforeEach
    void setupEach() {
        System.out.println("Начало теста...");
    }

    @Test
    void testMin() {
        String expected = String.valueOf(numbers.stream().min(Integer::compareTo).orElseThrow());
        assertEquals(expected, NumberOperations._min(numbers));
    }

    @Test
    void testMax() {
        String expected = String.valueOf(numbers.stream().max(Integer::compareTo).orElseThrow());
        assertEquals(expected, NumberOperations._max(numbers));
    }

    @Test
    void testSum() {
        String expected = String.valueOf(numbers.stream().mapToInt(Integer::intValue).sum());
        assertEquals(expected, NumberOperations._sum(numbers));
    }

    @Test
    void testMult() {
        String expected;
        if (numbers.contains(0)) {
            expected = "0";
        } else {
            long product = numbers.stream().mapToLong(Integer::longValue).reduce(1, (a, b) -> a * b);
            expected = String.valueOf(product);
        }
        assertEquals(expected, NumberOperations._mult(numbers));
    }
}
