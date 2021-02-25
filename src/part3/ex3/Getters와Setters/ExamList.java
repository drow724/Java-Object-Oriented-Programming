package part3.ex3.Getters와Setters;

import java.util.Scanner;

public class ExamList {
	
	private Exam[] exams;
	private int current;
	
	public void printList() {
		this.printList(this.current);
		}
		
	public void printList(int size) {
		System.out.print("⎡            ⎤\n");
		System.out.print("⎢   성적출력   ⎟\n");
		System.out.print("⎣            ⎦\n");
		
//		int size = list.current;
		Exam[] exams = this.exams; 
		
		for(int i=0; i<size; i++) {
		Exam exam = exams[i];
		int kor = exam.getKor();//exam.kor;
		int eng = exam.getEng();//exam.eng;
		int math = exam.getMath();//exam.math;
		
		int total = kor+eng+math;
		float avg = total/3.0f;
		
		System.out.printf("국어 : %d\n", kor);
		System.out.printf("영어 : %d\n", eng);
		System.out.printf("수학 : %d\n", math);
		
		System.out.printf("총 : %d\n", total);
		System.out.printf("평 : %6.2f\n", avg);
		System.out.println("--------------------");
		}
	}
	
	public void inputList() {
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
				
				Exam exam = new Exam();
				exam.setKor(kor);//exam.kor = kor;
				exam.setEng(eng);//exam.eng = eng;
				exam.setMath(math);//exam.math = math;
				
				Exam[] exams = this.exams;
				int size = this.current;
				
				if(exams.length == size) {
					//1.크기가 5개 정도 더 새로운 배열을 생성하시오.
					Exam[] temp = new Exam[this.exams.length + 5];
					//2.값을 이주시키기
					for(int i =0; i<size; i++)
						temp[i] = exams[i];
					//3. list.exams가 새로만든 temp 배열을 참조하도록 한다.
					this.exams = temp;
					
					
				}
				
				this.exams[this.current] = exam;
				this.current++;
		}
	
	public ExamList() {
		exams= new Exam[3];
		current = 0;
	}
}