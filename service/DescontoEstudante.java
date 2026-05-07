//Implementa a interface PoliticaDesconto para aplicar descontos percentuais

package service;

import model.PoliticaDesconto;

public class DescontoEstudante implements PoliticaDesconto{
    private double percentual;

    public DescontoEstudante(double percentual){
        this.percentual = percentual;
    }

    @Override
    public double calcularPrecoFinal(double precoBase){
        return precoBase * (1 - (percentual / 100));
    }
}