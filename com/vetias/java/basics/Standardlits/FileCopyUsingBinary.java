
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyUsingBinary {
    public static void main(String[] args) {
        try (FileInputStream InputStream=new FileInputStream("animie.qr");
        FileOutputStream OutputStream=new FileOutputStream("ANIMIE"))
        {
            byte[] chunk=new byte[1024];
            int byteRead;
            while( (byteRead=InputStream.read(chunk))!=-1){
                OutputStream.write(chunk,0,byteRead);
            }
            
        } catch (Exception e) {
            System.out.println("Erroe in reading or writing the file");
        }
    }

}
