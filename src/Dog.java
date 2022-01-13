public class Dog extends Animal{

    public Dog(String name, int age, String color, SocialStatus socialStatus) {
        super(name, age, color, socialStatus);
    }

    @Override
    public String toString() {
        return
                "кличка: " + name + '\n' +
                "возраст: " + age + '\n' +
                "окрас: " + color + '\n' +
                "социальный статус: " + socialStatus.toString();
    }


}
