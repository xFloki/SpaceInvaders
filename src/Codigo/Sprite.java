/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.awt.Graphics2D;
import java.awt.Image;

/**
 *
 * @author Administrator
 */
 public abstract class Sprite {
    private int x = 0;   
    private int y = 0; 
    private int velocidad;
    private int ancho;
    private int alto;
    private int fila;
    private int columna;
    private int fila2;
    private int columna2;
    
    abstract public void mueve();        
    
    public void dibujaSprite(Graphics2D g2, Image i, int numeroImagen){
        if (numeroImagen == 1){
        g2.drawImage(i,                                              //la imagen con todos los sprites
                        this.getX(),                                 //posicion x en el jPanel
                        this.getY(),                                 //posicion y en jPanel
                        ( this.getX() + this.getAncho()),            //ancho en el jPanel
                        ( this.getY() + this.getAlto()),          //alto en el jPanel
                        this.getFila(),                              //posición inicial x dentro del sprite
                        this.getColumna(),                           //posicion inicial y dentro del sprite
                        (this.getAncho() + this.getFila()),                             //ancho en el sprite
                        (this.getAlto() + this.getColumna()),                              //alto en el sprite                       
                        
                        null);  
        } else {
            g2.drawImage(i,                                              //la imagen con todos los sprites
                        this.getX(),                                 //posicion x en el jPanel
                        this.getY(),                                 //posicion y en jPanel
                        ( this.getX() + this.getAncho()),            //ancho en el jPanel
                        ( this.getY() + this.getAlto()),          //alto en el jPanel
                        this.getFila2(),                              //posición inicial x dentro del sprite
                        this.getColumna2(),                           //posicion inicial y dentro del sprite
                        (this.getAncho() + this.getFila2()),                             //ancho en el sprite
                        (this.getAlto() + this.getColumna2()),                              //alto en el sprite                         
                        
                        null); 
        }
    }
    

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getFila2() {
        return fila2;
    }

    public void setFila2(int fila2) {
        this.fila2 = fila2;
    }

    public int getColumna2() {
        return columna2;
    }

    public void setColumna2(int columna2) {
        this.columna2 = columna2;
    }
}
