public class SwitchNewDemo {
    public static void main(String[] args) {
        int num = 29;
        String size = switch (num) {
            case 29 -> "Small";
            case 42 -> "Medium";
            case 44 -> "Large";
            default -> "Unknown";
        };
        System.out.println("The size is: " + size);
    }
}
