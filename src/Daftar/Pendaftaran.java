/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daftar;

import java.util.Scanner;

/**
 *
 * @author Anggita
 */
public class Pendaftaran implements Seleksi {
    
    public int tulis, coding, wawancara;

    public Pendaftaran(int tulis, int coding, int wawancara) {
        this.tulis = tulis;
        this.coding = coding;
        this.wawancara = wawancara;
    }

    @Override
    public double hasilAndro() {
        return (0.2*tulis)+(0.5*coding)+(0.3*wawancara);
    }

    @Override
    public double hasilWeb() {
        return (0.4*tulis)+(0.35*coding)+(0.25*wawancara);
    }

    
   
    
    
}
