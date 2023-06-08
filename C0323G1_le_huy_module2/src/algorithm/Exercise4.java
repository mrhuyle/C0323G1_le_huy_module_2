package algorithm;

public class Exercise4 {
    public static void main(String[] args) {
        String string = "CodegymDaNang";
        try {
            System.out.println(modifyStr(string));
        } catch (Exception e) {
            System.out.println("Have special characters (or any)");
            throw new RuntimeException(e);
        }

    }

    public static String modifyStr(String string) throws Exception {
        String newString = "";
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            int code = (int) ch;
            if (code > 64 && code < 91) {
                newString += " " + ch;
            } else if (code > 96 && code < 123) {
                newString += ch;
            } else {
                throw new Exception();
            }
        }
        return newString.trim().toLowerCase();
    }
}
