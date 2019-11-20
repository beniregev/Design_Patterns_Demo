package com.beniregev.designpatterns.creational.builder_pattern;

public class BuilderPatternApplication {
    public static void main(String[] args) {
        EmployeeWithoutLombok employee1 = new EmployeeWithoutLombok.EmployeeBuilder("1", "King", "David", 12345.67, "M")
                .setAddress("Jerusalem")
                .setPhone("02-7777777")
                .setEmail("king.david@jer.co.il")
                .build();

        EmployeeWithLombok employee2 = EmployeeWithLombok.builder()
                .id("1")
                .firstName("King")
                .lastName("Solomon")
                .gender("M")
                .salary(23456.78)
                .address("Jerusalem")
                .email("king.solomon@jer.co.il")
                .phone("02-7777777")
                .build();

        System.out.println("Builder Pattern");
        System.out.println(employee1);
        System.out.println(employee2);
    }
}
