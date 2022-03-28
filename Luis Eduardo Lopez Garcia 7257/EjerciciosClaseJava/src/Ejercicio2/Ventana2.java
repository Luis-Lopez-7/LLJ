package Ejercicio2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;



public class Ventana2 extends Frame implements ActionListener{
	Button aceptar;
    Button igual;
    TextField text;
    TextArea resultado;
    Panel central;
    Panel arriba;
    int aux,p=0;
    int suma,n;

    public Ventana2(){
        aceptar = new Button("Aceptar");
        igual = new Button("  = ");
        text= new TextField("");
        central = new Panel();
        central.setLayout(new BorderLayout());
        central.add(aceptar, BorderLayout.CENTER);
        aceptar.addActionListener((ActionListener)this);
        central.add(igual, BorderLayout.LINE_END);
        igual.addActionListener((ActionListener) this);
        central.add(text, BorderLayout.BEFORE_LINE_BEGINS);
        this.setLayout(new BorderLayout());
        this.add(central, BorderLayout.CENTER);
        this.setSize(500,300);
        setVisible(true);

        
        arriba = new Panel();
        resultado= new TextArea(" ");
        arriba.setLayout(new BorderLayout());
        
        arriba.add(resultado, BorderLayout.CENTER);
        this.setLayout(new BorderLayout());
        this.add(arriba, BorderLayout.SOUTH);
        this.setSize(500,500);
        setVisible(true);
        
        cerrarVentana();
    }

    public static void main(String args[]){
        Ventana2 v = new Ventana2();
        
        
    }
  //Cerrar la ventana 
  	public void cerrarVentana() {
  		addWindowListener((WindowListener) new WindowAdapter() {
  			public void windowClosing(WindowEvent e) {
  				System.exit(0);
  			}
  		});
  	}

  	@Override
	public void actionPerformed(ActionEvent e) {
	 	String c= text.getText();
	 	if (e.getSource() == aceptar) {
			 
			 resultado.append(c + "\n");
			 
	 	}else {
			 String Texto= resultado.getText();
			 Texto = Texto.trim();
			 
			 String[] Arreglo= Texto.split("\n");
			 
			
			  n=  Arreglo.length;
			 int aux, Suma=0;
			 for(int i=0; i<n; i++) {
				 
				 aux = Integer.parseInt(Arreglo[i]);
				 Suma += aux;
			 }
			 resultado.append("\n" + Suma+"\n");
		 }
	}	

    

}

