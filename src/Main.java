public class Main {
    public static void main(String[] args) {
//Task1
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullName);

//Task2
        String UpperCaseFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + UpperCaseFullName);

//Task3
        fullName = "Иванов Семён Семёнович";
        String fullNameNew = ("");
        String[] letters = fullName.split("");
        for (int i = 0; i < letters.length; i++) {
            if (letters[i].contains("ё")) {
                letters[i] = "е";
            }
            fullNameNew = fullNameNew + letters[i];
        }
        System.out.println("Данные ФИО сотрудника — " + fullNameNew);
        //второй метод
        String fullNameNew2 = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullNameNew2);
    }
}