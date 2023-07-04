import java.util.Arrays;

public class NumberPermutation {
    public static void main(String[] args) {
        int number = 23;
        int result = findNextPermutation(number);
        System.out.println(result);
    }

    public static int findNextPermutation(int number) {
        char[] digits = String.valueOf(number).toCharArray();

// Находим индекс самой правой цифры, которую можно поменять
        int i = digits.length - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        if (i < 0) {
// Перестановка невозможна
            return -1;
        }

// Находим индекс самой правой цифры, которую можно заменить
        int j = digits.length - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }

// Меняем найденные цифры местами
        swap(digits, i, j);

    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    }
}
