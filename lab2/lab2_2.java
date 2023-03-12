package data_ctructer;

public class lab2_2 {

    public static void copy(int x[],int z[])
    {
        for (int i = 0; i <x.length ; i++) {
            z[i]=x[i];

        }





    }

    public static void main(String[] args) {
        int[] x={1,2,3,4,5,6};
        int[] z=new int[x.length];
        copy(x,z);
        for (int i = 0; i <z.length ; i++) {
            System.out.print(z[i]+" ");

        }






    }
}
