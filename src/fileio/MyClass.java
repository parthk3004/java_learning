package fileio;

import java.io.Serializable;

public class MyClass implements Serializable{

    private String Name;
    private int rollno;

    public MyClass(String name, int rollno) {
        super();
        Name = name;
        this.rollno = rollno;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }


}