import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        readFile();
        writeFile();
        readFile();

    }

    public static void createFile(){
        File file = new File("C:\\Users\\rocke\\OneDrive\\Masaüstü\\files\\students.txt");

        try {
            if(file.createNewFile()){
                System.out.println("Dosya olusturuldu");
            }else{
                System.out.println("Dosya zaten mevcut");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo(){
        File file = new File("C:\\Users\\rocke\\OneDrive\\Masaüstü\\files\\students.txt");
        if(file.exists()){
            System.out.println("Dosya adi " + file.getName());
            System.out.println("Dosya yolu " + file.getAbsolutePath());
            System.out.println("Dosya Yazilabilir mi " + file.canWrite());
            System.out.println("Dosya Okunabilir mi " + file.canRead());
            System.out.println("Dosya Boyutu (byte) :  " + file.length());
        }
    }

    public static void readFile(){
        File file = new File("C:\\Users\\rocke\\OneDrive\\Masaüstü\\files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNextInt()){
                int line = reader.nextInt();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\rocke\\OneDrive\\Masaüstü\\files\\students.txt", true));
            writer.newLine();
            writer.write("222");
            System.out.println("Dosyaya Yazildi");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
