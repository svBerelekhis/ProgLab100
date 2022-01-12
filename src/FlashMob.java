public class FlashMob {
    private final String hashtag;
    public String text;
    public FlashMob(String hashtag, String text){
        this.hashtag = hashtag;
        this.text = text;
    }
    public String getHashtag(){
        return "#" + hashtag;
    }

    public String getText() {
        return text;
    }
}
