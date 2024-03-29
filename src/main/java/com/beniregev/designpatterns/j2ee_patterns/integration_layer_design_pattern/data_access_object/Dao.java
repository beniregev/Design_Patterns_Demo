package com.beniregev.designpatterns.j2ee_patterns.integration_layer_design_pattern.data_access_object;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {
    Optional<T> get(Long id);
    List<T> getAll();
    void save(T t);
    void update(T t, String[] params);
    void delete(T t);
}
