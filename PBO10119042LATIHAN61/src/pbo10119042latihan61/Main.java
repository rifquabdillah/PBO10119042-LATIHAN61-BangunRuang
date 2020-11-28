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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bola b = new Bola(7);
        System.out.printf("Volume bola\t= %.1f%n", b.hitungVolume());
        
        Tabung t = new Tabung(10,21);
        System.out.printf("Volume tabung\t= %.1f%n", t.hitungVolume());
        
        Kerucut k = new Kerucut(14,9);
        System.out.printf("Volume kerucut\t= %.0f%n", k.hitungVolume());
        
    }
    
}
