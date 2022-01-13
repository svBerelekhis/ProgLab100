import java.util.ArrayList;
import java.util.Objects;

public class Shelter implements Hostable{
    private final String name;
    private ArrayList<Animal> wards;
    private final ArrayList<SocialNetwork> socialNetworks = new ArrayList<>();
    int size;

    public Shelter(String name, int size) {
        this.name = name;
        this.wards = new ArrayList<>();
        this.size = size;
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
        StringBuilder sb = new StringBuilder();
        sb.append("Вот и завершился флешмоб! Многие собаки нашли новый дом и собак на улице стало меньше! \n Дом нашли для:\n");
        ArrayList<Animal> newWards = new ArrayList<>();
        for (Animal ward : this.wards){
            if (ward.socialStatus == SocialStatus.HOME){
                sb.append(ward.name).append("\n");
            } else {
                newWards.add(ward);
            }
        }
        this.wards = newWards;
        sb.append("В приюте осталось ").append(this.wards.size()).append(" собак!");
        for (SocialNetwork socialNetwork : socialNetworks){
            socialNetwork.publish(this, flashMob, sb.toString());
        }
    }

    public void registrationAtAllSN(){
        socialNetworks.add(VK.getVk());
        socialNetworks.add(Facebook.getFacebook());
        socialNetworks.add(Odnokclassniki.getOdnokclassniki());
        socialNetworks.add(Tiktok.getTiktok());
        socialNetworks.add(Instagram.getInstagram());
        socialNetworks.add(Twitter.getTwitter());
    }
    public String getName(){
        return this.name;
    }

    @Override
    public void takeResponsibility(Animal animal) {
        if (wards.size() >= size){
            throw new ShelterIsOverflowError();
        }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shelter shelter = (Shelter) o;
        return size == shelter.size &&
                Objects.equals(name, shelter.name) &&
                Objects.equals(wards, shelter.wards) &&
                Objects.equals(socialNetworks, shelter.socialNetworks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, wards, socialNetworks, size);
    }
}
