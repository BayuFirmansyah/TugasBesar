

import java.util.Scanner;

public class SaranaUtama {
    
    
private String NamaRuang;
private String LokasiRuang;
private String ProgramStudi;
private String Fakultas;
private int PanjangRuang;
private int LebarRuang;
private int JumlahKursi;
private int JumlahPintu;
private int JumlahJendela;
private int JumlahStopKontak;
private String KondisiStopKontak;
private String PosisiStopKontak;
private int JumlahKabelLCD;
private String KondisiKabelLCD;
private String PosisiKabelLCD;
private int JumlahLampu;
private String KondisiLampu;
private String PosisiLampu;
private int JumlahKipasAngin;
private String KondisiKipasAngin;
private String PosisiKipasAngin;
private int JumlahAC;
private String KondisiAC;
private String PosisiAC;
private String SSID;
private String Bandwidth;
private int JumlahCCTV;
private String KondisiCCTV;
private String PosisiCCTV;

    public String getNamaRuang() {
        return NamaRuang;
    }

    public void setNamaRuang(String NamaRuang) {
        this.NamaRuang = NamaRuang;
    }

    public String getLokasiRuang() {
        return LokasiRuang;
    }

    public void setLokasiRuang(String LokasiRuang) {
        this.LokasiRuang = LokasiRuang;
    }

    public String getProgramStudi() {
        return ProgramStudi;
    }

    public void setProgramStudi(String ProgramStudi) {
        this.ProgramStudi = ProgramStudi;
    }

    public String getFakultas() {
        return Fakultas;
    }

    public void setFakultas(String Fakultas) {
        this.Fakultas = Fakultas;
    }

    public int getPanjangRuang() {
        return PanjangRuang;
    }

    public void setPanjangRuang(int PanjangRuang) {
        this.PanjangRuang = PanjangRuang;
    }

    public int getLebarRuang() {
        return LebarRuang;
    }

    public void setLebarRuang(int LebarRuang) {
        this.LebarRuang = LebarRuang;
    }

    public int getJumlahKursi() {
        return JumlahKursi;
    }

    public void setJumlahKursi(int JumlahKursi) {
        this.JumlahKursi = JumlahKursi;
    }

    public int getJumlahPintu() {
        return JumlahPintu;
    }

    public void setJumlahPintu(int JumlahPintu) {
        this.JumlahPintu = JumlahPintu;
    }

    public int getJumlahJendela() {
        return JumlahJendela;
    }

    public void setJumlahJendela(int JumlahJendela) {
        this.JumlahJendela = JumlahJendela;
    }

    public int getJumlahStopKontak() {
        return JumlahStopKontak;
    }

    public void setJumlahStopKontak(int JumlahStopKontak) {
        this.JumlahStopKontak = JumlahStopKontak;
    }

    public String getKondisiStopKontak() {
        return KondisiStopKontak;
    }

    public void setKondisiStopKontak(String KondisiStopKontak) {
        this.KondisiStopKontak = KondisiStopKontak;
    }

    public String getPosisiStopKontak() {
        return PosisiStopKontak;
    }

    public void setPosisiStopKontak(String PosisiStopKontak) {
        this.PosisiStopKontak = PosisiStopKontak;
    }

    public int getJumlahKabelLCD() {
        return JumlahKabelLCD;
    }

    public void setJumlahKabelLCD(int JumlahKabelLCD) {
        this.JumlahKabelLCD = JumlahKabelLCD;
    }

    public String getKondisiKabelLCD() {
        return KondisiKabelLCD;
    }

    public void setKondisiKabelLCD(String KondisiKabelLCD) {
        this.KondisiKabelLCD = KondisiKabelLCD;
    }

    public String getPosisiKabelLCD() {
        return PosisiKabelLCD;
    }

    public void setPosisiKabelLCD(String PosisiKabelLCD) {
        this.PosisiKabelLCD = PosisiKabelLCD;
    }

    public int getJumlahLampu() {
        return JumlahLampu;
    }

    public void setJumlahLampu(int JumlahLampu) {
        this.JumlahLampu = JumlahLampu;
    }

    public String getKondisiLampu() {
        return KondisiLampu;
    }

    public void setKondisiLampu(String KondisiLampu) {
        this.KondisiLampu = KondisiLampu;
    }

    public String getPosisiLampu() {
        return PosisiLampu;
    }

    public void setPosisiLampu(String PosisiLampu) {
        this.PosisiLampu = PosisiLampu;
    }

