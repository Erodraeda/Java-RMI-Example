import java.rmi.Naming;

public class ClienteMain {
    public static void main(String[] args) throws Exception {

        Object obj = Naming.lookup("rmi://127.0.0.1:1099/mensagem");

        ServidorInterface mens = (ServidorInterface) obj;

        System.out.println("Mensagem do Servidor: " + mens.getMensagem());

        mens.setMensagem("Chamndo o Servidor - Execução: ");

        System.out.println(mens.setValues(1, 100000));

    }
}