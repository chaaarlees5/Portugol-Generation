package aulasJava;

public interface POO5Figuras {
	
	public String nomeInterface = "Figuras";
	
	abstract public String getNome();
	abstract public void setNome(String nome);
	
	public double getArea();
	public double getPerimetro();
	double getDiagonal(); //Sem nada deixa subentendido que � 'public'
}
