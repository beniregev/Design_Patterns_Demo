package com.beniregev.designpatterns.creational.builder_pattern;


import lombok.*;
import lombok.experimental.Wither;

@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
@Data
@Builder
@Wither
public class Employee {
    private String id;
    private String firstName;
    private String lastname;
    private double salary;
    //@InjectRandomInt(min=1, max=2)
    private int gender;
}
