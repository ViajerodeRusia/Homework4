public class Homework4 {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] array = generateRandomArray();
        int sum = 0;
        for (int i : array) {
            sum +=i;
        }
        String str = String.format("Сумма трат за месяц составила %,d рублей", sum);
        System.out.println(str);
    }
    public static void task2() {
        int[] array = generateRandomArray();
        int max = array[0];
        int min = array[0];
        for (int i : array) {
            if (i>max) {
                max = i;
            }
            if (i<min) {
                min = i;
            }
        }
        String str = String.format("Минимальная сумма трат за день составила %,d рублей. " +
                "Максимальная сумма трат за день составила %,d рублей", min, max);
        System.out.println(str);
    }
    public static void task3() {
        int[] array = generateRandomArray();
        double average = 0;
        int sum = 0;
        for (int i : array) {
            sum+=i;
        }
        average = (double) sum/ array.length;
        String str = String.format("Средняя сумма трат за месяц составила %,.3f рублей", average);
        System.out.println(str);
    }
    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }


    public static void main(String[] args) {
        System.out.println("Задача1");
        task1();
        System.out.println("Задача2");
        task2();
        System.out.println("Задача3");
        task3();
        System.out.println("Задача4");
        task4();
    }
}
