import part3.ex3.UI코드분리하기.Exam;

public class Program {

	//1. 컴파일 -> Exam.class
	//2. 압축 -> Exam.zip
	//3. jar -> Exam.jar
	
	//>javac -cp "d:\java\examlib.jar" Program.java
	
	public static void main(String[] args) {
		Exam exam= new Exam(1, 1, 1);
		
		System.out.println(exam.total());
	}
}
