public class Wrappers_Delight {

    public static void main(String[] args){
        Integer num_1 = 14;
        Integer num_2 = new Integer(8);
        Double num_3 = 2.5;
        Double num_4 = (num_2+num_3);
        num_2 = new Integer(5);
        num_3 = (num_1+num_2+num_4);
        num_1 = (int) (num_2+num_4);

        System.out.println(num_1);
        System.out.println(num_2);
        System.out.println(num_3);
        System.out.println(num_4);



    }
}
