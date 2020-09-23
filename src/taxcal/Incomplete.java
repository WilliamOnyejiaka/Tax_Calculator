package taxcal;

class Incomplete {
    
    public static void cal(double value) {
        double tax = 0.0;
        double percent[] = {0.1,0.15,0.2,0.25,0.3};
        double deduct[] = {5000.0,10000.0,15000.0,25000.0,0};
        
        for(int i = 0;i < percent.length;i++) {
            if(value >= deduct[i]) {
               
               tax = tax + (percent[i] * deduct[i]);
               value = value - deduct[i];
            }else if (value < deduct[i] )  {
                tax = tax + (percent[i] * value);
            }if (value > 0 && i == 4) {
                tax = tax + (0.3*value);
            }
            System.out.println(value);
            System.out.println(tax+ "\n");
        }
    }
    
    public static void main(String args[]) {
        double value = 22000.0;
        cal(value);
    }
}