public class Divisao {
    float parcial;
    float coeficiente;

    public void setNumero(float parcial, float coficiente){
        this.parcial=parcial;
        this.coeficiente=coeficiente;
    }

    public float getDivisao(){
        return parcial/coeficiente;
    }    
}
