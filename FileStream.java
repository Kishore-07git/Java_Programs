import java.io.*;
public class FileStream 
{
    /*public static void main(String[] args) throws IOException 
    {
        String file = "sample.txt";

        // Writing to the file in append mode
        FileWriter write = new FileWriter(file, true);
        write.write("Hello, this is appended data.\n");
        write.close();

        // Reading from the file
        FileReader read = new FileReader(file);
        int ch;
        while ((ch = read.read()) != -1) {
            System.out.print((char) ch);
        }
        read.close();
    }
}*/
   public static void main(String[] args) throws IOException {
    FileReader fr=new FileReader("sample.txt");
    FileWriter fw=new FileWriter("sample.txt",true);
    int ch;
    do{
        ch=fr.read();
        if(ch!=-1)
        fw.write(ch);
    }while(ch!=-1);
    fr.close();
    String s="Appending a text";
    fw.write();
    fw.close();
}
}
