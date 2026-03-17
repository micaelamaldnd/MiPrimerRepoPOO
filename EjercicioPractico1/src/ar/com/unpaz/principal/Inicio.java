package ar.com.unpaz.principal;

import ar.com.unpaz.model.*;

public class Inicio {

    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta();
        cuenta1.setNumeroCuenta(123456);
        cuenta1.setTitular("Micaela Maldonado");
        cuenta1.setSaldo(100000);
        
        Cuenta cuenta2 = new Cuenta();
        cuenta2.setNumeroCuenta(987456);
        cuenta2.setTitular("Micaela Maldonado");
        cuenta2.setSaldo(10);


        Contacto contacto1 = new Contacto();
        contacto1.setDomicilio("Alejandro Sirio");
        contacto1.setMail("micamaldnd@gmail.com");
        contacto1.setTelefono(1140404040);

        Cliente cliente1 = new Cliente();
        cliente1.setNombreCompleto("Micaela Maldonado");
        cliente1.setContacto(contacto1);

        cliente1.agregarCuenta(cuenta1);
        cliente1.agregarCuenta(cuenta2);
        
        
        System.out.println("Nombre Completo del cliente: " + cliente1.getNombreCompleto());
        System.out.println("Contacto del cliente" + cliente1.getContacto());
        for (Cuenta c : cliente1.getCuentas()) {
            System.out.println("Numero de cuenta: " + c.getNumeroCuenta());
            System.out.println("Titular: " + c.getTitular());
            System.out.println("Saldo: " + c.getSaldo());
        }
    }
}