package data_ctructer;

public class lab4_4<E> {



    private Nod4<E> hed4=null;
    private Nod4<E> tail4=null;
    private  int siz=0;
    public lab4_4() {
    }
   public boolean isemty()
   {
       return siz==0;


   }

    public void desbye()
    {

        while (!isemty())
        {

            System.out.println(hed4.element4);
            hed4=hed4.next4;
            siz--;



        }


    }

    public E first()

    {
        if(isemty()) return null;
        return hed4.element4;
    }
    public E last()

    {
        if(isemty()) return null;
        return tail4.element4;
    }

    public void addfirst4(E e1)
    {

        hed4=new Nod4<>(e1,hed4);
        if(isemty())
            tail4=hed4;
           siz++;
    }
    public void addlast4(E el)
    {
        Nod4<E> newest=new Nod4<E>(el,null);
        if(isemty())
            hed4=newest;
        else
            tail4.next4=newest;
        tail4=newest;
        siz++;

    } public E removeFrist4()
    {

        if(siz==0)return null;
        E deleted=hed4.element4;
        hed4=hed4.next4;
        siz--;

        if(isemty())
            tail4=null;
        return deleted;
    }
    public void retoet(int x)
    {
        int k=x;
        while (k!=0)
        {
            E a=removeFrist4();
           addlast4(a);
            k--;


        }

        desbye();






    }


    static class Nod4<E>{
        E element4;
        Nod4<E>next4;

        public Nod4(E element4, Nod4<E> next4) {
            this.element4 = element4;
            this.next4 = next4;
        }

        public E getElement() {
            return element4;
        }

        public void setElement(E element) {
            this.element4 = element;
        }

        public Nod4<E> getNext4() {
            return next4;
        }

        public void setNext4(Nod4<E> next4) {
            this.next4 = next4;
        }
    }


}
