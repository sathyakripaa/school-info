
public class Teacher extends Person {
	private String subject;
	private int exp;
	
	//default constructor
	public Teacher() {
		super();
	}

	//para constructor
	public Teacher(String subject, int exp, String name, String gender, int age) {
		super(name, gender, age);
		this.subject = subject;
		this.exp = exp;
	}

	@Override
	public String toString() {
		return super.toString() +"\nSubject:"+this.subject+"\nExperience:"+this.exp;
	}
	
	
	
	

}
