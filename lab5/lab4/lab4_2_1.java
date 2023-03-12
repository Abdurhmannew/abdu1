package data_ctructer;

public class lab4_2_1<E> {


   private lb4_Node<E>hed=null;
   private lb4_Node<E>tai=null;
   private int size=0;
   private lb4_Node<E> x = null;

    public boolean ismptye()
    {

        return size==0;

    }





    public E first()

    {
        if(ismptye()) return null;
        return hed.elemt;
    }
    public E last()

    {
        if(ismptye()) return null;
        return tai.elemt;
    }

    public void addfirst(E e1)
    {

       hed=new lb4_Node<E>(e1,hed);
        if(ismptye())
            tai=hed;
        size++;
    }
    public void addlast(E el)
    {
        lb4_Node<E>newest=new lb4_Node<E>(el,null);
        if(ismptye())
            hed=newest;
        else
            tai.nxt=newest;
        tai=newest;
        size++;
    }
    public void interfece()
    {
        lb4_Node<E>court=hed;
        while (hed.nxt.nxt!=null)
        {
            hed=hed.nxt;
          court=court.nxt;
        }
        System.out.println(court.elemt);

    }
    public E removeFrist()
    {

        if(ismptye())return null;
        E deleted=hed.elemt;
        hed=hed.nxt;
        size--;
        if(ismptye())
            tai=null;
        return deleted;
    }
    public void desbiy()
    {
        while (!ismptye())
        {


            System.out.println(hed.elemt);
            hed=hed.nxt;
           size--;




        }





    }



    static class lb4_Node<E>
    {
        E elemt;
       lb4_Node<E>nxt;

        public lb4_Node(E elemt, lb4_Node<E> nxt) {
            this.elemt = elemt;
            this.nxt = nxt;
        }

        public E getElemt() {
            return elemt;
        }

        public void setElemt(E elemt) {
            this.elemt = elemt;
        }

        public lb4_Node<E> getNxt() {
            return nxt;
        }

        public void setNxt(lb4_Node<E> nxt) {
            this.nxt = nxt;
        }
    }











}
