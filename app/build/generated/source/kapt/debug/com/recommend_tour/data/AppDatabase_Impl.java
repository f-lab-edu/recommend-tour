package com.recommend_tour.data;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile TourDao _tourDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `tour_list` (`contentId` TEXT NOT NULL, `title` TEXT, `address` TEXT, `address2` TEXT, `areaCode` TEXT, `bookTour` TEXT, `category1` TEXT, `category2` TEXT, `category3` TEXT, `contentTypeId` TEXT, `createdTime` TEXT, `firstImage` TEXT, `firstImage2` TEXT, `copyrightDivCode` TEXT, `mapX` TEXT, `mapY` TEXT, `mapLevel` TEXT, `modifiedTime` TEXT, `siGunGuCode` TEXT, `telephone` TEXT, `zipCode` TEXT, PRIMARY KEY(`contentId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'abed8b114d8941c3e48bd52f26a70e8c')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `tour_list`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      public void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsTourList = new HashMap<String, TableInfo.Column>(21);
        _columnsTourList.put("contentId", new TableInfo.Column("contentId", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourList.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourList.put("address", new TableInfo.Column("address", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourList.put("address2", new TableInfo.Column("address2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourList.put("areaCode", new TableInfo.Column("areaCode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourList.put("bookTour", new TableInfo.Column("bookTour", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourList.put("category1", new TableInfo.Column("category1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourList.put("category2", new TableInfo.Column("category2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourList.put("category3", new TableInfo.Column("category3", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourList.put("contentTypeId", new TableInfo.Column("contentTypeId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourList.put("createdTime", new TableInfo.Column("createdTime", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourList.put("firstImage", new TableInfo.Column("firstImage", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourList.put("firstImage2", new TableInfo.Column("firstImage2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourList.put("copyrightDivCode", new TableInfo.Column("copyrightDivCode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourList.put("mapX", new TableInfo.Column("mapX", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourList.put("mapY", new TableInfo.Column("mapY", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourList.put("mapLevel", new TableInfo.Column("mapLevel", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourList.put("modifiedTime", new TableInfo.Column("modifiedTime", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourList.put("siGunGuCode", new TableInfo.Column("siGunGuCode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourList.put("telephone", new TableInfo.Column("telephone", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourList.put("zipCode", new TableInfo.Column("zipCode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTourList = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTourList = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTourList = new TableInfo("tour_list", _columnsTourList, _foreignKeysTourList, _indicesTourList);
        final TableInfo _existingTourList = TableInfo.read(_db, "tour_list");
        if (! _infoTourList.equals(_existingTourList)) {
          return new RoomOpenHelper.ValidationResult(false, "tour_list(com.recommend_tour.data.TourList).\n"
                  + " Expected:\n" + _infoTourList + "\n"
                  + " Found:\n" + _existingTourList);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "abed8b114d8941c3e48bd52f26a70e8c", "c4c24da2ea92d30d8ec778f4e3e43b09");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "tour_list");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `tour_list`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(TourDao.class, TourDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public TourDao tourDao() {
    if (_tourDao != null) {
      return _tourDao;
    } else {
      synchronized(this) {
        if(_tourDao == null) {
          _tourDao = new TourDao_Impl(this);
        }
        return _tourDao;
      }
    }
  }
}
