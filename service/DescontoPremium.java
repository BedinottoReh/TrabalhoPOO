// Esta classe implementa a interface PoliticaDesconto para atender ao perfil de Membros Premium.

package service;

import model.PoliticaDesconto;

public class DescontoPremium implements PoliticaDesconto{
    private double valorFixo;

    public DescontoPremium(double valorFixo){
        this.valorFixo = valorFixo;
    }

    @Override
    public double calcularPrecoFinal(double precoBase){
        return this.valorFixo;
    }
}
