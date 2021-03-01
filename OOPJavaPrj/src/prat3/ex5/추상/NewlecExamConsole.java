package prat3.ex5.추상;

import java.util.Scanner;

import part3.ex5.추상.Exam;
import part3.ex5.추상.ExamConsole;

public class NewlecExamConsole extends ExamConsole {

	@Override
	protected Exam makeExam() {
		// TODO Auto-generated method stub
		return new NewlecExam();
	}

	@Override
	protected void onPrint(Exam exam) {
		NewlecExam newlecExam = (NewlecExam)exam;
		int com = newlecExam.getCom();
		System.out.printf("컴퓨터 : %d\n", com);
	}

	@Override
	protected void onInput(Exam exam) {
		NewlecExam newlecExam = (NewlecExam)exam;
		
		Scanner scan = new Scanner(System.in);
		int com;
		do {
			System.out.printf("컴퓨터:");
			com = scan.nextInt();
		
			if(com<0 || 100<com)
				System.out.println("성적범위(0~100)을 벗어났습니다.");
			
		}while(com<0 || 100<com);
		
		newlecExam.setCom(com);
		
	}


}
