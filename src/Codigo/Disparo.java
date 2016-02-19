/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Administrator
 */
public class Disparo extends Sprite{


    
    public Disparo(){
        try {
           imagen = ImageIO.read(getClass().getResource("/imagenes/Disparo.png"));
//           this.altoMundo = _altoMundo;
        }
        
        catch (IOException e) {
            
        }
    }

    
    public void mueve(){
        if(this.getY() > - this.imagen.getHeight(null)){
            this.setY(this.getY() - 8) ;
        }
        
    }
    
    public void posicionaDisparo(Nave n) {
        this.setX(n.getX() + n.imagen.getWidth(null)/2 - this.imagen.getWidth(null)/2) ;
        this.setY(n.getY());
    }
    
}
