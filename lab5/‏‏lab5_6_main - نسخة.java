package data_ctructer;

public class lab5_6_main {
    public static void main(String[] args) throws CloneNotSupportedException {
        lab5_6<Integer> l = new lab5_6<>();
        l.addFirst52(1);
        l.addFirst52(2);
        l.addFirst52(3);
        l.addFirst52(4);
        l.addFirst52(5);


        lab5_6<Integer> l2 =new lab5_6<>();
        l2= (lab5_6<Integer>) l.clone();
         l2.addFirst52(7);
        System.out.println(l.first52());


    }


}