    public int getJumlahKipasAngin() {
        return JumlahKipasAngin;
    }

    public void setJumlahKipasAngin(int JumlahKipasAngin) {
        this.JumlahKipasAngin = JumlahKipasAngin;
    }

    public String getKondisiKipasAngin() {
        return KondisiKipasAngin;
    }

    public void setKondisiKipasAngin(String KondisiKipasAngin) {
        this.KondisiKipasAngin = KondisiKipasAngin;
    }

    public String getPosisiKipasAngin() {
        return PosisiKipasAngin;
    }

    public void setPosisiKipasAngin(String PosisiKipasAngin) {
        this.PosisiKipasAngin = PosisiKipasAngin;
    }

    public int getJumlahAC() {
        return JumlahAC;
    }

    public void setJumlahAC(int JumlahAC) {
        this.JumlahAC = JumlahAC;
    }

    public String getKondisiAC() {
        return KondisiAC;
    }

    public void setKondisiAC(String KondisiAC) {
        this.KondisiAC = KondisiAC;
    }

    public String getPosisiAC() {
        return PosisiAC;
    }

    public void setPosisiAC(String PosisiAC) {
        this.PosisiAC = PosisiAC;
    }

    public String getSSID() {
        return SSID;
    }

    public void setSSID(String SSID) {
        this.SSID = SSID;
    }

    public String getBandwidth() {
        return Bandwidth;
    }

