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
        int c = f_name.compareTo(l_name);
        System.out.println(c);
        int a = l_name.indexOf(f_name.substring(f_name.length()-1));
        System.out.println(a);
        int b = f_name.indexOf(l_name.substring(l_name.length()-1));
        System.out.println(b);
        int mid_1 = f_name.length()/2;
        int mid_2 = l_name.length()/2;
        String mix_1 = f_name.substring(0,mid_1)+l_name.substring(mid_2);
        String mix_2 = l_name.substring(0,mid_2)+f_name.substring(mid_1);
        System.out.println(mix_1+" "+mix_2);




    }
}
