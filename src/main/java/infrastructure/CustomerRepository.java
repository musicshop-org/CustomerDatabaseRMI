package infrastructure;

import sharedrmi.application.dto.CustomerDTO;

import java.util.List;

public interface CustomerRepository {
    List<CustomerDTO> findCustomersByName(String name);
}
