
public class Student extends Person {
	
	private int rollno;
	private String grade;
	private int marks;
	
	//default constructor
	public Student() {
		super();
	}

	
	//para constructor
	public Student(int rollno, String grade, int marks, int age, String gender, String name) {
		super(name,gender,age);
		this.rollno = rollno;
		this.grade = grade;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return super.toString()+"\n rollno:"+this.rollno+"\ngrade:"+this.grade+"\nmarks:"+this.marks;
	}
	
	
	
	

}
