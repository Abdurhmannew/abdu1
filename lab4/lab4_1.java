package data_ctructer;
/**
 * Created by lab on 17/01/2023.
 */
public class lab4_1 {

    public static void main(String[] args) {
        lab4_1_1<Integer>x=new lab4_1_1<>();
        x.add(1);
       x.add(2);
        x.add(3);
        x.add(4);
        x.add(5);
        x.deslye();
        System.out.println("\n");
        lab4_1_1<Integer>x2=new lab4_1_1<>();
        x2.add(1);
        x2.add(2);
        x2.add(3);
        x2.add(4);
        x2.add(5);
        x2.deslye();
        System.out.println("\n");
        System.out.println(x.equals(x2));






    }



}
