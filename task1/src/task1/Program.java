package task1;
import java.util.Scanner; 

public class Program {

	public static void main(String[] args) throws Exception {
		
		
	   ProductImpl dao = new  ProductImpl();
	   
		Product new_product = new Product();
		char select ;
		
		do  
		{
			System.out.print("insert A- to insert new product \n B- to delete \n c- to update a product \n D- to retrieve \n E- to EXIT \n ");
			Scanner inp = new Scanner(System.in); 
			select = inp.next().charAt(0);	
		
		switch (select)
		{
		case 'A':
		
		System.out.print("insert productID ");
        Scanner input = new Scanner(System.in);
        String ID = input.nextLine();
        System.out.print("insert productType ");
        String Type = input.nextLine();
        System.out.print("insert productManufacturer");
        String Manufacturer = input.nextLine();
        System.out.print("insert Production_Date ");
        String Production_Date = input.nextLine();
        System.out.print("insert Expiry_Date ");
        String Expiry_Date = input.nextLine();
         
		new_product.setID(ID);
		new_product.setType(Type);
		new_product.setManufacturer(Manufacturer);
		new_product.setProductionDate(Production_Date);
		new_product.setExpiryDate(Expiry_Date);
		dao.insert_Product(new_product);
		break;
		// .........................................................
   
		case 'B':   
		System.out.println("insert The productID  of Product you want to delete");
		 Scanner input1 = new Scanner(System.in);
	      String ID1 = input1.nextLine();
	      
       dao.delete_Product(ID1);
       break;
       //...............................................................................
		case 'C':
       System.out.println("insert productID to update a new product");
		 Scanner input2 = new Scanner(System.in);
	      String ID_D = input2.nextLine();
   	  System.out.println("insert productID ");
     
      String Id = input2.nextLine();
    System.out.println("insert productType ");
    String T = input2.nextLine();
    System.out.println("insert productManufacturer");
    String Man = input2.nextLine();
    System.out.println("insert Production_Date ");
    String Prod_Date = input2.nextLine();
    System.out.println("insert Expiry_Date ");
    String Expir_Date = input2.nextLine();
     
	new_product.setID(Id);
	new_product.setType(T);
	new_product.setManufacturer(Man);
	new_product.setProductionDate(Prod_Date);
	new_product.setExpiryDate(Expir_Date);
       dao.Update_Product(new_product, ID_D);
       break;
       // ............................................................................
		case 'D':
		System.out.println("insert manufacture to retrieve the products ");
		 Scanner input3 = new Scanner(System.in);
	      String manufacturer = input3.nextLine();
       dao.select_Product(manufacturer);
      break;
      
		}
		}while (select!='E');
		}
	}
	
	

