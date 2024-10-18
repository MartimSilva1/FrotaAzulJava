//Lugar Frota Azul

public class Lugar
{
    int identificador;
    boolean disponibilidade;
    Autocarro autocarro;
    
    public Lugar(int ident){
        this.identificador = ident;
        this.disponibilidade = true;
        this.autocarro = null;
    }
    
    public int getIdentificador(){
        return this.identificador;
    }
    
    public void setIdentificador(int nIdentificador){
        this.identificador = nIdentificador;
    }
    
    public boolean getDisponibilidade(){
        return this.disponibilidade;
    }
    
    public boolean setDisponibilidade(boolean disp){
        this.disponibilidade = disp;
    }
}
