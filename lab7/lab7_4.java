package data_ctructer;

public class lab7_4<E> implements stack_7<E>,Cloneable   {
    static final int caa=30;
    private E dad[];
    private int t=1;

    public lab7_4(int c)
    {dad=(E[])new Object[c];

    }
    public lab7_4()
    {dad=(E[])new Object[caa];

    }
    public lab7_4<E> clone() throws CloneNotSupportedException {


        return new  lab7_4<>();
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
