package socialNetworks;

/**
 * Класс-синглетон Twitter
 */
public class VK extends SocialNetwork {
    private static VK vk;
    private VK(){
        super("socialNetworks.VK");
    }
    public static VK getVk(){
        if(vk == null){
            vk = new VK();
        }
        return vk;
    }

    /**
     * Функция toString
     * @return строковое представление класса
     */
    @Override
    public String toString() {
        return "Сотсеть : " + name;
    }

}
