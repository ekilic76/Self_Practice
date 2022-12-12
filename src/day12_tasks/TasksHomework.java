package day12_tasks;

public class TasksHomework {
    public static void main(String[] args) {
        emailDomain("Cydeo@gmail.com");

        capitalization("cyDeO", "sCHooL");

        monthName(7);
        day(1);
        daysInMonth("JUNe");
    }

    /*
    Create a method named emailDomain that can display the domain of the email
        Ex:
            emailDomain("Cydeo@gmail.com")
            output:
                domain: gmail
     */
    public static void emailDomain(String email){
        String domain = email.substring(email.indexOf("@") + 1, email.indexOf("."));
        System.out.println(domain);
    }
    /*
    Create a method named capitalization that can format the first and last names of the person and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")
        output:
            full name: Cydeo School
     */
    public static void capitalization(String firstName, String lastName){
        firstName = firstName.substring(0,1).toUpperCase()+ firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase()+ lastName.substring(1).toLowerCase();
        System.out.println(firstName + " " + lastName);

    }

    /*
    Create a method named monthName that can display the name of the month based on the given number to the method,
    if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        monthName(6)
        output:
            June
     */
    public static void monthName(int number){
        if (number <1 || number >12){
            System.err.println("Invalid Number");
            return;
        }
        if (number == 1){
            System.out.println("January");
        }else if (number == 2){
            System.out.println("February");
        }else if(number == 3){
            System.out.println("March");
        }else if (number == 4){
            System.out.println("April");
        }else if(number == 5){
            System.out.println("May");
        }else if (number == 6){
            System.out.println("June");
        }else if(number == 7){
            System.out.println("July");
        }else if (number == 8){
            System.out.println("August");
        }else if(number == 9){
            System.out.println("September");
        }else if (number == 10){
            System.out.println("October");
        }else if(number == 11){
            System.out.println("November");
        }else{
            System.out.println("December");
        }
    }

    /*
    Create a method named day that can display the name of the day based on the given number to the method,
    if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        day(5)
        output:
            Friday
     */

    public static void day(int number){
        if (number <1 || number >7){
            System.err.println("Invalid number");
            return;
        }
            if (number == 1){
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("Wednesday");
        } else if (number ==4) {
            System.out.println("Thursday");
        }else if (number == 5){
            System.out.println("Friday");
        }else if (number == 6){
            System.out.println("Saturday");
        }else {
            System.out.println("Sunday");
        }
    }

    /*
    Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days
     */

    public static void daysInMonth(String month){
     month = (""+ month.charAt(0)).toUpperCase()+ month.substring(1).toLowerCase();

        switch (month) {
            case "February":
                month += 28 + " days";
                break;

            case "April":
            case "June":
            case "September":
            case "November":
                month += 30 + " days";
                break;

            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                month += 31 + " days";
                break;

            default:
                month = "Invalid month";
        }
        System.out.println(month);
    }



}
