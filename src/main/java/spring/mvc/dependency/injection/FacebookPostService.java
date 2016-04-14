package spring.mvc.dependency.injection;

/**
 * Created by maro on 13/04/16.
 */
public class FacebookPostService implements PostService {


    public boolean publishPost(String content) {

        System.out.println("Facebook PostService : " + content);
        return true;
    }
}
