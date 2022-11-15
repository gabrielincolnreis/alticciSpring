package com.example.Alticci.controller;

import com.example.Alticci.service.AlticciService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/alticci")
public class AlticciController {

    private final AlticciService alticciService;

    public AlticciController(AlticciService alticciService) {
        this.alticciService = alticciService;
    }

    @CrossOrigin()
    @GetMapping("/{n}")
    @Cacheable("alticciIndex")
    public Integer alticciIndex(@PathVariable Integer n){
        return alticciService.getAlticciIndex(n);
    }

}
