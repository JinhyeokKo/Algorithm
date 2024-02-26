import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String C = sc.next();
        if (C.equals("A+")) {
            System.out.println("4.3");
        } else if (C.equals("A0")) {
            System.out.println("4.0");
        } else if (C.equals("A-")) {
            System.out.println("3.7");
        } else if (C.equals("B+")) {
            System.out.println("3.3");
        } else if (C.equals("B0")) {
            System.out.println("3.0");
        } else if (C.equals("B-")) {
            System.out.println("2.7");
        } else if (C.equals("C+")) {
            System.out.println("2.3");
        } else if (C.equals("C0")) {
            System.out.println("2.0");
        } else if (C.equals("C-")) {
            System.out.println("1.7");
        } else if (C.equals("D+")) {
            System.out.println("1.3");
        } else if (C.equals("D0")) {
            System.out.println("1.0");
        } else if (C.equals("D-")) {
            System.out.println("0.7");
        } else if (C.equals("F")) {
            System.out.println("0.0");
        }
        sc.close();
    }
}