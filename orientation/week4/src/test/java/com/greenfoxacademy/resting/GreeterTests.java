package com.greenfoxacademy.resting;

import com.greenfoxacademy.resting.controllers.GreeterController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@RunWith(SpringRunner.class)
@WebMvcTest(GreeterController.class)
public class GreeterTests {

  @Autowired
  MockMvc mockMvc;

  @Test
  public void greet_withTitleandNoName_returnsNewNoInputError() throws Exception{
    mockMvc.perform(get("/greeter?title=whatever")
            .contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(MockMvcResultMatchers.jsonPath("$.error")
            .value("Please provide a name!"))
            .andExpect(status().isOk());
  }

  @Test
  public void greet_withNoTitleandNoName_returnsNewNoInputError() throws Exception{
    mockMvc.perform(get("/greeter")
            .contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(MockMvcResultMatchers.jsonPath("$.error")
                    .value("Please provide a name and a title!"))
            .andExpect(status().isOk());
  }

  @Test
  public void greet_withtitleandname_returnsGreeting() throws Exception{
    mockMvc.perform(get("/greeter?name=Tamas&title=student")
            .contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(MockMvcResultMatchers.jsonPath("$.welcome_message")
                    .value("Oh, hi there Tamas, my dear student!"))
            .andExpect(status().isOk());
  }


}
