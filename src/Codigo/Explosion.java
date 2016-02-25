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
public class Explosion extends Sprite {
   
    private int tiempoDeVida = 10;

public Explosion(){
        
   
    }

   

   @Override
   public void mueve(){
       
   }

    public int getTiempoDeVida() {
        return tiempoDeVida;
    }

    public void setTiempoDeVida(int tiempoDeVida) {
        this.tiempoDeVida = tiempoDeVida;
    }

}