public class FlashMob {
    private Shelter organizers;
    private final String hashtag;
    public String text;
    public FlashMob(Shelter organizers, String hashtag, String text){
        this.hashtag = hashtag;
        this.organizers = organizers;
        this.text = text;
    }
    public String getHashtag(){
        return "#" + hashtag;
    }

    public String getText() {
        return text;
    }
}
