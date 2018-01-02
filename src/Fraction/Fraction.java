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
public class Fraction {

    int num;
    int den;

    public Fraction(int n, int d) {
        num = n;
        den = d;
    }

    public Fraction plus(Fraction other) {
        Fraction temp = new Fraction(0, 1);
        temp.num = num * other.den + other.num * den;
        temp.den = den * other.den;
        return temp;
    }

    public double asDecimal() {
        return (double) num / den;
    }

    @Override
    public String toString() {
        return num + " / " + den;
    }

    public int gcd(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }

    public Fraction reduce() {
        int gcd = gcd(num, den);
        num /= gcd;
        den /= gcd;
        Fraction reduced = new Fraction(num, den);
        return reduced;
    }

    public Fraction minus(Fraction other) {
        Fraction f = new Fraction(1, 1);
        f.num = num * other.den - other.num * den;
        f.den *= other.den;
        f.reduce();
        return f;
    }

    public Fraction minus(int other) {
        Fraction f = new Fraction(1, 1);
        f.num = num - other * den;
        f.reduce();
        return f;
    }
}
