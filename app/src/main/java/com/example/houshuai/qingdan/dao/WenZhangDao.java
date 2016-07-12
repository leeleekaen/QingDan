package com.example.houshuai.qingdan.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table SHOUCHANG.
*/
public class WenZhangDao extends AbstractDao<WenZhang, Long> {

    public static final String TABLENAME = "SHOUCHANG";

    /**
     * Properties of entity WenZhang.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Url = new Property(1, String.class, "url", false, "URL");
        public final static Property Title = new Property(2, String.class, "title", false, "TITLE");
        public final static Property Content = new Property(3, String.class, "content", false, "CONTENT");
        public final static Property Image = new Property(4, String.class, "image", false, "IMAGE");
        public final static Property AddLove = new Property(5, String.class, "addLove", false, "ADD_LOVE");
        public final static Property AddSee = new Property(6, String.class, "addSee", false, "ADD_SEE");
        public final static Property Date = new Property(7, java.util.Date.class, "date", false, "DATE");
    };


    public WenZhangDao(DaoConfig config) {
        super(config);
    }
    
    public WenZhangDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'SHOUCHANG' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'URL' TEXT NOT NULL ," + // 1: url
                "'TITLE' TEXT," + // 2: title
                "'CONTENT' TEXT," + // 3: content
                "'IMAGE' TEXT," + // 4: image
                "'ADD_LOVE' TEXT," + // 5: addLove
                "'ADD_SEE' TEXT," + // 6: addSee
                "'DATE' INTEGER);"); // 7: date
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'SHOUCHANG'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, WenZhang entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getUrl());
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(3, title);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(4, content);
        }
 
        String image = entity.getImage();
        if (image != null) {
            stmt.bindString(5, image);
        }
 
        String addLove = entity.getAddLove();
        if (addLove != null) {
            stmt.bindString(6, addLove);
        }
 
        String addSee = entity.getAddSee();
        if (addSee != null) {
            stmt.bindString(7, addSee);
        }
 
        java.util.Date date = entity.getDate();
        if (date != null) {
            stmt.bindLong(8, date.getTime());
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public WenZhang readEntity(Cursor cursor, int offset) {
        WenZhang entity = new WenZhang( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // url
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // title
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // content
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // image
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // addLove
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // addSee
            cursor.isNull(offset + 7) ? null : new java.util.Date(cursor.getLong(offset + 7)) // date
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, WenZhang entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUrl(cursor.getString(offset + 1));
        entity.setTitle(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setContent(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setImage(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setAddLove(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setAddSee(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setDate(cursor.isNull(offset + 7) ? null : new java.util.Date(cursor.getLong(offset + 7)));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(WenZhang entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(WenZhang entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
