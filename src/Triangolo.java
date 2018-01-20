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
public class Triangolo {

    public Segmento cateto1, cateto2, ipotenusa;
    private double area, perimetro;
    public final boolean isTriangoloRettangolo;

    //;
    public Triangolo(Segmento cateto1, Segmento cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        //Per capire meglio: https://i.imgur.com/TWQ4u8B.png
        if (cateto1.getP2().equals(cateto2.getP1())) {                      //CASO ROSSO
            this.ipotenusa = new Segmento(cateto1.getP1(), cateto2.getP2());
        } else if (cateto1.getP1().equals(cateto2.getP1())) {               //CASO VERDE
            this.ipotenusa = new Segmento(cateto1.getP2(), cateto2.getP2());
        } else if (cateto1.getP2().equals(cateto2.getP2())) {               //CASO BLU
            this.ipotenusa = new Segmento(cateto1.getP1(), cateto2.getP1());
        } else {
            this.cateto1 = null;
            this.cateto2 = null;
            this.ipotenusa = null;
            this.isTriangoloRettangolo = false;
            return;
        }
        if (ipotenusa.getLunghezza() < cateto1.getLunghezza()) {                //Assegno alla variabile ipotenusa il segmento più lungo
            if (cateto1.getLunghezza() < cateto2.getLunghezza()) {
                Segmento temp = this.ipotenusa;
                this.ipotenusa = cateto2;
                this.cateto2 = temp;
            } else {
                Segmento temp = this.ipotenusa;
                this.ipotenusa = cateto1;
                this.cateto1 = temp;
            }
        }
        if (ipotenusa.getLunghezza() < cateto2.getLunghezza()) {
            Segmento temp = this.ipotenusa;
            this.ipotenusa = cateto2;
            this.cateto2 = temp;
        }
        this.perimetro = ipotenusa.getLunghezza() + cateto1.getLunghezza() + cateto2.getLunghezza();
        isTriangoloRettangolo = cateto1.getCoeffAngolare() == (1 / cateto2.getCoeffAngolare());
    }

    public double getArea() {
        return area;
    }

    public boolean isTriangoloRettangolo() {//;
        return isTriangoloRettangolo;
    }

    public double getPerimetro() {
        this.perimetro = ipotenusa.getLunghezza() + cateto1.getLunghezza() + cateto2.getLunghezza();
        return perimetro;
    }

}
