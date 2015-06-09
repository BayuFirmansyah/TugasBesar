private static Connection mysqlkonek;
 public static Connection koneksiDB() throws SQLException{
 
 
 if(mysqlkonek==null){
 try {
 String url="jdbc:mysql://localhost:3306/login";
 String user="root";
 String pass="";
 
 DriverManager.registerDriver(new com.mysql.jdbc.Driver());
 mysqlkonek = (Connection) DriverManager.getConnection(url,user,pass);
 
 
 } catch (Exception e) {
 JOptionPane.showMessageDialog(null,"gagal koneksi");
 }
 
 }
 
 return mysqlkonek;
 
 }
 public static void main (String args[]){
 
 }  

   
}
