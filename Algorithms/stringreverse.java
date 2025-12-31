public class stringreverse {

    public static void sum(String input, int index) {
        if (index == 0) {
            System.out.println(input.charAt(index));
            return;
        }
        System.out.print(input.charAt(index));
        sum(input, index - 1);
    }

    public static void main(String[] args) {
        String input = "abcd";
        sum(input, input.length() - 1);

    }

}
