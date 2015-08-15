package Problem2;

public class Student {

	String name;
	String subject;
	double grade;
	int yearInCollege ;
	int age;
	Boolean isDegree;
	double money;
	
	Student(){
		this.grade = 4.0;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;

	}
	
	Student(String name,String subject,int age ){
		this();
		this.name = "Pesho";
		this.subject = "IT";
		this.age = 20;
		
	}
	
	
	void upYear(){
		if (this.isDegree) {
			
			this.yearInCollege ++;
			
		}else if (!this.isDegree) {
			
			System.out.println("student still studying... ");
			
		}else if (yearInCollege > 4) {
			
			this.isDegree = true;
		}
		
	}
	
	 double receiveScholarship(double min, double amount) {
		 
		 if (this.grade >= min && this.age > 30 ) {
			
			 this.money += amount;
		}else {
			
			System.out.println("student still studying... ");
		}
		 
		return this.money;
		 
		 
		 
	 }
	
	
}
