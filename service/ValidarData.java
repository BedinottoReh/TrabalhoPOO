//Classe utilitária para validações temporais usando a API moderna
package service;

import java.time.LocalDateTime; //biblioteca data/hora

public class ValidarData {
    //método estático de classe para validar se o evento é futuro
    public static boolean DataValida(LocalDateTime dataEvento) {
        return dataEvento.isAfter(LocalDateTime.now());
    }
}