public class Main {
    public static void main(String[] args){
        PeopleFactory peopleFactory = new PeopleFactory();
        AnimalFactory animalFactory = new AnimalFactory();
        Shelter shelter = new Shelter("Домашний");
        Animal[] animals = animalFactory.getSomeAnimals(15, TypeOfAnimal.DOG, SocialStatus.WILD);
        shelter.registrationAtAllSN();
        for (Animal animal: animals){
            shelter.takeResponsibility(animal);
        }
        FlashMob flashMob = new FlashMob(shelter, "ПесНаСчастье", "Сегодня Я хочу помочь этой собаке найти дом. Мне очень важна его судьба поэтому я лично передам его новым хозяевам");
        shelter.publicationAtSN(flashMob);
        Volunteersvable[] volunteersvables = peopleFactory.getSomeVolunteers(10);
        Mechanism mechanism = new Mechanism("если хотя бы один человек поможет одной собаке найти семью, беспризорных псов на улицах города станет меньше");
        People[] people = peopleFactory.getSomePeople(10);
        mechanism.activate(volunteersvables, shelter.getWards(), people, flashMob, shelter);
    }
}
