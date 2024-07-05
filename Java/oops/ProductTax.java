class ProductTax {
	
	String productName;
	int productId;
	float price;
	float gstPercent;
	float gstPrice;

	public ProductTax (String produtName,int produtId,float pric,float gstPercnt){
		productName =produtName;
		productId =produtId;
		price = pric;
		gstPercent =gstPercnt;
	}

	public void calcTax(){
		 gstPrice = (gstPercent / 100)*price;
		 gstPrice += price;
	//	System.out.println(gstPrice);
	}
	public int getProductId(){
		return productId;
	}
	public String getProductName(){
		return productName;
	}
	public float getProductPrice(){
		return price;
	}
	public float getGstPercentage(){
		return gstPercent;
	}
	public float getCalcTax(){
		return gstPrice;
	}
}
