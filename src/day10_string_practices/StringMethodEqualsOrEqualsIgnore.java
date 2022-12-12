package day10_string_practices;

public class StringMethodEqualsOrEqualsIgnore {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = new String("Java");
        String str3 = new String("Java");
        String str4 = new String("JAVA");



        System.out.println(str1 == str2); // will return false boolean value

        System.out.println(str1.equals(str2)); // will return you true. because it will compare the values

        System.out.println(str2.equals(str3)); // will return you true.only the value check. not the method

        System.out.println(str3.equalsIgnoreCase(str4)); // will check the value regardless the case sensitivity



    }
}
