package animal;

/**
 * Класс крыс со свойствами  <b>name</b>, <b>age</b>, <b>color</b> и <b>socialStatus</b>.
 */
public class Rat extends Animal {

    /**
     * Конструктор - создание нового объекта с определенными значениями
     * @param name - имя
     * @param age - возраст
     * @param color - цвет
     * @param socialStatus - социальный статус
     */
    public Rat(String name, int age, String color, SocialStatus socialStatus) {
        super(name, age, color, socialStatus);
    }
}
