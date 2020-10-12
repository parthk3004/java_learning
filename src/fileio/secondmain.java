package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class secondmain {
        public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException {
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Users\\parth korawala\\Desktop\\projects\\event management project\\java learning\\src\\fileio\\file.txt"));
            employee e = (employee) in.readObject();
            System.out.print(e.getName() + e.getId() +"" + e.getSalary());
            in.close();
        }
    }
