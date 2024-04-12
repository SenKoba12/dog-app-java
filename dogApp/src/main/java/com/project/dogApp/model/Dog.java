package com.project.dogApp.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="dogs")
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String breed;
    private int age;
    private String color;
    private String status;
    private String image;

    public Dog() {
    }

    public Dog(long id, String name, String breed, int age, String color, String status, String image) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
        this.status = status;
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return id == dog.id && age == dog.age && Objects.equals(name, dog.name) && Objects.equals(breed, dog.breed) && Objects.equals(color, dog.color) && Objects.equals(status, dog.status) && Objects.equals(image, dog.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, breed, age, color, status, image);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", status='" + status + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
