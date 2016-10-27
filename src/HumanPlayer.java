/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author c16318
 */
public class HumanPlayer extends Player{
    
    public HumanPlayer(String name){
        super(name);
    }
    
    /**自分のhundの値と、コンピュータの値を取り、結果を返す。*/
    public int judge(int a,int b){
        int judge = (a - b + 3) % 3;
        
        return judge;
    }

  
    
}
