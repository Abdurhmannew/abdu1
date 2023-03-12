package data_ctructer;

public class lab5_4_main {
    public static void main(String[] args) {
        lab5_4<Integer>l=new lab5_4<>();

        l.addFirst52(1);
        l.addFirst52(2);
        l.addFirst52(3);
        l.addFirst52(5);
        lab5_4<Integer>l2=new lab5_4<>();
        l2.addFirst52(1);
        l2.addFirst52(2);
        l2.addFirst52(4);
        l2.addFirst52(3);

      boolean x=  l.eq(l2);
      if (x==true)
      {
          System.out.println("the equles");
      }
      else
          System.out.println("the not eqles");



    }
}
