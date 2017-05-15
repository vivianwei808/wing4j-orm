package org.wing4j.orm.litebatis.api;

import java.util.List;

/**
 * Created by wing4j on 2017/5/15.
 */
public interface SqlSession {
    <E> List<E> selectList(String statement);
    <E> List<E> selectList(String statement, Object parameter);
}
