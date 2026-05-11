//Esta classe é responsável pelos relatórios gerenciais do sistema UrbanXP

package service;

import model.Experiencia;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RelatorioService{
    public void ordenarPorPreco(List<Experiencia> eventos){
        Collections.sort(eventos, new Comparator<Experiencia>(){
            @Override
            public int compare(Experiencia e1, Experiencia e2){
                return Double.compare(e1.getPrecoBase(), e2.getPrecoBase());
            }
        });
    }
    public void ordenarPorTitulo(List<Experiencia> eventos){
        eventos.sort((e1, e2) -> e1.getTitulo().compareToIgnoreCase(e2.getTitulo()));
    }
}