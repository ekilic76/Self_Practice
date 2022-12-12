package day04_pracices;

public class SalaryCalculator {

    public static void main(String[] args) {
        int hourlyRate = 50;
        int weeklyHours = 45;
        int stateTaxRate = 6,
                federalTaxRate = 26;

        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        int stateTax = salaryBeforeTax * stateTaxRate / 100;
        int federalTax = salaryBeforeTax * federalTaxRate / 100;
        int totalTax = stateTax + federalTax;
        int salaryAfterTax = salaryBeforeTax - totalTax;
        System.out.println("Gross pay is: " + "$" + salaryBeforeTax);
        System.out.println("\tFederal tax is: " + "$" + federalTax);
        System.out.println("\tState tax is: " + "$" + stateTax);
        System.out.println("\tState tax is: " + "$" + totalTax);
        System.out.println("\t Net income is: " + "$" + salaryAfterTax);
    }
}
/*
Create a class named SalaryCalculator, and declare the following variables:
                hourlyRate
                weeklyHours
                stateTaxRate
                federalTaxRate
        Use the given info above to calculate the followings:
                salaryBeforeTax
                stateTax
                federalTax
                totalTax
                salaryAfterTax
Display each of the above in the following format:
        Ex:
              hourlyRate = $50
              weeklyHours = 45
              stateTax = 6  (given as percentage)
              federalTax = 26 (given as percentage)
        output:
               Gross pay is: $117000
                    Federal tax is: $30420
                    State tax is: $7020
                    Total tax is: $37440
                     Net income is: $79560

 */