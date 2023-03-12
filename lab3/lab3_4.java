package data_ctructer;

public class lab3_4 {
    public static void main(String[] args) {
        int x[]={1,9,3,4,5};
        int x2[]={1,2,3,4,5};

;       boolean a = false;
        for (int i = 0; i <x.length ; i++) {
            if(x[i]==x2[i])
            {

              a =true;
            }
            else
            {

               a=false;

            }

        }
        if (a==true)
        { System.out.println("the equle");
            
        }
        else
            System.out.println("the no eqlue");


    }



}
