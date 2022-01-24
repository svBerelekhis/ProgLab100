package people;

import animal.Animal;
import shelterAndCo.FlashMob;

/**
 * Интерфейс "способный к волонтерству"
 */
public interface Volunteersvable {
    /**
     * Функция publicToSN
     * @param  flashMob - флешмоб
     * @param animal - животное, про которое будут рассказывать
     */
    void publicToSN(FlashMob flashMob, Animal animal);
}
