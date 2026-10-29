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

    public static void triangle(int rows){
        int i = 1;
        while (i <= rows) {
            int j = 1;
            while (j <= i) {
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
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
    public static void eo(int maxE) {
        String eo = "OE";
        if (maxE % 2 == 0) {
            eo = "EO";
        }
        for (int i = 0; i <= maxE; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(eo.charAt(i % 2));
            }
            System.out.println();
        }
        for (int i = maxE - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(eo.charAt(i % 2));
            }
            System.out.println();
        }
    }
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