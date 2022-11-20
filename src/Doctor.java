import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class Doctor extends Person implements PersonAble {

    private String services;

    public Doctor(int id, String fullName, char gender, String email, String phoneNumber, double governmentsSalary, byte age, String services) {
        super(id, fullName, gender, email, phoneNumber, governmentsSalary, age);
        this.services = services;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "services='" + services + '\'' +
                '}';
    }

    @Override
    public void favoriteSport() {
        System.out.println(getFullName() + " favorite sport is tennis");


    }

    @Override
    public String favoriteLanguage() {
        return getFullName() + " favorite language is french";
    }

    @Override
    public Month favoriteMonth() {
        Month month = Month.of(12);
        return null;
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
        return getPhoneNumber() + " " + getEmail();
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