package com.dominika.msjuiceconsumer.web.controller;

import java.util.*;

import com.dominika.msjuiceconsumer.web.model.JuiceDto;
import com.dominika.msjuiceconsumer.services.JuiceService;
import jakarta.validation.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/juice")
@RestController //@Controller + @ ResponseBody
@RequiredArgsConstructor
@Slf4j
public class JuiceController {

    private final JuiceService juiceService;

    @GetMapping("/{juiceId}")
    public ResponseEntity<JuiceDto> getJuice(@PathVariable UUID juiceId){
     return new ResponseEntity<>(juiceService.getJuiceById(juiceId), HttpStatus.OK);
    }

    @PostMapping //POST -create new juice
    public ResponseEntity handlePost(@Valid @RequestBody JuiceDto juiceDto){
        HttpHeaders headers = new HttpHeaders();
        //TODO - add hostname to url
        headers.add("Location", "/api/v1/juice/"+juiceService.createNewJuice(juiceDto).getId().toString());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{juiceId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateJuice(@PathVariable UUID juiceId, @Valid @RequestBody JuiceDto juiceDto){
        juiceService.updateJuiceById(juiceId, juiceDto);
    }

    @DeleteMapping("/{juiceId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteJuice(@PathVariable UUID juiceId){
        juiceService.deleteByid(juiceId);
        log.debug("deleting juice: "+juiceId.toString());
    }

}
