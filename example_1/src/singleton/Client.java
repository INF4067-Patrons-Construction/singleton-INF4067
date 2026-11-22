package singleton;
public class Client {

    public static void main(String[] args) {

//        Singleton singl = Singleton.getInstance();
//
//        singl.op1(1, 2, 3);
//        singl.op2(3, 4, 5);
        Singleton singl = Singleton.getInstance();
        Singleton singl2 = Singleton.getInstance();

        System.out.println(singl == singl2);

        singl.op1(1, 2, 3);
        singl.op2(3, 4, 5);
    }
}
