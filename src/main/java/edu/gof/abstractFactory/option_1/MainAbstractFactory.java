package edu.gof.abstractFactory.option_1;

import edu.gof.abstractFactory.option_1.customer.Customer;

public class MainAbstractFactory {

    public static void main(String[] args) {

        Customer customer = new Customer();
        String createVehicle = customer.createMotorcycle("economic");

        System.out.println(createVehicle);
    }
}
