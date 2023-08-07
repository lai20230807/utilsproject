package com.utils.project.domain;

import lombok.Data;

/**
 * @Author: laiwenjie
 * @CreateTime: 2023-08-04 10:02
 * @Description:
 */
@Data
public class DataBaseField {
    private String field;
    private String type;
    private String key;
    private String extra;
}
