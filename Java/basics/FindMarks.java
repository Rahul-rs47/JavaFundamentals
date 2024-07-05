
import java.util.Scanner;

	class FindMarks {
		public static void main (String args[]){
			Scanner sc = new Scanner(System.in);



			System.out.println("Enter the name of the student followed by marks in the 4 subjects ");
			String  name  = sc.nextLine();
			System.out.println(" Enter Marks scored in Maths");
			int maths = sc.nextInt();
			System.out.println(" Enter Marks scored in Science");
			int science = sc.nextInt();
			System.out.println(" Enter Marks scored in SST");
			int sst = sc.nextInt();
			System.out.println(" Enter Marks scored in English");
			int english = sc.nextInt();


			//float average = findAverage(maths,science,sst,english);
			//String grade = findGrade(maths);
			//System.out.println(grade);
			System.out.println (" The total  Percentage  marks scored by   " + name + "For all Subjects is " + findAverage(maths,science,sst,english));
			System.out.println (" The grade scored by " + name + "For Maths is " + findGrade(maths));
			System.out.println (" The grade scored by " + name + "For Science is " + findGrade(science));
			System.out.println (" The grade scored by " + name + "For SST is " + findGrade(sst));
			System.out.println (" The grade scored by " + name + "For English is " + findGrade(english));
			
		}

			public static float findAverage(int value1,int value2,int value3,int value4){
				float average = ((value1 + value2 + value3 + value4) / 4) * 100;
				return average;
			}


			public static char findGrade(float value){
				char  grade;
				if (value <= 100 && value >= 90  ){
					 grade = 'A';

				}else if (value <= 89 && value >= 80){
					grade = 'B';
					}else if (value <= 79 && value >= 70){
						grade = 'C';
						}else if (value <= 69 && value >= 60){
						    grade = 'D';
							}else if (value <= 59 && value >= 50){
								grade = 'E';
								}else {
								grade = 'F' ;
								}
								return grade;
			}
			


					
					
					



			
	
	}		


			





