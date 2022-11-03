

public class MainClassPerson {
    public static void main(String[] args) {
        Person person = new Person();

        person.setFirstName();
        person.setLastName();
        person.setNameFather();
        person.setDateBirthday();
        person.setPhoneNumber();
        person.setAdress();
        person.setCountry();
        person.setCity();
        System.out.println("Проверте, правильно ли заполнены ваши данные");
        System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getNameFather()+ " " + person.getDateBirthday() + " " +person.getPhoneNumber()+ " " +person.getAdress()+ " " +person.getCountry()+ " " +person.getCity());
    }
}
