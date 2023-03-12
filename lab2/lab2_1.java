package data_ctructer;

public class lab2_1 {




    static  public  int[] revren(int x[])

    {

        int n=x.length-1;
         int []z=new int[n+1];

        for (int i = 0; i <=x.length-1 ; i++) {
            z[i]=x[n];
            n--;





        }
        return z;



    }

    public static void main(String[] args) {



        int c[]={1,4,5,7,8,9,2};

          int x[]=revren(c);

        for (int i = 0; i <x.length ; i++) {
            System.out.print( x[i]+" ");

        }







    }


}
