package taxcal;

public final class TaxCal {
    
    private static double value = 0.0;
    private static double tenPercent = 0.0;
    private static double fiffteenPercent = 0.0;
    private static double twentyPercent = 0.0;
    private static double twentyFivePercent = 0.0;
    private static double thirtyPercent = 0.0;
    private static double tax = 0.0;
    
    TaxCal(double value) {
        this.value = value;
        tenPercent();
        tax = calTax();
    }
    
    private static void tenPercent() {
        if(value < 5000) {
            tenPercent = 0.1*value;
        }else if (value > 5000) {
            tenPercent = 0.1*5000;
            value = value - 5000;
            fiffteenPercent();
        }
    }
    
    private static void fiffteenPercent() {
        if(value < 10000) {
            fiffteenPercent = 0.15*value;
        }else if (value > 10000) {
            fiffteenPercent = 0.15*10000;
            value = value - 10000;
            twentyPercent();
        }
    }
    
    private static void twentyPercent() {
        if(value < 15000) {
            twentyPercent = 0.2*value;
        }else if (value > 15000) {
            twentyPercent = 0.2*15000;
            value = value - 15000;
            twentyFivePercent();
        }
    }
    
    private static void twentyFivePercent() {
        if(value < 25000) {
            twentyFivePercent = 0.25*value;
        }else if (value > 25000) {
            twentyFivePercent = 0.25*25000;
            value = value - 25000;
            thirtyPercent();
        }
    }
    
    private static void thirtyPercent() {
        thirtyPercent = 0.3*value;
    }
    
    private static double calTax() {
        return tenPercent+fiffteenPercent+twentyPercent+twentyFivePercent+thirtyPercent;
    }
    
    public static double getTax() {
        return tax;
    }
}