package data_ctructer;

public class lab4_5_main {
    public static void main(String[] args) {

        lab4_5<Integer>x=new lab4_5<>();
        x.addfirst5(1);
        x.addfirst5(2);
        x.addfirst5(3);
        x.addlast5(4);

        lab4_5<Integer>x2=new lab4_5<>();
        x2.addfirst5(5);
        x2.addfirst5(6);
        x2.addfirst5(7);
        x2.addlast5(8);
        System.out.println("\n");
        x.desbyel5_1(x2);
        x.desbyel5();






    }


}
