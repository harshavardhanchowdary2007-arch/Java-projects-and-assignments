
import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE)
            System.out.println("byte");

        if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE)
            System.out.println("short");

        if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE)
            System.out.println("int");

        System.out.println("long");

        sc.close();
    }
}
