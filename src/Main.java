import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int pay = 0;

        int[] arr = generateRandomArray();
        double min = arr[0];
        double max = arr[0];
        double middle = arr[0];

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(i + " " + arr[i]);
            pay += arr[i];
            middle = pay / 30;
            if (min > arr[i]) {
                min = arr[i];
            }
            else if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("Сумма всех выплат за месяц: " + pay);
        System.out.println("Минимальная сумма трат за день составила " + min +  " рублей. Максимальная сумма трат " +
                "за день составила " + max + " рублей");
        System.out.println("Средняя сумма трат за месяц составила " + middle + " рублей");


    }

    public static int[] generateRandomArray() {

        Random random = new Random();
        int[] arr = new int[30];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}

