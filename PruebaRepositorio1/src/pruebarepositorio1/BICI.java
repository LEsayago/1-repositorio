/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebarepositorio1;

/**
 *
 * @author Admin
 */
public class BICI {
    
    String modelo; 
    double precio; 
    
    public BICI(String m, double p)
    { 
        modelo = m; 
        precio = p; 
    }
  
    public String ObtenerModelo ()
    {
        
        return modelo;
               
    }
    
    public double ObtenerPrecio ()
    {
        return precio; 
    }
}
