
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author the 12
 */
public class kebersihanRuang extends abstrax implements Inter {
    String lancar;
    
    private String SirkulasiUdara;
    private int NilaiPencahayaan;
    private int Kelembaban;
    private int Suhu;

    public String getLancar() {
        return lancar;
    }

    public void setLancar(String lancar) {
        this.lancar = lancar;
    }

    public String getSirkulasiUdara() {
        return SirkulasiUdara;
    }

    public void setSirkulasiUdara(String SirkulasiUdara) {
        this.SirkulasiUdara = SirkulasiUdara;
    }

    public int getNilaiPencahayaan() {
        return NilaiPencahayaan;
    }

    public void setNilaiPencahayaan(int NilaiPencahayaan) {
        this.NilaiPencahayaan = NilaiPencahayaan;
    }

    public int getKelembaban() {
        return Kelembaban;
    }

    public void setKelembaban(int Kelembaban) {
        this.Kelembaban = Kelembaban;
    }

    public int getSuhu() {
        return Suhu;
    }

    public void setSuhu(int Suhu) {
        this.Suhu = Suhu;
    }

   kebersihanRuang kls = new kebersihanRuang();
    Scanner in = new Scanner(System.in);
    int s = 0, ts = 0, kondisi;
    
     
    @Override
    public void inter(){
        Scanner in=new Scanner(System.in);
        System.out.println("kelancaran sirkulasi udara : ");
        setSirkulasiUdara(in.nextLine());
        System.out.println("nilai pencahayan : ");
        setNilaiPencahayaan(in.nextInt());
        System.out.println("nilai kelembapan : ");
        setKelembaban(in.nextInt());
        System.out.println("nilai suhu : ");
        setSuhu(in.nextInt());
    }
    
    
    int CekKondisiKebersihan() {
        int kon;
        if ("Lancar".equalsIgnoreCase(kls.getSirkulasiUdara())) {
            System.out.println("SirkulasiUdara : Lancar");
            s++;
        } else {
            System.out.println("Tidak Lancar");
            ts++;
        }
        if (kls.getNilaiPencahayaan() >= 250) {
            if (kls.getNilaiPencahayaan() <= 350) {
                System.out.println("NilaiPencahayaan : s");
            }
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if (kls.getKelembaban() >= 70) {
            if (kls.getKelembaban() <= 80) {
                System.out.println("Kelembaban : s");
            }
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        
        if (kls.getSuhu() >= 25) {
            if (kls.getSuhu() <= 35) {
                System.out.println("Suhu : s");
            }
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if (s > ts) {
            kon = 1;
        } else {
            kon = 0;
        }
        return s;
    }
   
    
    @Override
    String exter(){
      
        System.out.println("Sirkulasi Udara : "+SirkulasiUdara);
        System.out.println("Nilai Pencahayaan "+NilaiPencahayaan);
        System.out.println("Kelembaban : "+Kelembaban);
        System.out.println("Suhu : "+Suhu);
 
        
        
        return null;
        
    }

   
}
