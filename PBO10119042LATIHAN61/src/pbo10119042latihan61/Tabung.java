/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119042latihan61;

/**
 *
 * @author Muhammad Rifqu Abdillah
 * NIM  : 10119042
 * Kelas:IF-1
 */
public class Tabung extends BangunRuang {
    private final float r;
    private final float h;
    
    public Tabung(int r, int h){
        this.r=r;
        this.h=h;
    }
    
    @Override
    public float hitungVolume(){
        double volume=(Math.PI*Math.pow(r,2)*h);
        return (float) volume;
    }
    
}
