package animal;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

/**
 * Класс-фабрика, создающая объекты класса Animal
 */
public class AnimalFactory {
    Random random;
    /** Возможные имена для собак (кобели) */
    private final String[] animalsNamesMale = new String[]{"Аватар", "Алтaй", "Барон", "Бонд", "Бутч", "Буян", "Вальтер",
    "Винстон", "Вольф", "Вжик", "Вольдемар", "Гамлет", "Гилмор", "Гэри", "Герцог", "Данте", "Джокер", "Дени", "Ельсон",
    "Закат", "Зорро", "Изюм", "Раф", "Рольф", "Ян"};
    /** Возможные имена для собак (суки) */
    private final String[] animalsNamesFemale = new String[]{"Ада", "Айка", "Айса", "Астра", "Бусинка", "Берта", "Венеция",
    "Виолетта", "Вэлла", "Венера", "Габи", "Глафира", "Гермиона", "Джесси", "Дива", "Джоли", "Дора", "Ева", "Есения",
    "Евита", "Жюли", "Жюльетта", "Злата", "Искра", "Кукки", "Лилу"};
    /** Возможные цвета собак */
    private final String[] animalsColors = new String[]{"Черный", "Белый", "Рыжий", "Серый", "Черно-рыжий", "Черно-белый", "Рыже-белый"};
    /**
     * Функция makeAnimal
     * @param  typeOfAnimal - тип животного
     * @param  isMale - пол животного
     * @param  socialStatus - социальный статус животного
     * @return новое животоное, с заданными параметрами
     */
    public Animal makeAnimal(TypeOfAnimal typeOfAnimal, boolean isMale, SocialStatus socialStatus){
        int age = random.nextInt(15) + 1;
        String name;
        if (isMale){
            name = animalsNamesMale[random.nextInt(animalsNamesMale.length)];
        } else {
            name = animalsNamesFemale[random.nextInt(animalsNamesFemale.length)];
        }
        String color = animalsColors[random.nextInt(animalsColors.length)];
        if(typeOfAnimal == TypeOfAnimal.DOG){
            return new Dog(name, age, color, socialStatus);
        }else if (typeOfAnimal == TypeOfAnimal.CAT){
            return new Cat(name, age, color, socialStatus);
        }else{
            return new Rat(name, age, color, socialStatus);
        }
    }
    /**
     * Функция getSomeAnimals
     * @param  count - количество животных
     * @param  typeOfAnimal - тип животных
     * @param  socialStatus - социальный статус животных
     * @return массив живоных с заданными параметрами
     */
    public Animal[] getSomeAnimals(int count, TypeOfAnimal typeOfAnimal, SocialStatus socialStatus){
        Animal[] res = new Animal[count];
        for (int i = 0; i < count; i++){
            int isMaleInt = random.nextInt(2);
            res[i] = makeAnimal(typeOfAnimal, isMaleInt < 1, socialStatus);
        }
        return res;
    }

    /**
     * Конструктор - создание нового объекта
     */
    public AnimalFactory(){
        random = new Random();
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
        AnimalFactory that = (AnimalFactory) o;
        return Objects.equals(random, that.random) &&
                Arrays.equals(animalsNamesMale, that.animalsNamesMale) &&
                Arrays.equals(animalsNamesFemale, that.animalsNamesFemale) &&
                Arrays.equals(animalsColors, that.animalsColors);
    }

    /**
     * Функция hashCode
     * @return хеш-код
     */
    @Override
    public int hashCode() {
        int result = Objects.hash(random);
        result = 31 * result + Arrays.hashCode(animalsNamesMale);
        result = 31 * result + Arrays.hashCode(animalsNamesFemale);
        result = 31 * result + Arrays.hashCode(animalsColors);
        return result;
    }

    /**
     * Функция toString
     * @return строковое представление класса
     */
    @Override
    public String toString() {
        return "animal.AnimalFactory{" +
                "random=" + random +
                ", animalsNamesMale=" + Arrays.toString(animalsNamesMale) +
                ", animalsNamesFemale=" + Arrays.toString(animalsNamesFemale) +
                ", animalsColors=" + Arrays.toString(animalsColors) +
                '}';
    }
}
