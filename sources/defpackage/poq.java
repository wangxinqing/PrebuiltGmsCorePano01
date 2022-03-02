package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: poq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class poq extends dvf {
    public static final String[] d = {"_id", "msg_type"};
    public static final String[] e = {"_id", "msg_type", "date"};
    private static poq f;
    private final oyq g;

    public static synchronized poq a(Context context, dvg dvg) {
        poq poq;
        synchronized (poq.class) {
            if (f == null) {
                f = new poq(context, dvg);
            }
            poq = f;
        }
        return poq;
    }

    private static final void b(SQLiteDatabase sQLiteDatabase) {
        pnz.d("Dropping mmssms index by executing: %s", "DROP INDEX IF EXISTS mmssms_idx");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS mmssms_idx");
        pnz.d("Creating mmssms index by executing: %s", "CREATE INDEX mmssms_idx ON mmssms(uri)");
        sQLiteDatabase.execSQL("CREATE INDEX mmssms_idx ON mmssms(uri)");
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        return ((Boolean) ozx.aO.c()).booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final SQLiteDatabase e() {
        try {
            return getReadableDatabase();
        } catch (SQLiteException e2) {
            this.g.a("sms_read_db_exception");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final SQLiteDatabase f() {
        try {
            return getWritableDatabase();
        } catch (SQLiteException e2) {
            this.g.a("sms_write_db_exception");
            return null;
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        pnz.b("Downgrading mmssms DB from version %d to version %d", Integer.valueOf(i), Integer.valueOf(i2));
        jit.a(sQLiteDatabase);
        onCreate(sQLiteDatabase);
    }

    public poq(Context context, dvg dvg) {
        super(context, "icing_mmssms.db", 4, dvg);
        this.g = new oyq(context);
    }

    public final int a(String str, boolean z) {
        SQLiteDatabase e2 = e();
        if (e2 == null) {
            pnz.e("Got null db in SmsCorpusDbOpenHelper's getIdCount.");
            return 0;
        } else if (z) {
            return (int) DatabaseUtils.queryNumEntries(e2, "mmssms_tag", "msg_type=? AND tag=?", new String[]{str, "unread"});
        } else {
            return (int) DatabaseUtils.queryNumEntries(e2, "mmssms", "msg_type=?", new String[]{str});
        }
    }

    /* JADX INFO: finally extract failed */
    public final int a(List list, String str) {
        SQLiteDatabase f2 = f();
        if (f2 == null) {
            pnz.e("Got null db in SmsCorpusDbOpenHelper.updateReadStatus");
            return 0;
        }
        f2.beginTransaction();
        try {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                i += f2.delete("mmssms_tag", "_id=? AND msg_type=?", new String[]{String.valueOf((Integer) it.next()), str});
            }
            f2.setTransactionSuccessful();
            f2.endTransaction();
            pnz.c("Updated %d readstatus for %s", Integer.valueOf(i), str);
            return i;
        } catch (Throwable th) {
            f2.endTransaction();
            throw th;
        }
    }

    public final pop a(String str, Iterator it) {
        long j;
        String str2 = str;
        SQLiteDatabase f2 = f();
        if (f2 != null) {
            oq oqVar = null;
            int i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                pob pob = (pob) it.next();
                if (pob != null) {
                    f2.beginTransaction();
                    try {
                        ContentValues contentValues = new ContentValues();
                        jit.a(contentValues, "_id", Integer.valueOf(pob.a()));
                        jit.a(contentValues, "msg_type", pob.b());
                        jit.a(contentValues, "uri", pob.c());
                        jit.a(contentValues, "type", pob.d());
                        jit.a(contentValues, "thread_id", pob.e());
                        jit.a(contentValues, "address", pob.g());
                        contentValues.put("date", Long.valueOf(pob.f()));
                        jit.a(contentValues, "subject", pob.h());
                        jit.a(contentValues, "body", pob.i());
                        jit.a(contentValues, "score", Integer.valueOf(pob.j()));
                        jit.a(contentValues, "content_type", pob.k());
                        jit.a(contentValues, "media_uri", pob.l());
                        f2.insert("mmssms", (String) null, contentValues);
                        f2.delete("mmssms_tag", "_id=? AND msg_type=?", new String[]{String.valueOf(pob.a()), str2});
                        if (!"sms".equals(str2)) {
                            j = TimeUnit.MILLISECONDS.toSeconds(pob.f());
                        } else {
                            j = pob.f();
                        }
                        if (!pob.m()) {
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("_id", Integer.valueOf(pob.a()));
                            contentValues2.put("msg_type", str2);
                            contentValues2.put("uri", pob.c());
                            contentValues2.put("tag", "unread");
                            contentValues2.put("date", Long.valueOf(j));
                            f2.insert("mmssms_tag", (String) null, contentValues2);
                            i2++;
                        }
                        i++;
                        oqVar = new oq(Long.valueOf(j), Integer.valueOf(pob.a()));
                        f2.setTransactionSuccessful();
                    } finally {
                        f2.endTransaction();
                    }
                }
            }
            pnz.c("Ingested %d %s (%d unread) into corpus", Integer.valueOf(i), str2, Integer.valueOf(i2));
            return new pop(i, oqVar);
        }
        pnz.e("Got null db SmsCorpusDbOpenHelper.processNewMessages for %s", str2);
        return new pop(0, (oq) null);
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        pnz.d("Dropping mmssms table by executing: %s", "DROP TABLE IF EXISTS mmssms");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS mmssms");
        pnz.d("Creating mmssms table by executing: %s", "CREATE TABLE mmssms(_id INTEGER NOT NULL,msg_type TEXT NOT NULL,uri TEXT NOT NULL,type INTEGER,thread_id INTEGER,address TEXT,date INTEGER,subject TEXT,body TEXT,score INTEGER,content_type TEXT,media_uri TEXT,read INTEGER DEFAULT 0,UNIQUE(_id,msg_type) ON CONFLICT REPLACE)");
        sQLiteDatabase.execSQL("CREATE TABLE mmssms(_id INTEGER NOT NULL,msg_type TEXT NOT NULL,uri TEXT NOT NULL,type INTEGER,thread_id INTEGER,address TEXT,date INTEGER,subject TEXT,body TEXT,score INTEGER,content_type TEXT,media_uri TEXT,read INTEGER DEFAULT 0,UNIQUE(_id,msg_type) ON CONFLICT REPLACE)");
        b(sQLiteDatabase);
        pnz.d("Dropping mmssms_tag table by executing: %s", "DROP TABLE IF EXISTS mmssms_tag");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS mmssms_tag");
        pnz.d("Creating mmssms_tag table by executing: %s", "CREATE TABLE mmssms_tag(_id INTEGER NOT NULL,msg_type TEXT NOT NULL,uri TEXT NOT NULL,tag TEXT NOT NULL,date INTEGER DEFAULT 0,UNIQUE(_id,msg_type,tag) ON CONFLICT REPLACE)");
        sQLiteDatabase.execSQL("CREATE TABLE mmssms_tag(_id INTEGER NOT NULL,msg_type TEXT NOT NULL,uri TEXT NOT NULL,tag TEXT NOT NULL,date INTEGER DEFAULT 0,UNIQUE(_id,msg_type,tag) ON CONFLICT REPLACE)");
    }

    /* access modifiers changed from: protected */
    public final void a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        pnz.b("Upgrading mmssms DB from version %d to version %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i < 2) {
            onCreate(sQLiteDatabase);
        } else if (i < 3) {
            onCreate(sQLiteDatabase);
        } else if (i < 4) {
            b(sQLiteDatabase);
        }
    }
}
