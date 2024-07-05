 class Circle {
 	private int radius;
 	private double area;

 	public Circle(){

 	}

 	public Circle(int radius){
 		this.radius = radius;
 	}

// setter and getter method 
// java Bean class

 	public int getRadius(){
 		return radius;
 	}
 	public	void setRadius(int radius){
 		this.radius = radius;
 	}

 	public double getArea(){
 		return area;
 	}

 	public void findArea(){
 		area = Math.PI *(radius *radius);
 	}
 	
 	
 	
 }