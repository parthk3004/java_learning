package fileio;
import java.io.*;
import java.util.ArrayList;
public class MyClassArray {
    public static void main(String args[]) throws IOException {
        ArrayList<MyClass> list = new ArrayList<MyClass>();
        MyClass class1=new MyClass("Parth",101);
        MyClass class2=new MyClass("Shivani",102);
        list.add(class1);
        list.add(class2);
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\Users\\parth korawala\\Desktop\\projects\\event management project\\java learning\\src\\fileio\\MyClassList.txt"))){
            for(MyClass cs:list) {
                oos.writeObject(cs);
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }

        try(ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Users\\parth korawala\\Desktop\\projects\\event management project\\java learning\\src\\fileio\\MyClassList.txt"))){
            Object o;
            while((o=in.readObject())!=null)
            {
                MyClass cls=(MyClass)o;
                System.out.println("Name: "+cls.getName()+", RollNo: "+cls.getRollno());
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }


    }
    }
