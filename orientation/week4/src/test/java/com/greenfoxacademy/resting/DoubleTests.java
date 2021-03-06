package com.greenfoxacademy.resting;

import com.greenfoxacademy.resting.controllers.DoubleController;
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
@WebMvcTest(DoubleController.class)
public class DoubleTests {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void numberDoubler_withInput5_returns10() throws Exception{
    mockMvc.perform(get("/doubling?input=5")
            .contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(MockMvcResultMatchers.jsonPath("$.result")
                    .value(10))
            .andExpect(MockMvcResultMatchers.jsonPath("$.received")
                    .value(5))
            .andExpect(status().isOk());
  }

  @Test
  public void numberDoubler_withoutInput_returnsError() throws Exception {
    mockMvc.perform(get("/doubling")
            .contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(MockMvcResultMatchers.jsonPath("$.error")
                    .value("Please provide an input!"))
            .andExpect(status().isOk());
  }
}