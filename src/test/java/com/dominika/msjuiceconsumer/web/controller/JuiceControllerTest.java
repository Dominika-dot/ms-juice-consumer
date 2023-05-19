package com.dominika.msjuiceconsumer.web.controller;

import java.util.UUID;

import com.dominika.msjuiceconsumer.services.JuiceService;
import com.dominika.msjuiceconsumer.web.model.JuiceDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.http.RequestEntity.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureRestDocs
@WebMvcTest(JuiceController.class)
public class JuiceControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    private JuiceService juiceService;

    @Test
    void getJuiceById() throws Exception{

        mockMvc.perform((RequestBuilder)
            get("api/v1/juice/"+UUID.randomUUID())
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void saveNewJuice() throws Exception{
        JuiceDto juiceDto = JuiceDto.builder().build();
        String juiceDtoJson = objectMapper.writeValueAsString(juiceDto);
        mockMvc.perform((RequestBuilder)
            post("api/v1/juice/")
                .contentType(MediaType.APPLICATION_JSON)
                .body(juiceDtoJson))
                .andExpect(status().isCreated());
    }

    @Test
    void updateJuiceById() throws Exception{
        JuiceDto juiceDto = JuiceDto.builder().build();
        String juiceToDtoJson = objectMapper.writeValueAsString(juiceDto);
        mockMvc.perform((RequestBuilder)
            put("/api/v1/juice/"+UUID.randomUUID())
                .contentType(MediaType.APPLICATION_JSON)
                .body(juiceToDtoJson))
            .andExpect(status().isNoContent());
    }
}
