public class Apples {

	public static void main(String[] args) {
		
		Tuna tunaObj = new Tuna();
		Tuna tunaObj2 = new Tuna(1);
		Tuna tunaObj3 = new Tuna(1, 2);
		Tuna tunaObj4 = new Tuna(1, 2, 3);
		
		Tuna tunaArray[] = {tunaObj, tunaObj2, tunaObj3, tunaObj4};
		
		for (Tuna x : tunaArray) {
			System.out.println(x.getMilitaryTime()); 
			System.out.println(x.getTime());
		}
		
	}

}
