public class Apples {

	public static void main(String[] args) {
		
		Tuna tunaObj = new Tuna();
		
		System.out.println(tunaObj.getMilitaryTime());
		System.out.println(tunaObj.getTime());
		tunaObj.setTime(12, 34, 11);
		System.out.println(tunaObj.getMilitaryTime());
		System.out.println(tunaObj.getTime());
		
	}

}
