package application;

import dama.PartidaDama;

public class Program {
    
    public static void main(String [] args){
        
        PartidaDama partidaDama = new PartidaDama();
        UI.imprimeTabuleiro(partidaDama.getPeças());
        
        
        
    }
    
    
    
}
