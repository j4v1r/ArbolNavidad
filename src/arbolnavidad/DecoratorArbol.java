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
public class DecoratorArbol implements Arbol {
    
    protected Arbol arbolDecorado;
    
    public DecoratorArbol(Arbol arbolDecorado){
        this.arbolDecorado = arbolDecorado;
    }

    @Override
    public void colocar() {
        arbolDecorado.colocar();
    }
    
}
