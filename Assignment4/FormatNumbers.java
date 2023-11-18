package Assignment4;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class FormatNumbers {
    public static void main(String args[]){

    double number = 12345.678;
    
    NumberFormat uk = NumberFormat.getInstance(Locale.UK);
    uk.setMaximumFractionDigits(2);
    String ukNumbers = uk.format(number);
    System.out.println("UK Formatted Number: " + ukNumbers);

    NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
    String usNumbers = us.format(number);
    System.out.println("US Currency Formatted Number: " + usNumbers);

    String numberString = "12,345.678";
    try{
        Number parsedNumber = uk.parse(numberString);
        double parsedDouble = parsedNumber.doubleValue();
        System.out.println("Parced Number: " + parsedDouble);
    }
    catch(ParseException e){
        e.printStackTrace();
    }
}
}
