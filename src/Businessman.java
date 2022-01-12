import java.util.ArrayList;

public class Businessman extends People implements Volunteersvable{
    public Businessman(String name, ArrayList<SocialNetwork> socialNetworks, int age, boolean isMan) {
        super(name, socialNetworks, age, isMan);
    }

    @Override
    public String toString() {
        return name + " (Бизнесмен, " + age + " лет)";
    }

    public void publicToSN(FlashMob flashMob, Animal animal) {
        StringBuilder sb = new StringBuilder();
        sb.append("Сегодня Я хочу помочь этой собаке найти дом. Вот информация о ней\n");
        sb.append(animal.toString());
        sb.append("\nЯ хочу самостоятельно передать эту собаку хозяевам, чтобы точно знать что с ней будет все хорошо");
        for(SocialNetwork socialNetwork : this.socialNetworks){
            socialNetwork.publish(this, flashMob, sb.toString());
        }
    }
}
