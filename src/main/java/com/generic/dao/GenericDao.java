package com.generic.dao;

import com.generic.dto.GenericDTO;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by amiranda on 18/09/16.
 */
@Repository
public class GenericDao {

//    @Autowired
//    JdbcTemplate jdbcTemplate;

    public GenericDTO get() {
        return new GenericDTO(1L,"OK");
    }

    public List<GenericDTO> getList() throws SQLException {
        List<GenericDTO> list = new ArrayList<>();
        list.add(new GenericDTO(2L, "OK"));
        list.add(new GenericDTO(2L, "OK"));
        return list;
//        return jdbcTemplate.queryForList("SELECT 1 = 1", Object.class);
    }

}
