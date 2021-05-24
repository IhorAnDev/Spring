package spring_introduction;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

    public Person() {
        System.out.println("Person bean is created");
    }

    /*   public Person(Pet pet) {
           System.out.println("Person bean is created");
           this.pet = pet;
       }*/
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet ");
        this.pet = pet;
    }

    public String getSurname() {
        System.out.println(this.surname);
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person : set Surname ");
        this.surname = surname;
    }

    public int getAge() {
        System.out.println(this.age);
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person : set Age ");
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
