
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
public class kondisiRuang extends abstrax implements Inter{
    String bersih;
    
    private String Lantai;
    private String dinding;
    private String Atap;
    private String Pintu;
    private String Jendela;


    public String getLantai() {
        return Lantai;
    }

    public void setLantai(String Lantai) {
        this.Lantai = Lantai;
    }

    public String getDinding() {
        return dinding;
    }

    public void setDinding(String dinding) {
        this.dinding = dinding;
    }

    public String getAtap() {
        return Atap;
    }

    public void setAtap(String Atap) {
        this.Atap = Atap;
    }

    public String getPintu() {
        return Pintu;
    }

    public void setPintu(String Pintu) {
        this.Pintu = Pintu;
    }

    public String getJendela() {
        return Jendela;
    }

    public void setJendela(String Jendela) {
        this.Jendela = Jendela;
    }
    
    kondisiRuang kls = new kondisiRuang();
    Scanner in = new Scanner(System.in);
    int s = 0, ts = 0, kondisi;
   
    
    
     @Override
    public void inter(){
        Scanner in=new Scanner(System.in);
        System.out.println("Masukkan kondisi lantai : ");
        setLantai(in.nextLine());
        System.out.println("Masukkan kondisi dinding : ");
        setDinding(in.nextLine());
        System.out.println("masukan kondisi atap : ");
        setAtap(in.nextLine());
        System.out.println("Masukkan kondisi pintu : ");
        setPintu(in.nextLine());
        System.out.println("Masukkan kondisi jendela : ");
        setJendela(in.nextLine());
    }
    
    int CekKondisiLingkungan() {
        
        int kon;
        if (kls.getLantai().equalsIgnoreCase("bersih")) {
            System.out.println("getKondisiLantai : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if (kls.getDinding().equalsIgnoreCase("bersih")){
            System.out.println("KondisiDinding : s");
            s++;
        }else {
            ts++;
            System.out.println("Tidak s");
        }
        if (kls.getAtap().equalsIgnoreCase("bersih")){
            System.out.println("KondisiAtap : s");
            s++;
        }else{
            System.out.println("Tidak s");
            ts++;
        }
        if (kls.getPintu().equalsIgnoreCase("bersih")){
            System.out.println("KondisiPintu : s");
            s++;
        }else {
            System.out.println("Tidak s");
            ts++;
        }
        if (kls.getJendela().equalsIgnoreCase("bersih")){
            System.out.println("getKondisiJendela : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        
        if (s > ts) {
            System.out.println("Bersih");
            kon = 1;
        } else {
            System.out.println("Kotor");
            kon = 0;
        }
        return s;
    }
       
       
       @Override
       String exter(){
           
          System.out.println("Kondisi Lantai : "+Lantai); 
          System.out.println("Kondisi Dinding : "+dinding);
          System.out.println("Kondisi Atap : "+Atap);
          System.out.println("Kondisi Pintu : "+Pintu);
          System.out.println("Kondisi Jendela : "+Jendela);
        return null;    
       }
}

