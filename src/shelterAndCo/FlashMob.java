package shelterAndCo;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "shelterAndCo.FlashMob{" +
                "hashtag='" + hashtag + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlashMob flashMob = (FlashMob) o;
        return Objects.equals(hashtag, flashMob.hashtag) &&
                Objects.equals(text, flashMob.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hashtag, text);
    }
}
