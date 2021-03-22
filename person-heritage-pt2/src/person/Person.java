package person;

// CLASSE ABSTRATA, NÃO PODE SER INSTANCIADA
public abstract class Person {
	
	// ATRIBUTOS
	private String name, sex;
	private int years;

	// MÉTODO PARA FAZER ANIVERSARIO
	public void makeBirthday() {
		this.setYears(this.getYears() + 1);
	}

	// MÉTODOS ESPECIAIS GETTERS E SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	// MÉTODO TO STRING
	@Override
	public String toString() {
		return  "Dados" + "\n" +
				"Nome: " + getName() + "\n" +
				"Sexo: " + getSex() + "\n"+
				"Idade: " + getYears();
	}
	
}
