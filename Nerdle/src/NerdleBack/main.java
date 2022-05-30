package NerdleBack;

public class main {
    
    public static int l;
    public static String result;
    
    public static void main(String[] args){
        do{
            GenerateEquation generateEquation = new GenerateEquation();
            l = 0;
            String equation = generateEquation.generateEquation();
            result = generateEquation.generateResult(generateEquation.getEquation());
            l = generateEquation.calculateEquationLength(generateEquation.getEquation(), result);
            if((l >= 7 && l <= 9) && !result.equals("0")){
                System.out.println(generateEquation.getEquation());
                System.out.println(generateEquation.generateResult(generateEquation.getEquation()));
            }
        }while((l < 7 || l > 9) || result.equals("0"));
        
    }
}
