package mystore;

import peoplestuff.Person;

import java.util.List;

// Write a class called Cashier that extends the Person class in the peoplestuff package
// Cashier should have a public instance method called total(List<DataType> parameterName)
// The method should accept a List that can contain Androids, Iphones, Windows and Apples
// The cashier should return the total of all items in the List.
// bonus: Overwrite the greetSomeoneElse method from the Person class
public class Cashier extends Person {
    public Cashier(String newPersonFirstName, String newPersonLastName, int newPersonAge) {
        super(newPersonFirstName, newPersonLastName, newPersonAge);
    }

    // all the classes implement the Product data type
    // so that's what I put into the <>
    public double total(List<Product> cart){
        double sum = 0;
        for(Product item: cart){

            sum += item.getPrice();

        }
        return sum;
    }
}
