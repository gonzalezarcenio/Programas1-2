
/**
 
        FECHA MIERCOLES 5 DE JULIO DEL 2019
 	INSTITUTO TECNOLÒICO SUPERIOR RUMIÑAHUI 
 	NOMBRE : BRYAN GONZALEZ 
 	NOMBRE DE PROGRAMA : OPERACIONES BASICAS
 	MATERIA : PROGRAMACION VISUAL
 	NIVEL : CUARTO DE SISTEMAS NOCTURNO
 */




import java.util.Scanner;


public class Aplicativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numero1=0,numero2=0;
        float valor1,valor2,valor3,valor4;
         
        Operaciones obj1 = new Operaciones(numero1,numero2);
        
        
          numero1=obj1.getNumero1();
        numero2=obj1.getNumero2();
        
        System.out.println("Diguite un numero : ");
        numero1=entrada.nextFloat();
        System.out.println("Diguite un numero : ");
        numero2=entrada.nextFloat();
        
       
         
        valor1=obj1.sumar(numero1, numero2);
        System.out.println("suma :"+valor1);
        valor2=obj1.restar(numero1, numero2);
        System.out.println("resta :"+valor2);
        valor3=obj1.multiplicar(numero1, numero2);
        System.out.println("multiplicacion:"+valor3);
        valor4=obj1.dividir(numero1, numero2);
        System.out.println("division :"+valor4);
    }
    
}
