package shelterAndCo;

import java.util.Objects;

/**
 * Класс FlashMob описывающий флешмоб
 */
public class FlashMob {
    /** Поле хештег */
    private final String hashtag;
    /** Поле текст флешмоба */
    public String text;
    /**
     * Конструктор - создание нового объекта с определенными значениями
     * @param hashtag - хештег
     * @param text - базовый текст хештега
     */
    public FlashMob(String hashtag, String text){
        this.hashtag = hashtag;
        this.text = text;
    }
    /**
     * Функция getHashtag
     * @return хештег
     */
    public String getHashtag(){
        return "#" + hashtag;
    }

    /**
     * Функция getText
     * @return текст хештега
     */
    public String getText() {
        return text;
    }

    /**
     * Функция toString
     * @return строковое представление класса
     */
    @Override
    public String toString() {
        return "shelterAndCo.FlashMob{" +
                "hashtag='" + hashtag + '\'' +
                ", text='" + text + '\'' +
                '}';
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
        FlashMob flashMob = (FlashMob) o;
        return Objects.equals(hashtag, flashMob.hashtag) &&
                Objects.equals(text, flashMob.text);
    }

    /**
     * Функция hashCode
     * @return хеш-код
     */
    @Override
    public int hashCode() {
        return Objects.hash(hashtag, text);
    }
}
