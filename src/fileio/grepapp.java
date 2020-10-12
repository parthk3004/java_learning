package fileio;
import java.util.*;
import java.io.*;
import java.io.BufferedReader;
public class grepapp {


    static Map<Integer,String> src;
    public static Map<Integer,String> search(String skey,File file)  throws IOException{
        src=new LinkedHashMap<Integer,String>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        int countline=1;
        String line;
        while((line = reader.readLine())!=null)
        {
            if(line.contains(skey))
            {
                src.put(countline, line);
            }
            countline++;
        }
        for( Integer i: src.keySet())
        {
            System.out.println(i+":"+src.get(i));
        }
        reader.close();
        return src;
    }
}