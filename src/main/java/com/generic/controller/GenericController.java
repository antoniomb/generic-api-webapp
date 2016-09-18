package com.generic.controller;

import com.generic.dao.GenericDao;
import com.generic.dto.GenericDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by amiranda on 18/09/16.
 */
@Controller
public class GenericController {

    @Autowired
    private GenericDao genericDao;

    @RequestMapping("/endpoint1")
    @ResponseBody
    GenericDTO endpoint1() throws SQLException {
        return genericDao.get();
    }

    @RequestMapping("/endpoint2")
    @ResponseBody
    List<GenericDTO> endpoint2() throws SQLException {
        return genericDao.getList();
    }

    @RequestMapping("/endpoint3")
    @ResponseBody
    List<GenericDTO> endpoint3() throws SQLException {
        List<GenericDTO> list = genericDao.getList();
        list.add(genericDao.get());
        return list;
    }


}
