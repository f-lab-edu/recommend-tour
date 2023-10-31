package com.recommend_tour.data;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class TourDao_Impl implements TourDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TourList> __insertionAdapterOfTourList;

  public TourDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTourList = new EntityInsertionAdapter<TourList>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `tour_list` (`contentId`,`title`,`address`,`address2`,`areaCode`,`bookTour`,`category1`,`category2`,`category3`,`contentTypeId`,`createdTime`,`firstImage`,`firstImage2`,`copyrightDivCode`,`mapX`,`mapY`,`mapLevel`,`modifiedTime`,`siGunGuCode`,`telephone`,`zipCode`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TourList value) {
        if (value.getContentId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getContentId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getAddress() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAddress());
        }
        if (value.getAddress2() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getAddress2());
        }
        if (value.getAreaCode() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getAreaCode());
        }
        if (value.getBookTour() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getBookTour());
        }
        if (value.getCategory1() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getCategory1());
        }
        if (value.getCategory2() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getCategory2());
        }
        if (value.getCategory3() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getCategory3());
        }
        if (value.getContentTypeId() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getContentTypeId());
        }
        if (value.getCreatedTime() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getCreatedTime());
        }
        if (value.getFirstImage() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getFirstImage());
        }
        if (value.getFirstImage2() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getFirstImage2());
        }
        if (value.getCopyrightDivCode() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getCopyrightDivCode());
        }
        if (value.getMapX() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getMapX());
        }
        if (value.getMapY() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getMapY());
        }
        if (value.getMapLevel() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getMapLevel());
        }
        if (value.getModifiedTime() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getModifiedTime());
        }
        if (value.getSiGunGuCode() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getSiGunGuCode());
        }
        if (value.getTelephone() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getTelephone());
        }
        if (value.getZipCode() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getZipCode());
        }
      }
    };
  }

  @Override
  public Object insertTourList(final TourList[] list,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTourList.insert(list);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getAllTourList(final Continuation<? super List<TourList>> continuation) {
    final String _sql = "SELECT * FROM tour_list";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<TourList>>() {
      @Override
      public List<TourList> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfContentId = CursorUtil.getColumnIndexOrThrow(_cursor, "contentId");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final int _cursorIndexOfAddress2 = CursorUtil.getColumnIndexOrThrow(_cursor, "address2");
          final int _cursorIndexOfAreaCode = CursorUtil.getColumnIndexOrThrow(_cursor, "areaCode");
          final int _cursorIndexOfBookTour = CursorUtil.getColumnIndexOrThrow(_cursor, "bookTour");
          final int _cursorIndexOfCategory1 = CursorUtil.getColumnIndexOrThrow(_cursor, "category1");
          final int _cursorIndexOfCategory2 = CursorUtil.getColumnIndexOrThrow(_cursor, "category2");
          final int _cursorIndexOfCategory3 = CursorUtil.getColumnIndexOrThrow(_cursor, "category3");
          final int _cursorIndexOfContentTypeId = CursorUtil.getColumnIndexOrThrow(_cursor, "contentTypeId");
          final int _cursorIndexOfCreatedTime = CursorUtil.getColumnIndexOrThrow(_cursor, "createdTime");
          final int _cursorIndexOfFirstImage = CursorUtil.getColumnIndexOrThrow(_cursor, "firstImage");
          final int _cursorIndexOfFirstImage2 = CursorUtil.getColumnIndexOrThrow(_cursor, "firstImage2");
          final int _cursorIndexOfCopyrightDivCode = CursorUtil.getColumnIndexOrThrow(_cursor, "copyrightDivCode");
          final int _cursorIndexOfMapX = CursorUtil.getColumnIndexOrThrow(_cursor, "mapX");
          final int _cursorIndexOfMapY = CursorUtil.getColumnIndexOrThrow(_cursor, "mapY");
          final int _cursorIndexOfMapLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "mapLevel");
          final int _cursorIndexOfModifiedTime = CursorUtil.getColumnIndexOrThrow(_cursor, "modifiedTime");
          final int _cursorIndexOfSiGunGuCode = CursorUtil.getColumnIndexOrThrow(_cursor, "siGunGuCode");
          final int _cursorIndexOfTelephone = CursorUtil.getColumnIndexOrThrow(_cursor, "telephone");
          final int _cursorIndexOfZipCode = CursorUtil.getColumnIndexOrThrow(_cursor, "zipCode");
          final List<TourList> _result = new ArrayList<TourList>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TourList _item;
            final String _tmpContentId;
            if (_cursor.isNull(_cursorIndexOfContentId)) {
              _tmpContentId = null;
            } else {
              _tmpContentId = _cursor.getString(_cursorIndexOfContentId);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpAddress;
            if (_cursor.isNull(_cursorIndexOfAddress)) {
              _tmpAddress = null;
            } else {
              _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            }
            final String _tmpAddress2;
            if (_cursor.isNull(_cursorIndexOfAddress2)) {
              _tmpAddress2 = null;
            } else {
              _tmpAddress2 = _cursor.getString(_cursorIndexOfAddress2);
            }
            final String _tmpAreaCode;
            if (_cursor.isNull(_cursorIndexOfAreaCode)) {
              _tmpAreaCode = null;
            } else {
              _tmpAreaCode = _cursor.getString(_cursorIndexOfAreaCode);
            }
            final String _tmpBookTour;
            if (_cursor.isNull(_cursorIndexOfBookTour)) {
              _tmpBookTour = null;
            } else {
              _tmpBookTour = _cursor.getString(_cursorIndexOfBookTour);
            }
            final String _tmpCategory1;
            if (_cursor.isNull(_cursorIndexOfCategory1)) {
              _tmpCategory1 = null;
            } else {
              _tmpCategory1 = _cursor.getString(_cursorIndexOfCategory1);
            }
            final String _tmpCategory2;
            if (_cursor.isNull(_cursorIndexOfCategory2)) {
              _tmpCategory2 = null;
            } else {
              _tmpCategory2 = _cursor.getString(_cursorIndexOfCategory2);
            }
            final String _tmpCategory3;
            if (_cursor.isNull(_cursorIndexOfCategory3)) {
              _tmpCategory3 = null;
            } else {
              _tmpCategory3 = _cursor.getString(_cursorIndexOfCategory3);
            }
            final String _tmpContentTypeId;
            if (_cursor.isNull(_cursorIndexOfContentTypeId)) {
              _tmpContentTypeId = null;
            } else {
              _tmpContentTypeId = _cursor.getString(_cursorIndexOfContentTypeId);
            }
            final String _tmpCreatedTime;
            if (_cursor.isNull(_cursorIndexOfCreatedTime)) {
              _tmpCreatedTime = null;
            } else {
              _tmpCreatedTime = _cursor.getString(_cursorIndexOfCreatedTime);
            }
            final String _tmpFirstImage;
            if (_cursor.isNull(_cursorIndexOfFirstImage)) {
              _tmpFirstImage = null;
            } else {
              _tmpFirstImage = _cursor.getString(_cursorIndexOfFirstImage);
            }
            final String _tmpFirstImage2;
            if (_cursor.isNull(_cursorIndexOfFirstImage2)) {
              _tmpFirstImage2 = null;
            } else {
              _tmpFirstImage2 = _cursor.getString(_cursorIndexOfFirstImage2);
            }
            final String _tmpCopyrightDivCode;
            if (_cursor.isNull(_cursorIndexOfCopyrightDivCode)) {
              _tmpCopyrightDivCode = null;
            } else {
              _tmpCopyrightDivCode = _cursor.getString(_cursorIndexOfCopyrightDivCode);
            }
            final String _tmpMapX;
            if (_cursor.isNull(_cursorIndexOfMapX)) {
              _tmpMapX = null;
            } else {
              _tmpMapX = _cursor.getString(_cursorIndexOfMapX);
            }
            final String _tmpMapY;
            if (_cursor.isNull(_cursorIndexOfMapY)) {
              _tmpMapY = null;
            } else {
              _tmpMapY = _cursor.getString(_cursorIndexOfMapY);
            }
            final String _tmpMapLevel;
            if (_cursor.isNull(_cursorIndexOfMapLevel)) {
              _tmpMapLevel = null;
            } else {
              _tmpMapLevel = _cursor.getString(_cursorIndexOfMapLevel);
            }
            final String _tmpModifiedTime;
            if (_cursor.isNull(_cursorIndexOfModifiedTime)) {
              _tmpModifiedTime = null;
            } else {
              _tmpModifiedTime = _cursor.getString(_cursorIndexOfModifiedTime);
            }
            final String _tmpSiGunGuCode;
            if (_cursor.isNull(_cursorIndexOfSiGunGuCode)) {
              _tmpSiGunGuCode = null;
            } else {
              _tmpSiGunGuCode = _cursor.getString(_cursorIndexOfSiGunGuCode);
            }
            final String _tmpTelephone;
            if (_cursor.isNull(_cursorIndexOfTelephone)) {
              _tmpTelephone = null;
            } else {
              _tmpTelephone = _cursor.getString(_cursorIndexOfTelephone);
            }
            final String _tmpZipCode;
            if (_cursor.isNull(_cursorIndexOfZipCode)) {
              _tmpZipCode = null;
            } else {
              _tmpZipCode = _cursor.getString(_cursorIndexOfZipCode);
            }
            _item = new TourList(_tmpContentId,_tmpTitle,_tmpAddress,_tmpAddress2,_tmpAreaCode,_tmpBookTour,_tmpCategory1,_tmpCategory2,_tmpCategory3,_tmpContentTypeId,_tmpCreatedTime,_tmpFirstImage,_tmpFirstImage2,_tmpCopyrightDivCode,_tmpMapX,_tmpMapY,_tmpMapLevel,_tmpModifiedTime,_tmpSiGunGuCode,_tmpTelephone,_tmpZipCode);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
