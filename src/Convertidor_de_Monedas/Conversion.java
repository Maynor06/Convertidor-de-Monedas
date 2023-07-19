package Convertidor_de_Monedas;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Conversion  extends JFrame {
	
	Conversion(){
		setSize(500,500);//Definimos el tamaño de la ventana
		setVisible(true);//Hacemos que la ventana se vuelva visible
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Definimos de que al momento de cerrar la ventana se corte el programa
		setTitle("Conversor de Dinero y de Grados"); //Definimos el titulo de la ventana
		setLocationRelativeTo(null);
		componentes();
		contenido(); 
	}

	private void componentes() {
		JPanel panel = new JPanel(); //creación del panel
		
		//panel.setBackground(Color.BLUE);
		this.getContentPane().add(panel); //añadimos el panel a la ventana.  
		
	}
	private void contenido() {

		String opciones = (JOptionPane.showInputDialog(null, "Selecciones en que lo quiere convertir: ", "opciones",
				JOptionPane.PLAIN_MESSAGE,null, new Object [] {"Dolares","Euros","Libras esterlinas", 
				"Won sur-coreano", "Yen japones"}, "Selecciona")).toString(); 

		
	}
	/*public static void main(String[] args) {
	 
		double quetzales = 0; 
		double resultado = 0; 
		int salida;  
		Opciones opc = new Opciones(); 
		
		do {
			quetzales = Integer.parseInt( JOptionPane.showInputDialog("Digite cuantos quetzales desea convertir: ")); 

			
			/*if(opciones == "Dolares") {
				resultado =opc.aDolares(quetzales); //0.13
			}else if(opciones == "euros"){
				resultado = opc.aEuros(quetzales);  //0.12
			}else if(opciones == "libras esterlinas") {
				resultado = opc.aLibras(quetzales);  // 0.099
			}else if(opciones == "Yen Japones") {
				resultado = opc.aYen(quetzales);  // 18
			}else{
				resultado = opc.aWon(quetzales);  //165.51
			}*/
			
			/*JOptionPane.showMessageDialog(null,"El resultado de la conversion es de: " +  resultado);
			
			salida = JOptionPane.showConfirmDialog(null, "Quieres seguir en el programa?"); 
		}while(salida == 0); 
			
	}*/
	
}

