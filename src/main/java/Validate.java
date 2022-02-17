import java.util.regex.*;
public class Validate {

        public static boolean
        ValidatePassword(String password)
        {

            // Regular expressions for password validation
            String regex = "^(?=.*[0-9])"
                   + "(?=.*[a-z])(?=.*[A-Z])"
                  + "(?=.*[!@#$%^&*()-+])"
                   + "(?=\\S+$).{6,12}$";

            //Compile Regex
            Pattern pt = Pattern.compile(regex);

            /*
            * The matcher() method will check between the compiled pattern
            * and the regular expression.
            * */
            Matcher m = pt.matcher(password);

            // Return True if matched pattern.
            return (m.matches());
        }


}
