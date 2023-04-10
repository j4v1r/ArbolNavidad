/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolnavidad;

/**
 *
 * @author Rogelio Colunga R
 */
public class ArbolNavidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Arbol arbolNavidad = new ArboldeNavidad();
        
        Arbol arbolConLuces = new Luces(new ArboldeNavidad());
        
        Arbol arbolConEsferas = new Esferas(new ArboldeNavidad());
        
        Arbol arbolConEstrella = new Estrella(new ArboldeNavidad());
        
        Arbol arbolCompleto = new Estrella(new Luces(new Esferas(new ArboldeNavidad())));
        
        arbolNavidad.colocar();
        
        System.out.println("---------------------------------------");
        
        arbolConLuces.colocar();
        
        System.out.println("---------------------------------------");
        
        arbolConEsferas.colocar();
        
        System.out.println("---------------------------------------");
        
        arbolConEstrella.colocar();
        
        System.out.println("---------------------------------------");
        
        arbolCompleto.colocar();
        
    }
    
}
