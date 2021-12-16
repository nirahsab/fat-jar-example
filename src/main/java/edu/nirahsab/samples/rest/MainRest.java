package edu.nirahsab.samples.rest;

import edu.nirahsab.samples.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("main")
public class MainRest {

    @Autowired
    private MainService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Map<String, String>> getActivityEvents(@RequestParam(name = "limit", required = false, defaultValue = "5") int limit) {

        return ResponseEntity.ok(service.getMain(limit));
    }
}
