public class neighboringBitwiseXOR {

    public boolean doesValidArrayExist(int[] derived) {
        int res = 0;
        for (int n : derived) {
            res = res ^ n;
        }
        return (res == 0);

    }
}
