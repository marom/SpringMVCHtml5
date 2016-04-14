package spring.mvc.dependency.injection;

/**
 * Created by maro on 13/04/16.
 */
public class PostManager {

    private PostService postService;
    private boolean enabled;

    //public PostManager() {};

    public PostManager(PostService postService, boolean enabled) {
        this.postService = postService;
        this.enabled = enabled;
    }

//    public PostService getPostService() {
//        return postService;
//    }
//
//    public void setPostService(PostService postService) {
//        this.postService = postService;
//    }
//
    public boolean isEnabled() {
        return enabled;
    }
//
//    public void setEnabled(boolean enabled) {
//        this.enabled = enabled;
//    }

    public boolean publish(String content) {
        if(enabled == true)
            return postService.publishPost(content);
        else
            return false;

    }
}
