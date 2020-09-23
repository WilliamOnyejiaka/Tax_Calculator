package taxcal;

import java.util.Scanner;

final class Input {
  
    public static void input() {
        double totalIncome,personalIncome,wifeAllowance,childrenAllowance,dependantRelative,insurance,taxableIncome,tax;
        
        new CheckInput("Total Income");
        totalIncome = CheckInput.getValue();
        
        new CheckInput("Personal Allowance");
        personalIncome = CheckInput.getValue();
        
        new CheckInput("Wife's Allowance");
        wifeAllowance = CheckInput.getValue();
        
        new CheckInput("Children's Allowance");
        childrenAllowance = CheckInput.getValue();
        
        new CheckInput("Dependant Relatives Allowance");
        dependantRelative = CheckInput.getValue();
        
        new CheckInput("Insurance");
        insurance = CheckInput.getValue();
        
        new TaxableIncome(totalIncome,personalIncome,wifeAllowance,childrenAllowance,dependantRelative,insurance);
        taxableIncome = TaxableIncome.getTaxableIncome();
        
        new TaxCal(taxableIncome);
        tax = TaxCal.getTax();
        
        System.out.println("Your tax is " + tax + " Naira");
        contd();
    }
    
    public static void contd() {
        Scanner scanner = new Scanner(System.in);
        String answer;
        System.out.println("\nDo you want to exit?\nEnter yes or no");
        
        while(true) {
            System.out.println("\nEnter your answer: ");
            answer = scanner.nextLine().trim().toLowerCase();
            if(answer.equals("yes")) {
                break;
            }else if(answer.equals("no")) {
                input();
                break;
            }
            System.out.println("\nEnter yes or no");
        }
    }
    
    public static void main(String args[]) {
        input();
    }
}