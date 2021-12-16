package edu.nirahsab.samples.service;

import edu.nirahsab.samples.util.MainUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MainService {
    @Autowired
    private MainUtil util;

    public Map<String, String> getMain(int limit) {
        Map<String, String> res = new HashMap<>();
        res.put("size", String.valueOf(1));
        res.put("events", util.getEvent(limit));
        return res;
    }
}
