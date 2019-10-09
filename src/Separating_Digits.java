import java.util.Scanner;

public class Separating_Digits {

    private static int q(int num_a) {
       return num_a/1000;
    }
    private static int r(int num_a) {
        return num_a%1000;
    }
    static void display(int digit) {
        System.out.print(digit+"  ");
    }
    public static void main(String[] args){

        Scanner digit = new Scanner(System.in);
        System.out.println("Please type your four digit number");
        int num_a = digit.nextInt();
        int first_digit = q(num_a);
        int second_digit = num_a/100-q(num_a)*10;
        int third_digit = (num_a/10-second_digit*10)%100;
        int fourth_digit = (num_a-third_digit*10)%100;

        display(first_digit);
        display(second_digit);
        display(third_digit);
        display(fourth_digit);
    }


}
