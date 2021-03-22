package main;
import freeStudent.FreeStudent;
import student.Student;

public class Main {

	public static void main(String[] args) {
		
		// CRIANDO O ALUNO, ADICIONANDO ATRIBUTOS REALIZANDO MÉTODOS
		Student student = new Student();
		student.setName("Cláudio");
		student.setCourse("Informática");
		student.setRegistration(1111);
		student.setYears(16);
		student.setSex("Masculino");
		
		student.payMonthly();
		
		// CRIANDO O ALUNO BOLSISTA, ADICIONANDO ATRIBUTOS REALIZANDO MÉTODOS
		FreeStudent freeStudent = new FreeStudent();
		freeStudent.setRegistration(1112);
		freeStudent.setName("Jubileu");
		freeStudent.setHandbag(12.5f);
		freeStudent.setSex("Masculino");
		
		freeStudent.payMonthly();	
	}
}
