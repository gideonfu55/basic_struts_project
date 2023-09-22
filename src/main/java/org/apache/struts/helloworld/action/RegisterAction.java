package org.apache.struts.helloworld.action;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {

    String firstName;
    String lastName;
    String gender;
    Integer age;
    String email;

    public String execute() throws Exception {
        System.out.println("execute() method called");
        return SUCCESS;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // ActionSupport provides the Interceptor component for validation so that all fields can be validated at once within the validate() method:
    // - We use the addFieldError() method to add an error message for a specific field.
    // - This is one of the ways to add validation for form fields.
//    public void validate() {
//        if (firstName == null || firstName.trim().isEmpty()) {
//            addFieldError("firstName", "First name is required.");
//        }
//
//        if (lastName == null || lastName.trim().isEmpty()) {
//            addFieldError("lastName", "Last name is required.");
//        }
//
//        if (gender == null) {
//            addFieldError("gender", "Gender is required.");
//        }
//
//        if (age == null || age < 18) {
//            addFieldError("age", "Age is required and must be 18 or older");
//        }
//
//        if (email == null || email.trim().isEmpty()) {
//            addFieldError("email", "Email is required.");
//        }
//    }

}