package inheritance;

public class basicinherit {

    static int D = (int) (Math.random() * 10);

    public void basicMethod() {
        System.out.println("This is non Static method " + D);
    }

    public static void basicStaticMethod() {
        System.out.println("This is Static method " + D);
    }
}