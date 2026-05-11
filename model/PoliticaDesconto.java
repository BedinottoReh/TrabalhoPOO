//Define um contrato para o cálculo de preços, permitindo flexibilidade para novos perfis de clientes no futuro.
package model;

public interface PoliticaDesconto{
    double calcularPrecoFinal(double precoBase);
}