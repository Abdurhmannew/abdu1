package data_ctructer;

public class lab5_5_main {
    public static void main(String[] args) {
        lab5_5<Integer>l=new lab5_5<>();
        l.addFirst52(1);
        l.addFirst52(2);
        l.addFirst52(3);
        l.addFirst52(4);
        lab5_5<Integer>l2=new lab5_5<>();
        int x=l.size53();
        int v=x;
        if (v%2==0)
        {
            int c=v/2;
            l.addscout(l2,c);
        }
        else
        {v=v+1;
            if (v%2==0)
            {int c=v/2;
                l.addscout(l2,c);
            }
            else
            {v=v-1;
                if (v%2==0)
                {
                    int c=v/2;
                    l.addscout(l2,c);
                }
            }
        }
        for (int i = 0; i <l.size53() ; i++) {
            System.out.println(l.first52());
            l.rotate52();

        }
        System.out.println("----------------------------");
        for (int i = 0; i <l2.size53() ; i++) {
            System.out.println(l2.first52());
            l2.rotate52();

        }









    }
        }
