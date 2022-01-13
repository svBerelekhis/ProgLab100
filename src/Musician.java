import java.util.ArrayList;

public class Musician extends People implements Volunteersvable{
    public Musician(String name, ArrayList<SocialNetwork> socialNetworks, int age, boolean isMan) {
        super(name, socialNetworks, age, isMan);
    }

    @Override
    public String toString() {
        return name + " (Музыкант, " + age + " лет)";
    }

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
