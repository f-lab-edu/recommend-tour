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
        _db.execSQL("CREATE TABLE IF NOT EXISTS `tour_item` (`contentId` TEXT NOT NULL, `title` TEXT, `address` TEXT, `address2` TEXT, `areaCode` TEXT, `bookTour` TEXT, `category1` TEXT, `category2` TEXT, `category3` TEXT, `contentTypeId` TEXT, `createdTime` TEXT, `firstImage` TEXT, `firstImage2` TEXT, `copyrightDivCode` TEXT, `mapX` TEXT, `mapY` TEXT, `mapLevel` TEXT, `modifiedTime` TEXT, `siGunGuCode` TEXT, `telephone` TEXT, `zipCode` TEXT, PRIMARY KEY(`contentId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '0ba88686600d2d527ce782fe72a0209c')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `tour_item`");
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
        final HashMap<String, TableInfo.Column> _columnsTourItem = new HashMap<String, TableInfo.Column>(21);
        _columnsTourItem.put("contentId", new TableInfo.Column("contentId", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourItem.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourItem.put("address", new TableInfo.Column("address", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourItem.put("address2", new TableInfo.Column("address2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourItem.put("areaCode", new TableInfo.Column("areaCode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourItem.put("bookTour", new TableInfo.Column("bookTour", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourItem.put("category1", new TableInfo.Column("category1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourItem.put("category2", new TableInfo.Column("category2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourItem.put("category3", new TableInfo.Column("category3", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourItem.put("contentTypeId", new TableInfo.Column("contentTypeId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourItem.put("createdTime", new TableInfo.Column("createdTime", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourItem.put("firstImage", new TableInfo.Column("firstImage", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourItem.put("firstImage2", new TableInfo.Column("firstImage2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourItem.put("copyrightDivCode", new TableInfo.Column("copyrightDivCode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourItem.put("mapX", new TableInfo.Column("mapX", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourItem.put("mapY", new TableInfo.Column("mapY", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourItem.put("mapLevel", new TableInfo.Column("mapLevel", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourItem.put("modifiedTime", new TableInfo.Column("modifiedTime", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourItem.put("siGunGuCode", new TableInfo.Column("siGunGuCode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourItem.put("telephone", new TableInfo.Column("telephone", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTourItem.put("zipCode", new TableInfo.Column("zipCode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTourItem = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTourItem = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTourItem = new TableInfo("tour_item", _columnsTourItem, _foreignKeysTourItem, _indicesTourItem);
        final TableInfo _existingTourItem = TableInfo.read(_db, "tour_item");
        if (! _infoTourItem.equals(_existingTourItem)) {
          return new RoomOpenHelper.ValidationResult(false, "tour_item(com.recommend_tour.data.TourItem).\n"
                  + " Expected:\n" + _infoTourItem + "\n"
                  + " Found:\n" + _existingTourItem);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "0ba88686600d2d527ce782fe72a0209c", "3a53a0278dd5653d98b2a85778b512f7");
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
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "tour_item");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `tour_item`");
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
