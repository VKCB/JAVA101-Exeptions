/**
 *
 * @author Valerine
 */


public class CustomException extends Exception{
    
    //Envia mensaje y revisa el ID igresado
    public static final long serialVersionUID= 700L;
    
    public CustomException(String mensaje){
            super(mensaje);
    }
    
    
}

