import java.rmi.server.*;
import java.rmi.*;

public class ServidorImplementacao extends UnicastRemoteObject implements ServidorInterface {
    private Integer numero = 1;
    private String mensagem = "Execução Nro" + numero;

    public ServidorImplementacao() throws RemoteException {
        System.out.println("Constructor");
    }

    public String getMensagem() throws RemoteException {
        System.out.println("chamou getmensagem");
        return mensagem;
    }

    public void setMensagem(String msg) throws RemoteException {
        numero++;
        mensagem = msg + numero;
        System.out.println("chamou setmensagem");
    }

    public String setValues(int a, int b) throws RemoteException {

        String resultados = "";

        NumberCalculation calc = new NumberCalculation();

        resultados += "Even numbers: " + calc.evenNumber(a, b) + "; \n";

        resultados += "Odd numbers: " + calc.oddNumber(a, b) + "; \n";

        resultados += "Prime numbers: " + calc.primeNumber(a, b) + "; \n";

        resultados += "Composite numbers: " + calc.compositeNumber(a, b) + "; \n";

        resultados += "Perfect numbers: " + calc.perfectNumber(a, b) + "; \n";

        return resultados;

    }

}