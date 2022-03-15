import application.CustomerServiceImpl;
import application.api.CustomerService;
import application.dto.CustomerDTO;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;

public class Main {
    public static void main(String[] args) throws RemoteException, MalformedURLException {

        System.setProperty("java.rmi.server.hostname","10.0.40.163");
        LocateRegistry.createRegistry(Registry.REGISTRY_PORT);

        Naming.rebind("rmi://localhost/getCustomersByName", new CustomerServiceImpl());

        CustomerService customerService = new CustomerServiceImpl();
        List<CustomerDTO> customerList = customerService.getCustomerByName("Jake");

        for (CustomerDTO c:customerList) {
            System.out.println(c.getFirstName() + c.getLastName());
        }
    }
}
