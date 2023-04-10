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
public class Esferas extends DecoratorArbol{
    
    public Esferas(Arbol arbolDecorado) {
        super(arbolDecorado);
    }
    
    @Override
    public void colocar() {
        arbolDecorado.colocar();
        ponerEsferas(arbolDecorado);
    }

    private void ponerEsferas(Arbol arbolDecorado) {
        System.out.println("y ahora tiene esferas...");
    }
    
}
