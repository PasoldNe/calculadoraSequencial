public class Adicao {
    float parcial;
    float coeficiente;

    public void setNumero(float parcial, float coeficiente){ //puxa e ja da os valores certos
        this.parcial=parcial;
        this.coeficiente=coeficiente;
    }

    public float getAdicao(){ // faz a conta e ja da o resultado na funcao
        return this.parcial + this.coeficiente;
    }
}
