package socialNetworks;

/**
 * Класс-синглетон Odnokclassniki
 */
public class Odnokclassniki extends SocialNetwork {
    private static Odnokclassniki odnokclassniki;
    private Odnokclassniki(){
        super("socialNetworks.Odnokclassniki");
    }
    public static Odnokclassniki getOdnokclassniki(){
        if(odnokclassniki == null){
            odnokclassniki = new Odnokclassniki();
        }
        return odnokclassniki;
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
