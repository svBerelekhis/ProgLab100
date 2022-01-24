package shelterAndCo;

import animal.Animal;
import people.People;
import people.Volunteersvable;
import service.Printer;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Класс Mechanism описывающий механизм флешмоба
 */
public class Mechanism {
    /** Поле описание механизма */
    private final String description;
    /**
     * Функция activate
     * @param  volunteersvables - волонтеры
     * @param  animals - животные, которых раздают
     * @param  people - люди, которые будут забирать собак
     * @param flashMob - флешмоб
     * @param shelter - приют, который организюет флешмоб
     */
    public void activate(Volunteersvable[] volunteersvables, ArrayList<Animal> animals, People[] people, FlashMob flashMob, Shelter shelter){
        publicMechanism();
        int i = 0;
        while (i < volunteersvables.length && i < animals.size()){
            volunteersvables[i].publicToSN(flashMob, animals.get(i));
            i++;
        }
        i = 0;
        while (i < volunteersvables.length && i < animals.size() && i < people.length){
            String text = "Сегодня я забираю собаку из приюта. Её зовут " + animals.get(i).getName() + ". Её мне привезет " + people[i].getName();
            people[i].publishToPersonalSN(text);
            people[i].takeResponsibility(animals.get(i));
            i++;
        }
        shelter.finishFlashMOb(flashMob);
    }

    /**
     * Функция publicMechanism. Сообщает что механизм активирован
     */
    public void publicMechanism(){ Printer.print("\n" + this.toString() + " АКТИВИРОВАН\n");
    }

    /**
     * Функция toString
     * @return строковое представление класса
     */
    @Override
    public String toString() {
        return "Механизм: " + description;
    }

    /**
     * Конструктор - создание нового объекта с определенными значениями
     * @param description - описание механизма
     */
    public Mechanism(String description){
        this.description = description;
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
        Mechanism mechanism = (Mechanism) o;
        return Objects.equals(description, mechanism.description);
    }

    /**
     * Функция hashCode
     * @return хеш-код
     */
    @Override
    public int hashCode() {
        return Objects.hash(description);
    }
}
