import java.awt.Rectangle;

import java.awt.*;
import java.util.Scanner;

public class PointsandRectangles {

    private static Object Dimension;

    public static void main(String[] args){

        Scanner points = new Scanner(System.in);
        System.out.print("Please enter x coordinate :");
        int x = points.nextInt();
        System.out.print("Please enter y coordinate :");
        int y = points.nextInt();
        Point a = new Point(x,y);
        System.out.print("Enter the length :");
        int l = points.nextInt();
        System.out.print("Enter the width :");
        int w = points.nextInt();
        Dimension d = new Dimension(l,w);
        Rectangle r = new Rectangle();
        r.setFrame(a,d);
        System.out.println(a);
        System.out.println(d);
        System.out.println(r);



    }
}
