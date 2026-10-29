//
//  Class author:  Leo Brennan
//  Date created:  10/28/26
//  General description: bunch of methods that create patterns with loops. this is used for practicing loops
//
public class PatternGenerator
{
    public static void main(String[] args)
    {
        //PatternGenerator.stars(7);
        //PatternGenerator.triangle(7);
        //PatternGenerator.odds(7);
        PatternGenerator.eo(7);
        //PatternGenerator.eo(8);
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
        char[] EArr = new char[2];
        if ((maxE & 1) == 1) {
            EArr[0] = 'E';
            EArr[1] = 'O';
        }
        else {
            EArr[0] = 'O';
            EArr[1] = 'E';
        }
        for (int i = maxE; i < maxE; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(EArr[i % 2]);
            }
            System.out.println();
        }
    }
}