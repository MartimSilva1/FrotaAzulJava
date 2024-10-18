//Autocarro Frota Azul

public class Autocarro
{
    String matricula;
    int kms;
    
    public Autocarro(String m) {
        this.matricula = m;
        kms = 0;
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    
    public void setMatricula(String novamatricula){
        this.matricula = novamatricula;
    }
    
    public int getKms(){
        return this.kms;
    }
    
    public void setKms(int kmsAndados){
        this.kms = this.kms + kmsAndados;
    }
    
    public String toString(){
        String resultado = "Matrícula:" + this.matricula + "Kms:" + this.kms;
        return resultado;
    }
}