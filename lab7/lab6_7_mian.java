package data_ctructer;

public class lab6_7_mian {
    public static void main(String[] args) throws CloneNotSupportedException {
        lab6_7<Integer> l1 = new lab6_7<>();
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addFirst(3);
        l1.addFirst(4);
        l1.addFirst(5);
        lab6_7<Integer> l =  new lab6_7<>();
   l=l1.clone();
        l.addFirst(8);
        System.out.println(l1.first());





    }


}
