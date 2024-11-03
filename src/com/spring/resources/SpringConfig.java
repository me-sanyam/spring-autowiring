package com.spring.resources;

import com.spring.beans.Address;
import com.spring.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public Address createAddress(){
        Address addressObj = new Address();
        addressObj.setHouseNo(125);
        addressObj.setLocation("Guru Gobind Singh Nagar");
        addressObj.setCity("Amritsar");
        addressObj.setState("Punjab");
        addressObj.setZipCode(143001);
        return addressObj;
    }

    @Bean
    public Address createAddress2(){
        Address addressObj = new Address();
        addressObj.setHouseNo(90);
        addressObj.setLocation("Block-b, Ranjit Avenue");
        addressObj.setCity("Amritsar");
        addressObj.setState("Punjab");
        addressObj.setZipCode(143001);
        return addressObj;
    }

    @Bean
    public Student createStudent(){
        Student studentObj = new Student();
        studentObj.setRollNo(1);
        studentObj.setFirstName("Sanyam");
        studentObj.setLastName("Kapoor");
        studentObj.setGrades("A+");
//        studentObj.setAddress(createAddress());
        return studentObj;
    }
}
