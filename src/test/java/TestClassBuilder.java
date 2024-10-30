import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.heavysteel.SecurityClearance;
import io.github.heavysteel.State;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class TestClassBuilder {

    @Test
    public void testClassBuilder1() {
        // Build the SecurityClearance object using the builder
        SecurityClearance Clearance = new SecurityClearance.Builder()
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

        // Now assert that each field is set correctly
        assertEquals("John", Clearance.firstName());
        assertEquals("Doe", Clearance.lastName());
        assertEquals("Michael", Clearance.middleName());
        assertEquals("john.doe@example.com", Clearance.email());
        assertEquals("555-123-4567", Clearance.phone());
        assertEquals("1234 Elm St", Clearance.address());
        assertEquals("Springfield", Clearance.city());
        assertEquals(State.CALIFORNIA, Clearance.state());
        assertEquals("90210", Clearance.zipCode());
        assertEquals("USA", Clearance.country());
        assertEquals(1985, Clearance.birthYear());
        assertEquals(5, Clearance.birthMonth());
        assertEquals(15, Clearance.birthDay());
        assertEquals("Robert", Clearance.fatherFirstName());
        assertEquals("Doe", Clearance.fatherLastName());
        assertEquals("Chicago", Clearance.fatherBirthCity());
        assertEquals(State.ILLINOIS, Clearance.fatherBirthState());
        assertEquals("USA", Clearance.fatherBirthCountry());
        assertEquals(1960, Clearance.fatherBirthYear());
        assertEquals(7, Clearance.fatherBirthMonth());
        assertEquals(20, Clearance.fatherBirthDay());
        assertEquals("60601", Clearance.fatherBirthZipCode());
        assertEquals("Mary", Clearance.motherFirstName());
        assertEquals("Doe", Clearance.motherLastName());
        assertEquals("Smith", Clearance.motherMaidenName());
        assertEquals("New York", Clearance.motherBirthCity());
        assertEquals(State.NEW_YORK, Clearance.motherBirthState());
        assertEquals("USA", Clearance.motherBirthCountry());
        assertEquals(1962, Clearance.motherBirthYear());
        assertEquals(4, Clearance.motherBirthMonth());
        assertEquals(10, Clearance.motherBirthDay());
        assertEquals("10001", Clearance.motherBirthZipCode());
    }


    @Test
    public void testClassBuilderRandomValues() {
        Random random = new Random();
        int randomBirthYear = random.nextInt(50) + 1950;
        int randomBirthMonth = random.nextInt(12) + 1;
        int randomBirthDay = random.nextInt(28) + 1;
        int randomFatherBirthYear = random.nextInt(50) + 1950;
        int randomMotherBirthYear = random.nextInt(50) + 1950;
        int randomFatherBirthMonth = random.nextInt(12) + 1;
        int randomMotherBirthMonth = random.nextInt(12) + 1;
        int randomFatherBirthDay = random.nextInt(28) + 1;
        int randomMotherBirthDay = random.nextInt(28) + 1;

        // Build the SecurityClearance object using the builder with different values
        SecurityClearance clearance = new SecurityClearance.Builder()
                .firstName("Alice")
                .lastName("Smith")
                .middleName("Jane")
                .email("alice.smith@example.com")
                .phone("555-987-6543")
                .address("4321 Oak Ave")
                .city("Los Angeles")
                .state(State.TEXAS)
                .zipCode("75001")
                .country("USA")
                .birthYear(randomBirthYear)
                .birthMonth(randomBirthMonth)
                .birthDay(randomBirthDay)
                .fatherFirstName("William")
                .fatherLastName("Smith")
                .fatherBirthCity("Austin")
                .fatherBirthState(State.TEXAS)
                .fatherBirthCountry("USA")
                .fatherBirthYear(randomFatherBirthYear)
                .fatherBirthMonth(randomFatherBirthMonth)
                .fatherBirthDay(randomFatherBirthDay)
                .fatherBirthZipCode("73301")
                .motherFirstName("Linda")
                .motherLastName("Smith")
                .motherMaidenName("Johnson")
                .motherBirthCity("Houston")
                .motherBirthState(State.TEXAS)
                .motherBirthCountry("USA")
                .motherBirthYear(randomMotherBirthYear)
                .motherBirthMonth(randomMotherBirthMonth)
                .motherBirthDay(randomMotherBirthDay)
                .motherBirthZipCode("77001")
                .build();

        // Now assert that each field is set correctly
        assertEquals("Alice", clearance.firstName());
        assertEquals("Smith", clearance.lastName());
        assertEquals("Jane", clearance.middleName());
        assertEquals("alice.smith@example.com", clearance.email());
        assertEquals("555-987-6543", clearance.phone());
        assertEquals("4321 Oak Ave", clearance.address());
        assertEquals("Los Angeles", clearance.city());
        assertEquals(State.TEXAS, clearance.state());
        assertEquals("75001", clearance.zipCode());
        assertEquals("USA", clearance.country());
        assertEquals(randomBirthYear, clearance.birthYear());
        assertEquals(randomBirthMonth, clearance.birthMonth());
        assertEquals(randomBirthDay, clearance.birthDay());
        assertEquals("William", clearance.fatherFirstName());
        assertEquals("Smith", clearance.fatherLastName());
        assertEquals("Austin", clearance.fatherBirthCity());
        assertEquals(State.TEXAS, clearance.fatherBirthState());
        assertEquals("USA", clearance.fatherBirthCountry());
        assertEquals(randomFatherBirthYear, clearance.fatherBirthYear());
        assertEquals(randomFatherBirthMonth, clearance.fatherBirthMonth());
        assertEquals(randomFatherBirthDay, clearance.fatherBirthDay());
        assertEquals("73301", clearance.fatherBirthZipCode());
        assertEquals("Linda", clearance.motherFirstName());
        assertEquals("Smith", clearance.motherLastName());
        assertEquals("Johnson", clearance.motherMaidenName());
        assertEquals("Houston", clearance.motherBirthCity());
        assertEquals(State.TEXAS, clearance.motherBirthState());
        assertEquals("USA", clearance.motherBirthCountry());
        assertEquals(randomMotherBirthYear, clearance.motherBirthYear());
        assertEquals(randomMotherBirthMonth, clearance.motherBirthMonth());
        assertEquals(randomMotherBirthDay, clearance.motherBirthDay());
        assertEquals("77001", clearance.motherBirthZipCode());
    }
}