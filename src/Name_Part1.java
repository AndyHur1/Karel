import java.util.Scanner;

public class Name_Part1 {
    public static void main(String [] cats)
    {
        Scanner name = new Scanner(System.in);
        System.out.print("Please enter your first name==>");
        String f_name = name.next();
        System.out.print("Please enter your last name==>");
        String l_name = name.next();
        int length = f_name.length()+l_name.length();
        System.out.println(length);
        System.out.println(f_name.substring(0,1)+l_name.substring(0,1));



    }
}
