public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        DaysOfWeek day = DaysOfWeek.WED;

        String translated = switch (day) {
            case SUN -> "Неділя";
            case MON -> "Понеділок";
            case TUE -> "Вівторок";
            case WED -> "Середа";
            case THU -> "Четвер";
            case FRI -> "П'ятниця";
            case SAT -> "Субота";
        };

        System.out.println("Translated day: " + translated);
    }
}