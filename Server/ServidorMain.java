import java.rmi.Naming;
import java.rmi.RemoteException;

public class ServidorMain {
    public static void main(String[] args) throws RemoteException {
        System.out.println("Iniciando servidor!");

        // teste();

        ServidorInterface mens = new ServidorImplementacao();
        try {
            Naming.rebind("mensagem", mens);
            System.out.println("Resposta do Servidor : Nome do objeto servidor: mensagem (Ex. 127.0.0.1/mensagem)");
        } catch (Exception ex) {
        }
    }

    // private static void teste() {

    // try {
    // ServidorImplementacao serv = new ServidorImplementacao();
    // System.out.println(serv.setValues(1, 500));
    // } catch (RemoteException e) {
    // e.printStackTrace();
    // }

    // }
}