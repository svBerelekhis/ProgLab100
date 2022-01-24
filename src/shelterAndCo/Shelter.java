package shelterAndCo;

import animal.Animal;
import animal.SocialStatus;
import errorsAndExceptions.ShelterIsOverflowError;
import people.Hostable;
import socialNetworks.*;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Класс Shelter, описывающий приют
 */
public class Shelter implements Hostable {
    /** Поле название */
    private final String name;
    /** List опекаемые животные */
    private ArrayList<Animal> wards;
    /** List социальные сети*/
    private final ArrayList<SocialNetwork> socialNetworks = new ArrayList<>();
    /** Поле размер приюта */
    int size;

    /**
     * Конструктор - создание нового объекта с определенными значениями
     * @param name - название приюта
     * @param size - размер приюта
     */
    public Shelter(String name, int size) {
        this.name = name;
        this.wards = new ArrayList<>();
        this.size = size;
    }
    /**
     * Функция publicationAtSN
     * @param flashMob - флешмоб
     */
    public void publicationAtSN(FlashMob flashMob){
        StringBuilder sb = new StringBuilder();
        sb.append("В этом году наш приют ");
        sb.append(this.name);
        sb.append(" проводит флешмоб ");
        sb.append(flashMob.getHashtag());
        sb.append("\n");
        sb.append("Сейчас в приюте находятся: \n");
        for (Animal ward : this.wards){
            sb.append(ward.getName()).append("\n");
        }
        for (SocialNetwork socialNetwork : socialNetworks){
            socialNetwork.publish(this, flashMob, sb.toString());
        }
    }

    /**
     * Функция finishFlashMOb
     * @param flashMob - флешмоб
     */
    public void finishFlashMOb(FlashMob flashMob){
        StringBuilder sb = new StringBuilder();
        sb.append("Вот и завершился флешмоб! Многие собаки нашли новый дом и собак на улице стало меньше! \n Дом нашли для:\n");
        ArrayList<Animal> newWards = new ArrayList<>();
        for (Animal ward : this.wards){
            if (ward.getSocialStatus() == SocialStatus.HOME){
                sb.append(ward.getName()).append("\n");
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

    /**
     * Функция registrationAtAllSN
     */
    public void registrationAtAllSN(){
        socialNetworks.add(VK.getVk());
        socialNetworks.add(Facebook.getFacebook());
        socialNetworks.add(Odnokclassniki.getOdnokclassniki());
        socialNetworks.add(Tiktok.getTiktok());
        socialNetworks.add(Instagram.getInstagram());
        socialNetworks.add(Twitter.getTwitter());
    }

    /**
     * Функция getName
     * @return название приюта
     */
    public String getName(){
        return this.name;
    }

    /**
     * Функция takeResponsibility
     * @param animal - животное
     */
    @Override
    public void takeResponsibility(Animal animal) {
        if (wards.size() >= size){
            throw new ShelterIsOverflowError();
        }
        this.wards.add(animal);
        animal.chengSocialStatus(SocialStatus.SHELTER);
    }

    /**
     * Функция getName
     * @return List животных в приюте
     */
    public ArrayList<Animal> getWards() {
        return wards;
    }

    /**
     * Функция toString
     * @return строковое представление класса
     */
    @Override
    public String toString() {
        return "Приют " + this.name;
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
        Shelter shelter = (Shelter) o;
        return size == shelter.size &&
                Objects.equals(name, shelter.name) &&
                Objects.equals(wards, shelter.wards) &&
                Objects.equals(socialNetworks, shelter.socialNetworks);
    }

    /**
     * Функция hashCode
     * @return хеш-код
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, wards, socialNetworks, size);
    }
}
