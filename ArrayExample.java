import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang n: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int index = 0;

        while (index < n) {
            System.out.println("Nhap pham tu vi tri " + index + ": ");
            int number = scanner.nextInt();
            // them phan tu vao mang numbers
            numbers[index] = number;
            index++;
        }

        System.out.println("------- ");
        System.out.println("Hien thi danh sach phan tu: 1");
        System.out.println("Xoa phan tu theo index: 2");
        int choseNumber = scanner.nextInt();
        switch (choseNumber) {
            case 1:
                showArray(numbers);
                break;
            case 2:
                System.out.println("Nhap index: ");
                int indexDelete = scanner.nextInt();
                numbers = remove(numbers, indexDelete);
                showArray(numbers);
                break;
        }

    }

    public static int[] add(int[] array, int value){
        int n = array.length;
        int[] result = new int[n + 1];
        for (int i = 0; i < n; i++) {
            result[i] = array[i];
        }
        // System.arraycopy(array, 0, result, 0, n);
        result[n] = value;
        return result;
    }

    public static int[] remove(int[] array, int index) {

        int n = array.length;
        if (index >= n) {
            return array;
        }

        int[] result = new int[n - 1];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (i == index) {
                continue;
            }
            result[k] = array[i];
            k++;
        }
        return result;
    }

    public static void showArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

}
