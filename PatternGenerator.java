//
//  Class author:  Leo Brennan
//  Date created:  10/28/26
//  General description: bunch of methods that create patterns with loops. this is used for practicing loops
//
public class PatternGenerator
{
    public static void main(String[] args)
    {
        PatternGenerator.stars(7);
        System.out.println();
        PatternGenerator.triangle(9);
        System.out.println();
        PatternGenerator.odds(9);
        System.out.println();
        PatternGenerator.eo(6);
        System.out.println();
        PatternGenerator.eo(5);
        System.out.println();
        PatternGenerator.pyramid(5);
    }
    //  Pre-condition: parameter rows must be an int that is the amount of rows
    //  Post-condition: this method will print a star pattern that is a right triangle in shape
    public static void stars(int rows){
        int i = 0;
        while (i < rows) {
            int j = 1;
            while (j <= i * 2 - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    //  Pre-condition: parameter rows must be an int that is the amount of rows
    //  Post-condition: this method will print a number pattern where the number is printed its amount of times, numbers are in ascending order
    public static void triangle(int rows){
        int i = 1;
        while (i <= rows) {
            int j = 0;
            while (j < i) {
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
    //  Pre-condition: parameter start must be an int that is the number you start at
    //  Post-condition: this method will print an odd number pattern where the number is printed its amount of times, numbers are in descending order
    public static void odds(int start){
        for (int i = start; i > 0; i--) {
            if (i % 2 == 1) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    }
    //  Pre-condition: parameter rows must be an int that is the amount of rows
    //  Post-condition: this method will print an alternating pattern of E's and O's where the biggest row is E
    public static void eo(int maxE) {
        String eo = "OE";
        if (maxE % 2 == 0) {
            eo = "EO";
        }
        for (int i = 1; i < maxE; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(eo.charAt(i % 2));
            }
            System.out.println();
        }
        for (int k = maxE; k > 0; k--) {
            for (int l = 1; l <= k; l++) {
                System.out.print(eo.charAt(k % 2));
            }
            System.out.println();
        }
    }
    //  Pre-condition: parameter rows must be an int that is the amount of rows
    //  Post-condition: this method will print a upside down pyramid using numbers, number are in ascending order
    public static void pyramid(int rows){
        int c = 0;
        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < c; j++) {
                System.out.print(' ');
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print(c + 1);
            }
            System.out.println();
            c++;
        }
    }
}