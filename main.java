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
public class main {
    
    public static void main(String[] args) {
        Human iLintu = new Human ("Ксения");
        //String setWeightResponse = new String ("");
        String setWeightResponse = iLintu.setWeight(100);
        System.out.println(setWeightResponse);

        System.out.println(iLintu.toString(555));
        
    }
    
}
