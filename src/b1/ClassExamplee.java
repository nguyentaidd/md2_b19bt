package b1;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExamplee {
    private static final String CLASS_REGEX = "^[APC]\\d{4}[GHIKLM]$";
    public ClassExamplee(){

    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
