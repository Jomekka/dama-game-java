package Tabuleiro;
public class Peça {
    protected Posicao posicao;
    private Tabuleiro tabuleiro;
    
    public Peça() {
    }

    public Peça(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        posicao = null;
    }

    protected Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
    

    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }
//    
//    public Peça movimentosPossiveis(){
//        
//    }
//    
//    public boolean movimentoPossivel(Posicao posicao){
//        
//    }
//    
//    public boolean algumMovimentoPossivel(){
//        
//    }
    @Override
    public String toString(){
        return "O";
    }
    
    
}
