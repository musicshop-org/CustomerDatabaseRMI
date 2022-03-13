package application;

import application.api.CustomerService;
import application.dto.CustomerDTO;
import infrastructure.CustomerRepository;
import infrastructure.CustomerRepositoryImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class CustomerServiceImpl extends UnicastRemoteObject implements CustomerService {

    //TODO: Singleton?
    CustomerRepository customerRepository = new CustomerRepositoryImpl();

    public CustomerServiceImpl() throws RemoteException {
    }

    public List<CustomerDTO> getCustomerByName(String name) throws RemoteException{
        return customerRepository.getCustomersByName(name);
    }

}
