
/**
 
        FECHA MIERCOLES 5 DE JULIO DEL 2019
 	INSTITUTO TECNOLÒICO SUPERIOR RUMIÑAHUI 
 	NOMBRE : BRYAN GONZALEZ 
 	NOMBRE DE PROGRAMA : OPERACIONES BASICAS
 	MATERIA : PROGRAMACION VISUAL
 	NIVEL : CUARTO DE SISTEMAS NOCTURNO
 */


public class Operaciones {
    private float numero1;
    private float numero2;

    public Operaciones(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }
    
    
    public float sumar(float numero1,float numero2){
        float suma;
        suma=numero1+numero2;
        return suma;
    }
    public float restar(float numero1,float numero2){
        float resta;
        resta=numero1-numero2;
        return resta;
    }
    public float multiplicar(float numero1,float numero2){
        float mul;
        mul=numero1*numero2;
        return mul;
    }
    public float dividir(float numero1,float numero2){
        float div;
        div=numero1/numero2;
        return div;
    }
}
