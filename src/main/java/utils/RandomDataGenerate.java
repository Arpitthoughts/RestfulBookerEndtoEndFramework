package utils;


import net.datafaker.Faker;
public class RandomDataGenerate{

public static Faker faker=new Faker();

    public static String  getRandomDataFor(DataGeneratorKeys dataGeneratorKeys) {

        switch (dataGeneratorKeys) {
            case FIRST_NAME:
                return faker.name().firstName();
            case LAST_NAME:
                return faker.name().lastName();
            default:
                return "data type not available";

        }
    }
        public static int getRandomTotalPrice(){
           return Integer.parseInt(faker.number().digits(3));
        }

    public static int getRandomNumber(){
        return faker.number().numberBetween(0,3);
    }



}
