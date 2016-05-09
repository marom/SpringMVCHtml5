package spring.mvc.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import spring.mvc.bean.PostJSON;

import java.util.Arrays;
import java.util.List;

/**
 * Created by maro on 18/04/16.
 */
@RestController
public class RestTemplateControllerExample {

    @Autowired
    private RestTemplate restTemplate;

    //JSON http://jsonplaceholder.typicode.com/ free JSON service
    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public List<PostJSON> getPosts() {

        //JSON http://jsonplaceholder.typicode.com/posts
        ResponseEntity<PostJSON[]> response = restTemplate.getForEntity(
                "http://jsonplaceholder.typicode.com/posts", PostJSON[].class);

        System.out.println("@RestTemplateControllerExample getPosts return response: " + response);
        return Arrays.asList(response.getBody());
    }

    @RequestMapping(value = "/posts/{postId}", method = RequestMethod.GET)
    public PostJSON getPostByID(
            @PathVariable(value="postId") String postId) {

        //JSON http://jsonplaceholder.typicode.com/posts/postId
        ResponseEntity<PostJSON> response = restTemplate.getForEntity(
                "http://jsonplaceholder.typicode.com/posts/{postId}",
                PostJSON.class,postId);

        System.out.println("@RestTemplateControllerExample getPostByID return response: " + response);
        return response.getBody();
    }
}
