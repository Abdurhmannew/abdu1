package data_ctructer;

public class lab6_1<E> {
    private Node<E> header;
    private Node<E> trailer;
    private int size=0;

    public lab6_1() {
        header=new Node<E>(null,null,null);
        trailer=new Node<>(null,header,null);
        header.next=trailer;
    }

    public boolean isEmpty()
    {return size==0;}
    public int size()
    {return size;}
    public E first()
    {if (isEmpty())return null;
        return header.next.element;
    }
    public E last()
    {
        if (isEmpty())return null;
        return trailer.prev.element;
    }
    private void addBetween(E el, Node<E> p, Node<E> n)
    {
        Node<E> newset= new Node<E>(el,p,n);
        p.next=newset;
        n.prev=newset;
        size++;
    }
    public void addFirst(E el)

    {
        addBetween(el,header,header.next);}

    public void addLast(E el)
    {
        addBetween(el,trailer.prev,trailer);
    }

    private E remove(Node<E> x)
    {
        if (isEmpty())return null;
        Node<E> p= x.prev;
        Node<E> n=x.next;
        p.next=n;
        n.prev=p;
        size--;
        return x.element;
    }
    public E middel()
    {
        Node<E>n=header;
        Node<E>m=trailer;
        while (n!=null&&m!=null)
        {
            m=m.getPrev();
            if (n==m)
            {
                break;
            }
            n=n.getNext();



        }
        return m.getElement();




    }

    public E removeFirst()
    {
        return remove(header.next);
    }
    public E removeLast()
    {
        return remove(trailer.prev);
    }


    private static class Node<E>{
        E element;
        Node<E> prev;
         Node<E> next;

        public Node(E element, Node<E> prev,Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

}
