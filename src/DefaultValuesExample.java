
public class DefaultValuesExample {

    static int v1;
    static double v2;
    static boolean v3;
    static String v4;

    public static void main(String[] args) {
        System.out.println("Checking Default Values : ");
        DefaultValuesExample ob=new DefaultValuesExample();
        ob.show();
                
    }

    public void show() {
        int v5=5;
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        System.out.println(v5);
    }
}
