package taxcal;

import java.util.Scanner;

final class CheckInput {
    
    private static double value = 0.0;
    private static String name = "";
    
    CheckInput(String name) {
        this.name = name;
        value = checkLetter();
        value = checkNegative();
    }
    
    private static double checkLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + name + ": ");
        try {
            value = scanner.nextDouble();
        }catch(Exception e) {
            System.out.println("Entered an invalid value\n");
            value = checkLetter();
        }
        return value;
    }
    
    private static double checkNegative() {
        if (value >= 0) {
            value = value;
        }else {
            do {
                System.out.println("Entered a negative value\n");
                value = checkLetter();
            }while(value < 0);
        }
        return value;
    }
    
    public static double getValue() {
        return value;
    }
}