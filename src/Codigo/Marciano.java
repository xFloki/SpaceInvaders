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
public class Marciano extends Sprite {
   
    

public Marciano(){
        try {
           imagen = ImageIO.read(getClass().getResource("/imagenes/marcianito1.png"));
           imagen2 = ImageIO.read(getClass().getResource("/imagenes/marcianito2.png"));
//           this.altoMundo = _altoMundo;
        }
        
        catch (IOException e) {
            
        }
    }

   
    public void mueve(boolean _direccionMarciano){
        if(_direccionMarciano ){
            this.setX(this.getX() - 1) ;
        }
        if(!_direccionMarciano){
             this.setX(this.getX() + 1) ;
        }
    }

    @Override
    public void mueve() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}