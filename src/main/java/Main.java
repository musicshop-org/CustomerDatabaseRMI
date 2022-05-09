import sharedrmi.application.api.CustomerService;
import sharedrmi.application.dto.CustomerDTO;

import application.CustomerServiceImpl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;

public class Main {
    public static void main(String[] args) throws RemoteException, MalformedURLException, InterruptedException {

        System.setProperty("java.rmi.server.hostname","10.0.40.163");
        LocateRegistry.createRegistry(Registry.REGISTRY_PORT);

        Naming.rebind("rmi://localhost/CustomerService", new CustomerServiceImpl());

        CustomerService customerService = new CustomerServiceImpl();
        List<CustomerDTO> customerList = customerService.findCustomersByName("Jake");

//        for (CustomerDTO c:customerList) {
//            System.out.println(c.getFirstName() + " " + c.getLastName() + " " +  c.getEmail());
//        }
    }
}
