package com.dominika.msjuiceconsumer.web.controller;

import java.util.UUID;

import com.dominika.msjuiceconsumer.web.model.JuiceDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.http.RequestEntity.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(JuiceController.class)
public class JuiceControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void getJuiceById() throws Exception{
 /*       mockMvc.perform(
            get("api/v1/juice/"+UUID.randomUUID())
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void saveNewJuice() throws Exception{
        JuiceDto juiceDto = JuiceDto.builder().build();
        String juiceDtoJson = objectMapper.writeValueAsString(juiceDto);
        mockMvc.perform(
            post("api/v1/juice/")
                .contentType(MediaType.APPLICATION_JSON)
                .body(juiceDtoJson))
                .andExpect(status().isCreated());
    }

    @Test
    void updateJuiceById() throws Exception{
        JuiceDto juiceDto = JuiceDto.builder().build();
        String juiceToDtoJson = objectMapper.writeValueAsString(juiceDto);
        mockMvc.perform(
            put("/api/v1/juice/"+UUID.randomUUID())
                .contentType(MediaType.APPLICATION_JSON)
                .body(juiceToDtoJson))
            .andExpect(status().isNoContent()); */
    }
}
