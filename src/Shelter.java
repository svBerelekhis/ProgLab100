import java.util.ArrayList;

public class Shelter implements Hostable{
    private final String name;
    private ArrayList<Animal> wards;
    private final ArrayList<SocialNetwork> socialNetworks = new ArrayList<>();

    public Shelter(String name) {
        this.name = name;
        this.wards = new ArrayList<>();
    }
    public void publicationAtSN(FlashMob flashMob){
        StringBuilder sb = new StringBuilder();
        sb.append("В этом году наш приют ");
        sb.append(this.name);
        sb.append(" проводит флешмоб ");
        sb.append(flashMob.getHashtag());
        sb.append("\n");
        sb.append("Сейчас в приюте находятся: \n");
        for (Animal ward : this.wards){
            sb.append(ward.name).append("\n");
        }
        for (SocialNetwork socialNetwork : socialNetworks){
            socialNetwork.publish(this, flashMob, sb.toString());
        }
    }

    public void finishFlashMOb(FlashMob flashMob){
        String text = "Вот и завершился флешмоб! Многие собаки нашли новый дом и собак на улице стало меньше!";
        for (SocialNetwork socialNetwork : socialNetworks){
            socialNetwork.publish(this, flashMob, text);
        }
    }

    public void registrationAtAllSN(){
        socialNetworks.add(VK.getVk());
        socialNetworks.add(Facebook.getFacebook());
        socialNetworks.add(Odnokclassniki.getOdnokclassniki());
    }
    public String getName(){
        return this.name;
    }

    @Override
    public void takeResponsibility(Animal animal) {
        this.wards.add(animal);
        animal.chengSocialStatus(SocialStatus.SHELTER);
    }

    public ArrayList<Animal> getWards() {
        return wards;
    }

    @Override
    public String toString() {
        return "Приют " + this.name;
    }
}
