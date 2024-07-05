class EmployeeSalarySlip{
	

	String name;
	int employeeId;
	double basicPay;
	double hra;
	double da;
	double ta;
	double pf;
	double grossPay;
	double netPay;


	

	public void readEmployeeDetails(){
		System.out.println("Enter the employee name: ");
		name =Helper.getS();
		System.out.println("Enter the employee Id: ");
		employeeId = Helper.getI();
		System.out.println("Enter the employee BasicPay: ");
		basicPay = Helper.getI();


	}
	public void displaySalaryDetails(){
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Id: " + employeeId);
		System.out.println("Employee basicPay: " + basicPay);
		System.out.println("Employee HRA: " + hra);
		System.out.println("Employee DA: " + da);
		System.out.println("Employee TA: " + ta);
		System.out.println("Employee PF: " + pf);
		System.out.println("Employee GrossPay: " + grossPay);
		System.out.println("Employee netPay: " + netPay);


	}
	public void calculateHra(){
		 hra = 0.25 * basicPay;
		
	}
	public void calculateDa(){
		 da = 0.4 * basicPay;
		
	}
	public void calculateTa(){
		 ta = 0.1 * basicPay;

	}
	
	public void calculatePf(){
		pf = 0.12 * basicPay;
		
	}
	public void calculateGrossPay(){
		grossPay = basicPay;
			
	}
	public void calculateNetPay(){
		 netPay = grossPay-pf;
		
	}
	
	

}