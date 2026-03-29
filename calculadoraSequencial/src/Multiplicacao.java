public class Multiplicacao {
    float parcial;
    float coeficiente;

    public void setNumero(float parcial, float coeficiente){
        this.parcial=parcial;
        this.coeficiente=coeficiente;
    }

    public float getMultiplicacao(){
        return parcial*coeficiente;
    }    
}
