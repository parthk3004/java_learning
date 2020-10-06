package inheritance;

public class checkdemo extends check{

    public void disp2() {
        System.out.println(getName() + "'s id is " + id + " and age is " + age + " with a total marks of " + marks + " out of " + totalMarks + ".");
    }

    public static void main(String[] args) {
        checkdemo c = new checkdemo();
        c.disp();
        c.disp2();
    }
}