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
public class Nave extends Sprite {
//    public Image imagen = null;    
//    private int x = 0;   
//    private int y = 0; 
    private boolean pulsadoIzquierda = false;
    private boolean pulsadoDerecha = false;
    private int anchoMundo;
    private int velocidad;
    
    public Nave(int _anchoMundo, int _velocidad){
        try {
           imagen = ImageIO.read(getClass().getResource("/imagenes/nave.png"));
           this.anchoMundo = _anchoMundo;
           this.velocidad = _velocidad;
        }
    
        catch (IOException e) {
            
        }
    }
    

   
    
    public void mueve(){
        if(this.pulsadoIzquierda && this.getX() >= 0){
            this.setX(this.getX() - velocidad);
        }
        if(this.pulsadoDerecha && this.getX() < anchoMundo - (imagen.getWidth(null)+20)){
            this.setX(this.getX() + velocidad);
        }
    }
    
    
//
//    public int getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        if(x>0){
//        this.x = x;
//        }
//    }

    public boolean isPulsadoIzquierda() {
        return pulsadoIzquierda;
    }

    public void setPulsadoIzquierda(boolean pulsadoIzquierda) {
        this.pulsadoIzquierda = pulsadoIzquierda;
    }

    public boolean isPulsadoDerecha() {
        return pulsadoDerecha;
    }

    public void setPulsadoDerecha(boolean pulsadoDerecha) {
        this.pulsadoDerecha = pulsadoDerecha;
    }

//    public int getY() {
//        return y;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }
    
    
    
}
