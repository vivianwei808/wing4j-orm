package org.wing4j.orm.litebatis.api;

/**
 * Created by wing4j on 2017/5/15.
 */
public interface MappedStatement {
    BoundSql getBoundSql(Object parameterObject);
}
