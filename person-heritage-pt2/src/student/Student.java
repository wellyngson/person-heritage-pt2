package student;
import person.Person;

// CLASSE FILHA DA CLASSE PERSON
public class Student extends Person {

	// ATRIBUTOS
	private int registration;
	private String course;
	
	// MÉTODO PAGAR MENSALIDADE
	public void payMonthly() {
		System.out.println("Mensalidade paga do aluno " + this.getName());
	}

	// MÉTODOS ESPECIAIS GETTERS E SETTERS
	public int getRegistration() {
		return registration;
	}

	public void setRegistration(int registration) {
		this.registration = registration;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
}
