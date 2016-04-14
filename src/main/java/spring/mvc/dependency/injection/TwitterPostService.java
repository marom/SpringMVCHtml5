package spring.mvc.dependency.injection;

/**
 * Created by maro on 13/04/16.
 */
public class TwitterPostService implements PostService {


    public boolean publishPost(String content) {

        System.out.println("Twitter PostService : " + content);
        return true;
    }
}
