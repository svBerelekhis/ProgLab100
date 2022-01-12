import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random random = new Random();
        PeopleFactory peopleFactory = new PeopleFactory();
        AnimalFactory animalFactory = new AnimalFactory();
        Shelter shelter = new Shelter("Домашний", 25);
        Animal[] animals = animalFactory.getSomeAnimals(random.nextInt(28), TypeOfAnimal.DOG, SocialStatus.WILD);
        shelter.registrationAtAllSN();
        for (Animal animal: animals){
            shelter.takeResponsibility(animal);
        }
        FlashMob flashMob = new FlashMob("ПесНаСчастье", "Сегодня Я хочу помочь этой собаке найти дом. Мне очень важна его судьба поэтому я лично передам его новым хозяевам");
        shelter.publicationAtSN(flashMob);
        Volunteersvable[] volunteersvables = peopleFactory.getSomeVolunteers(random.nextInt(28) + 5);
        Mechanism mechanism = new Mechanism("если хотя бы один человек поможет одной собаке найти семью, беспризорных псов на улицах города станет меньше");
        People[] people = peopleFactory.getSomePeople(random.nextInt(28) + 5);
        mechanism.activate(volunteersvables, shelter.getWards(), people, flashMob, shelter);
    }
}
