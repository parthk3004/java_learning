package fileio;
import java.io.*;

public class Linecount {

    public static int count (String location) throws IOException
    {
        File file  = new File(location);

        int count=0;
        if(file.exists())
        {
            BufferedReader br=new BufferedReader(new FileReader(location));
        while(br.readLine()!=null) {
            count++;
        }
        br.close();
        return count;
    }
        else {
            throw new FileNotFoundException("File not found");
        }
    }
}
