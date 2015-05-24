
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Utama extends IdentitasKelas{

    private double luas;
    private double luasrasio;
    private int panjang;
    private int lebar;
    private int jumlahKursi;
    private int jumlahJendela;
    private int jumlahPintu;
   
    
    public Utama (String namaRuang , String lokasiRuang){
        this.namaRuang=namaRuang;
        this.lokasiRuang=lokasiRuang;
    }
    public Utama(){
        
    }

    
    void setData(String namaRuang , String lokasiRuang){
        this.namaRuang=namaRuang;
        this.lokasiRuang=lokasiRuang;
    }
    
    void setData(String namaRuang , String lokasiRuang, String prodi){
        this.namaRuang=namaRuang;
        this.lokasiRuang=lokasiRuang;
        this.prodi=prodi;
    }
    
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getLebar() {
        return lebar;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void setJumlahJendela(int jumlahJendela) {
        this.jumlahJendela = jumlahJendela;
    }

    public int getJumlahJendela() {
        return jumlahJendela;
    }
    
    
    @Override
    void inputawal(){
        Scanner in=new Scanner(System.in);
        System.out.println("Masukkan nama ruang anda : ");
        super.setNamaRuang(in.nextLine());
        System.out.println("Masukkan lokasi ruangan anda : ");
        super.setLokasiRuang(in.nextLine());
        System.out.println("Pilih program jurusan anda : ");
        super.setProdi(in.nextLine());
    }
   
    
    void input(){
        Scanner in = new Scanner (System.in);
        System.out.println("Panjang : ");
        setPanjang(in.nextInt());
        System.out.println("Lebar : ");
        setLebar(in.nextInt());
        System.out.println("Jumlah Kursi :");
        setJumlahKursi(in.nextInt());
        System.out.println("Jumlah Jendela :");
        setJumlahJendela(in.nextInt());
        System.out.println("Jumlah pintu : ");
        setJumlahPintu(in.nextInt());
            
    }
    
    double luas(){
        return panjang*lebar;
    }
    
    double luasrasio(){
        return luas()/jumlahKursi;
    }
    
    void input(String panjang){
        
    }
    void output(){
        System.out.println("Nama ruang anda : "+getNamaRuang());
        System.out.println("Lokasi ruangan anda ada di : "+getLokasiRuang());
        System.out.println("Jurusan/ program studi pilihan anda adalah : "+getProdi());
        System.out.println("Luas " + luas());
        System.out.println("Jumlah rasio luas " + luasrasio());
        System.out.println("Jumlah jendela  : "+ getJumlahJendela());
        System.out.println("jumlah pintu: "+ getJumlahPintu());
    }
    
}
