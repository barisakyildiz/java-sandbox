package NerdleBack;

import java.util.*;


public class GenerateEquation {
    private LinkedList<String> equation = new LinkedList<String>(); //Storing the equation in a linked list for easier sequential access
    private Random randomGenerator = new Random();
    private String operators = "+-*/";
    private String selectedNum;
    private char selectedOp;
    private int numberOfOperators = 1;
    
    public char getRandomOperator(){
        return operators.charAt(randomGenerator.nextInt(operators.length()));
    }
    
    public String getRandomNumber(){
        return Integer.toString(randomGenerator.nextInt(100));
    }

    public String getSelectedNum() {
        return selectedNum;
    }

    public void setSelectedNum(String selectedNum) {
        this.selectedNum = selectedNum;
    }

    public char getSelectedOp() {
        return selectedOp;
    }

    public void setSelectedOp(char selectedOp) {
        this.selectedOp = selectedOp;
    }

    public LinkedList<String> getEquation() {
        return equation;
    }
    
    public String generateEquation(){
        String equation1 = "";
        for(int i = 0; i < numberOfOperators; i++){
            setSelectedNum(getRandomNumber());
            equation1 += getSelectedNum();
            equation.add(getSelectedNum());
            setSelectedOp(getRandomOperator());
            equation1 += getSelectedOp();
            equation.add(Character.toString(getSelectedOp()));
        }
        setSelectedNum(getRandomNumber());
        equation1 += getSelectedNum();
        equation.add(getSelectedNum());
        return equation1;
    }
    
    public String generateResult(LinkedList<String> eq){
        String gotString;
        ArrayList<Integer> intList = new ArrayList<Integer>();
        int number1;
        String op;
        int numberOP = (numberOfOperators * 2) + 1;
        for(int i = 0; i < numberOP; i++){
            if(i % 2 == 0){
                gotString = eq.get(i);
                number1 = Integer.parseInt(gotString);
                intList.add(number1);
            }else{
                gotString = eq.get(i);
                op = gotString;
            }
        }
        for(int i = 0; i < numberOfOperators; i++){
            switch (equation.get(1)) {
                case "+":
                    return Integer.toString((intList.get(i) + intList.get(i+1)));
                case "-":
                    return Integer.toString((intList.get(i) - intList.get(i+1)));                   
                case "*":
                    return Integer.toString((intList.get(i) * intList.get(i+1)));
                case "/":
                    return Integer.toString((intList.get(i) / intList.get(i+1)));
            }
        }
        
        return("Invalid GAME! Something Wrong Happenned");
    }
    
    public int calculateEquationLength(LinkedList<String> eq, String resultLen){
        char[] charArr;
        int totalLen = 0;
        for(int i = 0; i < eq.size(); i++){
            charArr = eq.get(i).toCharArray();
            totalLen += charArr.length;
        }
        charArr = resultLen.toCharArray();
        totalLen += charArr.length;
        totalLen++;
        return totalLen;
    }
    
    
}
