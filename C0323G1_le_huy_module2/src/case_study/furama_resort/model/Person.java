package case_study.furama_resort.model;

import java.util.Objects;

public abstract class Person {
    private String code;
    private String name;
    private String birthdate;
    private boolean gender;
    private String id;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person(String code, String name, String birthdate, boolean gender, String id, String phoneNumber, String email) {
        this.code = code;
        this.name = name;
        this.birthdate = birthdate;
        this.gender = gender;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "code = " + code +
                ", name = " + name +
                ", birthdate = " + birthdate +
                ", gender = " + (gender ? "Male" : "Female") +
                ", id = " + id +
                ", phoneNumber = " + phoneNumber +
                ", email = " + email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(code, person.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
