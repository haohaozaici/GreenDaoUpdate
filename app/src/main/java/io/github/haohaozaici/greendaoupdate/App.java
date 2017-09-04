package io.github.haohaozaici.greendaoupdate;

import android.app.Application;
import io.github.haohaozaici.greendaoupdate.model.db.ReleaseOpenHelper;
import io.github.haohaozaici.greendaoupdate.model.db.dao.DaoMaster;
import io.github.haohaozaici.greendaoupdate.model.db.dao.DaoMaster.DevOpenHelper;
import io.github.haohaozaici.greendaoupdate.model.db.dao.DaoSession;
import org.greenrobot.greendao.database.Database;

/**
 * Created by haohao on 2017/9/1.
 */

public class App extends Application {

  public static final boolean ENCRYPTED = false;

  private static DaoSession daoSession;
  Database db;

  @Override
  public void onCreate() {
    super.onCreate();
//    if (BuildConfig.DEBUG) {
//      DevOpenHelper helper = new DevOpenHelper(this,
//          ENCRYPTED ? "haohao-db-encrypted" : "haohao-db");
//      db = ENCRYPTED ? helper.getEncryptedWritableDb("super-secret") : helper.getWritableDb();
//    } else {
      ReleaseOpenHelper helper = new ReleaseOpenHelper(this,
          ENCRYPTED ? "haohao-db-encrypted" : "haohao-db");
      db = ENCRYPTED ? helper.getEncryptedWritableDb("super-secret") : helper.getWritableDb();
//    }

    daoSession = new DaoMaster(db).newSession();

  }

  public static DaoSession getDaoSession() {
    return daoSession;
  }
}
