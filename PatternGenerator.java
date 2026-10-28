
import java.util.*;
public class PatternGenerator
{
    public static void main(String[] args)
    {
        PatternGenerator.stars(7);
    }
    public static void stars(int rows){
        int i = 1;
        while (i <= rows * 2 - 1) {
            System.out.println("*" * i);
            i += 2;
        }
    }

}