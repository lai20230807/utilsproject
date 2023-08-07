package com.utils.project.service;

import com.utils.project.domain.DataBaseField;

import java.util.List;

/**
*@Author: laiwenjie
*@CreateTime: ${YEAR}-${MONTH}-${DAY} ${HOUR}:${MINUTE}
*@Description:
*@Param:
*@return:
*/
public interface DataBaseService {
    /**
     * 获取
    *@Author: laiwenjie
    *@CreateTime: ${YEAR}-${MONTH}-${DAY} ${HOUR}:${MINUTE}
    *@Description: 获取指定表字段
    *@Param: tableName 表名
    *@return: DataBaseField
    */
    public List<DataBaseField> getDataBaseField(String tableName);

}
