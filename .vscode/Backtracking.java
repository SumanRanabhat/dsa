// public class Backtracking {
// public static void main(String args[]) {
// String str = "ABC";
// String perm = "";

// findPermutation(str, perm, 0);

// }

// public static void findPermutation(String str, String perm, int idx) {
// if (str.length() == 0) {
// System.out.println(perm);
// return;
// }
// for (int i = 0; i < str.length(); i++) {

// Character currentChar = str.charAt(i);

// perm = perm + currentChar;
// String newstr = str.substring(0, i) + str.substring(i + 1);

// findPermutation(newstr, perm + currentChar, idx++);

// }

// }

// }

public class Backtracking {
    public static void main(String args[]) {
        String str = "ABC";
        String perm = "";

        findPermutation(str, perm);
    }

    public static void findPermutation(String str, String perm) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            Character currentChar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            findPermutation(newstr, perm + currentChar);
        }
    }
}
