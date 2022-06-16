package javafaker;

import com.github.javafaker.Faker;

public class Demo {

    protected static Faker faker = new Faker();
    public static void main(String[] args) {
        System.out.println(generateFakeFirstName());
        System.out.println(generateFakeLastName());
        System.out.println(generateFakeEmailAddress());
        System.out.println(generateFakeFirstName());
        System.out.println(generateArtistName());
        System.out.println(generateFakeAnimalName());

    }


    public static String generateFakeFirstName() {
        Faker faker = new Faker();
        return "Hello my name is " + faker.name().firstName();

    }

    public static String generateFakeLastName(){
        return "Surname is:" + faker.name().lastName();

    }

    public static String generateFakeEmailAddress(){
        return "Email is:" + faker.internet().emailAddress();
    }

    public static String generateArtistName(){
        return faker.artist().name();
    }

    public static String generateFakeAnimalName(){
        return faker.animal().name();
    }

    public static String generateFakeProgrammingLang(){
        return faker.animal().name();
    }
}
