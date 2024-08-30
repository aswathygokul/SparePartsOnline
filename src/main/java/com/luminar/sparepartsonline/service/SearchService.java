package com.luminar.sparepartsonline.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SearchService {
    public List<String> findResults(String query) {

        List<String> allResults = Arrays.asList("Steering 1", "Steering 2", "Brake Pad", "Compressor");
        return allResults.stream()
                .filter(result -> result.toLowerCase().contains(query.toLowerCase()))
                .toList();
    }

}
