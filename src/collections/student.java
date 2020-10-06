package collections;

public class student {

    private String name;
    private String fruit;

    public student(String name,String fruit) {
        this.name=name;
        this.fruit=fruit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }
}