package data_ctructer;

public class lab5_3<E> {
    private Node53<E> tail53 = null;


    public lab5_3() {
    }


    public int size53() {
        int siz = 0;


        if (tail53 != null) {


            E c = null;
         Node53<E> n = new Node53<>(c, tail53.next53);


            while (n != tail53) {

                siz++;
                n = n.next53;
            }
        }
        return siz;


    }


    public E first52() {
        if (size53() == 0) return null;
        return tail53.next53.element53;
    }

    public E last53() {
        if (size53() == 0) return null;
        return tail53.element53;
    }


    public void addFirst52(E el) {


        if (size53() == 0) {


            tail53 = new Node53<>(el, null);
            tail53.next53 = tail53;
        } else
            tail53.next53 = new Node53<>(el, tail53.next53);


    }

    public void addLastc2(E el) {
        addFirst52(el);
        tail53 = tail53.next53;
    }

    public E removeFirst5() {
        if (size53() == 0) return null;
        Node53<E> x = tail53.next53;
        if (x == tail53)
            tail53 = null;
        else
            tail53.next53 = x.next53;
        return x.element53;

    }

    public void rotate52() {
        if (tail53 != null) {
            tail53 = tail53.next53;
        }
    }


    static class Node53<E> {
        E element53;
        Node53<E> next53;

        public Node53(E element53, Node53<E> next53) {
            this.element53 = element53;
            this.next53 = next53;
        }

        public E getElement53() {
            return element53;
        }

        public void setElement53(E element53) {
            this.element53 = element53;
        }

        public Node53<E> getNext53() {
            return next53;
        }

        public void setNext53(Node53<E> next53) {
            this.next53 = next53;
        }
    }
}

