import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class Driver extends Person implements PersonAble {


    private char driverCategory;

    public Driver(int id, String fullName, char gender, String email, String phoneNumber, double governmentsSalary, byte age, char driverCategory) {
        super(id, fullName, gender, email, phoneNumber, governmentsSalary, age);
        this.driverCategory = driverCategory;
    }

    public char getDriverCategory() {
        return driverCategory;
    }

    public void setDriverCategory(char driverCategory) {
        this.driverCategory = driverCategory;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverCategory=" + driverCategory +
                '}';
    }

    @Override
    public void favoriteSport() {
        System.out.println(getFullName() + " favorite spotr is box");

    }

    @Override
    public String favoriteLanguage() {
        return getFullName() + " favorite language is italian";
    }

    @Override
    public Month favoriteMonth() {
        Month month = Month.of(7);
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
        return getPhoneNumber() + getEmail();
    }

    @Override
    public long[] getPeopleOfAllAges(Person[]people) {
        int counter = 0;
        long[] age = new long[people.length];
        for (Person person : people) {
            age[counter] = person.getAge();
            counter++;
        }
        Arrays.sort(age);
        return age;
    }
}