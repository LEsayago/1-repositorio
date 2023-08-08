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
public class Moto {
    String marca; 
    int cc; 
    
    public Moto (String m, int cilindrada)
    {
        marca = m; 
        cc = cilindrada;
    }
    public String ObtenerMarca()
    {
        return marca;
    }
   
    public int ObtenerCC()
    {
        return cc; 
    }   
}