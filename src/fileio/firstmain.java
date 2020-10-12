package fileio;
import  java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class firstmain {


    public static void main(String[] args) throws IOException {
        employee emp1 = new employee(100,"PARTH ",400000);
        employee emp2 = new employee(101,"ARMAN ",330000);
        FileOutputStream fout = new FileOutputStream("C:\\Users\\parth korawala\\Desktop\\projects\\event management project\\java learning\\src\\fileio\\file.txt");
        ObjectOutputStream out=new ObjectOutputStream(fout);
        out.writeObject(emp1);
        out.writeObject(emp2);
        out.flush();
        out.close();
    }

}