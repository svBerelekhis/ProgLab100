public class VK extends SocialNetwork{
    private static VK vk;
    private VK(){
        super("VK");
    }
    public static VK getVk(){
        if(vk == null){
            vk = new VK();
        }
        return vk;
    }
}
