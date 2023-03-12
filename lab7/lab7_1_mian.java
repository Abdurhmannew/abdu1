package data_ctructer;

public class lab7_1_mian {
    public static void main(String[] args) {
        lab7_1_1<Integer>x=new lab7_1_1<>();
        x.push(1);
        x.push(2);
        x.push(3);
        x.push(4);
        x.push(5);
        lab7_1_1<Integer>x2=new lab7_1_1<>();
        while (!x.isemty())
        {
           x2.addStat(x.top());
           x.pop();

        }
        while (!x2.isemty())
        {
            System.out.println(x2.top());
            x2.pop();

        }







    }
}
