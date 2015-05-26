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
    
    void inputInter(){
        keamananRuang qaz=new keamananRuang();
        kebersihanRuang qwe=new kebersihanRuang();
        kenyamananRuang iop=new kenyamananRuang();
        kondisiRuang sds=new kondisiRuang();
        qaz.inter();
        qwe.inter();
        iop.inter();
        sds.inter();
    
        }
    
    void outputAbstrax(){
        
    }
        
    
     
    
    void kondisiRuang(){
        kondisiRuang qaz=new kondisiRuang();
        
        qaz.CekKondisiLingkungan();
        qaz.exter();
        
    }
    
    
    void kebersihanRuang(){
        kebersihanRuang qaz=new kebersihanRuang();
        ;
        qaz.CekKondisiKebersihan();
        qaz.exter();
        
    }
    
    
    void kenyamananRuang(){
        kenyamananRuang qaz=new kenyamananRuang();
        
        qaz.CekKondisiKenyamanan();
        qaz.exter();
        
    }
    
    
    void keamananRuang(){
        keamananRuang qaz=new keamananRuang();
        
        qaz.CekKondisiKeamanan();
        qaz.exter();
    }

}
