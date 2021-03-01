package prat3.ex5.추상;

import part3.ex5.추상.Exam;
import part3.ex5.추상.ExamConsole;

public class NewlecExamConsole extends ExamConsole {

	@Override
	protected Exam makeExam() {
		// TODO Auto-generated method stub
		return new NewlecExam();
	}


}
