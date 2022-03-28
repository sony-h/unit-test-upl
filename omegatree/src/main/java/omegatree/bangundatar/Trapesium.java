package omegatree.bangundatar;

import omegatree.poligon.Poligon;

public class Trapesium extends Poligon {
	private double panjangSisiAtas;
	private double panjangSisiBawah;
	private double tinggi;
	
	public Trapesium(double panjangSisiAtas, double panjangSisiBawah, double tinggi) {
		this.panjangSisiAtas = panjangSisiAtas;
		this.panjangSisiBawah = panjangSisiBawah;
		this.tinggi = tinggi;
		this.jumlahSisi = 4;
	}
	
	public double hitungLuas() {
		return (this.panjangSisiAtas + this.panjangSisiBawah) * this.tinggi / 2;
	}
	
	public double getPanjangSisiAtas() {
		return this.panjangSisiAtas;
	}
	
	public double getPanjangSisiBawah() {
		return this.panjangSisiBawah;
	}
	
	public double getTinggi() {
		return this.tinggi;
	}
}
