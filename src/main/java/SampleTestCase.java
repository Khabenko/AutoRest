import controllers.Client;
import controllers.UserController;
import models.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.*;

public class SampleTestCase {

    private UserController userController;

    @Before
    public void setUp() {
        userController = new UserController();
    }

    @Test
    public void testUserInfoResponse() {
          RestTemplate restTemplate = new RestTemplate();
          Client client =null ;
    //     restTemplate.getForObject("http://marketing-web/Tavriav790_T/ExternalProjects/ExternalAPI.WebApp/EditHouseHoldRole",Client.class);
    //     restTemplate.headForHeaders

    //    User remoteUser = userController.getUserByUsername("maxkolotilkin");
  //      assertTrue(remoteUser.getHtml_url().contains("https://github.com/maxkolotilkin"));
    }

  //  @Test
    public void testFollowers() {
        User[] followers = userController.getFollowersByUser("Khabenko");
        assertTrue(followers.length == 0 || followers == null );
    }


}
