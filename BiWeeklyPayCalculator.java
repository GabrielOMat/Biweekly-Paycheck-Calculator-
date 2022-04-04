import java.util.*;

public class BiWeeklyPayCalculator
{
   public static void main (String[]args)
   {
      /* creating the variables needed*/
      double payRate, 
      hours,
      payCheck,
      otPay, 
      overTime;
   
      Scanner Keyboard = new Scanner (System.in);
      /* telling user to input dat*/
      System.out.println("What is your pay rate?");
      payRate = Keyboard.nextDouble();
      
      System.out.println("How many hours did you work the last two weeks?");
      hours = Keyboard.nextDouble();
      
     /* Calculating the input given*/ 
     if (hours <= 40){
         payCheck = payRate * hours;
         System.out.println("You worked " + hours + " and your payrate is $" + payRate + " .");
         System.out.printf("\n Your paycheck is %.2f ", payCheck);
     }
     
     else if (hours >= 41){
      overTime = hours - 40; 
      System.out.println("Your overtime hours are " + overTime);
      
      otPay = overTime * payRate * 1.5;
      System.out.printf("\n You will be getting payed $%.2f for those overtime hours. ", otPay);
      
      hours = hours - overTime;
      System.out.println("\n Your regular hours are " + hours);
      
      payCheck = hours * payRate + otPay;
      System.out.printf("\n Your paycheck before taxes are $%.2f" ,payCheck);
     }        
   }
}


