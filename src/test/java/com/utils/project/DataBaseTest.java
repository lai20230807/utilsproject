package com.utils.project;

import com.utils.project.domain.DataBaseField;
import com.utils.project.service.DataBaseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author: laiwenjie
 * @CreateTime: 2023-08-04 10:36
 * @Description:
 */
@SpringBootTest
public class DataBaseTest {
    @Autowired
    private DataBaseService dataBaseService;

    @Test
    public void testDataBaseTableField() { // 测试TEST
        String tableName = "t_order";
        List<DataBaseField> dataBaseField = dataBaseService.getDataBaseField(tableName);
        System.out.println("aaaaa");
    }

}
