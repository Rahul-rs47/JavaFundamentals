class EmployeeSalarySlipApp {
	
	public static void main(String args[]){

		
		EmployeeSalarySlip employee1 = new EmployeeSalarySlip();
		

		System.out.println("Enter the Employee Salary Slip details ");
		employee1.readEmployeeDetails();

		
		employee1.calculateHra();
		employee1.calculateTa();
		employee1.calculatePf();
		employee1.calculateDa();
		employee1.calculateGrossPay();	
		employee1.calculateNetPay();

		employee1.displaySalaryDetails();
		


	}
}