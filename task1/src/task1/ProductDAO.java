package task1;



	public interface ProductDAO {
		 public void insert_Product(Product product) throws Exception ;
		 public void delete_Product(String ID) throws Exception ;
		 public void Update_Product(Product product, String ID) throws Exception ;
		 public void select_Product(String Manufacturer) throws Exception;

}
