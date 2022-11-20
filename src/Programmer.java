import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class Programmer extends Person implements PersonAble{

    private String programmerLevel;

    public Programmer(int id, String fullName, char gender, String email, String phoneNumber, double governmentsSalary, byte age, String programmerLevel) {
        super(id, fullName, gender, email, phoneNumber, governmentsSalary, age);
        this.programmerLevel = programmerLevel;
    }



    public String getProgrammerLevel() {
        return programmerLevel;
    }

    public void setProgrammerLevel(String programmerLevel) {
        this.programmerLevel = programmerLevel;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "programmerLevel='" + programmerLevel + '\'' +
                '}';
    }



    @Override
    public void favoriteSport() {
        System.out.println(getFullName()+" favorite sport is game");

    }

    @Override
    public String favoriteLanguage() {
        return getFullName()+" favorite language is english";
    }

    @Override
    public Month favoriteMonth() {
        Month month=Month.of(9);
        return month;
    }

    @Override
    public String getLastName() {
        String[] arr = getFullName().split(" ");
        for (String lastName : arr) {
            return lastName;
        }
        return null;
    }
    @Override
    public LocalDate getDateOfBrith() {
        int myDate = getAge();
        LocalDate localDate = LocalDate.now();
        return localDate.minusDays(myDate);
    }

    @Override
    public String getPhoneNumberAndEmail() {
        return getPhoneNumber()+getEmail();
    }

    @Override
    public long[] getPeopleOfAllAges(Person[] people) {
        long[] age = new long[people.length];
        int counter = 0;
        for (Person person : people) {
            age[counter] = person.getAge();
            counter++;
        }
        Arrays.sort(age);
        return age;
    }
}




