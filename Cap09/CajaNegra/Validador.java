

/**
 * Clase para validar los campos de un formulario
 * para iniciar sesión dentro de un chat de amigos.
 * @author Jessica Santizo Galicia.
 */
public class Validador {

  /**
   * Método que valida el nickname del usuario, el cuál no debe ser vacío.
   * Deberá contener al menos 5 carácteres y como máximo 10.
   * Nunca debe empezar por un número y no tendrá que contener espacios en blancos.
   * @param nickname - la cadena con el usuario que inciará sesión en el chat.
   * @return bolean - true si cumpĺe con la validación el nickname y false en otro caso.
   */
  public boolean validarNickname(String nickname) {
    nickname = nickname.trim();
    return nickname.matches("[a-z0-9]{5,10}");

  }

  /**
   * Método que valida la contraseña del usuario el cuál deberá
   * contener un mínimo de 8 carácteres.
   * Tendrá que ser una combinación obligatoria de letras y números.
   * No deberá de contener espacios en blanco.
   * @param contrasena --la contraseña que introduce el usuario para iniciar sesión.
   * @return boolean -  true si es válida la contraseña y false en otro caso.
   */
  public boolean validarContrasena(String contrasena) {
    contrasena = contrasena.trim();
    if (contrasena.length() < 8 || contrasena.contains(" ")) {
      return false;
    } else {
      return contrasena.matches("[0-9]+[a-z]+");
    }
  }

  /**
   *  Valida la edad del usuario.
   * @param edad - la edad del usuario.
   * @return boolean - true si es mayor de edad y false en otro caso.
   */
  public boolean validarEdad(int edad) {
    if (edad < 18) {
      return false;
    }
    return true;
  }

  /**
   * Método que valida el sexo del usuario
   * @param sexo - el número 1 representa sexo masculino y el 0 al femenino.
   * @return boolean -  en caso de escribir cualquier número diferente de este, el método
   * devuelve false y en otro caso true.
   */
  public boolean validarSexo(int sexo) {
    if (sexo < 0 || sexo > 1) {
      return false;
    }
    return true;
  }
}
