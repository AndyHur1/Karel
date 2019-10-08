import java.awt.*;
import java.util.Scanner;

public class UsingTheRectangleClass2 {
    public static void main(String[] args){

        Rectangle square = new Rectangle(100,100,50,50);
        System.out.println(square);
        square.grow(25,25);
        System.out.println(square);
        square.translate(25,25);
        System.out.println(square);


    }
}
