package newproject;

public class StringManipulator {

    public String reverse(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }

    public String reverse(String str, int start, int end) {
        if (str == null || start < 0 || end >= str.length() || start > end) {
            return str;
        }
        char[] charArray = str.toCharArray();
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
    }

    public String reverse(char[] charArray) {
        if (charArray == null || charArray.length == 0) {
            return new String(charArray);
        }
        int left = 0, right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        StringManipulator sm = new StringManipulator();

        System.out.println("Reversing entire string:");
        String str1 = "Sreeja Swayamsiddha";
        System.out.println("Original: " + str1);
        System.out.println("Reversed: " + sm.reverse(str1));

        System.out.println("\nReversing a substring:");
        String str2 = "SreejaS";
        System.out.println("Original: " + str2);
        System.out.println("Reversed substring (4, 6): " + sm.reverse(str2, 4, 6));

        System.out.println("\nReversing a character array:");
        char[] charArray = {'S', 'r', 'e', 'e', 'j', 'a'};
        System.out.println("Original: " + new String(charArray));
        System.out.println("Reversed: " + sm.reverse(charArray));

        System.out.println("\nReversing empty string:");
        String emptyStr = "";
        System.out.println("Original: " + emptyStr);
        System.out.println("Reversed: " + sm.reverse(emptyStr));

        System.out.println("\nReversing with invalid indices:");
        String str3 = "Sreeja S";
        System.out.println("Original: " + str3);
        System.out.println("Reversed with invalid indices (10, 5): " + sm.reverse(str3, 10, 5));
    }
}
