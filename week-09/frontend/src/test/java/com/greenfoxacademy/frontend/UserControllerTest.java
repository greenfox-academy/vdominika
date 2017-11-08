package com.greenfoxacademy.frontend;

        import org.junit.Before;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.test.context.SpringBootTest;
        import org.springframework.http.MediaType;
        import org.springframework.test.context.junit4.SpringRunner;
        import org.springframework.test.context.web.WebAppConfiguration;
        import org.springframework.test.web.servlet.MockMvc;
        import org.springframework.test.web.servlet.setup.MockMvcBuilders;
        import org.springframework.web.context.WebApplicationContext;
        import org.springframework.web.servlet.config.annotation.EnableWebMvc;

        import java.nio.charset.Charset;

        import static org.hamcrest.core.Is.is;
        import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
        import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FrontendApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class UserControllerTest {

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setup() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void testApplicationWorkingCorrectly() throws Exception {
        mockMvc.perform(get("/doubling?input=10"))
                .andExpect(jsonPath("$.received", is(10)))
                .andExpect(jsonPath("$.result", is(20)));
    }

    @Test
    public void testError() throws Exception {
        mockMvc.perform(get("/doubling"))
                .andExpect(jsonPath("$.error", is("Please provide an input!")));
    }

    @Test
    public void testGreeterFunction() throws Exception {
        mockMvc.perform(get("/greeter?name=Peter&title=student"))
                .andExpect(jsonPath("$.welcome_message", is("Oh, hi there Peter, my dear student!")));
    }

    @Test
    public void testGreetingError() throws Exception {
        mockMvc.perform(get("/greeter"))
                .andExpect(jsonPath("$.error", is("Please provide a name!")));
    }

    @Test
    public void testAppendAFunction() throws Exception {
        mockMvc.perform(get("/appenda/macsk"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.appended", is("macska")));
    }

    @Test
    public void testAppendError() throws Exception {
        mockMvc.perform(get("/appenda"))
                .andExpect(status().isNotFound());

    }
    
}
