package data_ctructer;

public class lab5_1<E> {
    private Node5<E> tail5 = null;
    private int size = 0;

    public  lab5_1() {
    }

    public boolean isEmpty5() {
        return size == 0;
    }




    public int size() {
        return size;
    }

    public E first5() {
        if (isEmpty5()) return null;
        return tail5.next5.element5;
    }

    public E last5() {
        if (isEmpty5()) return null;
        return tail5.element5;
    }


    public void addFirst5(E el) {
        if (isEmpty5()) {
            tail5 = new Node5<>(el, null);
            tail5.next5 = tail5;
        } else {
           tail5.next5=new Node5<>(el,tail5.next5);

        }
        size++;

    }

    public void addLastc(E el) {
        addFirst5(el);
        tail5 = tail5.next5;
    }

    public E removeFirst5() {
        if (isEmpty5()) return null;
    Node5<E> x = tail5.next5;
        if (x == tail5)
            tail5 = null;
        else
            tail5.next5 = x.next5;
        size--;
        return x.element5;

    }

    public void rotate5() {
        if (tail5 != null) {
            tail5 = tail5.next5;
        }
    }


    private static class Node5<E> {
        E element5;
       Node5<E> next5;

        public Node5(E element5, Node5<E> next5) {
            this.element5 = element5;
            this.next5 = next5;
        }

        public E getElement5() {
            return element5;
        }

        public void setElement5(E element5) {
            this.element5 = element5;
        }

        public Node5<E> getNext5() {
            return next5;
        }

        public void setNext5(Node5<E> next5) {
            this.next5 = next5;
        }
    }
}
