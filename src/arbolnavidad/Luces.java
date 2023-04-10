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
public class Luces extends DecoratorArbol{
    
    public Luces(Arbol arbolDecorado) {
        super(arbolDecorado);
    }
    
    @Override
    public void colocar() {
        arbolDecorado.colocar();
        ponerLuces(arbolDecorado);
    }

    private void ponerLuces(Arbol arbolDecorado) {
        System.out.println("y ahora tiene luces luminosas...");
    }
    
}
