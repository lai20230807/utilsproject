package com.utils.project.dao;

import com.utils.project.domain.DataBaseField;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface DataBaseDao {

    public List<DataBaseField> selectTableFieldByTableName(String tableName);

}
