package people;

import animal.Animal;
import shelterAndCo.FlashMob;
import socialNetworks.SocialNetwork;

import java.util.ArrayList;

/**
 * Класс музыкантов со свойствами  <b>name</b>, <b>age</b>, <b>isMan</b> и <b>socialNetworks</b>.
 */
public class Musician extends People implements Volunteersvable {
    /**
     * Конструктор - создание нового объекта с определенными значениями
     * @param name - имя
     * @param age - возраст
     * @param socialNetworks - массив социальных сетей
     * @param isMan - пол
     */
    public Musician(String name, ArrayList<SocialNetwork> socialNetworks, int age, boolean isMan) {
        super(name, socialNetworks, age, isMan);
    }

    /**
     * Функция toString
     * @return строковое представление класса
     */
    @Override
    public String toString() {
        return name + " (Музыкант, " + age + " лет)";
    }

    /**
     * Функция publicToSN
     * @param  flashMob - флешмоб, в рамках которого публикуют
     * @param  animal - животное, про которое рассказывают
     */
    @Override
    public void publicToSN(FlashMob flashMob, Animal animal) {
        StringBuilder sb = new StringBuilder();
        sb.append("Сегодня Я хочу помочь этой собаке найти дом. Вот информация о ней:\n");
        sb.append(animal.toString());
        sb.append("\nМне важно чтобы хотябы у этой собаки все в жизни было хорошо, поэтому я самостоятельно привезу ее новым хозяевам");
        for(SocialNetwork socialNetwork : this.socialNetworks){
            socialNetwork.publish(this, flashMob, sb.toString());
        }
    }

}
