package com.beniregev.designpatterns.structural.data_access_object_pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class UserDao implements Dao<User> {
    private List<User> users = new ArrayList<>();

    public UserDao() {
        users.add(new User(1L, "John Doe", "john.doe@domain.com"));
        users.add(new User(2L, "Jane Doe", "jane.doe@domain.com"));
    }

    @Override
    public Optional<User> get(Long id) {
        //return Optional.empty();
        return Optional.ofNullable(users.get((int) Long.parseLong(id.toString())));
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public void update(User user, String[] params) {
        int index = users.indexOf(user);
        user.setName(Objects.requireNonNull(params[0], "Name cannot be null"));
        user.setEmail(Objects.requireNonNull(params[1], "Email cannot be null"));
        users.remove(index);
        users.add(index, user);
    }

    @Override
    public void delete(User user) {
        users.remove(user);
    }
}
