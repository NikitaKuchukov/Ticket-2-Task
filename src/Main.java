public class Main {
    public static void main(String[] args) {
        String str = "Муза, ранясь шилом опыта, ты помолишься на разум";
        String strWithoutSpaces = str.replace(" ", "");
        String strWithoutSpacesAndComma = strWithoutSpaces.replace(",", "");
        StringBuilder sb = new StringBuilder(strWithoutSpacesAndComma);
        sb.reverse();
        if (strWithoutSpacesAndComma.equalsIgnoreCase(sb.toString())) {
            System.out.println("Строка - палиндром");
        } else {
            System.out.println("Строка - не палиндром");
        }
    }
}