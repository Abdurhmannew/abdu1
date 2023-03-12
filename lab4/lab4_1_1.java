package data_ctructer;

public class lab4_1_1<E> {

    private labNode<E>hed=null;

    private int  size=0;

    public boolean smyte()
    {
        return size==0;
    }
    public lab4_1_1() {
    }

    public void add(E x)
    {
        hed=new labNode<E>(x,hed);

        size++;






    }



    public void deslye()
    {
        while (size!=0)

        {
            System.out.println(hed.getElement());
            hed=hed.next;
            size--;

        }



    }





    static class labNode<E>
    {
        private E element;
        labNode<E>next;

        public labNode(E element, labNode<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public labNode<E> getNext() {
            return next;
        }

        public void setNext(labNode<E> next) {
            this.next = next;
        }
    }

}
