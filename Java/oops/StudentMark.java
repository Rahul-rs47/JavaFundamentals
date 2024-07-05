
class StudentMark{
	int studentId;
	String studentName;
	int mark1;
	int mark2;
	int mark3;
	int total;
	char grade;
	String result;

	public StudentMark(String studentName,int sId,int mark1,int mark2,int mark3){
		this.studentName = studentName ; 
// instance vaiable must be differentiated with "this." when local vaialble and instance variable are 
// are using same name.
// this. is not mandatory by deafault it means that ( this.datamembers ) -syntax

		studentId = sId;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	

	public void prepareMarkSheet(){
		total = mark1 + mark2 + mark3;
		//System.out.println("The Toatl mark is: " + total);
		if(mark1 > 50 && mark2 > 50 && mark3 > 50){
			result = "passed";
				
		}else{
			result ="failed";
		}
		

		int percentage =(int)(((float)total / 300)*100);

		//System.out.println(percentage);
		if(percentage >= 90){
			grade ='A';
		}else if(percentage >= 80 && percentage <=89){
			grade = 'B';
			}else if(percentage >= 70 && percentage <= 79){
				grade ='C';
				}else if(percentage >= 60 && percentage <= 79){
				grade ='D';
					}else if(percentage >= 50 && percentage <= 59){
					grade ='E';
						}else {
						grade ='F';
						}
		
	}

	public String getStudentName(){
		return studentName;
	}
	public int getStudentId(){
		return studentId;
	}
	public int getMark1(){
		return mark1;
	}
	public int getMark2(){
		return mark2;
	}
	public int getMark3(){
		return mark3;
	}
	public int getTotal(){
		return total;
	}
	public char getGrade(){
		return grade;
	}
	public String getResult(){
		return result;
	}

}	