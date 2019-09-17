public class PersonInfo5 {

    public static String firstName = "Tristan";
    public static String lastName = "Benoit";
    public static int studentNo = 300058143;
    public static String description = "Likes to play video ganes, for some reason";

    public static void displayFr() {
        String out = SIConstants.GREETING_FR;
        out += " " + firstName + " " + lastName + '.';
        out += SIConstants.STUDENT_NUMBER_FR + studentNo + '.';
        out += SIConstants.DESCRIPTION_FR + description + '.';
        out += SIConstants.EOL;

        System.out.println(out);
    }

    public static void displayEn() {
        String out = SIConstants.GREETING_EN;
        out += " " + firstName + " " + lastName + '.';
        out += SIConstants.STUDENT_NUMBER_EN + studentNo + '.';
        out += SIConstants.DESCRIPTION_EN + description + '.';
        out += SIConstants.EOL;

        System.out.println(out);
    }
}
