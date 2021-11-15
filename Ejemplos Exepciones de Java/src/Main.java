import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Valerine
 */
public class Main {
    public static void main(String[] args) throws CustomException{
    
    String user, pass, repass;
    user = "Valerin14";
    pass = "12345";
    repass = "12345";
    
    
    MiHelper h= new MiHelper(); //Ayuda a registrar el usuario
    
    try{
    h.validarPassword(pass,repass);
    
    }catch(CustomException e){
      System.out.println("No se puede registrar el usuario debido a:"+ e.getMessage());// Llamada de los mensajes creados por medio de throw
    }
    }
    
}
