package mentorQuestions;

import java.sql.SQLOutput;

public class ChallengingQuestions {
    public static void main(String[] args) {

        int i = 11;
        i = i++ + ++i;
        System.out.println("i = " + i);

        System.out.println("-----------------------------------");

        int a = 11,
                b =22,
                c;
        c = a + b + a++ + b++ + ++a + ++b;
        /*
        > c = a + b + a++ + b++ + ++a + ++b
> c = 11 + 22 + a++ + b++ + ++a + ++b [Substitute the values of a and b]
> c = 33 + 11 + b++ + ++a + ++b [a remains 11, post-increment]
> c = 44 + b++ + ++a + ++b [a becomes 12]
> c = 44 + 22 + ++a + ++b [b remains 22, post-increment]
> c = 66 + ++a + ++b [b becomes 23]
> c = 66 + 13 + ++b [a becomes 13, pre-increment]
> c = 79 + ++b
> c = 79 + 24 [b becomes 24, pre-increment]
> c = 103
         */


        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("------------------------------------------");
        int z = 0;
        z = z++ - --z + ++z - z--;
        System.out.println("z = " + z);





    }
}
