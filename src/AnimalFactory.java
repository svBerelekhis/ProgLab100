import java.util.Random;

public class AnimalFactory {
    Random random;
    String[] animalsNamesMale = new String[]{"Аватар", "Алтaй", "Барон", "Бонд", "Бутч", "Буян", "Вальтер",
    "Винстон", "Вольф", "Вжик", "Вольдемар", "Гамлет", "Гилмор", "Гэри", "Герцог", "Данте", "Джокер", "Дени", "Ельсон",
    "Закат", "Зорро", "Изюм", "Раф", "Рольф", "Ян"};
    String[] animalsNamesFemale = new String[]{"Ада", "Айка", "Айса", "Астра", "Бусинка", "Берта", "Венеция",
    "Виолетта", "Вэлла", "Венера", "Габи", "Глафира", "Гермиона", "Джесси", "Дива", "Джоли", "Дора", "Ева", "Есения",
    "Евита", "Жюли", "Жюльетта", "Злата", "Искра", "Кукки", "Лилу"};
    String[] animalsColors = new String[]{"Черный", "Белый", "Рыжий", "Серый", "Черно-рыжий", "Черно-белый", "Рыже-белый"};
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
    public Animal[] getSomeAnimals(int count, TypeOfAnimal typeOfAnimal, SocialStatus socialStatus){
        Animal[] res = new Animal[count];
        for (int i = 0; i < count; i++){
            int isMaleInt = random.nextInt(2);
            res[i] = makeAnimal(typeOfAnimal, isMaleInt < 1, socialStatus);
        }
        return res;
    }
    public AnimalFactory(){
        random = new Random();
    }
}
