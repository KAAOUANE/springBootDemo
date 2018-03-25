package fr.sb.service;

import org.springframework.stereotype.Service;

/**
 * Created by admin on 25/03/2018.
 */
@Service
public class MyServiceImpl implements MyService {


    @Override
    public String sayHello() {
        return "Hello Service";
    }
}
