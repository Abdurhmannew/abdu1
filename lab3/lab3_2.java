package data_ctructer;

import java.util.Arrays;

public class lab3_2 {






    public  static class obje {


        private obje []x;
        private String na;
        private int age;

        public obje(String na, int age) {
            this.na = na;
            this.age = age;
            x=new obje[3];

        }

        public String getNa() {
            return na;
        }

        public void setNa(String na) {
            this.na = na;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "obje{" +
                    "x=" + Arrays.toString(x) +
                    ", na='" + na + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        obje x[]= new obje[3];
        x[1]=new obje("abdu",23);
        x[2]=new obje("ali",18);
obje c[]=new obje[3];
c[1]=new obje("sss",000);
c=x.clone();
        System.out.println(c[1]);





















    }






}
