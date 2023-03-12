package data_ctructer;
import  java.io.*;
public class lab7_4_main {
    public static void main(String[] args) throws CloneNotSupportedException {
        lab7_4<Integer>x=new lab7_4<>();
        x.push(1);
        x.push(2);
        x.push(3);
        x.push(4);
        x.push(5);
        System.out.println(x.siz());
        lab7_4<Integer>x2=new lab7_4<>();
        x2 = (lab7_4<Integer>) x.clone();
        x2.push(6);
        x2.push(8);
        System.out.println(x.siz());






    }
}
