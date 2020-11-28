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
class Bola extends BangunRuang {
    private final float r;
    
    public Bola(int r){
        this.r=r;
        
    }
    
    @Override
    public float hitungVolume(){
        double volume = (1.33333333333*Math.PI*Math.pow(r,3));
        return (float) volume;
    }
    
}
