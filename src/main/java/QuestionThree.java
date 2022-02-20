import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class QuestionThree {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        String string = st.nextToken();
        List<String> list = new ArrayList<>();

             for(int i = 0; i < string.length(); i++) {
                for(int j = 1; j < string.length(); j++) {
                    if(string.charAt(i) == string.charAt(j) && i !=j && i < j) {
                        if(string.charAt(i) == string.charAt(i+1)) {
                            String x = string.substring(i, i + 1);
                            String y = string.substring(i, i + j);
                            list.add(x);
                            list.add(y);

                     } else {
                            String y = string.substring(i, j);
                            String z = string.substring(i + 1, j + 1);
                            String x= string.substring(i, i + 1);
                            list.add(x);
                            list.add(y);
                            list.add(z);
                        }
                    }
                }
            }

            System.out.println(list);
        }
    }

