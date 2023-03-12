package data_ctructer;

public class lab4_3<E> {

    private Nod3<E>hed=null;
    private Nod3<E>tail=null;

    public int size()
    {

        Nod3<E>n=hed;
         Nod3<E>m=tail;
         if (n==null)
             return 0;
         int siz=0;
         while (n!=m)
         {
             siz++;
             n=n.next3;


         }
        return siz;


    }

    public E first()

    {
        if(size()==0) return null;
        return hed.element;
    }
    public E last()

    {
        if(size()==0) return null;
        return tail.element;
    }

    public void addfirst3(E e1)
    {

        hed=new Nod3<>(e1,hed);
        if(size()==0)
            tail=hed;

    }
    public void addlast3(E el)
    {
        Nod3<E>newest=new Nod3<>(el,null);
        if(size()==0)
            hed=newest;
        else
            tail.next3=newest;
        tail=newest;

    } public E removeFrist1()
    {

        if(size()==0)return null;
        E deleted=hed.element;
        hed=hed.next3;

        if(size()==0)
            tail=null;
        return deleted;
    }


    static class Nod3<E>{
        E element;
        Nod3<E>next3;

        public Nod3(E element, Nod3<E> next3) {
            this.element = element;
            this.next3 = next3;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Nod3<E> getNext3() {
            return next3;
        }

        public void setNext3(Nod3<E> next3) {
            this.next3 = next3;
        }
    }

     }






