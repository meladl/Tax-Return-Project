import java.util.Scanner;

public class TaxTester {
    
 public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Please Enter Your Income: ");
    
    double income = in.nextDouble();
    
    System.out.print("Please Enter S for Single or M for Married: ");
    
    String input = in.next();
    
    int status = 0;
    
    if (input.equalsIgnoreCase("S")){
        status = TaxReturn.Single;
    }
    
    else if (input.equalsIgnoreCase("M")){
    status = TaxReturn.Married;
    }
    
    else {
        System.out.println("Error");
        
        return;
    }
    
    TaxReturn aTaxReturn = new TaxReturn(income,status);
    
    System.out.println("The Tax is " + aTaxReturn.getTax());
    }
        
    
    }
    

