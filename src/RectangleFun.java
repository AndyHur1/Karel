import java.awt.*;
import java.util.Scanner;

public class RectangleFun {
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        System.out.print("Width : ");
        int w = input.nextInt();
        System.out.print("Height : ");
        int h = input.nextInt();
        System.out.print("X: ");
        int x = input.nextInt();
        System.out.print("Y: ");
        int y = input.nextInt();
        Rectangle r = new Rectangle(x,y,w,h);
        double perimeter = (w+w+h+h);
        System.out.println("Perimeter = "+perimeter);
        int new_x = x-4;
        int new_y = y+2;
        r.setLocation(new_x,new_y);
        System.out.println("New Location is "+"("+new_x+","+new_y+")");




    }
}
