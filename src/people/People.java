package people;

import animal.Animal;
import animal.SocialStatus;
import socialNetworks.SocialNetwork;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Класс людей со свойствами  <b>name</b>, <b>age</b>, <b>isMan</b>, <b>socialNetworks</b> и <b>animals</b>.
 */
public class People implements Hostable {
    /** Поле имя */
    protected final String name;
    /** List социальных сетей */
    protected final ArrayList<SocialNetwork> socialNetworks;
    /** Поле возраст */
    protected int age;
    /** Поле пол */
    protected boolean isMan;
    /** List животных */
    ArrayList<Animal> animals;
    /**
     * Конструктор - создание нового объекта с определенными значениями
     * @param name - имя
     * @param age - возраст
     * @param socialNetworks - массив социальных сетей
     * @param isMan - пол
     */
    public People(String name, ArrayList<SocialNetwork> socialNetworks, int age, boolean isMan){
        this.name = name;
        this.age = age;
        this.socialNetworks = socialNetworks;
        this.isMan = isMan;
        this.animals = new ArrayList<>();
    }

    /**
     * Функция getName
     * @return name - имя
     */
    public String getName() {
        return name;
    }

    /**
     * Функция publishToPersonalSN
     * @param  text - текст, который публикуют
     */
    public void publishToPersonalSN(String text){
        for (SocialNetwork sn: socialNetworks){
            sn.publish(this, text);
        }
    }
    /**
     * Функция hashCode
     * @param animal - животное, над котором берут опеку
     */
    @Override
    public void takeResponsibility(Animal animal) {

        this.animals.add(animal);
        animal.chengSocialStatus(SocialStatus.HOME);
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
        People people = (People) o;
        return age == people.age &&
                isMan == people.isMan &&
                Objects.equals(name, people.name) &&
                Objects.equals(socialNetworks, people.socialNetworks) &&
                Objects.equals(animals, people.animals);
    }
    /**
     * Функция toString
     * @return строковое представление класса
     */
    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", socialNetworks=" + socialNetworks +
                ", age=" + age +
                ", isMan=" + isMan +
                ", animals=" + animals +
                '}';
    }

    /**
     * Функция hashCode
     * @return хеш-код
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, socialNetworks, age, isMan, animals);
    }

}
