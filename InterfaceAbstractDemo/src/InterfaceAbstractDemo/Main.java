package InterfaceAbstractDemo;

import java.util.GregorianCalendar;

import InterfaceAbstractDemo.Abstract.BaseCustomerManager;
import InterfaceAbstractDemo.Concrete.StarbucksCustomerManager;
import InterfaceAbstractDemo.Entities.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new customerCheckService());

		Customer Engin = new Customer();
		Engin.setId(1);
		Engin.setFirstName("Engin");
		Engin.setLastName("Demiroð");
		Engin.setNationalityId("1234567");
		Engin.setDateOfBirth(new GregorianCalendar(1985, 01, 06).getTime());

		customerManager.save(Engin);

	}

}
