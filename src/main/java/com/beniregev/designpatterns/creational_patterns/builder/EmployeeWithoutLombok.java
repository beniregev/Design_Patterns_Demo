package com.beniregev.designpatterns.creational_patterns.builder;

import java.util.Objects;

public class EmployeeWithoutLombok {
    private String id;          //  Required
    private String firstName;   //  Required
    private String lastName;    //  Required
    private double salary;      //  Required
    private String gender;         //  Required
    private String address;     //  Optional
    private String email;       //  Optional
    private String phone;       //  Optional

    public static class EmployeeBuilder {
        private String id;          //  Required
        private String firstName;   //  Required
        private String lastName;    //  Required
        private double salary;      //  Required
        private String gender;         //  Required
        private String address;     //  Optional
        private String email;       //  Optional
        private String phone;       //  Optional

        public EmployeeBuilder(String id, String firstName, String lastName, double salary, String gender) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.salary = salary;
            this.gender = gender;
        }

        public EmployeeBuilder setAddress(String address) {
            this.address = address;
            return this;
        }
        public EmployeeBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public EmployeeBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public EmployeeWithoutLombok build() {
            //  Call the private constructor in the outer class
            return new EmployeeWithoutLombok(this);
        }
    }

    private EmployeeWithoutLombok(EmployeeBuilder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.gender = builder.gender;
        this.salary = builder.salary;
        this.address = builder.address;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    public EmployeeWithoutLombok() {
    }

    public EmployeeWithoutLombok(String id, String firstName, String lastName, double salary, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeWithoutLombok that = (EmployeeWithoutLombok) o;
        return Double.compare(that.salary, salary) == 0 &&
                id.equals(that.id) &&
                firstName.equals(that.firstName) &&
                lastName.equals(that.lastName) &&
                gender.equals(that.gender) &&
                address.equals(that.address) &&
                email.equals(that.email) &&
                phone.equals(that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, salary, gender, address, email, phone);
    }

    @Override
    public String toString() {
        return "EmployeeWithoutLombok{" +
                "id='" + id + '\'' +
                ", fullName=" + firstName + ' ' + lastName +
                ", salary=" + salary +
                ", gender=" + gender +
                ", address=" + address +
                ", email=" + email +
                ", phone=" + phone +
                '}';
    }
}
