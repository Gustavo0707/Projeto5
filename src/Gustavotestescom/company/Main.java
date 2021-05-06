package Gustavotestescom.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 int s, calculator;

        Scanner scanner = new Scanner(System.in);

        System.out.println("put any side of square");
        s = scanner.nextInt();

        calculator = s * s;

        System.out.println("The area is " + calculator);
    }
}
