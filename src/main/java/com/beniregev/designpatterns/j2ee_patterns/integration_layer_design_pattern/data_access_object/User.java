package com.beniregev.designpatterns.j2ee_patterns.integration_layer_design_pattern.data_access_object;

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
