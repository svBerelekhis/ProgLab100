package socialNetworks;

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

    @Override
    public String toString() {
        return "Сотсеть : " + name;
    }

}
