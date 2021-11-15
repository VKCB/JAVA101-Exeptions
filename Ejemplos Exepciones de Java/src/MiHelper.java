
/**
 *
 * @author Valerine
 */
public class MiHelper {

   
// validacion de datos ingresados
void validarPassword(String pass, String repass) throws CustomException{
    
    if (!pass.equals(repass)){
    
        throw new CustomException("Los password no coinciden");
    }

    if(pass.length()<5){
           throw new CustomException("Es password no tiene la cantidad de digitos requeridos");
    
    }
    /*...continuara...*/
}
}
