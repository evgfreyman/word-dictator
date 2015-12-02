package com.lll.dbengine;

import java.util.List;

import rx.Observable;

/**
 * Created by Freyman on 27.11.2015.
 * Interface for manipulating with database.
 * Any work with database goes through it
 */
public interface DbEngine<Key, Value> {
    void createEmpty();

    void addRecord(DbRecord<Key, Value> dbRecord);
    void updateRecord(DbRecord<Key, Value> dbRecord);
    Observable<List<DbRecord<Key, Value>>> getRecords(String sqlQuery);
    void addJSON(String filename);
}
