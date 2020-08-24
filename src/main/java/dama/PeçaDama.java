package dama;

import Tabuleiro.Peça;
import Tabuleiro.Tabuleiro;

public class PeçaDama extends Peça{
    
    private Cor cor;

    public PeçaDama(Cor cor, Tabuleiro tabuleiro) {
        super(tabuleiro);
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }
     
    
    
    
}
