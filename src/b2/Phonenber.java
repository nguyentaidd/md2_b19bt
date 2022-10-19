package b2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phonenber {
    private static final String PHONE_REGEX = "^\\([0-9]{2}\\)\\-\\(0[0-9]{9}\\)$";

    public Phonenber(){

    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
