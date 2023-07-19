package Convertidor_de_Monedas;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Opciones {

	private double dolares = 7.8465;
	private double euros = 8.6331;
	private double libras = 10.0945;
	private double yen  = 0.0556;
	private double won = 0.0060;
	
	 public Opciones(){
		String opciones = (JOptionPane.showInputDialog(null, "Selecciones en que lo quiere convertir: ", "opciones",
				JOptionPane.PLAIN_MESSAGE,null, new Object [] {"Dolares","Euros","Libras esterlinas", 
				"Won sur-coreano", "Yen japones"}, "Selecciona")).toString(); 

	}
	
	DecimalFormat df = new DecimalFormat("#.00");
	
	public double aDolares(double valor) {
		return  valor / this.dolares;
		
	}
	public double aEuros(double valor) {
		return valor / this.euros; 
	}
	public double aLibras(double valor) {
		return valor / this.libras; 
	}
	public double aWon(double valor) {
		return valor / this.won; 
	}
	public double aYen(double valor) {
		return valor / this.yen;  
	}
	
	
	
}
