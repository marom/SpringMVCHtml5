package spring.mvc.dependency.injection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by maro on 13/04/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class PostManagerTest {


    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void publish() throws Exception {

        PostManager postManager = (PostManager) applicationContext.getBean("postManager");
        System.out.println("postManager.isServiceAvailable(): " + postManager.isEnabled());
        Assert.assertTrue(postManager.isEnabled());
        Assert.assertTrue(postManager.publish("test post"));
    }

}