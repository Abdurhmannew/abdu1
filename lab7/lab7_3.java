package data_ctructer;

public class lab7_3<E> implements stack_7<E> {
    static final int caa=30;
    private E dad[];
    private int t=1;

    public lab7_3(int c)
    {dad=(E[])new Object[c];

    }
    public lab7_3()
    {dad=(E[])new Object[caa];

    }
    public void postifix()
    {


        for (int i = 2; t!=1 ; ++i)
        {



           E b= dad[i];
            if (b==null)
                return;
            if ((char) b!='('&&(char) b!=')')
            {
                System.out.print(b+" ");
                t--;
            }
            else
            {
                dad[i]=null;

            }






        }






    }
    @Override
    public boolean isemty() {
        return t==1;
    }

    @Override
    public int siz() {
        return t;
    }

    @Override
    public E top() {
        if(t==0)return null;


        return dad[t];
    }

    @Override
    public void push(E e) {
        if (t==dad.length)
            throw new  IllegalMonitorStateException("the full");
        dad[++t]=e;






    }

    @Override
    public void pop() {
        if (t==0)
            throw new  IllegalMonitorStateException("the full");
            dad[t]=null;
            t--;





    }
}
