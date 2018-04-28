
package projetobuddy;

import java.util.ArrayList;
import java.util.List;


public class ListaVisitante {
    private static List<Visitante> listaVisitante;

    public static List<Visitante> getInstance() {
        if (listaVisitante == null) {
            listaVisitante = new ArrayList<>();
        }
        return listaVisitante;
    }
   
}
