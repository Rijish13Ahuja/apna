package com.apna.backend.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Service
public class DataService {

    public List<Map<String, Object>> getGlobeData() {
        ObjectMapper mapper = new ObjectMapper();
        List<Map<String, Object>> data = null;
        try {
            data = mapper.readValue(new File("apna/env/Scripts/globe_data.json"), List.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
