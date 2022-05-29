/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NerdleBack;

public class main {
    

    
    public static void main(String[] args){
        GenerateEquation generateEquation = new GenerateEquation();
        String equation = generateEquation.generateEquation();
        System.out.println(equation);
        System.out.println(generateEquation.getEquation());
        System.out.println(generateEquation.generateResult(generateEquation.getEquation()));
    }
}
