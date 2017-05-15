package org.wing4j.orm.litebatis.api;

import java.sql.SQLException;

/**
 * Created by wing4j on 2017/5/15.
 */
public interface Executor {
    int update(MappedStatement ms, Object parameter) throws SQLException;
    void commit(boolean required) throws SQLException;
    void rollback(boolean required) throws SQLException;
    void close(boolean forceRollback);
    boolean isClosed();
}
