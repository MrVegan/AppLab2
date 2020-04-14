package appvar10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckingNumbers {
    
    private final Pattern patternTextBox = Pattern.compile("^(([+-]?([\\d]){1,3}\\s){2,9})([+-]?(\\d){1,3})?$");
    private final Pattern patternFile = Pattern.compile("^(([+-]?([\\d]){1,3};){2,9})([+-]?(\\d){1,3})?$");   
    private final Pattern patternKey = Pattern.compile("[\\d\\s+-]");
    
    public boolean CheckingFromTextBox(String s){    
        Matcher matcher = patternTextBox.matcher(s);       
        return  matcher.find();
    }
    
    public boolean CheckingFromFile(String s){    
        Matcher matcher = patternFile.matcher(s);       
        return  matcher.find();
    }
    
    public boolean CheckingKeyInTextBox(String s){               
        Matcher matcher = patternKey.matcher(s);
        return matcher.find();
    }
    
}
