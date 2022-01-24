package animal;

/**
 * Класс собак со свойствами  <b>name</b>, <b>age</b>, <b>color</b> и <b>socialStatus</b>.
 */
public class Dog extends Animal {

    /**
     * Конструктор - создание нового объекта с определенными значениями
     * @param name - имя
     * @param age - возраст
     * @param color - цвет
     * @param socialStatus - социальный статус
     */
    public Dog(String name, int age, String color, SocialStatus socialStatus) {
        super(name, age, color, socialStatus);
    }

    /**
     * Функция toString
     * @return строковое представление класса
     */
    @Override
    public String toString() {
        return
                "кличка: " + name + '\n' +
                "возраст: " + age + '\n' +
                "окрас: " + color + '\n' +
                "социальный статус: " + socialStatus.toString();
    }


}
