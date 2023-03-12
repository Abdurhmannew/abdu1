package data_ctructer;

public class lab3_3 {

    public static void main(String[] args) {
        int x[]={1,2,3};
        int x2[]={4,5,6};
        int x3[]=new int[x.length+x2.length];
        int c=x.length+x2.length;
        int v=0;
        int v2=0;



        for (int i = 0; i <c ; i++) {
            if(i<=x.length-1)
            {
                x3[i]=x[i];
            }
            else if (i>x.length-1&&i<c)
            {

                v2=x2[v++];
                x3[i]=v2;
            }



        }
        for (int i = 0; i <c ; i++) {
            System.out.println(x3[i]+" ");

        }
    }
}
