package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

//        Car car1 = new Car("Toyota", 124);
//        User user1 = new User("User1", "Lastname1", "user1@mail.ru");
//        user1.setCar(car1);
//
//        Car car2 = new Car("Honda", 444);
//        User user2 = new User("User2", "Lastname2", "user2@mail.ru");
//        user2.setCar(car2);
//
//        Car car3 = new Car("Ford", 853);
//        User user3 = new User("User3", "Lastname3", "user3@mail.ru");
//        user3.setCar(car3);

//        userService.add(user1);
//        userService.add(user2);
//        userService.add(user3);

//        List<User> users = userService.listUsers();
//        for (User user : users) {
//            System.out.println("Id = " + user.getId());
//            System.out.println("First Name = " + user.getFirstName());
//            System.out.println("Last Name = " + user.getLastName());
//            System.out.println("Email = " + user.getEmail());
//            System.out.println();
//            if (user.getCar() != null) {
//                System.out.println("car model: " + user.getCar().getModel());
//                System.out.println("car series: " + user.getCar().getSeries());
//            }
//            System.out.println();
//        }

        User user = userService.getUser("Toyota", 124);
        System.out.println(user);
        context.close();
    }
}
