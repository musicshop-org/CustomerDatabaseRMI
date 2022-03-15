package application.api;

import application.dto.CustomerDTO;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface CustomerService extends Remote, Serializable {

    List<CustomerDTO> getCustomerByName(String name) throws RemoteException;
}
