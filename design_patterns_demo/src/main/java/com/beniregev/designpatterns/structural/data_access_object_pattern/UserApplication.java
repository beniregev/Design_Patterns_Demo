package com.beniregev.designpatterns.structural.data_access_object_pattern;

import java.util.Optional;

public class UserApplication {
    private static Dao userDao;

    public static void main(String[] args) {
        userDao = new UserDao();

        int countBeforeAdd = userDao.getAll().size();
        userDao.save(new User(3L, "Jake Reacher", "jake.reacher@domain.com"));
        int countAfterAdd = userDao.getAll().size();
        System.out.println("userDao.save(User " + (countAfterAdd == (countBeforeAdd + 1) ? "completed successfully" : "failed!") + ", count: " + countAfterAdd);
        System.out.println("-------------------------------------------------");

        userDao.getAll().forEach(user -> System.out.println("{ " + ((User)user).toString() + " }"));
        System.out.println("-------------------------------------------------");

        User user1 = getUser(2L);
        System.out.println("user1 = getUser(2): " + user1);
        userDao.getAll().forEach(user -> System.out.println("{ " + ((User)user).toString() + " }"));
        System.out.println("-------------------------------------------------");

        userDao.update(user1, new String[]{"Jack", "jack.richer@domain.com"});
        System.out.println("userDao.update(..) --  completed successfully");
        userDao.getAll().forEach(user -> System.out.println("{ " + ((User)user).toString() + " }"));
        System.out.println("-------------------------------------------------");

        User user2 = getUser(1L);
        System.out.println("user2 = getUser(1): " + user1);
        userDao.getAll().forEach(user -> System.out.println("{ " + ((User)user).toString() + " }"));
        System.out.println("-------------------------------------------------");

        userDao.delete(user2);
        System.out.println("userDao.delete(user2) --  completed successfully");
        userDao.getAll().forEach(user -> System.out.println("{ " + ((User)user).toString() + " }"));
        System.out.println("-------------------------------------------------");

        countBeforeAdd = userDao.getAll().size();
        userDao.save(new User(4L, "Dr. Miri", "dr.miri@health.com"));
        countAfterAdd = userDao.getAll().size();
        System.out.println("userDao.save(User " + (countAfterAdd == (countBeforeAdd + 1) ? "completed successfully" : "failed!") + ", count: " + countAfterAdd);
        userDao.getAll().forEach(user -> System.out.println("{ " + ((User)user).toString() + " }"));
        System.out.println("-------------------------------------------------");
    }

    private static User getUser(long id) {
        Optional<User> user = userDao.get(id);
        return user.orElseGet(
                () -> new User(-9999999L, "non-existing user", "no-email")
        );
    }
}
