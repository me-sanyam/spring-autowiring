package Main;

import com.spring.beans.Student;
import com.spring.resources.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        Student studentObj = (Student)context.getBean("createStudent");
        Student studentObj = (Student)context.getBean(Student.class);
        studentObj.displayDetails();
    }
}