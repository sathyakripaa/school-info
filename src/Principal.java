
public class Principal extends Person {
	private int no_of_service;

	public Principal() {
		super();
	}

	public Principal(int no_of_service, String name, String gender, int age) {
		super(name,gender,age);
		this.no_of_service = no_of_service;
	}

	@Override
	public String toString() {
		
		return super.toString()+"\nservice_years:"+this.no_of_service;
	}
	
	

}
