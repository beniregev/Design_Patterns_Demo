package com.beniregev.designpatterns.structural_patterns.data_access_object_pattern;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {
    Optional<T> get(Long id);
    List<T> getAll();
    void save(T t);
    void update(T t, String[] params);
    void delete(T t);
}
