import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServidorInterface extends Remote {
    public String getMensagem() throws RemoteException;

    public void setMensagem(String msg) throws RemoteException;

    public String setValues(int a, int b) throws RemoteException;
}