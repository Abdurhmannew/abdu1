package data_ctructer;

public class lab5_3_main {
    public static void main(String[] args) {
        lab5_3<Integer>l=new lab5_3<>();
        l.addFirst52(1);
        l.addFirst52(2);
        l.addFirst52(3);
        l.addFirst52(4);

        lab5_3<Integer>l2=new lab5_3<>();
        l2.addFirst52(5);
        l2.addFirst52(6);
        l2.addFirst52(7);
        l2.addFirst52(8);

        if(l.equals(l2))
        {

            System.out.println("the list equals");

        }
        else
            System.out.println("the list not equals");






    }
}
