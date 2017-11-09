/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;

//PASO 1-IMPLEMENTAR PASO UNPROGRAMA
import javax.swing.*;//
import java.awt.*;//

/**
 *
 * @author LAB08
 */
//PASO 2 - HEREDAR  LA CLASE DE JAVASWING
public class JavaSwing 
{
 //PASO 3-declara CAMPOS Y VARIABLES
    JPanel panel;
    JLabel label;
    JTextField text;
    JButton boton;
    JCheckbox
    //PASO 4-DEFINIR EL CONSTRUCTOR
    public window()
    {
  
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {      
       TODO code application logic here;
       
        window ventana = new window();//Creo un objeto tipo window
        ventana.setVisible(true);
        ventana.setBounds(0, 0,800, 800);
        //La siguente inst.
        ventana.setTitle("mi primera aplicacion con ventana");
        //la siguente sentecia es para finalizar la vetana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }         
    
   //PASO 5  CREAR E INICIALIZAR Los OBJETOS
     
 
        
 
     
    }
        // TODO code application logic here
    }
    
}
