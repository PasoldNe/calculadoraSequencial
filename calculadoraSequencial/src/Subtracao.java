public class Subtracao {
    float parcial;
    float coeficiente;

    public void setNumero(float parcial, float coeficiente){
        this.parcial=parcial;
        this.coeficiente=coeficiente;
    }

    public float getSubtracao(){
        return parcial-coeficiente;
    }    
}
