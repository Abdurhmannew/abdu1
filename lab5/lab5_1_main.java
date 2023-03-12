package data_ctructer;

public class lab5_1_main {
    public static void main(String[] args) {
        lab5_1<String>l=new lab5_1<>();
        System.out.println(l.size());
        System.out.println(l.isEmpty5());

        l.addFirst5("ali");
        l.addFirst5("ahmad");
        l.addFirst5("mohom");
        for (int i = 0; i <l.size() ; i++) {
            System.out.print(l.first5()+"\t");
            l.rotate5();
        }
        System.out.println(l.first5());
    }
}
