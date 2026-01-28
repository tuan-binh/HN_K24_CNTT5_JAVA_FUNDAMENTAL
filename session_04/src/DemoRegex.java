import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegex {
    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("[0-9]+A");
//        String checkRegex = "123A";
//        Matcher matcher = pattern.matcher(checkRegex);
//        boolean result = matcher.matches();
//        System.out.println(result);
        // REGEX EMAIL BASIC
        Pattern pattern = Pattern.compile("\\w+@rikkeieducation+\\.\\w{2,4}");
        String email = "phamthaison@rikkeieducation.com";
        Matcher matcher = pattern.matcher(email);
        boolean result = matcher.matches();
        System.out.println("result = " + result);
    }
}
