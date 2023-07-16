package first;

public class Unicorn {
    public static void main(String[] args) {
        char charValue = 'T';
        boolean booleanValue;

        if (charValue == 'T' || charValue == 't' || charValue == '1') {
            booleanValue = true;
        } else if (charValue == 'F' || charValue == 'f' || charValue == '0') {
            booleanValue = false;
        } else {
            throw new IllegalArgumentException("Invalid boolean representation");
        }

        System.out.println(booleanValue);  // Output: true
    }

}
