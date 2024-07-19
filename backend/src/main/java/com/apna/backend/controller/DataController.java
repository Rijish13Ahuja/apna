package com.apna.backend.controller;

import com.apna.backend.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/globe-data")
public class DataController {

    @Autowired
    private DataService dataService;

    @GetMapping
    public List<Map<String, Object>> getGlobeData() {
        return dataService.getGlobeData();
    }
}
