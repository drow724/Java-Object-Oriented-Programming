package prat3.ex5.추상;

import part3.ex5.추상.Exam;
import part3.ex5.추상.ExamConsole;

public class Program {

	public static void main(String[] args) {
		//Exam exam = new NewlecExam();
		
		ExamConsole console = new NewlecExamConsole();
		console.input();
		console.print();
	}

}
