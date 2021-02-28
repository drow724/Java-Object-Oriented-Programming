import part3.ex3.UI코드분리하기.Exam;

public class NewlecExam extends Exam{
//	private Exam exam;
	
	private int com;
	
	public NewlecExam() {
		this(0,0,0,0);
	}
	
	public NewlecExam(int kor, int eng, int math, int com) {
		
//		this.setKor(kor);
		super(kor, eng, math);
		this.com = com;
	}
	
	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = com;
	}
//	public int total() {
//	
//}
@Override
	public int total() {

//		return this.getKor()+this.getEng()+this.getMath()+com;
//		return total()+com;
//		return this.total()+com;
	return super.total()+com;
	
	}
@Override
	public float avg() {

		return total()/4.0f;
	}
}
