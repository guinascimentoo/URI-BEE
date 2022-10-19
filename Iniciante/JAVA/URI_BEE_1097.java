public class URI_BEE_1097 {
    public static void main(String[] args) {
        for (int i = 1,j = 7; i <= 9; i += 2,j += 2) {
            for (int l = i, k = j; k >= (j - 2); k--) {
                System.out.println("I=" + l + " J=" + k);
            }
        }
    }
}