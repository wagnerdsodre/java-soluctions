import java.util.ArrayList;
import java.util.List;
/*Wagner Sodré
 * Usamos a class StringBuilder para realizar a manipulação de strings através do método Append
 * Definimos um laço para realizar o output
 * */
public class QuestionOne {
    public static void main(String[] args) throws Exception {
        int n = 6;
        String c = "*" ;
        StringBuilder str = new StringBuilder();
        for(int i=1; i <=n; i++){
            System.out.println(str.append(c));
        }
    }
}
