/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uva_2;

/**
 *
 * @author user
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
//        int data[] = {90, 123, 134, 52, 36};
//        for (int i = 0; i < data.length - i; i++) {
//            for (int j = 0; j < data.length - 1; j++) {
//                if (data[j] < data[j + 1]) {
//                    int tmp = data[j];
//                    data[j] = data[j + 1];
//                    data[j + 1] = tmp;
//                }
//            }
//        }
        System.out.println(firstLessThanSecond("90", "56"));
        System.out.println(firstLessThanSecond("999", "56"));
        System.out.println(firstLessThanSecond("998", "99"));
        String[] numbers = {"999", "124", "90", "56", "9", "996", "879", "87", "870", "1231231232", "123"};
        sort(numbers);
        for (String s : numbers) {
            System.out.println(s);
        }
//
//        for (int i = 0; i < data.length; i++) {
//            System.out.println(data[i]);
//        }
    }

    private static void sort(String[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (!firstLessThanSecond(numbers[j], numbers[j + 1])) {
                    //   System.out.println("swapping");
                    String tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }

    }

    private static boolean firstLessThanSecond(String first, String second) {
        BigInteger n1 = new BigInteger(first + second);
        BigInteger n2 = new BigInteger(second + first);
        if (n1.compareTo(n2) > 0) {
            return false;
        } else {
            return true;
        }
    }
}