import java.rmi.*;
import java.rmi.server.*;

public class MyRemoteImpl 
    extends UnicastRemoteObject 
    implements MyRemote {
	private static final long serialVersionUID = 1L;

    public String sayHello() {
	return "Server says 'Time for your next class'";
    }

    public MyRemoteImpl() throws RemoteException { }

    public static void main(String[] args) {
	try {
	    MyRemote service = new MyRemoteImpl();
	    Naming.rebind("//localhost:50000/RemoteHello_mageesj", service);
	}
	catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
