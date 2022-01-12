import java.util.ArrayList;

public class Journalist extends People implements Volunteersvable{
    @Override
    public String toString() {
        return name + " (Журналист, " + age + " лет)";
    }

    public Journalist(String name, ArrayList<SocialNetwork> socialNetworks, int age, boolean isMan) {
        super(name, socialNetworks, age, isMan);
    }

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
