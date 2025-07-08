
import java.io.File;

public class FileHandling {
    public static void main(String[] args) {
        File file=new File("");
        if(file.exists()){
            System.out.println("File.exist: "+ file.getAbsolutePath());
        }
        else{
            System.out.println("File does not exists.");
        }
        if(file.isDirectory()){
            System.out.println("It is a directory.");
            File[]files = file.listFiles();
            if (files!=null){
                System.out.println("Files in the directory");
                for (File f : files) {
                    System.out.println(f.getName());
                }
                }else{
                    System.out.println("the directory in empty");
                }
            }
        }
        }

