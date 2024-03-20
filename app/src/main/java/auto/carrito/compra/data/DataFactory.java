package auto.carrito.compra.data;

import static auto.carrito.compra.enums.ContacDataEnum.*;
import static auto.carrito.compra.enums.ShopingDataEnum.*;


import java.util.HashMap;
import java.util.Map;

import com.github.javafaker.Faker;

public class DataFactory {

    private static Faker faker=Faker.instance();


    @SuppressWarnings({ "rawtypes"})
    public static Map contactData() {
        String email = faker.internet().emailAddress();
        String contactName = faker.name().fullName();
        String message = faker.lorem().sentence();
        // Create a HashMap to store the information
        Map<String, String> fakeData = new HashMap<>();
        fakeData.put(EMAIL.name(), email);
        fakeData.put(CONTACT_NAME.name(), contactName);
        fakeData.put(MESSAGE.name(), message);
        return fakeData;
    }

    @SuppressWarnings({ "rawtypes" })
    public static Map shopingData() {
        // Generate fake data
        String name = faker.name().fullName();
        String country = faker.address().country();
        String city = faker.address().city();
        String creditCard = faker.finance().creditCard();
        String month = faker.business().creditCardExpiry();
        String year = faker.business().creditCardExpiry();

        // Create a HashMap to store the information
        Map<String, String> fakeData = new HashMap<>();
        fakeData.put(NAME.name(), name);
        fakeData.put(COUNTRY.name(), country);
        fakeData.put(CITY.name(), city);
        fakeData.put(CREDIT_CARD.name(), creditCard);
        fakeData.put(MONTH.name(), month);
        fakeData.put(YEAR.name(), year);
        return fakeData;
    }
}