package data_ctructer;

public class lab5_2<E> {
    private Node52<E> tail52 = null;


    public lab5_2() {
    }


   public int size52()
   { int siz=0;



      if (tail52!=null) {


          E c = null;
          Node52<E> n = new Node52<>(c, tail52.next52);


          while (n != tail52) {

              siz++;
              n = n.next52;
          }
      }
            return siz;








   }




    public E first52() {
        if (size52()==0) return null;
        return tail52.next52.element52;
    }

    public E last52() {
        if (size52()==0) return null;
        return tail52.element52;
    }


    public void addFirst52(E el) {


        if (size52()==0) {


            tail52 = new Node52<>(el, null);
            tail52.next52 = tail52;
        }
        else
        tail52.next52=new Node52<>(el,tail52.next52);










    }

    public void addLastc2(E el) {
        addFirst52(el);
        tail52 = tail52.next52;
    }

    public E removeFirst5() {
        if (size52()==0) return null;
       Node52<E> x = tail52.next52;
        if (x == tail52)
            tail52 = null;
        else
            tail52.next52 = x.next52;
        return x.element52;

    }

    public void rotate52() {
        if (tail52 != null) {
            tail52 = tail52.next52;
        }
    }


    static class Node52<E> {
        E element52;
        Node52<E> next52;

        public Node52(E element52, Node52<E> next52) {
            this.element52 = element52;
            this.next52 = next52;
        }

        public E getElement52() {
            return element52;
        }

        public void setElement52(E element52) {
            this.element52 = element52;
        }

        public Node52<E> getNext52() {
            return next52;
        }

        public void setNext52(Node52<E> next52) {
            this.next52 = next52;
        }
    }
}



