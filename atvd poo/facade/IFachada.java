package facade;

import entity.Conta;
import exception.ExcecaoElementoInex;

public interface IFachada {
    public void inserirConta(Conta conta);
    public void alterarConta(String numero); 
    public void removerConta(String numero);
    public Conta buscarConta(String numero) throws ExcecaoElementoInex ;
    public boolean verificarExistenciaConta(String numero) ;
    public void mostrarContas();
}
