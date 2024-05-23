import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberOperations {
    static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название файла: ");
        String filename = scanner.nextLine();
        scanner.close();

        loadNumbersFromFile(filename);

        System.out.println("_min: " + _min(numbers));
        System.out.println("_max: " + _max(numbers));
        System.out.println("_sum: " + _sum(numbers));
        System.out.println("_mult: " + _mult(numbers));
    }

    public static void loadNumbersFromFile(String filename) {
        numbers.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine();
            if (line != null) {
                String[] values = line.split(" ");
                for (String val : values) {
                    numbers.add(Integer.parseInt(val));
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    public static String _min(List<Integer> list) {
        if (list.isEmpty()) {
            return "Пустой файл";
        }
        int min = Integer.MAX_VALUE;
        for (int val : list) {
            if (val < min) {
                min = val;
            }
        }
        return String.valueOf(min);
    }

    public static String _max(List<Integer> list) {
        if (list.isEmpty()) {
            return "0";
        }
        int max = Integer.MIN_VALUE;
        for (int val : list) {
            if (val > max) {
                max = val;
            }
        }
        return String.valueOf(max);
    }

    public static String _sum(List<Integer> list) {
        if (list.isEmpty()) {
            return "Пустой файл";
        }
        int sum = 0;
        for (int val : list) {
            sum += val;
        }
        return String.valueOf(sum);
    }

    public static String _mult(List<Integer> list) {
        if (list.isEmpty()) {
            return "Пустой файл";
        }
        if (list.contains(0)) {
            return "0";
        }
        long mult = 1;
        for (int val : list) {
            mult *= val;
        }
        return String.valueOf(mult);
    }
}