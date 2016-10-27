/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author c16318
 */
public abstract class Player {
    
    private String name;
    private int hund;
    
    Player(String name){
        this.name = name;
    }
    
    /**hundの値をSETする。*/
    public void setHund(int hund){
        this.hund = hund;
    }
    
    /**名前を返す。*/
    public String getName(){
        return name;
    }
   
    /**hundの値を返す。*/
    public int getHund(){
        return hund;
    }
    
    
}
