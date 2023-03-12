package data_ctructer;

public class lab2_3 {

    public static void ss(int x[])
    {


        int j=0;


        for (int i = 0; i <x.length-1 ; i++) {


            if (x[i] != x[i + 1]) {
                x[j++] = x[i];

            }
        }
        x[j++]=x[x.length-1];



        for (int i = 0; i <j; i++) {
            System.out.print(x[i]+" ");

        }


    }


    public static void main(String[] args) {
        int x[]={6,2,4,4,5,5,6,7};
        int j=0;
         ss(x);



            }




        }













