package Ejercicio1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.ref.Cleaner;
public class Ventana extends Frame implements ActionListener{
    Button aceptar;
    Button igual;
    TextField text;
    TextArea resultado;
    Panel central;
    Panel arriba;

    public Ventana(){
        aceptar = new Button("Aceptar");
        igual = new Button("  = ");
        text= new TextField(" ");
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
        Ventana v = new Ventana();
        
        
    }
  //Cerrar la ventana 
  	public void cerrarVentana() {
  		addWindowListener((WindowListener) new WindowAdapter() {
  			public void windowClosing(WindowEvent e) {
  				System.exit(0);
  			}
  		});
  	}

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==aceptar){
            String t=text.getText();

            resultado.append(t+'\n');
            
        }else{
        
        }
    
        
        
    }

    

}
//public class Ventana {


