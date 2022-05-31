package NerdleBack;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class main {
    
    public static int l;
    public static String result;
    public static LinkedList<String> equation2;
    
    public static void createEq(){
        do{
            GenerateEquation generateEquation = new GenerateEquation();
            l = 0;
            String equation = generateEquation.generateEquation();
            try {
                result = generateEquation.generateResult(generateEquation.getEquation());
            } catch (InvalidOperandException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
            l = generateEquation.calculateEquationLength(generateEquation.getEquation(), result);
            if((l >= 7 && l <= 9) && !result.equals("0")){
                System.out.println(generateEquation.getEquation());
                equation2 = generateEquation.getEquation();
                try {
                    System.out.println(generateEquation.generateResult(generateEquation.getEquation()));
                } catch (InvalidOperandException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }while((l < 7 || l > 9) || result.equals("0"));
    }
    
    public static void main(String[] args){
        createEq();
        StartWindow.main(args);
        
    }
}
