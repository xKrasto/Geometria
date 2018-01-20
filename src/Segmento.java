/*
 * The MIT License
 *
 * Copyright 2018 Alex.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

/**
 *
 * @author Alex
 */
public class Segmento {

    private Punto p1, p2;
    private double lunghezza, coeffAngolare;

    public Segmento(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
        coeffAngolare = calcolaCoefficenteAngolare(p1, p2);
        lunghezza = calcolaLunghezza(p1, p2);
    }

    public static double calcolaCoefficenteAngolare(Punto p1, Punto p2) {
        return (p2.y - p1.y) / (p2.x - p1.x);
    }

    public static double calcolaLunghezza(Punto p1, Punto p2) {
        return java.lang.Math.sqrt(((p2.x - p1.x) * (p2.x - p1.x)) + ((p2.y - p1.y) * (p2.y - p1.y)));
    }

    public double getLunghezza() {
        return lunghezza;
    }

    public double getCoeffAngolare() {
        return coeffAngolare;
    }

    public Punto getP1() {
        return p1;
        //Fatto da Alex
    }

    public void setP1(Punto p1) {
        this.p1 = p1;                                               //Se modifico le coordinate di un punto la lunghezza e CA cambiano di conseguenza
        this.lunghezza = calcolaLunghezza(this.p1, this.p2);
        coeffAngolare = calcolaCoefficenteAngolare(this.p1, this.p2);
    }

    public Punto getP2() {
        return p2;
    }

    public void setP2(Punto p2) {
        this.p2 = p2;                                               //Se modifico le coordinate di un punto la lunghezza e CA cambiano di conseguenza
        this.lunghezza = calcolaLunghezza(this.p1, this.p2);
        coeffAngolare = calcolaCoefficenteAngolare(this.p1, this.p2);
    }
}



//;
