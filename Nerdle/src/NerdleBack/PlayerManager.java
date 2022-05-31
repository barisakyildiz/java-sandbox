
package NerdleBack;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PlayerManager {
    
    private String saveFileName = "savefile.txt";
    private String scoresFileName = "scoresfile.txt";


    public String getSaveFileName() {
        return saveFileName;
    }


    public String getScoresFileName() {
        return scoresFileName;
    }

    public static void saveToFile(String saveFileName){
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(saveFileName));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PlayerManager.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    
    
    
}
