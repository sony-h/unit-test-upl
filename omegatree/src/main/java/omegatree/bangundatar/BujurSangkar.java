package omegatree.bangundatar;

import omegatree.poligon.*;

public class BujurSangkar extends Poligon {
    private double panjangSisi;

    public BujurSangkar(double panjangSisi) {
        this.panjangSisi = panjangSisi;
        this.jumlahSisi = 4;
    }

    public double hitungLuas() {
        return this.panjangSisi * this.panjangSisi;
    }
    
    public double hitungKeliling() {
        return this.panjangSisi * this.jumlahSisi;
    }

    public double getPanjangSisi() {
        return this.panjangSisi;
    }
    
}
