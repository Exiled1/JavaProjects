package loopingName;

public class NameMethods {

	public static void main(String[] args) {
		FirstName();	LastName();
		
		System.out.println();
		
		FirstName(); 	MiddleName();	LastName();
		
		System.out.println();
		
		LastName();		MiddleName();	LastName();
	
		
	}
	
	public static void FirstName() {
		System.out.print("Rudy ");
	}
	public static void MiddleName() {
		System.out.print("Manuel");
	}
	public static void LastName() {
		System.out.print("Peralta Hernandez");
	}

}
