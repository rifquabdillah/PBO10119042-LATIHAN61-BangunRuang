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
public class Kerucut extends BangunRuang {

private final float r;
private final float t;

public Kerucut(int r, int t){
    this.r=r;
    this.t=t;
}

@Override

public float hitungVolume(){
    double volume = (0.33333333333*Math.PI*Math.pow(r,2)*t);
        return (float) volume;
}
}
