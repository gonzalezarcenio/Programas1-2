/**
 FECHA MIERCOLES 5 DE JULIO DEL 2019
 	INSTITUTO TECNOLÒICO SUPERIOR RUMIÑAHUI 
 	 NOMBRE : BRYAN GONZALEZ 
 	 NOMBRE DE PROGRAMA : CALCULO IVA
 	 MATERIA : PROGRAMACION VISUAL
 	 NIVEL : CUARTO DE SISTEMAS NOCTURNO
 */
public class Operaciones {
    float precioProducto;

    public Operaciones(float precioProducto) {
        this.precioProducto = precioProducto;
    }

    public float getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(float precioProducto) {
        this.precioProducto = precioProducto;
    }
    
    public float calculoIva(float precioProducto){
        float resultado;
        resultado=precioProducto*0.12f;
        return resultado;
    }
}
