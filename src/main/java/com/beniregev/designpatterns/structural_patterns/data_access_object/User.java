package com.beniregev.designpatterns.structural_patterns.data_access_object;

import lombok.*;

@Data
//@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private Long id;
    private String name;
    private String email;
}