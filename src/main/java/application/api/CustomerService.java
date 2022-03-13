package application.api;

import application.dto.CustomerDTO;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface CustomerService extends Remote {

    List<CustomerDTO> getCustomerByName(String name) throws RemoteException;
}
