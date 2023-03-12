package data_ctructer;

public class lab7_2<E> implements stack_7<E> {
    static final int caa=10;
    private E dad[];
    private int t=1;

    public lab7_2(int c)
    {dad=(E[])new Object[c];

    }
    public lab7_2()
    {dad=(E[])new Object[caa];

    }
    public void removDirect()
    {





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
         while (t!=0)
         {
             dad[t]=null;
             t--;
             if (t==0)
                 return;
         }


    }
}
