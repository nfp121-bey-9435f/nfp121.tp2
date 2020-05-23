package question3;
/**
 * Classe IHMFahrenheit.
 * 
 * @author Sami Abou Karam 
 * @version Mai 2020
 */
import question1.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IHMFahrenheit extends JFrame implements ActionListener{
  private JTextField entree = new JTextField( 6 );
  /** Le bouton de conversion. */
  private JButton  boutonDeConversion = new JButton( "convertir" );
  /** La sortie en degré Celsius. */
  private JTextField sortie = new JTextField( 6 );

  public IHMFahrenheit(){
    super("IHM Fahrenheit");
 
    setLayout(new FlowLayout());
    add( entree ); add( boutonDeConversion ); add( sortie );
    sortie.setEditable( false );
    getContentPane().setBackground( Color.yellow );
    setLocation(100,100);
    pack();setVisible(true);
    
    boutonDeConversion.addActionListener( this );
  }

  /** 
   * méthode déclenchée lorsque le bouton de conversion est appuyé. 
   * remarquer que le champs de droite (les degrés Celsius) n'est pas éditable.
   * @param ae l'événement transmis
   */
  public void actionPerformed( ActionEvent ae ){
    try{
            String valeur = entree.getText();
            int fahrenheit = Integer.parseInt(valeur);
            float celsius = question1.FahrenheitCelsius.fahrenheitEnCelsius(fahrenheit);
            if(celsius < -273.1F) celsius = -273.1F;
            sortie.setText( Float.toString( celsius));
    }
    catch(NumberFormatException nfe){
      sortie.setText("error ! ");
    }
  }
  
  
  public static void main(String[] args){
      new IHMFahrenheit();
    }
    
      
}
