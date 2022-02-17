import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QuestionTwo extends Validate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String pass = st.nextToken();
        System.out.println(pass);
        if(!ValidatePassword(pass)){
            System.out.println("The password does not meet the requirements");
         }else{
            System.out.println("Password successfully validated!");
        }

    }
}

