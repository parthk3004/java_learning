package lambda;

import java.io.File;
public class returnfilewithgivenextension {

        public static void main(String[] args) {
            File dir =  new File("C:\\Users\\parth korawala\\Desktop\\projects\\event management project\\java learning");
            File[] subdirs = dir.listFiles((d, name) -> name.toLowerCase().endsWith(".txt"));
            for(File s : subdirs) {
                System.out.println(s.getName());
            }
        }

    }
