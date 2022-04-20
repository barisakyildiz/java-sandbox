import java.rmi.server.ExportException;

public class Main {

    public static void main(String[] args) {

        try{
            int[] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[5]);
        }catch(StringIndexOutOfBoundsException exception){
            System.out.println(exception);
        }catch (Exception exception) {
            System.out.println("Loglandi");
        }
        finally{
            System.out.println("Ben her turlu Calisirim");
        }
    }
}
