package org.wing4j.orm.markdown;

import lombok.Data;
import lombok.ToString;

/**
 * Created by woate on 2017/2/28.
 * 8:15
 */
@Data
@ToString
public class ResultEntity {
    /**
     * 物理主键
     */
    String serialNo;
    /**
     * 姓名
     */
    String name1;
    /**
     * 年龄
     */
    Integer age2;
    /**
     * 性别
     */
    Boolean sex3;
}
