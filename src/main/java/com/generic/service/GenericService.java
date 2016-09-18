package com.generic.service;

import com.generic.dto.GenericDTO;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by amiranda on 18/09/16.
 */
@Repository
public class GenericService {

    public GenericDTO get() {
        return new GenericDTO(1L,"OK");
    }

    public List<GenericDTO> getList() throws SQLException {
        List<GenericDTO> list = new ArrayList<>();
        list.add(new GenericDTO(2L, "OK"));
        list.add(new GenericDTO(2L, "OK"));
        return list;
    }

}
