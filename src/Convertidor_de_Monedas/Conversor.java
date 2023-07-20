package Convertidor_de_Monedas;

import javax.swing.JOptionPane;

public class Conversor {

	Conversor(){
		ciclo(); 
		
			
	}
	
	private void menu() {
		String menu = (JOptionPane.showInputDialog(null, "Seleccione lo que quiera hacer: ", "menu", JOptionPane.PLAIN_MESSAGE, null, 
				new Object [] {"Conversor de moneda", "Conversor de temperatura"}, "Selecciona")).toString();

		if( menu == "Conversor de moneda" ) {
			conQuetzales(); 
		}else {
			grados(); 
		}
	}
	private void grados() {
		double resultado = 0; 
		double valorGrados = 0;
		
		try {
			String validar = JOptionPane.showInputDialog("Digite los grados que desea convertir"); 
			valorGrados = Integer.parseInt(validar); 	
		}catch(NumberFormatException e) {
			JOptionPane.showConfirmDialog(null, "Este valor no es valido para realizar una conversion", "Error", JOptionPane.ERROR_MESSAGE); 
		}
		
		if(valorGrados != 0) {
			String grados = (JOptionPane.showInputDialog(null, "Seleccione lo que quiera hacer: ", "menu", JOptionPane.PLAIN_MESSAGE, null, 
					new Object [] {"Celsius a Fahrenheit", "Fahrenheit a Celsius"}, "Selecciona")).toString();
			
			
			if(grados== "Celsius a Fahrenheit" ) {
				resultado = ( valorGrados * 9/5) + 32;  
				JOptionPane.showMessageDialog(null,valorGrados + " grados celsius equivale a: " + resultado + " grados Fahrenheit"); 
			}else {
				resultado = ((valorGrados - 32 )* 5)/9;
				JOptionPane.showMessageDialog(null,valorGrados + " grados Fahrenheit equivale a: " + resultado + " gradoso celsius"); 
			}	
		}
	
	}
	private void conQuetzales() {
		double valor= 0;  
		double resultado; 
		
		try {
			String validar = JOptionPane.showInputDialog(null, "Digita el valor a convertir: ");
			valor = Integer.parseInt(validar);	
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "esto no se puede utilizar para realizar una conversión", "Error", JOptionPane.ERROR_MESSAGE);
		}
	
		if(valor != 0) {
		
			String opciones = (JOptionPane.showInputDialog(null, "Selecciones en que lo quiere convertir: ", "opciones",
					JOptionPane.PLAIN_MESSAGE,null, new Object [] {"A dolares","A euros"," A libras esterlinas", 
					"A won sur-coreano", "A yen japones", "dolares a quetzales", "euros a quetzales", 
					"libras esterlinas a quetzales", "won sur-coreano a quetzales", "Yen japones a quetzales"}, "Selecciona")).toString(); 

			switch(opciones) {
				case "A dolares": resultado = valor * 0.1273; JOptionPane.showMessageDialog(null, "tienes: " 
						+ resultado + " dolares"); break; 
						
				case "A euros": resultado = valor * 0.1134; JOptionPane.showMessageDialog(null, "tienes: " 
						+ resultado + " euros");break;
						
				case "A libras esterlinas": resultado = valor * 0.0977; JOptionPane.showMessageDialog(null, "tienes: " 
						+ resultado + " libras esterlinas");break;
						
				case "A won sur-coreano": resultado = valor * 161.3948; JOptionPane.showMessageDialog(null, "tienes: " 
						+ resultado + " won surcoreano");break;
						
				case "A yen japones": resultado = valor * 17.7239; JOptionPane.showMessageDialog(null, "tienes: " 
						+ resultado + " Yenes japones");break;
						
				case "dolares a quetzales": resultado = valor * 7.8596; JOptionPane.showMessageDialog(null, "tienes: " 
						+ resultado + " Quetzales");break;
						
				case "euros a quetzales": resultado = valor * 8.8226; JOptionPane.showMessageDialog(null, "tienes: " 
						+ resultado + " Quetzales");break;
						
				case "libras esterlinas a quetzales": resultado = valor * 10.2338; JOptionPane.showMessageDialog(null, "tienes: " 
						+ resultado + " Quetzales");break; 
						
				case "won sur-coreano a quetzales": resultado = valor * 0.0062; JOptionPane.showMessageDialog(null, "tienes: " 
						+ resultado + " Quetzales");break;
						
				case "Yen japones a quetzales": resultado = valor / 0.0565; JOptionPane.showMessageDialog(null, "tienes: " 
						+ resultado + " Quetzales");break;
						
				default: JOptionPane.showMessageDialog(null, "No se puede convertir");
			}
		}
		
		
	}
	private void ciclo() {
		int salida; 
		do {
			menu(); 
			salida = JOptionPane.showConfirmDialog(null, "Quieres seguir en el programa?"); 
			if(salida != 0) {
				JOptionPane.showMessageDialog(null, "El programa a finalizado"); 
			}
				
		}while(salida == 0);  
	}
}
