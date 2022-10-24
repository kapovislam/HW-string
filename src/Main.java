public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task3() {
        //Задание 3
        /**
         * Нужно написать программу, которая заменяет символ “ё” на символ “е”.
         */
        String fullName = "Ёжиков Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        fullName = fullName.replace("Ё", "Е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }

    private static void task2() {
        //Задание 2
        /**
         * Напишите программу, которая изменит написание Ф. И. О. сотрудника с “Ivanov Ivan Ivanovich”
         * на полностью заглавные буквы.
         */
        String fullName = "Ivanov Ivan Ivanovich";
        String nameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + nameUpper);
    }

    private static void task1() {
        //Задание 1
        /**
         * Напишите четыре строки:
         * первая с именем firstName — для хранения имени;
         * вторая с именем middleName — для хранения отчества;
         * третья с именем lastName — для хранения фамилии;
         * четвертая с именем fullName — для хранения Ф.И.О. сотрудника в формате "Фамилия Имя Отчество".
         * Выведите в консоль фразу: “ФИО сотрудника — ….”
         */
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
    }
}