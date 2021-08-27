import java.rmi.*;

public class MyRemoteClient {
    public static void main(String[] args) {
	new MyRemoteClient().go();
    }
    public void go() {
	try {
	    MyRemote service = (MyRemote) Naming.lookup("rmi://student2.cs.appstate.edu:50000/RemoteHello_mageesj");
	    String s = service.sayHello();
	    System.out.println(s);
	}
	catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
