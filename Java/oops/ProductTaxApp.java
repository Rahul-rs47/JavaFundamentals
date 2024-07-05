class ProductTaxApp{
	public static void main(String args[]){

		System.out.println("Enter the product Name:");
		String productName = Helper.getS();
		System.out.println("Enter the product Id:");
		int productId = Helper.getI();
		System.out.println("Enter the productPrice");
		float productPrice = Helper.getF();
		System.out.println("Enter the GST percentage");
		float gstPercentage =Helper.getF();



		ProductTax product1 = new ProductTax(productName,productId,productPrice,gstPercentage);
		product1.calcTax();

		


		System.out.println("Product Name: " + product1.getProductName());
		System.out.println("Product Id: " + product1.getProductId());
		System.out.println("Product Price: " + product1.getProductPrice());
		System.out.println("Product Gst Percentage: " + product1.getGstPercentage());
		System.out.println("Product Gst price: " + product1.getCalcTax());

	}


}