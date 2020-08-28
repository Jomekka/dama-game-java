package application;

import dama.PeçaDama;

public class UI {
    
    public static void imprimeTabuleiro(PeçaDama [][] peças){
        for(int l=0;l<8; l++){
            System.out.print((8-l)+" ");
            for(int c=0; c<8;c++){
                imprimePeça(peças[l][c]);
            }
            System.out.println("");
        }
        System.out.print("  a b c d e f g h");
        
        
    }
    
    private static void imprimePeça(PeçaDama peça){
        if(peça == null){
            System.out.print("-");
        }
        else{
            System.out.print(peça);
        }
        System.out.print(" ");
    }
    
    
}
