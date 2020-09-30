package objectmanupukation;

public class rectangle {

    private int length;
    private int breadth;
    rectangle(int l,int b){
        this.length = l;
        this.breadth = b;
    }
    public int area() {
        return this.length*this.breadth;
    }
}
