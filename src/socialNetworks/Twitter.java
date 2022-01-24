package socialNetworks;

/**
 * Класс-синглетон Twitter
 */
public class Twitter extends SocialNetwork {
    private static Twitter twitter;
    private Twitter(){
        super("twitter");
    }
    public static Twitter getTwitter(){
        if(twitter == null){
            twitter = new Twitter();
        }
        return twitter;
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
