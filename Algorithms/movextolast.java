public class movextolast {

    public static void sumOff(String str, int idx, int count, String newString) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString = newString + "x";
            }
            System.out.println(newString);
            return;
        }
        char curr = str.charAt(idx);
        if (curr == 'x') {
            count++;
            sumOff(str, idx + 1, count, newString);
        } else {
            newString = newString + curr;
            sumOff(str, idx + 1, count, newString);

        }
    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        sumOff(str, 0, 0, " ");
    }

}
