import java.util.Scanner;

/**
 
        FECHA MIERCOLES 5 DE JULIO DEL 2019
 	INSTITUTO TECNOLÒICO SUPERIOR RUMIÑAHUI 
 	NOMBRE : BRYAN GONZALEZ 
 	NOMBRE DE PROGRAMA : CALCULO IVA
 	MATERIA : PROGRAMACION VISUAL
 	NIVEL : CUARTO DE SISTEMAS NOCTURNO
 */
public class Aplicativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float precioP=0,total=0;
        Operaciones obj1=new Operaciones(precioP);
         precioP=obj1.getPrecioProducto();
        System.out.println("Diguite precio producto :");
        precioP=entrada.nextFloat();
        
       
        total=obj1.calculoIva(precioP);
        System.out.println("total es :"+total);
        
        
    }
}
