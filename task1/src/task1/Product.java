package task1;
public class Product {
	private String ID;
	private String type;
	private String manufacturer;
	private String productionDate;
	private String expiryDate;
	
	public Product(){
	/*	this.ID = ID;
		this.type = type;
		this.manufacturer = manufacturer;
		this.productionDate = productionDate;
		this.expiryDate = expiryDate;*/
	}
	
	public void setID(String iD) {
		this.ID = iD;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setProductionDate(String productionDate) {
		this.productionDate = productionDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getID() {
		return ID;
	}
	
	public String getType() {
		return type;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	public String getProductionDate() {
		return productionDate;
	}
	
	public String getExpiryDate() {
		return expiryDate;
	}
}