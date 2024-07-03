import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = 1;

        ArrayList<User> myArrayList = new ArrayList<>();
        while (count <= 5) {
            System.out.println("Введите имя пользователя " + count);
            String name = in.nextLine();
            System.out.println("Введите возраст пользователя " + count);
            int age = in.nextInt();
            User user = new User(name, age);
            myArrayList.add(user);
            in.nextLine();
            count += 1;
        }

        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }
    }
}

class User {
    private String name;
    private Integer age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getAge(){
        return age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return (name + ", возраст " + age + " лет");
    }
}