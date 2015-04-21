import RMI.GestStationsImpl;
import java.rmi.Naming;
import java.rmi.registry.*;

/**
 *
 * @author 21103482
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
			LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
			GestStationsImpl od = new GestStationsImpl();
			Naming.rebind("rmi://localhost/VB", od);
			System.out.println("Publication OK "+od.toString());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
