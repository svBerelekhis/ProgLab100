package people;

import animal.Animal;

/**
 * Интерфейс "способный быть хозяином"
 */
public interface Hostable {
    /**
     * Функция takeResponsibility
     * @param animal - животное, за которого будет взята ответственность.
     */
    void takeResponsibility(Animal animal);
}
