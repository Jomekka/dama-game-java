package dama;
import Tabuleiro.Posicao;
import Tabuleiro.Tabuleiro;

public class PartidaDama {
    
    private Tabuleiro tabuleiro;
    
    public PartidaDama(){
        tabuleiro = new Tabuleiro(8,8);
        setupInicial();
    }
    
    public PeçaDama[][] getPeças(){
       PeçaDama[][] mat = new PeçaDama[tabuleiro.getLinha()][tabuleiro.getColuna()];    
       for(int l = 0; l<tabuleiro.getLinha();l++){
           for(int c = 0;c<tabuleiro.getColuna();c++){
               mat[l][c] = (PeçaDama) tabuleiro.peça(l, c);
           }
       }
       return mat;
    }
    
    private void setupInicial(){
        for(int l=0;l<3;l++){
            for(int c=0;c<8;c++){
                if(l==c || c-l==2||c-l==4||c-l==6||l-c==2){
                    tabuleiro.colocarPeça(new PeçaDama(Cor.BRANCO, tabuleiro), new Posicao(l,c));
                }
            }
        }
        
        for(int l=5;l<8;l++){
            for(int c=0;c<8;c++){
                if(l-c==7||l-c==5||l-c==3||l-c==1||c-l==1){
                    tabuleiro.colocarPeça(new PeçaDama(Cor.BRANCO, tabuleiro), new Posicao(l,c));
                }
            }
        }
        
        
    }
}
