/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

import javax.swing.JOptionPane;
import tp6.negocio.Cliente;
import tp6.negocio.Directorio;

/**
 *
 * @author Usuario
 */
public class Tp6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Directorio d=new Directorio();
        //Cliente martin lucero de la punta mod 11 mz 33 dni 123 telefono 4242
        boolean resultado=d.agregarCliente("4242",new Cliente(123,"martin","lucero","la punta","mod 11 mz 33") );
       if(resultado){
       
           JOptionPane.showMessageDialog(null,"Dato registrado");
       }else{
       
           JOptionPane.showMessageDialog(null,"Dato No registrado");
           
       }
       boolean resultado2=d.agregarCliente("4242",new Cliente(333,"pepe","lucero","la punta","mod 11 mz 33") );
       if(resultado2){
       
           JOptionPane.showMessageDialog(null,"Dato registrado");
       }else{
       
           JOptionPane.showMessageDialog(null,"Dato No registrado");
           
       }
        
        
    }
    
}
