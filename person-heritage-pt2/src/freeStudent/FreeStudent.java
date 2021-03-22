package freeStudent;
import student.Student;

// CLASSE FILHA DA CLASSE STUDENT
public class FreeStudent extends Student {

	// ATRIBUTOS
	private float handbag;
	
	// MÉTODO PARA RENOVAR MENSALIDADE DO ALUNO BOLSISTA
	public void freeStudentRenew() {
		System.out.println("Renovando bolsa de " + this.getName());
	}
	
	// MÉTODO PAGAR MENSALIDADE SOBREPOSTO DA CLASSE MÃE
	@Override
	public void payMonthly() {
		System.out.println(this.getName() + " é bolsista! Pagamento facilitado.");
	}

	// MÉTODOS ESPECIAIS GETTERS E SETTERS
	public float getHandbag() {
		return handbag;
	}

	public void setHandbag(float handbag) {
		this.handbag = handbag;
	}
}
