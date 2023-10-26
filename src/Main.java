import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Задача1 и Задача2
        System.out.println("Задача1 и Задача2");
        int [] arrayFirst = {1,2,3};
        double [] arraySecond = {1.57, 7.654, 9.986};
        int [] arrayThird = new int[] {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arrayFirst.length; i++) {
            if (i!=arrayFirst.length-1) {
                System.out.print(arrayFirst[i] + ", ");
            }else{
                System.out.print(arrayFirst[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < arraySecond.length; i++) {
            if (i!=arraySecond.length-1) {
                System.out.print(arraySecond[i] + ", ");
            }else{
                System.out.print(arraySecond[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < arrayThird.length; i++) {
            if (i!=arrayThird.length-1) {
                System.out.print(arrayThird[i] + ", ");
            }else{
                System.out.print(arrayThird[i]);
            }
        }
        System.out.println();

        //Задача3
        System.out.println("Задача3");
        for (int i = arrayFirst.length-1; i >= 0; i--) {
            if (i!=0) {
                System.out.print(arrayFirst[i] + ", ");
            }else{
                System.out.print(arrayFirst[i]);
            }
        }
        System.out.println();
        for (int i = arraySecond.length-1; i >= 0; i--) {
            if (i!=0) {
                System.out.print(arraySecond[i] + ", ");
            }else{
                System.out.print(arraySecond[i]);
            }
        }
        System.out.println();
        for (int i = arrayThird.length-1; i >= 0; i--) {
            if (i!=0) {
                System.out.print(arrayThird[i] + ", ");
            }else{
                System.out.print(arrayThird[i]);
            }
        }
        System.out.println();
        //Задача4
        System.out.println("Задача4");
        for (int i = 0; i < arrayFirst.length; i++) {
            if (arrayFirst[i] % 2 != 0) {
                arrayFirst[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arrayFirst));
    }
}