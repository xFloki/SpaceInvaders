/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;



/**
 *
 * @author Administrator
 */
public class Disparo extends Sprite{


    
    public Disparo(){
        this.setVelocidad(8);
        this.setAncho(18/3);
       this.setAlto(53/3);
       this.setFila(13/3);
       this.setColumna(32/3);
     
    }

    
    public void mueve(){
        if(this.getY() > - 15){
            this.setY(this.getY() - this.getVelocidad()) ;
        }
        
    }
    
    public void posicionaDisparo(Nave n) {
        this.setX(n.getX()+ n.getAncho()/2 - this.getAncho()/2) ;
        this.setY(n.getY());
    }
    
}
