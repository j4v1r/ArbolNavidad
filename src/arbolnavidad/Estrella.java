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
public class Estrella extends DecoratorArbol{
    
     public Estrella(Arbol arbolDecorado) {
        super(arbolDecorado);
    }
    
    @Override
    public void colocar() {
        arbolDecorado.colocar();
        ponerEstrella(arbolDecorado);
    }

    private void ponerEstrella(Arbol arbolDecorado) {
        System.out.println("y ahora tiene una estrella... ");
    }
    
}
