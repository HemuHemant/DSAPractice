public class Replace {
    
    static String replaceString(String str, int i) {
        if(i == str.length()) {
            return "";
        }
        char a = str.charAt(i);
        if(str.charAt(i) == a && str.charAt(i+1) == a) {
            return  str.charAt(i)+"*" + replaceString(str, i+2);
        }
        else {
            return str.charAt(i) + replaceString(str, i+1);
        }
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        String str = "abbabbaa";
        System.out.println(replaceString(str, 0));

    }
}
