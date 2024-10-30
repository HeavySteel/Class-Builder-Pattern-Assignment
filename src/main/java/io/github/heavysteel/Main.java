package io.github.heavysteel;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        Instructor comments
        IntelliJ helps but notice how cumbersome it is to create a new SecurityClearance object using the record constructor.
        A builder pattern would be much more convenient and readable.
         */

        SecurityClearance record = new SecurityClearance(
                "John",
                "Doe",
                "Michael",
                "john.doe@example.com",
                "555-123-4567",
                "1234 Elm St",
                "Springfield",
                State.CALIFORNIA,
                "90210",
                "USA",
                1985,
                5,
                15,
                "Robert",
                "Doe",
                "Chicago",
                State.ILLINOIS,
                "USA",
                1960,
                7,
                20,
                "60601",
                "Mary",
                "Doe",
                "Smith",
                "New York",
                State.NEW_YORK,
                "USA",
                1962,
                4,
                10,
                "10001"
        );

        /* Instructor Directions
        Update the SecurityClearance record to implement a builder pattern subclass.
        The builder should have a method for each field in the record.
        The following code should work after you have modified the SecurityClearance record:
         */
        SecurityClearance builderRecord = new SecurityClearance.Builder()
                .firstName("John")
                .lastName("Doe")
                .middleName("Michael")
                .email("john.doe@example.com")
                .phone("555-123-4567")
                .address("1234 Elm St")
                .city("Springfield")
                .state(State.CALIFORNIA)
                .zipCode("90210")
                .country("USA")
                .birthYear(1985)
                .birthMonth(5)
                .birthDay(15)
                .fatherFirstName("Robert")
                .fatherLastName("Doe")
                .fatherBirthCity("Chicago")
                .fatherBirthState(State.ILLINOIS)
                .fatherBirthCountry("USA")
                .fatherBirthYear(1960)
                .fatherBirthMonth(7)
                .fatherBirthDay(20)
                .fatherBirthZipCode("60601")
                .motherFirstName("Mary")
                .motherLastName("Doe")
                .motherMaidenName("Smith")
                .motherBirthCity("New York")
                .motherBirthState(State.NEW_YORK)
                .motherBirthCountry("USA")
                .motherBirthYear(1962)
                .motherBirthMonth(4)
                .motherBirthDay(10)
                .motherBirthZipCode("10001")
                .build();
    }
}