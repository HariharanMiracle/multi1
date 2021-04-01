package com.darkdevil.service.impl;


import com.darkdevil.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private HashMap<String, String> textHandler1;

    @Override
    public String test() {
        return "test function from service " + textHandler1.get("TEST2");
    }
}
