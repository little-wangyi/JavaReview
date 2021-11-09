package Generic;

import java.util.*;

public class GenericTest03 {
    public static void main(String[] args) {
        Dao<User> userDao = new Dao<User>();
        User user1 = new User(1, 18, "青年1");
        User user2 = new User(2, 19, "青年2");
        User user3 = new User(3, 20, "青年3");

        userDao.save(user1.getName(),user1);
        userDao.save(user2.getName(),user2);
        userDao.save(user3.getName(),user3);
        userDao.delete("青年3");
        System.out.println(userDao.get("青年2"));
        System.out.println(userDao.get("青年3"));
        userDao.update("青年1",user3);
        List list = userDao.list();
        /*for(Object object:list){
            System.out.println(object.toString());
        }*/
        System.out.println(list);
    }
}

class Dao<T> {
    Map<String, T> map = new HashMap<>();

    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.replace(id, entity);
    }

    public List<T> list() {
        ArrayList<T> list = new ArrayList<>();
        Iterator<Map.Entry<String, T>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, T> next =  iterator.next();
            list.add(next.getValue());
        }
        return list;
    }

    public void delete(String id) {
        map.remove(id);
    }
}

class User {
    private int id;
    private int age;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}