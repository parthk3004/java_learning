package fileio;
import java.io.*;
public class Wordcount {

    public static int count(File file) throws IOException {
        if (file.exists()) {
            BufferedReader br = new BufferedReader(new FileReader(file));
            int count = 0;
            String str = "";
            while ((str = br.readLine()) != null) {
                String words[] = str.split(" ");
                count = count + words.length;
            }
            br.close();
            return count;
        } else {
            throw new IOException("file not found");
        }
    }
}