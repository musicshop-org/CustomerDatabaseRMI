package application;

import sharedrmi.application.api.CustomerService;
import sharedrmi.application.dto.CustomerDTO;

import infrastructure.CustomerRepository;
import infrastructure.CustomerRepositoryImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.LinkedList;
import java.util.List;

public class CustomerServiceImpl extends UnicastRemoteObject implements CustomerService {

    CustomerRepository customerRepository = new CustomerRepositoryImpl();

    public CustomerServiceImpl() throws RemoteException {
    }

    @Override
    public List<CustomerDTO> findCustomersByName(String name) throws RemoteException {
        List<CustomerDTO> customers = new LinkedList<>();
        customers = customerRepository.findCustomersByName(name);
        return customers;
    }
}
