import part3.ex3.UI코드분리하기.Exam;

public class Program {

	public static void main(String[] args) {
		NewlecExam exam= new NewlecExam(1,1,1,1);
//		exam.setKor(10);
//		exam.setEng(10);
//		exam.setMath(10);
//		exam.setCom(10);//total값에 포함되지 않음
		System.out.println(exam.total());
		System.out.println(exam.avg());
	}
}
