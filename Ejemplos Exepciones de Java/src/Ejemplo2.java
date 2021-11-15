import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Valerine
 */
public class Ejemplo2 {
     // El siguiente ejemplo es para varidar la exceptions try y finally. El codigo se basa en una validacion a la entrada de numeros enteros.
    public static void main (String [] args){
    
        Scanner scanner = new Scanner(System.in);
        
        int x; //variable numerica 
        
        System.out.println("Ingrese un nùmero entero");// indicacion inicial
        
        
        try{
           x= scanner.nextInt(); //Obtener numero de teclado
           System.out.println(x);// se ejecuta el error 
        
        // Se coloca el nombre de la exepcion que se da
        }catch(InputMismatchException e){
            
            System.out.println("Debe de ingresar solo valores numericos");
        
        }
        finally{
        
        System.out.println("Proceso terminado");
        }
        
    }
}
