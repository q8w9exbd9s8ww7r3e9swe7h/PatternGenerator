
import java.util.*;
public class PatternGenerator
{
    public static void main(String[] args)
    {
        PatternGenerator.stars(7);
    }
    public static void stars(int rows){
        int i = 0;
        while (i < rows) {
            int j = 1;
            while (j <= i * 2 - 1) {
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
    }

}