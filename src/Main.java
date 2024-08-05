import java.util.Random;
public class Main {
    public static String permission(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            int age = generateRandomAge();
            int temperature = getRandomTemperature();
            System.out.println("Возраст: " + age + ", Температура: " + temperature + " - " + permission(age, temperature));
        }
    }
    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100);
    }
    public static int getRandomTemperature() {
        Random random = new Random();
        return random.nextInt(66) - 30;
    }
}