/**
 * @author linahovanessian on 11/6/18.
 */
public class Main {
    public static void main(String[] args) {


        StringBuilder path = new StringBuilder( "/repos/{ownerName}/{repoName}/contributors?per_page=100" );

        String s = path.toString();
        System.out.println( s.replace( "{ownerName}", "lina" ).replace( "{repoName}", "repooo" ) );

    }
}
