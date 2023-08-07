package com.utils.project.service.impl;

import com.utils.project.dao.DataBaseDao;
import com.utils.project.domain.DataBaseField;
import com.utils.project.service.DataBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: laiwenjie
 * @CreateTime: 2023-08-04 10:41
 * @Description:
 */
@Service
public class DataBaseServiceImpl implements DataBaseService {

    @Autowired
    private DataBaseDao dataBaseDao;

    @Override
    public List<DataBaseField> getDataBaseField(String tableName) {
        return dataBaseDao.selectTableFieldByTableName(tableName);
    }
}
