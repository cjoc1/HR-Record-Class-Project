/* This is the main program of your project. You DO NOT (and should not)
   change anything here. All the work you need to do is performed 
   in file HRRecord.java. This file, which has the main method, will run 
   and make use of the class you will define in HRRecord.java. Because of that, 
   you do not need to understand how this main method works; it includes things
   that we haven't seen in class before, but that we will see later on.
   
   Do feel free to look around in this file, if you're curious, but please 
   do not make any changes to this file. */

/* Tells java that we will need to use the Scanner object, which is
 * in the util library */
import java.util.Scanner;

public class HRRecordMain{
   
   // The main method. This is what runs when the red running person is clicked.
   public static void main(String[] args){
   
      /* Here we initialize the Scanner we will use later, and call it 'scan'.
       * We specify that it will get input from the console by giving it 
       * 'System.in' as a parameter in the constructor */
      Scanner scan = new Scanner(System.in);
      
      /* We also create an object of class HRRecord.
         This is the object we will use for the rest of the program. */
      HRRecord employee1 = new HRRecord();
      // set up the variables we will use to get user input.
      String name;
      String address;
      double years;
      
      /* The following variable is used to store the menu entry
         chosen by the user. We initialize it
         to a value it will not be take in the future through the menu system
         so that we know there has not been a choice made by the user yet.
         This value will get overriden almost imediately by our code */
      int userAnswer = -1;
   
      System.out.println("Welcome to the Human Resources Record System");
      
      
      
      /* A while loop runs whatever is in its code block as long as 
       * the condition inside the parentheses is true. In this case, we want
       * the code to run as long as the user has not chosen 5, which is when
       * they want to quit */
      while(userAnswer != 5){
         System.out.println("Would you like to:");
         System.out.println("\t1) Enter the employee's information");
         System.out.println("\t2) Increase the employee's years of service");
         System.out.println("\t3) Display the employee record");
         System.out.println("\t4) Reset the employee record");
         System.out.println("\t5) Quit");
         
         /* We have the scanner wait for the user to put in an int,
          * then assign it to userAnswer */
         userAnswer = Integer.parseInt(scan.nextLine());
         
         if(userAnswer == 1){
            // First we want to get the name of the animal
            System.out.println("Please enter the employee's name:"); 
            name = scan.nextLine();
            // Then we want to get the address.
            System.out.println("Please enter the employee's address:"); 
            address = scan.nextLine();
            // Then we get the current years of service
            System.out.println("Please enter the employee's years of service:"); 
            years = Double.parseDouble(scan.nextLine());
            /* Once we have the data, we store it in the object*/
            employee1.setName(name);
            employee1.setAddress(address);
            employee1.setYearsOfService(years);
         }
         else if(userAnswer == 2){
           System.out.println("Please enter the number of years to increase years of service by:"); 
           years = Double.parseDouble(scan.nextLine());
           employee1.increaseYearsOfService(years);
           }
         // If the user wants to print the record
         else if(userAnswer == 3){
            System.out.println(employee1.getName());
            System.out.println(employee1.getAddress());
            System.out.println(employee1.getYearsOfService());
         }
         // If the user wants to reset their town
         else if(userAnswer == 4){
            employee1.reset();
         }
         /* If the user is done and wants to exit we don't do anything, and when
          * we reach the end of the while loop it will check the condition (which 
          * will be false) and not run the loop again */
          
      } // End of while loop
      
      System.out.println("Goodbye!");
   
   }

}