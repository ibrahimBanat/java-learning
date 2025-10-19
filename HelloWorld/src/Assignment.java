public class Assignment {
    public static void main(String[] args) {

        double temp = 20.00;
        double temp2 = 80.00;

        double temp3 = (temp + temp2) * 100d;

        double reminder = temp3 % 40d;

        boolean hasNoReminder = (reminder != 0d);
        System.out.println(reminder);
    }
}
