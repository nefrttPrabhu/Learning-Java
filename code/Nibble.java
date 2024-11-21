import java.util.*;

class Nibble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int n = sc.nextInt();
        int c = ((n & 0xF0) >> 4) | ((n & 0x0F) << 4);
        System.out.println("After swapping nibbles: " + c);
    }
}
