import java.util.ArrayList;
import java.util.Random;

public class PeopleFabrica {
    Random random;
    String[] womenNames = new String[]{"Анна", "Татьяна", "Ольга", "Александра", "Галина", "Светлана", "Виктория", "София"};
    String[] menNames = new String[]{"Алексей", "Анатолий", "Виктор", "Роман", "Константин", "Андрей", "Илья", "Никита"};
    String[] womenSoname = new String[]{"Агеева", "Булгакова", "Винокурова", "Горелова", "Давыдова", "Ежова", "Жданова", "Зорина"};
    String[] menSoname = new String[]{"Смирнов", "Иванов", "Кузнецов", "Соколов", "Попов", "Петров", "Лебедев", "Козлов"};

    public People makePeople(TypeOfPeople typeOfPeople, boolean isMan){
        int nowAge = random.nextInt(62);
        nowAge += 18;
        String nowName = makeName(isMan);
        int inVk = random.nextInt(2);
        int inFac = random.nextInt(2);
        ArrayList<SocialNetwork> socialNetworks = new ArrayList<>();
        if (inVk == 1){
            socialNetworks.add(VK.getVk());
        }
        if (inFac == 1){
            socialNetworks.add(Facebook.getFacebook());
        }
        if (socialNetworks.size() == 0){
            socialNetworks.add(Odnokclassniki.getOdnokclassniki());
        }
        if (typeOfPeople == TypeOfPeople.BUSINESSMAN){
            return new Businessman(nowName, socialNetworks, nowAge, isMan);
        }else if (typeOfPeople == TypeOfPeople.JOURNALIST){
            return new Journalist(nowName, socialNetworks, nowAge, isMan);
        }else if (typeOfPeople == TypeOfPeople.MUSICIAN){
            return new Musician(nowName, socialNetworks, nowAge, isMan);
        }
        else {
            return new People(nowName, socialNetworks, nowAge, isMan);
        }
    }

    private String makeName(boolean isMan){
        if (isMan){
            return menNames[random.nextInt(8)] + " " + menSoname[random.nextInt(8)];
        }
        return womenNames[random.nextInt(8)] + " " + womenSoname[random.nextInt(8)];
    }
    public Volunteersvable[] getSomeVolunteers(int count){
        TypeOfPeople[] types = new TypeOfPeople[]{TypeOfPeople.BUSINESSMAN, TypeOfPeople.JOURNALIST, TypeOfPeople.MUSICIAN};
        Volunteersvable[] res = new Volunteersvable[count];
        for (int i = 0; i < count; i++){
            int isThisMan = random.nextInt(2);
            res[i] = (Volunteersvable) makePeople(types[random.nextInt(3)], isThisMan >= 1);
        }
        return res;
    }
    public PeopleFabrica(){
        random = new Random();
    }
}