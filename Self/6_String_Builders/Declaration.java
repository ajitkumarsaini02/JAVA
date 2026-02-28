public class Declaration {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0;
        sb.setCharAt(0, 'p');
        System.out.println(sb);
        
        //insert at any index
        sb.insert(2, 'n');
        System.out.println(sb);

        //delete the extra 'n'
        sb.delete(2, 3);

        //append the value
        sb.append(' ');
        sb.append('h');
        sb.append('e');
        sb.append('l');
        sb.append('l');
        sb.append('o');
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
