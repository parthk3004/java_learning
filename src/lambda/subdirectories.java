package lambda;
import java.io.File;
public class subdirectories {
    public static void main(String args[]) {
        File dir =  new File("C:\\Users\\parth korawala\\Desktop\\projects\\event management project\\java learning");
        File[] subDirs = dir.listFiles((file)->{return file.isDirectory();});
        System.out.println("Name of sub directories ");
        for (File file : subDirs) {
            System.out.println(file.getName());
        }
    }
}