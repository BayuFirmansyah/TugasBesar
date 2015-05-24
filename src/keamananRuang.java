
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
public class keamananRuang extends abstrax implements Inter{
    
    
   private String Kekokohan;
   private String KunciPintuJendela;
   private String Bahaya;

    public String getKekokohan() {
        return Kekokohan;
    }

    public void setKekokohan(String Kekokohan) {
        this.Kekokohan = Kekokohan;
    }

    public String getKunciPintuJendela() {
        return KunciPintuJendela;
    }

    public void setKunciPintuJendela(String KunciPintuJendela) {
        this.KunciPintuJendela = KunciPintuJendela;
    }

    public String getBahaya() {
        return Bahaya;
    }

    public void setBahaya(String Bahaya) {
        this.Bahaya = Bahaya;
    }

   keamananRuang kls = new keamananRuang();
    Scanner in = new Scanner(System.in);
    int s = 0, ts = 0, kondisi;
   
    
  @Override  
    public void inter(){
        Scanner in=new Scanner(System.in);
        System.out.println("masukan kekokohan : ");
        setKekokohan(in.nextLine());
        System.out.println("masukan kunci pintu dan jendela : ");
        setKunciPintuJendela(in.nextLine());
        System.out.println("masukan bahaya: ");
        setBahaya(in.nextLine());
    }
    
    
     int CekKondisiKeamanan() {
        int kon;
        
     if ("s".equalsIgnoreCase(kls.getKekokohan())) {
            System.out.println("Kekokohan : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if ("s".equalsIgnoreCase(kls.getKunciPintuJendela())) {
            System.out.println("KunciPintuJendela : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if ("s".equalsIgnoreCase(kls.getBahaya())) {
            System.out.println("Bahaya : s");
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
          
        System.out.println("Kekokohan : "+Kekokohan);
        System.out.println("Kunci Pintu dan Jendela : "+KunciPintuJendela);
        System.out.println("Bahaya : "+Bahaya); 

       
           
        return null;
           
       }
}
