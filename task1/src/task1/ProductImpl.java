package task1;
import javax.swing.JOptionPane;
import java.sql.*;




	

	public class ProductImpl implements ProductDAO {
		
		 
	    public void insert_Product(Product product) throws Exception {
	    	
	    	String URL="jdbc:mysql://localhost:3306/task1";
			String Uname="root";
			String Pass="";
			
			
			Class.forName("com.mysql.jdbc.Driver");
		    Connection con = DriverManager.getConnection(URL,Uname,Pass);
		    Statement st = con.createStatement();
	   	 Class.forName("com.mysql.jdbc.Driver");
	    PreparedStatement psmt = con.prepareStatement("insert into product values (?,?,?,?,?)");
		psmt.setString(1, product.getID());
		psmt.setString(2, product.getType());
		psmt.setString(3, product.getManufacturer());
		psmt.setString(4, product.getProductionDate());
		psmt.setString(5, product.getExpiryDate());
		psmt.executeUpdate();
		
	   
	     
	     // preparedStatement.executeUpdate();
	    
	    
	    
	    st.close();
	    con.close();
	    

	}
	    
	    public void delete_Product(String ID) throws Exception {
	    	String URL="jdbc:mysql://localhost:3306/task1";
			String Uname="root";
			String Pass="";
			
			
			Class.forName("com.mysql.jdbc.Driver");
		    Connection con = DriverManager.getConnection(URL,Uname,Pass);
		    Statement st = con.createStatement();
	   	  Class.forName("com.mysql.jdbc.Driver");
		    PreparedStatement psmt = con.prepareStatement("delete from product where ID=?");
		    psmt.setString(1, ID );
			psmt.executeUpdate();
		    
		    
		    
		    st.close();
		    con.close();
		    

		}
	    
	    
	    
 public void Update_Product(Product product ,String ID ) throws Exception {
	 String URL="jdbc:mysql://localhost:3306/task1";
		String Uname="root";
		String Pass="";
		
		
		Class.forName("com.mysql.jdbc.Driver");
	    Connection con = DriverManager.getConnection(URL,Uname,Pass);
	    Statement st = con.createStatement();
	        Class.forName("com.mysql.jdbc.Driver");
		    PreparedStatement psmt = con.prepareStatement(" UPDATE product SET  ID=?, type=?, manufacturer =?,Production_Date=?,Expiry_Date=? where ID=?;");
		    psmt.setString(1, product.getID());
			psmt.setString(2, product.getType());
			psmt.setString(3, product.getManufacturer());
			psmt.setString(4, product.getProductionDate());
			psmt.setString(5, product.getExpiryDate());
			psmt.setString(6,ID );
		    
		    
		    
		    
		    st.close();
		    con.close();
		    

		}
	    
	    
 public void select_Product(String Manufacturer) throws Exception {
	 String URL="jdbc:mysql://localhost:3306/task1";
		String Uname="root";
		String Pass="";
		
		
		Class.forName("com.mysql.jdbc.Driver");
	    Connection con = DriverManager.getConnection(URL,Uname,Pass);
	    Statement st = con.createStatement();
	     Class.forName("com.mysql.jdbc.Driver");
	   // PreparedStatement psmt = con.prepareStatement();
	     
	     PreparedStatement psmt = con.prepareStatement("select * from product where Manufacturer=?");
	     psmt.setNString(1, Manufacturer);
	     ResultSet rs =psmt.executeQuery();
	    while(rs.next()){
	    String Data=rs.getString(1)+ ":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getString(4)+":"+rs.getString(5);
	    System.out.println(Data);
	    }
	    
	    
	    
	    st.close();
	    con.close();
	    

	}  
 
	    
}
	

