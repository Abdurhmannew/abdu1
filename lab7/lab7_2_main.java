package data_ctructer;

public class lab7_2_main {
    public static void main(String[] args) {
        lab7_2<Integer>x=new lab7_2<>();
        x.push(1);
        x.push(2);
        x.push(3);
        x.push(4);
        x.push(5);
        System.out.println(  x.siz());
        x.pop();
        System.out.println(  x.siz());

    }



}
