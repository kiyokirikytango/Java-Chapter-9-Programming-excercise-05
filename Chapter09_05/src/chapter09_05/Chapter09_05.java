/*
Chapter 9 Programming excercise 05
Riky Hernandez
9/28/21
Description: Use the GregorianCalendar Class, date class: print the current year/month/date; 
and use setTimeInMillis to 1234567898765L and display the year/month/date
─▄▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▄
█░░░█░░░░░░░░░░▄▄░██░█
█░▀▀█▀▀░▄▀░▄▀░░▀▀░▄▄░█
█░░░▀░░░▄▄▄▄▄░░██░▀▀░█
─▀▄▄▄▄▄▀─────▀▄▄▄▄▄▄▀
     
 */
package chapter09_05;

import java.util.GregorianCalendar;
public class Chapter09_05 {

    public static void main(String[] args) {
        
      GregorianCalendar cal = new GregorianCalendar(); //usin the GregorianCalendar class
      
      System.out.println("The year is : " + cal.get(GregorianCalendar.YEAR) + ", the month is: " + cal.get(GregorianCalendar.MONTH) + " and the day of the month is: " + cal.get(GregorianCalendar.DAY_OF_MONTH));
                                                     //print the year/month/day usin GregorianCalendar
      cal.setTimeInMillis(1234567898765L);
      
      System.out.println("The year is : " + cal.get(GregorianCalendar.YEAR) + ", the month is: " + cal.get(GregorianCalendar.MONTH) + " and the day of the month is: " + cal.get(GregorianCalendar.DAY_OF_MONTH));
        
    }                                                       ////print the year/month/day usin GregorianCalendar to the value of 1234567898765L
    
}
