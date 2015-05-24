
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
public class kenyamananRuang extends abstrax implements Inter{
   
    
    private String Kebisingan;
    private String Bau;
    private String Kebocoran;
    private String Kerusakan;
    private String Keausan;

    public String getKebisingan() {
        return Kebisingan;
    }

    public void setKebisingan(String Kebisingan) {
        this.Kebisingan = Kebisingan;
    }

    public String getBau() {
        return Bau;
    }

    public void setBau(String Bau) {
        this.Bau = Bau;
    }

    public String getKebocoran() {
        return Kebocoran;
    }

    public void setKebocoran(String Kebocoran) {
        this.Kebocoran = Kebocoran;
    }

    public String getKerusakan() {
        return Kerusakan;
    }

    public void setKerusakan(String Kerusakan) {
        this.Kerusakan = Kerusakan;
    }

    public String getKeausan() {
        return Keausan;
    }

    public void setKeausan(String Keausan) {
        this.Keausan = Keausan;
    }
    

    kenyamananRuang kls = new kenyamananRuang();
    Scanner in = new Scanner(System.in);
    int s = 0, ts = 0, kondisi;
    
    
    
    @Override
    public void inter(){
        Scanner in=new Scanner(System.in);
        System.out.println("masukan kebisingan : ");
        setKebisingan(in.nextLine());
        System.out.println("masukan bau : ");
        setBau(in.nextLine());
        System.out.println("masukan kebocoran: ");
        setKebocoran(in.nextLine());
        System.out.println("masukan kerusakan : ");
        setKerusakan(in.nextLine());
    }
    
     int CekKondisiKenyamanan() {
        int kon;
        if ("s".equalsIgnoreCase(kls.getKebisingan())) {
            System.out.println("Kebisingan : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if ("s".equalsIgnoreCase(kls.getBau())) {
            System.out.println("Bau : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if ("s".equalsIgnoreCase(kls.getKerusakan())) {
            System.out.println("Kerusakan : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if ("s".equalsIgnoreCase(kls.getKeausan())) {
            System.out.println("Keausan : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if (s == 1) {
            System.out.println("s");
            kon = 1;
        } else {
            System.out.println("Tidak s");
            kon = 0;
        }
        return s;
     }
     
       String exter(){
      
        System.out.println("Kebisingan : "+Kebisingan);
        System.out.println("Bau : "+Bau);
        System.out.println("Kebocoran : "+Kebocoran);
        System.out.println("Kerusakan : "+Kerusakan);
        System.out.println("Keausan : "+Keausan);
           
           
           return null;
            
       }
}
