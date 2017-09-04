package io.github.haohaozaici.greendaoupdate.model.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.util.Log;
import io.github.haohaozaici.greendaoupdate.model.db.dao.DaoMaster.OpenHelper;
import io.github.haohaozaici.greendaoupdate.model.db.dao.SampleDao;
import org.greenrobot.greendao.database.Database;

/**
 * Created by haohao on 2017/9/4.
 */

public class ReleaseOpenHelper extends OpenHelper {

  public ReleaseOpenHelper(Context context, String name) {
    super(context, name);
  }

  public ReleaseOpenHelper(Context context, String name,
      CursorFactory factory) {
    super(context, name, factory);
  }

  @Override
  public void onUpgrade(Database db, int oldVersion, int newVersion) {
    Log.i("greenDAO", "Upgrading schema from version " + oldVersion + " to " + newVersion + " by dropping all tables");
    MigrationHelper.migrate(db, SampleDao.class);
  }
}
