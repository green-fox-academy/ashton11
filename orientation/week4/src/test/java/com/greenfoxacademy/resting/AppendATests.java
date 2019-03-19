package com.greenfoxacademy.resting;


import com.greenfoxacademy.resting.controllers.AppendARESTController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.concurrent.ExecutionException;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;


@RunWith(SpringRunner.class)
@WebMvcTest(AppendARESTController.class)
public class AppendATests {

  @Autowired
  MockMvc mockMvc;

  @Test
  public void appendA_noInput_notFoundError() throws Exception{
    mockMvc.perform(get("/appenda/"))
            .andExpect(status().isNotFound());
  }

  @Test
  public void appendA_inputKuty_returnKutya()throws Exception{
    mockMvc.perform(get("/appenda/kuty")
            .contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(MockMvcResultMatchers.jsonPath("$.appended")
                    .value("kutya"));
  }

}
