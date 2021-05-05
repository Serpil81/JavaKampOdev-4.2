package InterfaceAbstractDemo.Concrete;

import InterfaceAbstractDemo.Abstract.ICustomerCheckService;
import InterfaceAbstractDemo.Entities.Customer;

public abstract class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {

		return true;

	}

}
