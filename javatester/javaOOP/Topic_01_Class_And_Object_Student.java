package javaOOP;

public class Topic_01_Class_And_Object_Student{
	private int studentID;
	private String studentName;
	private float knowledgePoint;
	private float practicePoint;
	
	public Topic_01_Class_And_Object_Student(int studentID, String studentName, float knowledgePoint,
			float practicePoint) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.knowledgePoint = knowledgePoint;
		this.practicePoint = practicePoint;
	}

	private int getStudentID() {
		return studentID;
	}

	private void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	private String getSudentName() {
		return studentName;
	}

	private void setSudentName(String studentName) {
		this.studentName = studentName;
	}

	private float getKnowledgePoint() {
		return knowledgePoint;
	}

	private void setKnowledgePoint(float knowledgePoint) {
		this.knowledgePoint = knowledgePoint;
	}

	private float getPracticePoint() {
		return practicePoint;
	}

	private void setPracticePoint(float practicePoint) {
		this.practicePoint = practicePoint;
	}

		
	private float getAveragePoint() {
		return (this.knowledgePoint + this.practicePoint * 2) / 3;
	}
	
	private void showStudentInfo() {
		System.out.println("------------------------------------------------------------------");
		System.out.println("Student ID = " + getStudentID());
		System.out.println("Student Name = " + getSudentName());
		System.out.println("Student Knowledge Point = " + getKnowledgePoint());
		System.out.println("Student Practice Point = " + getPracticePoint());
		System.out.println("Student Average Point = " + getAveragePoint());
		System.out.println("------------------------------------------------------------------");

	}
	
	public static void main(String[] args) {
		Topic_01_Class_And_Object_Student firstStudent = new Topic_01_Class_And_Object_Student(20220101, "Jhon Wick", 8.5f, 7.0f);
		Topic_01_Class_And_Object_Student secondStudent = new Topic_01_Class_And_Object_Student(20220102, "Nick Wang", 9.5f, 6.0f);
		Topic_01_Class_And_Object_Student thirdStudent = new Topic_01_Class_And_Object_Student(20220106, "Bay Max", 7.0f, 9.0f);
		firstStudent.showStudentInfo();
		secondStudent.showStudentInfo();
		thirdStudent.showStudentInfo();
	}

	
}
