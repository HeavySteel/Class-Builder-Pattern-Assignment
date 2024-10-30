package io.github.heavysteel;

public record SecurityClearance(
        String firstName,
        String lastName,
        String middleName,
        String email,
        String phone,
        String address,
        String city,
        State state,
        String zipCode,
        String country,
        int birthYear,
        int birthMonth,
        int birthDay,
        String fatherFirstName,
        String fatherLastName,
        String fatherBirthCity,
        State fatherBirthState,
        String fatherBirthCountry,
        int fatherBirthYear,
        int fatherBirthMonth,
        int fatherBirthDay,
        String fatherBirthZipCode,
        String motherFirstName,
        String motherLastName,
        String motherMaidenName,
        String motherBirthCity,
        State motherBirthState,
        String motherBirthCountry,
        int motherBirthYear,
        int motherBirthMonth,
        int motherBirthDay,
        String motherBirthZipCode
) {
    public static class Builder {
        private String firstName;
        private String lastName;
        private String middleName;
        private String email;
        private String phone;
        private String address;
        private String city;
        private State state;
        private String zip;
        private String country;
        private int birthYear;
        private int birthMonth;
        private int birthDay;
        private String fatherFirstName;
        private String fatherLastName;
        private String fatherCity;
        private State fatherState;
        private String fatherCountry;
        private int fatherBirthYear;
        private int fatherBirthMonth;
        private int fatherBirthDay;
        private String fatherZip;
        private String motherFirstName;
        private String motherLastName;
        private String motherMaidenName;
        private String motherCity;
        private State motherState;
        private String motherCountry;
        private int motherBirthYear;
        private int motherBirthMonth;
        private int motherBirthDay;
        private String motherZip;

        public Builder firstName(String firstName) { this.firstName = firstName; return this; }
        public Builder lastName(String lastName) { this.lastName = lastName; return this; }
        public Builder middleName(String middleName) { this.middleName = middleName; return this; }
        public Builder email(String email) { this.email = email; return this; }
        public Builder phone(String phone) { this.phone = phone; return this; }
        public Builder address(String address) { this.address = address; return this; }
        public Builder city(String city) { this.city = city; return this; }
        public Builder state(State state) { this.state = state; return this; }
        public Builder zipCode(String zip) { this.zip = zip; return this; }
        public Builder country(String country) { this.country = country; return this; }
        public Builder birthYear(int birthYear) { this.birthYear = birthYear; return this; }
        public Builder birthMonth(int birthMonth) { this.birthMonth = birthMonth; return this; }
        public Builder birthDay(int birthDay) { this.birthDay = birthDay; return this; }
        public Builder fatherFirstName(String fatherFirstName) { this.fatherFirstName = fatherFirstName; return this; }
        public Builder fatherLastName(String fatherLastName) { this.fatherLastName = fatherLastName; return this; }
        public Builder fatherBirthCity(String fatherCity) { this.fatherCity = fatherCity; return this; }
        public Builder fatherBirthState(State fatherState) { this.fatherState = fatherState; return this; }
        public Builder fatherBirthCountry(String fatherCountry) { this.fatherCountry = fatherCountry; return this; }
        public Builder fatherBirthYear(int fatherBirthYear) { this.fatherBirthYear = fatherBirthYear; return this; }
        public Builder fatherBirthMonth(int fatherBirthMonth) { this.fatherBirthMonth = fatherBirthMonth; return this; }
        public Builder fatherBirthDay(int fatherBirthDay) { this.fatherBirthDay = fatherBirthDay; return this; }
        public Builder fatherBirthZipCode(String fatherZip) { this.fatherZip = fatherZip; return this; }
        public Builder motherFirstName(String motherFirstName) { this.motherFirstName = motherFirstName; return this; }
        public Builder motherLastName(String motherLastName) { this.motherLastName = motherLastName; return this; }
        public Builder motherMaidenName(String motherMaidenName) { this.motherMaidenName = motherMaidenName; return this; }
        public Builder motherBirthCity(String motherCity) { this.motherCity = motherCity; return this; }
        public Builder motherBirthState(State motherState) { this.motherState = motherState; return this; }
        public Builder motherBirthCountry(String motherCountry) { this.motherCountry = motherCountry; return this; }
        public Builder motherBirthYear(int motherBirthYear) { this.motherBirthYear = motherBirthYear; return this; }
        public Builder motherBirthMonth(int motherBirthMonth) { this.motherBirthMonth = motherBirthMonth; return this; }
        public Builder motherBirthDay(int motherBirthDay) { this.motherBirthDay = motherBirthDay; return this; }
        public Builder motherBirthZipCode(String motherZip) { this.motherZip = motherZip; return this; }

        public SecurityClearance build() {
            return new SecurityClearance(
                    firstName, lastName, middleName, email, phone, address, city, state, zip, country,
                    birthYear, birthMonth, birthDay, fatherFirstName, fatherLastName, fatherCity, fatherState,
                    fatherCountry, fatherBirthYear, fatherBirthMonth, fatherBirthDay, fatherZip,
                    motherFirstName, motherLastName, motherMaidenName, motherCity, motherState,
                    motherCountry, motherBirthYear, motherBirthMonth, motherBirthDay, motherZip
            );
        }
    }
}