    public void setBandwidth(String Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    public int getJumlahCCTV() {
        return JumlahCCTV;
    }

    public void setJumlahCCTV(int JumlahCCTV) {
        this.JumlahCCTV = JumlahCCTV;
    }

    public String getKondisiCCTV() {
        return KondisiCCTV;
    }

    public void setKondisiCCTV(String KondisiCCTV) {
        this.KondisiCCTV = KondisiCCTV;
    }

    public String getPosisiCCTV() {
        return PosisiCCTV;
    }

    public void setPosisiCCTV(String PosisiCCTV) {
        this.PosisiCCTV = PosisiCCTV;
    }

 SaranaUtama kls = new SaranaUtama();
    Scanner in = new Scanner(System.in);
    int s = 0, ts = 0, kondisi;

    
    
    void masuk(){
        System.out.println("Masukkan Jumlah Stop Kontak : ");
        kls.setJumlahStopKontak(in.nextInt());
        System.out.println("Masukkan Kondisi Stop Kontak : ");
        kls.setKondisiStopKontak(in.next());
        System.out.println("Masukkan Posisi Stop Kontak : ");
        kls.setPosisiStopKontak(in.next());
        System.out.println("Masukkan Jumlah Kabel LCD : ");
        kls.setJumlahKabelLCD(in.nextInt());
        System.out.println("Masukkan Kondisi Kabel LCD : ");
        kls.setKondisiKabelLCD(in.next());
        System.out.println("Masukkan Posisi Kabel LCD : ");
        kls.setPosisiKabelLCD(in.next());
        System.out.println("Masukkan Jumlah Lampu : ");
        kls.setJumlahLampu(in.nextInt());
        System.out.println("Masukkan Kondisi Lampu : ");
        kls.setKondisiLampu(in.next());
        System.out.println("Masukkan Posisi Lampu : ");
        kls.setPosisiLampu(in.next());
        System.out.println("Masukkan Jumlah Kipas Angin : ");
        kls.setJumlahKipasAngin(in.nextInt());
        System.out.println("Masukkan Kondisi Kipas Angin : ");
        kls.setKondisiKipasAngin(in.next());
        System.out.println("Masukkan Posisi Kipas Angin : ");
        kls.setPosisiKipasAngin(in.next());
        System.out.println("Masukkan Jumlah AC : ");
        kls.setJumlahAC(in.nextInt());
        System.out.println("Masukkan Kondisi AC : ");
        kls.setKondisiAC(in.next());
        System.out.println("Masukkan Posisi AC : ");
        kls.setPosisiAC(in.next());
        System.out.println("Masukkan SSID : ");
        kls.setSSID(in.next());
        System.out.println("Masukkan Bandwidth : ");
        kls.setBandwidth(in.next());
        System.out.println("Masukkan Jumlah CCTV : ");
        kls.setJumlahCCTV(in.nextInt());
        System.out.println("Masukkan Kondisi CCTV : ");
        kls.setKondisiCCTV(in.next());
        System.out.println("Masukkan Posisi CCTV : ");
        kls.setPosisiCCTV(in.next());
    }
        
       
        
   double CekKondisiSarana() {
        
        if (kls.getJumlahStopKontak() >= 4) {
            System.out.println("Jumlah Stop Kontak : s");
            s++;
        } else {
            System.out.println("Tidak Sesusai");
            ts++;
        }
        if (kls.getKondisiStopKontak().equalsIgnoreCase("baik")){
            System.out.println("KondisiStopKontak : s");
            s++;
        } else {
            System.out.println("Tidak Sesuai");
        }
        if (kls.getPosisiStopKontak().equalsIgnoreCase("DekatDosen") || kls.getPosisiStopKontak().equalsIgnoreCase("PojokKelas")) {
            System.out.println("PosisiStopKontak : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getJumlahKabelLCD()>=1){
            System.out.println("JumlahKabelLCD : s");
            s++;

        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getKondisiKabelLCD().equalsIgnoreCase("baik")|| kls.getKondisiKabelLCD().equalsIgnoreCase("berfungsi")){
            System.out.println("KondisiKabelLCD : s");
            s++;
        }else{
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getPosisiKabelLCD().equalsIgnoreCase("dekatdosen")){
            System.out.println("PosisiKabelLCD : s");
            s++;
        }else{
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getJumlahLampu()>=18){
            System.out.println("JumlahLampu : s");
            s++;
        }else{
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getKondisiLampu().equalsIgnoreCase("baik")){
            System.out.println("KondisiLampu : s");
            s++;
        }else{
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getPosisiLampu().equalsIgnoreCase("atapruangan")){
            System.out.println("PosisiLampu : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getJumlahKipasAngin()>=2){
            System.out.println("JumlahKipasAngin : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getPosisiKipasAngin().equalsIgnoreCase("atapruangan")){
            System.out.println("PosisiKipasAngin : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getKondisiKipasAngin().equalsIgnoreCase("baik")){
            System.out.println("KondisiKipasAngin : s");
            s++;
        }else {
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getJumlahAC()>=1){
            System.out.println("JumlahAC : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getKondisiAC().equalsIgnoreCase("baik")){
            System.out.println("KondisiAC : s");
            s++;
        } else {
            System.out.println("Tidak s");
            s++;
        }
        if(kls.getPosisiAC().equalsIgnoreCase("belakang")|| kls.getPosisiAC().equalsIgnoreCase("samping")){
            System.out.println("PosisiAC : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getSSID().equalsIgnoreCase("ummhotspot")){
            System.out.println("getSSID : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getBandwidth().equalsIgnoreCase("bisa")){
            System.out.println("Bandwidth : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if (kls.getJumlahCCTV()>=2){
            System.out.println("JumlahCCTV : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getKondisiCCTV().equalsIgnoreCase("baik")){
            System.out.println("KondisiCCTV : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getPosisiCCTV().equalsIgnoreCase("depanbelakang")){
            System.out.println("PosisiCCTV : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        return s;
   }
   
        void output(){
         
        System.out.println("Jumlah Stop Kontak : "+JumlahStopKontak);
        System.out.println("Kondisi Stop Kontak : "+KondisiStopKontak);
        System.out.println("Posisi Stop Kontak : "+PosisiStopKontak);
        System.out.println("Jumlah Kabel LCD : "+JumlahKabelLCD);
        System.out.println("Kondisi Kabel LCD : "+KondisiKabelLCD);
        System.out.println("Posisi Kabel LCD : "+PosisiKabelLCD);
        System.out.println("Jumlah Lampu : "+JumlahLampu);
        System.out.println("Kondisi Lampu : "+KondisiLampu);
        System.out.println("Posisi Lampu : "+PosisiLampu);
        System.out.println("Jumlah Kipas Angin : "+JumlahKipasAngin);
        System.out.println("Kondisi Kipas Angin : "+KondisiKipasAngin);
        System.out.println("Posisi Kipas Angin : "+PosisiKipasAngin);
        System.out.println("Jumlah AC : "+JumlahAC);
        System.out.println("Kondisi AC : "+KondisiAC);
        System.out.println("Posisi AC : "+PosisiAC);
        System.out.println("SSID : "+SSID);
        System.out.println("Bandwidth : "+Bandwidth);
        System.out.println("Jumlah CCTV : "+JumlahCCTV);
        System.out.println("Kondisi CCTV : "+KondisiCCTV);
        System.out.println("Posisi CCTV : "+PosisiCCTV);
   }
 }

