/* This is file HRRecord.java
   This is the file where you will have code
   that implements the class used in the main method
   of HRRecordMain.java  
   The methods declared in this file are only templates of what they
   need to be. Those templates are here so that the program compiles,
   but the behavior of the class is incorrect. Your task is to modify
   the methods so that their behavior is correct. */
   //refernce for grades
public class HRRecord{
   
   /* Instance variable declarations. */
   private String name;
   private double yearsOfService;
   private String address;
   
   /* Constructor. Initializes the instance variables to default values. */
   public HRRecord() {
     name ="none";
     address="none";
     yearsOfService=0.0;
     //TODO 1: Initialize name to "none". Initialize address to "none"
     //        Initialize yearsOfService to 0.0 
     
   }
   
   public void setName(String name){
      //TODO 2: Update the instance variables using the 'name' parameter.
      this.name = name;
   }
   
   public void setAddress(String address){
      //TODO 3: Update the instance variables using the 'address' parameter.
      this.address = address;
   }
   
   public void setYearsOfService(double years){
      //TODO 4: Update the instance variables using the 'years' parameter.
      this.yearsOfService = years;
   }
   
   public void increaseYearsOfService(double years){
      //TODO 5: Update the instance variable using the 'years' parameter.
      //        Increases the years of service by whoever much
      //        is passed as 'years' to this method.
      this.yearsOfService = yearsOfService + years;
   }   

   /* Returns the name String. */
   public String getName(){
      //TODO 6: Implement this method.
      return name;
   }
   
   /* Returns the address String. */
   public String getAddress(){
      //TODO 7: Implement this method.
      return address;
   }
   
   /* Returns the  yearsOfService.  */
   public double getYearsOfService(){
      //TODO 8: Implement this method.
      return yearsOfService;
   }
   
   /* This method resets the instance variables to their default values. 
      The default values are the values that constructor sets variables to.*/
   public void reset(){
      //TODO 9: Implement this method.
      this.yearsOfService = 0.0;
      this.name="none";
      this.address="none";
   }
}
