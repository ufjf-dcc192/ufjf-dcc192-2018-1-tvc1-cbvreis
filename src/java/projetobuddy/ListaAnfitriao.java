/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobuddy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ice
 */
public class ListaAnfitriao {
    
    private static List<Anfitriao> listaAnfitriao;

    public static List<Anfitriao> getInstance() {
        if (listaAnfitriao == null) {
            listaAnfitriao = new ArrayList<>();
            listaAnfitriao.add(new Anfitriao("Joao","Avenida Costa e Silva, 325 ,  São Pedro","Juiz de Fora",5,4));
            listaAnfitriao.add(new Anfitriao("Pedro","Rua ibitiguaia, 125 , Santa Terezinha","Juiz de Fora",15,3));
        }
        return listaAnfitriao;
    }
   
}
   