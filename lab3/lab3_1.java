package data_ctructer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class lab3_1 {

    public static class colon
    {
        private int x[]={1,2,3,4,5,6,7};
        public int zin()
        {

            return x.length-1;
        }
        public int[] getX() {
            return x;
        }
    }


    public static void main(String[] args) {
        colon x=new colon();
        int z[]=new int[x.zin()];
        z=x.getX();
        z[2]=888;
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i]+" ");

        }
        System.out.println("\n");

            System.out.print(Arrays.toString(x.getX()) +" ");


    }

}
