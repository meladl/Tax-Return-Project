public class TaxReturn {
    public TaxReturn(double aIncome, int aStatus){
        income = aIncome;
        status = aStatus;
    }
    public double getTax(){
        double tax = 0;
        if(status == Single){
            if(income <= Single_Bracket1){
                tax = rate1 * income;
            }
            else if (income <= Single_Bracket2){
                tax = rate1 * Single_Bracket1 + rate2 *( income - Single_Bracket1);
            }
            else 
                tax = rate1 * Single_Bracket1 + rate2 * (Single_Bracket2 - Single_Bracket1) + rate3 * (income - Single_Bracket2); 
            }
        else {
            if (income <= Married_Bracket1)
                tax = rate1 * income;
            else if (income <= Married_Bracket2)
                tax = rate1 * Married_Bracket1 + rate2 *( income - Married_Bracket1);
            else
               tax = rate1 * Married_Bracket1 + rate2 * (Married_Bracket2 - Married_Bracket1) + rate3 * (income - Married_Bracket2); 
        }
        return tax;
    }

    public static final int Single =1;
    public static final int Married =2;
    private static final double rate1 = 0.15;
    private static final double rate2 = 0.28;
    private static final double rate3 = 0.31;
    private static final double Single_Bracket1 = 21450;
    private static final double Single_Bracket2 = 51900;
    private static final double Married_Bracket1 = 35800;
    private static final double Married_Bracket2 = 86500;
    private double income;
    private int status;
}
