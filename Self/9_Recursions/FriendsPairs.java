public class FriendsPairs {
    public static  int pairFriend(int n){
        if(n<=1){
            return 1;
        }

        return pairFriend(n-1) + (n-1) * pairFriend(n-2);
    }

    public static void main(String[] args) {
        int n=5;
        int x=pairFriend(n);
        System.out.println(x);
    }
}
