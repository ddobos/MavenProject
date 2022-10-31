package curs16;

public class TestAnnotation {

	public static void main(String[] args) {
		Tester tester = new Tester();
		Developer dev = new Developer();
		
		if (tester.getClass().isAnnotationPresent(MostImportant.class)) {
			System.out.println("this Imployee is very important");
		}
		else {
			System.out.println("this imployee is not important");
			}
	}
}
