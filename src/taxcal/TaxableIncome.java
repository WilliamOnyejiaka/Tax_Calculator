package taxcal;

final class TaxableIncome {
    
    private static double personalAllowance = 0.0;
    private static double wifeAllowance = 0.0;
    private static double childrenAllowance = 0.0;
    private static double dependantRelatives = 0.0;
    private static double insurance = 0.0;
    private static double totalIncome = 0.0;
    private static double allowance = 0.0;
    private static double taxableIncome = 0.0;
    
    TaxableIncome(double totalIncome,double personalAllowance,double wifeAllowance,double childrenAllowance,double dependantRelatives,double insurance) {
        this.personalAllowance = personalAllowance;
        this.wifeAllowance = wifeAllowance;
        this.childrenAllowance = childrenAllowance;
        this.dependantRelatives = dependantRelatives;
        this.insurance = insurance;
        this.totalIncome = totalIncome;
        
        allowance = calAllowance();
        taxableIncome = taxableIncome();
     }
    
    private static double calAllowance() {
        return personalAllowance+wifeAllowance+childrenAllowance+dependantRelatives+insurance;
    }
    
    private static double taxableIncome() {
        return totalIncome-allowance;
    }
    
    public static double getTaxableIncome() {
        return taxableIncome;
    }
}