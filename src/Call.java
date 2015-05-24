/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author the 12
 */
public class Call {
    
                   
    
    void utama(){
        Utama qaz=new Utama();
        qaz.inputawal();
        qaz.input();
        qaz.luas();
        qaz.luasrasio();
        qaz.output();
    }
    
    void saranaUtama(){
        SaranaUtama qaz  = new SaranaUtama();
        qaz.masuk();
        qaz.CekKondisiSarana();
        qaz.output();
        
}
     
    
    void kondisiRuang(){
        kondisiRuang qaz=new kondisiRuang();
        qaz.inter();
        qaz.CekKondisiLingkungan();
        qaz.exter();
        
    }
    
    
    void kebersihanRuang(){
        kebersihanRuang qaz=new kebersihanRuang();
        qaz.inter();
        qaz.CekKondisiKebersihan();
        qaz.exter();
        
    }
    
    
    void kenyamananRuang(){
        kenyamananRuang qaz=new kenyamananRuang();
        qaz.inter();
        qaz.CekKondisiKenyamanan();
        qaz.exter();
        
    }
    
    
    void keamananRuang(){
        keamananRuang qaz=new keamananRuang();
        qaz.inter();
        qaz.CekKondisiKeamanan();
        qaz.exter();
    }

}
