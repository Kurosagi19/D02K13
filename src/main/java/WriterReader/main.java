package WriterReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        try{
            FileReader fileReader = new FileReader("C:\\Users\\TôLânThành\\OneDrive - bkacad.edu.vn\\Documents\\Lap trinh Java\\demo.txt");
//            FileWriter fileWriter = new FileWriter("C:\\Users\\TôLânThành\\OneDrive - bkacad.edu.vn\\Documents\\Lap trinh Java\\demo.txt");
            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.println((char)i);
            }
            System.out.println(fileReader.read());
            fileReader.close();
            FileWriter fileWriter = new FileWriter(demo.txt, true);
            fileWriter.write("\nXin chao");
            fileWriter.write("Xin chao the gioi");
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Khong tim thay file");
        } catch (IOException e) {

        }
    }
}
