import java.awt.*;
import java.util.Scanner;

public class UsingTheRectangleClass {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please type x point");
        int x = input.nextInt();
        System.out.println("Please type y point");
        int y = input.nextInt();
        System.out.println("Please type width of the box");
        int w = input.nextInt();
        System.out.println("Please type height of the box");
        int h = input.nextInt();
        Rectangle rec =  new Rectangle(x,y,w,h);
        System.out.println(rec);
        rec.translate(w,0);
        System.out.println(rec);
        rec.translate(0,h);
        System.out.println(rec);
        rec.translate(-w,0);
        System.out.println(rec);


    }
}
