/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author SAMSUNG
 */
public class Human {

    int weight;
    boolean isSexy = true;
    String name;
    
    
    Human (String myName) {
        this.name = new String (myName);
        this.name.toUpperCase();
    }
    
    public void setSexy (boolean kindSexy) {
        this.isSexy = kindSexy;
        
    }
    
    public String setWeight (int weight) {
        if (weight < 55) {
            this.weight = weight;
            return new String("Вес успешно установлен");
        }
        else {
            return "Ложь пиздешь и провокация";
        }
    }
    
    public static void staticMethodGetSomethg () {
        System.out.println("Smthg happens!");
    }
    
    @Override
    public String toString () {
        return ("Class Human. Instance:" + "\n" +
                           "isSexy: " + this.isSexy + "\n" +
                           "name: " + this.name + "\n" +
                           "weight: " + this.weight
                           );
    }
    
    public String toString (int verMix) {
        return ("Class Human. Instance:" + "\n" +
                           "name: " + this.name + "\n" +
                           "isSexy: " + this.isSexy + "\n" +
                           "weight: " + this.weight
                           );
    }
}
