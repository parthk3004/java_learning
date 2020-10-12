package collections.bank;
import java.io.*;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

public class bankaccountlist {
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        savingaccount s1 = new savingaccount(1000,1,"Parth Korawala",true);
        savingaccount s2 = new savingaccount(2000,4,"Arman shroff",true);
        savingaccount s3 = new savingaccount(3000,6,"Paras shah",true);
        savingaccount s4 = new savingaccount(4000,3,"shivani gupta",false);
        savingaccount s5 = new savingaccount(5000,9,"Nikhil Bhutra",false);
        ArrayList<savingaccount> list = new ArrayList<savingaccount>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        System.out.println("Print");
        for(savingaccount s : list) {
            System.out.println(s);
        }
        System.out.println("Display using file");
        FileOutputStream fout = new FileOutputStream("C:\\Users\\parth korawala\\Desktop\\projects\\event management project\\java learning\\src\\collections\\bank\\accounts.txt");
        ObjectOutputStream out=new ObjectOutputStream(fout);
        out.writeObject(list);
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Users\\parth korawala\\Desktop\\projects\\event management project\\java learning\\src\\collections\\bank\\accounts.txt"));
        ArrayList<savingaccount> listDisp = (ArrayList<savingaccount>) in.readObject();
        listDisp.stream().forEach(i->System.out.println(i));
        //display in sorted order as per acc_id
        Collections.sort(listDisp, (l1,l2)->Integer.toString(l1.getAcc_Id()).compareTo(Integer.toString(l2.getAcc_Id())));
        System.out.println("Display sorted by accID");
        listDisp.forEach(l->System.out.println(l));
    }
}