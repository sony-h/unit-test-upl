package omegatree.bangundatar;

import omegatree.poligon.*;

public class PersegiPanjang extends Poligon {
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = 4;
    }

    public double hitungLuas() {
        return this.panjang * this.lebar;
    }
    
    public double hitungKeliling() {
        return (this.panjang * 2) + (this.lebar * 2);
    }

    public double getPanjang() {
        return this.panjang;
    }
    
    public double getLebar() {
    	return this.lebar;
    }
}

