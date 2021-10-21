
public class PersonMain {

	public static void main(String[] args) {
		System.out.println("\nStudent details:");
		Student s=new Student(234, "A", 93, 22, "female", "sathya");
		System.out.println(s);
		
		System.out.println("\nteacher details:");
		Teacher t=new Teacher("science", 5, "jansi", "female", 39);
		System.out.println(t);
		
		System.out.println("\nprincipal details:");
		Principal p=new Principal(12, "lucy", "female", 52);
		System.out.println(p);
	}

}
