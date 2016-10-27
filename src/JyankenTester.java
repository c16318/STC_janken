/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author c16318
 */

import java.util.Scanner;

public class JyankenTester {
    public static void main(String[] args){
        
        Scanner stdIn = new Scanner(System.in);
        String[] hands = {"グー","チョキ","パー"};
        
        
        HumanPlayer p1 = new HumanPlayer("yama");
        ComputerPlayer p2 = new ComputerPlayer("cpu");
        
        System.out.println("PlyaerName:" + p1.getName());
        System.out.println("ComputerName:" + p2.getName());
        
        int c,phund;    /**c:もう一度繰り返すか。  phund:自分のhundの値  */
        do{
            for(int i = 0;i < 3;i++){
                System.out.printf("(%d)%s ",i,hands[i]);
            }
            
            System.out.println();
            
            /**自分のhundの値を入力 */
            do{
                System.out.print("入力してください。:");
                phund = stdIn.nextInt();
                System.out.println();
            }while(phund < 0 || phund > 2);
            
            
            /**自分とコンンピュータのhundの値をセットする。*/
            p1.setHund(phund);
            p2.setHund(p2.Random());
            
            System.out.println("あなたは"+ hands[p1.getHund()] + "で、コンピュータは" + hands[p2.getHund()] + "です。");
            
            
            /**HumanPlayerのjudgeメソッドを、呼び出し結果を表示 */
            switch(p1.judge(phund, p2.getHund())){
                case 0: System.out.println("引き分けです。");  break;
                case 1: System.out.println("あなたの負けです。");  break;
                case 2: System.out.println("あなたの勝ちです。");  break;
            }
            
            System.out.print("続ける/1  やめる/0  :");
            c = stdIn.nextInt();
            System.out.println();
            
        }while(c != 0);
        
    }
}
