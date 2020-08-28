package Tabuleiro;


public class Tabuleiro {
    
    private int linha, coluna;
    private Peça [][] peças;
     
    
    public Tabuleiro() {
    }

    public Tabuleiro(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
        peças = new Peça[linha][coluna];
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }
    
    public Peça peça(int linha, int coluna){
        return peças[linha][coluna];
    }
    
    public Peça peça(Posicao posicao){
        return peças[posicao.getLinha()][posicao.getColuna()];
    }
    
//    public void botarPeça(Peça peça, Posicao posicao){
//        
//    }
//    
//    public Peça removerPeça(Posicao posicao){
//        
//    }
//    
//    public boolean posicaoExiste(Posicao posicao){
//        
//    }
//    
//    public boolean temAlgumaPeça(Posicao posicao){
//        
//    }
    
    public void colocarPeça(Peça peça, Posicao posicao){
        peças[posicao.getLinha()][posicao.getColuna()] = peça;
        peça.posicao = posicao;
    }
    
}
