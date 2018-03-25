package fr.sb.service;

import fr.sb.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 25/03/2018.
 */
@Service
public class MyServiceImpl implements MyService {

    @Autowired
    CityMapper cityMapper;


    @Override
    public String sayHello() {
        return cityMapper.findByState("CA").toString();
    }
}
