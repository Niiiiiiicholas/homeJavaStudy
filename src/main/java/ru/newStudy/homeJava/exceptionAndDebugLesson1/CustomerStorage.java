package ru.newStudy.homeJava.exceptionAndDebugLesson1;

import ru.newStudy.homeJava.exceptionAndDebugLesson1.Exception.AddException;
import ru.newStudy.homeJava.exceptionAndDebugLesson1.Exception.EmailException;
import ru.newStudy.homeJava.exceptionAndDebugLesson1.Exception.NumberPhoneException;

import java.util.HashMap;

public class CustomerStorage
{
    private HashMap<String, Customer> storage;
    public static final String PATTERN_NUMBER = "^(8|\\+7)[\\- ]?(\\(?\\d{3,4}\\)?[\\- ]?)?[\\d\\- ]{5,10}$";
    public static final String PATTERN_EMAIL = "^[A-Za-z0-9._%+-]+@[A-Z0-9a-z.-]+\\.[A-Za-z]{2,6}$";

    public CustomerStorage()
    {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) throws AddException, NumberPhoneException, EmailException {
        String[] components = data.split("\\s+");
        if (components.length != 4) {
            throw  new AddException();
        } else if (components[2].matches(PATTERN_EMAIL)){
            if(components[3].matches(PATTERN_NUMBER)) {
                String name = components[0] + " " + components[1];
                storage.put(name, new Customer(name, components[3], components[2]));
            }else throw  new NumberPhoneException();
        }else throw new EmailException();
    }


    public void listCustomers()
    {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) throws AddException
    {
        storage.remove(name);
    }

    public int getCount()
    {
        return storage.size();
    }

}
