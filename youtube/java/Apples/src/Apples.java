public class Apples {

	public static void main(String[] args) {
		
		Tuna tunaObj = new Tuna(1, 3, 42);
		
		String militaryTime = tunaObj.getMilitaryTime();
		String standardTime = tunaObj.getTime();
		
		System.out.println(militaryTime);
		System.out.println(standardTime);
		
	}

}
