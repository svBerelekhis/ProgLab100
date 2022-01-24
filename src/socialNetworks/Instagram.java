package socialNetworks;

/**
 * Класс-синглетон Instagram
 */
public class Instagram extends SocialNetwork {
    private static Instagram instagram;
    private Instagram(){
        super("socialNetworks.Instagram");
    }
    public static Instagram getInstagram(){
        if(instagram == null){
            instagram = new Instagram();
        }
        return instagram;
    }

    /**
     * Функция toString
     * @return строковое представление класса
     */
    @Override
    public String toString() {
        return "Сотсеть : " + name ;
    }
}
