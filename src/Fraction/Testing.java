/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fraction;

/**
 *
 * @author 348676487
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fraction a = new Fraction(20,5);
        Fraction b = new Fraction(5,5);
        int c = 2;
        
        System.out.println(a.reduce());
        System.out.println(a.minus(b));
        System.out.println(a.minus(c));
    }
}
