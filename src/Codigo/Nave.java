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
public class Nave extends Sprite {
//    public Image imagen = null;    
//    private int x = 0;   
//    private int y = 0; 
    private boolean pulsadoIzquierda = false;
    private boolean pulsadoDerecha = false;
    private int anchoMundo;
    private int velocidad;
    
    public Nave(int _anchoMundo, int _velocidad){
          this.setAncho(75/3);
       this.setAlto(55/3);
       this.setFila(150/3);
       this.setColumna(635/3);
       this.anchoMundo = _anchoMundo;
       
           this.velocidad = _velocidad;
       
    }
    

   
    
    public void mueve(){
        if(this.pulsadoIzquierda && this.getX() >= 0){
            this.setX(this.getX() - velocidad);
        }
        if(this.pulsadoDerecha && this.getX() < anchoMundo- getAncho() ){
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
