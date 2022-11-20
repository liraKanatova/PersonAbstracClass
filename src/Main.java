import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         Programmer programmer1 = new Programmer(123, "Asan Asanov", 'M', "Asan_@.mail.ru", "1234", 1.500, (byte) 25, "Junior");
          Programmer programmer2 = new Programmer(124, "Isan Isanov", 'M', "Isan_@.mail.ru", "1235", 2.500, (byte) 26, "Middle");
          Programmer programmer3 = new Programmer(125, "Asi asinova", 'F', "Asi_@.mail.ru", "1236", 4.000, (byte) 28, "Senior");
          Programmer[] programmers={programmer1,programmer2,programmer3};
          programmer1.favoriteSport();
        System.out.println(Arrays.toString(programmers));
        System.out.println();


        Driver driver1 = new Driver(129, "Maksim Maksimov", 'M', "Maksim_@gmail.com", "2222", 400, (byte) 30, 'C');
        Driver driver2 = new Driver(131, "Asim Asimov", 'M', "Aksim_@gmail.com", "3333", 450, (byte) 32, 'B');
        Driver driver3 = new Driver(132, "Kasim Kasimov", 'M', "Kasim_@gmail.com", "2222", 350, (byte) 26, 'A');
        Driver[] drivers = {driver1, driver2, driver3};
        driver1.favoriteSport();
        System.out.println(Arrays.toString(drivers));
        System.out.println();


        Doctor doctor1 = new Doctor(126, "Uson Usonov", 'M', "Uson_@gmail.com", "1237", 500, (byte) 30, "Ent");
        Doctor doctor2 = new Doctor(127, "Asia Asiana", 'F', "Asia_@gmail.com", "1238", 700, (byte) 27, "Dental");
        Doctor doctor3 = new Doctor(128, "Asu Asuna", 'F', "Asu_@gmail.com", "1239", 600, (byte) 26, "Cosmetology");
        Doctor[] doctors = {doctor1, doctor2, doctor3};
        doctor1.favoriteSport();
        System.out.println(Arrays.toString(doctors));
        System.out.println();

        Person[] people = {programmer1, programmer2, programmer3, doctor1, doctor2, doctor3, doctor1, doctor2, doctor3};
        System.out.println("1 favoriteLanguage, 2 favoriteMonth, 3 getLastName, 4 getDateOfBrith,5 getPhoneNumberAndEmail, 6 getPeopleOfAllAges");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    System.out.println(programmer1.favoriteLanguage());
                    break;
                case 2:
                    System.out.println(programmer1.favoriteMonth());
                    break;
                case 3:
                    System.out.println(programmer1.getFullName());
                    break;
                case 4:
                    System.out.println(programmer1.getDateOfBrith());
                    break;
                case 5:
                    System.out.println(programmer1.getPhoneNumberAndEmail());
                    break;
                case 6:
                    System.out.println(Arrays.toString(programmer1.getPeopleOfAllAges(programmers)));
                default:
                    System.out.println("no such method");
                    break;

            }
        }





}
    }



