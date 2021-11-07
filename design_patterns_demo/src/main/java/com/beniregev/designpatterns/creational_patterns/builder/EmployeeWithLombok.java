package com.beniregev.designpatterns.creational_patterns.builder;


import lombok.*;
import lombok.experimental.Wither;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
@Data
@Builder
@Wither
public class EmployeeWithLombok {
    @NonNull
    private String id;          //  Required
    @NonNull
    private String firstName;   //  Required
    @NonNull
    private String lastName;    //  Required
    @NonNull
    private Double salary;      //  Required
    @NonNull
    private String gender;      //  Required
    private String address;     //  Optional
    private String email;       //  Optional
    private String phone;       //  Optional
}
