import application.CustomerServiceImpl;
import application.api.CustomerService;
import application.dto.CustomerDTO;

import java.rmi.RemoteException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws RemoteException {

        CustomerService customerService = new CustomerServiceImpl();
        List<CustomerDTO> customerList = customerService.getCustomerByName("Jake");

        for (CustomerDTO c:customerList) {
            System.out.println(c.getFirstName() + c.getLastName());
        }
    }
}
