package animal;

import java.util.Objects;
/**
 * Абстрактный класс животных со свойствами  <b>name</b>, <b>age</b>, <b>color</b> и <b>socialStatus</b>.
 */
public abstract class Animal{
    /** Поле имя */
    protected String name;
    /** Поле возраст*/
    protected int age;
    /** Поле цвет*/
    protected String color;
    /** Поле социальный статус*/
    protected SocialStatus socialStatus;

    /**
     * Конструктор - создание нового объекта с определенными значениями
     * @param name - имя
     * @param age - возраст
     * @param color - цвет
     * @param socialStatus - социальный статус
     */
    public Animal(String name, int age, String color, SocialStatus socialStatus){
        this.name = name;
        this.age = age;
        this.color = color;
        this.socialStatus = socialStatus;
    }

    /**
     * Смена социалього статуса
     * @param  newSocialStatus - новый социальный статус
     */
    public void chengSocialStatus(SocialStatus newSocialStatus){
        this.socialStatus = newSocialStatus;
    }

    /**
     * Функция equals
     * @param  o - объект с которым сравниваем
     * @return равны ли объекты
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                Objects.equals(name, animal.name) &&
                Objects.equals(color, animal.color) &&
                socialStatus == animal.socialStatus;
    }

    /**
     * Функция hashCode
     * @return хеш-код
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, age, color, socialStatus);
    }

    /**
     * Функция toString
     * @return строковое представление класса
     */
    @Override
    public String toString() {
        return "animal.Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", socialStatus=" + socialStatus +
                '}';
    }

    /**
     * Функция getName
     * @return name - имя
     */
    public String getName() {
        return name;
    }

    /**
     * Функция getAge
     * @return age - возраст
     */
    public int getAge() {
        return age;
    }

    /**
     * Функция getColor
     * @return color - цвет
     */
    public String getColor() {
        return color;
    }

    /**
     * Функция getSocialStatus
     * @return socialStatus - социальный статус
     */
    public SocialStatus getSocialStatus() {
        return socialStatus;
    }
}
