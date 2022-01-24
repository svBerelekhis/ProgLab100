package people;

import animal.Animal;
import shelterAndCo.FlashMob;
import socialNetworks.SocialNetwork;

import java.util.ArrayList;

/**
 * Класс журналистов со свойствами  <b>name</b>, <b>age</b>, <b>isMan</b> и <b>socialNetworks</b>.
 */
public class Journalist extends People implements Volunteersvable {
    /**
     * Функция toString
     * @return строковое представление класса
     */
    @Override
    public String toString() {
        return name + " (Журналист, " + age + " лет)";
    }

    /**
     * Конструктор - создание нового объекта с определенными значениями
     * @param name - имя
     * @param age - возраст
     * @param socialNetworks - массив социальных сетей
     * @param isMan - пол
     */
    public Journalist(String name, ArrayList<SocialNetwork> socialNetworks, int age, boolean isMan) {
        super(name, socialNetworks, age, isMan);
    }

    /**
     * Функция publicToSN
     * @param  flashMob - флешмоб, в рамках которого публикуют
     * @param  animal - животное, про которое рассказывают
     */
    @Override
    public void publicToSN(FlashMob flashMob, Animal animal) {
        StringBuilder sb = new StringBuilder();
        sb.append("Сегодня Я хочу помочь этой собаке найти дом. Вот информация о ней\n");
        sb.append(animal.toString());
        sb.append("\nМне очень важна его судьба поэтому я лично передам его новым хозяевам");
        for(SocialNetwork socialNetwork : this.socialNetworks){
            socialNetwork.publish(this, flashMob, sb.toString());
        }
    }
}
