package infrastructure;

import application.dto.CustomerDTO;

import java.util.List;

public interface CustomerRepository {
    List<CustomerDTO> getCustomersByName(String name);
}
