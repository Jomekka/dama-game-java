package dama;
import Tabuleiro.Tabuleiro;

public class PartidaDama {
    
    private Tabuleiro tabuleiro;
    
    public PartidaDama(){
        tabuleiro = new Tabuleiro(8,8);
        
    }
    
    public PeçaDama[][] getPeças(){
       PeçaDama[][] mat = new PeçaDama[tabuleiro.getLinha()][tabuleiro.getColuna()];    
       for(int i = 0; i<tabuleiro.getLinha();i++){
           for(int j = 0;j<tabuleiro.getColuna();j++){
               mat[i][j] = (PeçaDama) tabuleiro.peça(i, j);
           }
       }
       return mat;
    }
    
}
