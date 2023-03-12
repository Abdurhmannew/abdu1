package data_ctructer;

public class lab7_3_main {
    public static void main(String[] args) {
        lab7_3<Character>x=new lab7_3<>();

//        ((5+3)*(8-3))/4;
//        5+3*8-3/4;


        x.push('(');
        x.push('(');
        x.push('5');
        x.push('+');
        x.push('3');
        x.push(')');
        x.push('*');
        x.push('(');
        x.push('8');
        x.push('-');
        x.push('3');
        x.push(')');
        x.push(')');
        x.postifix();


    }
}
