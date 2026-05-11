public class SwitchOldDemo {
    public static void main(String[] args) {
        int num = 44;
        String size;
        switch (num) {
            case 29:
                size = "Small";
                break;
            case 42:
                size = "Medium";
                break;
            case 44:
                size = "Large";
                break;
            default:
                size = "Unknown";
        }
        System.out.println("The size is: " + size);
    }
}
