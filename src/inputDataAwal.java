
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import DB.input;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author the 12
 */
public class inputDataAwal extends javax.swing.JFrame {
  /*  public String namaRuang, lokasiruang, jurusan;
    GuiOutput fAB;
    

    public String getnama() {
        return namaRuang;
    }

    public String getlokasi() {
        return lokasiruang;
    }

    public String getjurus() {
        return jurusan;
    }*/
   
   public Connection con; 
    private String sql; // variabel "sql" digunakan menampung hasil query database
    private Statement st; // object "st" dari class Statement
    private ResultSet rs; // object "rs" dari class Resulset
    private PreparedStatement ps; // object "ps" dari class PreparedStatement
    private DefaultTableModel dtm; //object "dtm" dari class DefaultTableModel
   

    /**
     * Creates new form inputDataAwal
     */
    public inputDataAwal() {
        initComponents();
    }

    inputDataAwal(Object object, boolean closable) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        namaRuang = new javax.swing.JTextField();
        lokasiRuang = new javax.swing.JTextField();
        jurusan = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MV Boli", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Identitas Kelas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 206, 52));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("Nama Ruang");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 111, 29));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setText("Lokasi Ruang");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 101, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 0));
        jLabel4.setText("Jurusan");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 69, -1));

        namaRuang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaRuangActionPerformed(evt);
            }
        });
        jPanel1.add(namaRuang, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 74, 201, -1));

        lokasiRuang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lokasiRuangActionPerformed(evt);
            }
        });
        jPanel1.add(lokasiRuang, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 117, 201, -1));

        jurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jurusanActionPerformed(evt);
            }
        });
        jPanel1.add(jurusan, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 157, 201, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("Lanjut");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 237, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 255));
        jButton3.setText("Hapus ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 237, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("E:\\GAMBAR.otb\\Jpg.otb\\akaTsuKi_dEidaRa.jpg")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 410, 310));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>                        

    private void namaRuangActionPerformed(java.awt.event.ActionEvent evt) {                                          

    }                                         

    private void lokasiRuangActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jurusanActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
try {
             String sql="insert into tbjava','input awal values('"+namaRuang.getText()
                                             +"','"+lokasiRuang.getText()
                                             +"','"+jurusan.getText()+"')"; 
            st=con.createStatement(); 
            st.executeUpdate(sql); 
            JOptionPane.showMessageDialog(null, "DATA SUKSES TERSIMPAN"); 
           
           } catch (Exception e)
           {
            JOptionPane.showMessageDialog(null, "DATA GAGAL TERSIMPAN"); 
//indikator yang sitampilkan pada comand dialog jika data gagal tersimpan
            }

        
        GuiInput qaz=new GuiInput();
        qaz.setVisible(true); 
        this.dispose();// TODO add your handling code here:
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
try{
   
    namaRuang.setText("");
    lokasiRuang.setText("");
    jurusan.setText("");
}catch (Exception e){
}// TODO add your handling code here:
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(inputDataAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inputDataAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inputDataAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inputDataAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inputDataAwal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jurusan;
    private javax.swing.JTextField lokasiRuang;
    private javax.swing.JTextField namaRuang;
    // End of variables declaration                   
}
