package part3.ex5.추상;

import java.util.Scanner;

public abstract class ExamConsole {
	
//	private ExamList list;
//	
//	public ExamConsole() {
//		list = new ExamList();
//	}
	
//	Composition Has A 일체형
	private ExamList list = new ExamList();
	
	public void print() {
		
		print(list.size());
	}
		
	public void print(int size) {
		System.out.print("⎡            ⎤\n");
		System.out.print("⎢   성적출력   ⎟\n");
		System.out.print("⎣            ⎦\n");
		
//		int size = list.current;
		
		for(int i=0; i<size; i++) {
		Exam exam = list.get(i);//this.exams;
		int kor = exam.getKor();//exam.kor;
		int eng = exam.getEng();//exam.eng;
		int math = exam.getMath();//exam.math;
		
		int total = exam.total();//kor+eng+math;
		float avg = exam.avg();//total/3.0f;
		
		System.out.printf("국어 : %d\n", kor);
		System.out.printf("영어 : %d\n", eng);
		System.out.printf("수학 : %d\n", math);
		
		System.out.printf("총 : %d\n", total);
		System.out.printf("평 : %6.2f\n", avg);
		System.out.println("--------------------");
		}
	}
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("⎡            ⎤\n");
		System.out.print("⎢   성적입력   ⎟\n");
		System.out.print("⎣            ⎦\n");
			
			int kor,eng,math;

			do {
				System.out.printf("국어:");
				kor = scan.nextInt();
			
				if(kor<0 || 100<kor)
					System.out.println("성적범위(0~100)을 벗어났습니다.");
			}while(kor<0 || 100<kor);
			
			do {
				System.out.printf("영어:");
				eng = scan.nextInt();
			
				if(eng<0 || 100<eng)
					System.out.println("성적범위(0~100)을 벗어났습니다.");
			}while(eng<0 || 100<eng);
			
			do {
				System.out.printf("수학:");
				math = scan.nextInt();
			
				if(math<0 || 100<math)
					System.out.println("성적범위(0~100)을 벗어났습니다.");
			}while(math<0 || 100<math);
			
			//Exam exam = new Exam();
//			exam.setKor(kor);//exam.kor = kor;
//			exam.setEng(eng);//exam.eng = eng;
//			exam.setMath(math);//exam.math = math;
			
			//Exam exam = new Exam(kor, eng, math);
			Exam exam = makeExam();
			exam.setKor(kor);
			exam.setEng(eng);
			exam.setMath(math);
			/*-----------------------------------------*/
			
			list.add(exam);
	}

	protected abstract Exam makeExam();

}
