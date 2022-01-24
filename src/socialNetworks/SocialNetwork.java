package socialNetworks;

import people.People;
import service.Printer;
import shelterAndCo.FlashMob;
import shelterAndCo.Shelter;

/**
 * Абстактный класс SocialNetwork
 */
public abstract class SocialNetwork {
    /** Поле название */
    String name;
    /**
     * Конструктор - создание нового объекта с определенными значениями
     * @param name - название сотсети
     */
    public SocialNetwork(String name){
        this.name = name;
    }

    /**
     * Функция publish
     * @param flashMob - флешмоб
     * @param people - автор публикации
     * @param text - текст публикации
     */
    public void publish(People people, FlashMob flashMob, String text) {
        Printer.print(name + ": новая запись от " + people.toString() + ".\n" + text + "\n" + flashMob.getHashtag() + "\n");
    }

    /**
     * Функция publish
     * @param flashMob - флешмоб
     * @param shelter - автор публикации
     * @param text - текст публикации
     */
    public void publish(Shelter shelter, FlashMob flashMob, String text){
        Printer.print(name + " : новая запись от " + shelter.toString() + ".\n" + text  + flashMob.getHashtag() + "\n");
    }

    /**
     * Функция publish
     * @param people - автор публикации
     * @param text - текст публикации
     */
    public void publish(People people, String text){
        Printer.print(name + " : новая запись от " + people.toString() + ".\n" + text + "\n");
    }

    /**
     * Функция toString
     * @return строковое представление класса
     */
    @Override
    public String toString() {
        return "Сотсеть : " + name ;
    }
}
