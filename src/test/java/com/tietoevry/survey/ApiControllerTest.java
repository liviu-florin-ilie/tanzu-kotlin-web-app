package com.tietoevry.survey;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ApiController.class)
class ApiControllerTest {

    @Autowired
    private ApiController controller;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void index() throws Exception {
        assertEquals("Greetings from Spring Kotlin Boot + Tanzu!", controller.index());

        mockMvc
            .perform(get("/"))
            .andExpect(status().isOk())
            .andExpect(content().string("Greetings from Spring Kotlin Boot + Tanzu!"));
    }
}
