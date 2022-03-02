package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;

/* renamed from: jjj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class jjj extends SQLiteOpenHelper {
    private final String a;
    private boolean b;

    public jjj(Context context, String str, String str2, int i) {
        this(context, str, str2, i, true);
    }

    public static void a(SQLiteOpenHelper sQLiteOpenHelper) {
        if (jkr.f()) {
            Long valueOf = Long.valueOf(axbh.a.a().b());
            if (valueOf.longValue() > 0) {
                String databaseName = sQLiteOpenHelper.getDatabaseName();
                String a2 = axbh.a.a().a();
                if (TextUtils.isEmpty(a2) || !ish.a(a2, databaseName)) {
                    sQLiteOpenHelper.setIdleConnectionTimeout(valueOf.longValue());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(SQLiteDatabase sQLiteDatabase);

    /* access modifiers changed from: protected */
    public void b(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String str;
        if (axda.a.a().q()) {
            String str2 = this.a;
            if (str2 != null) {
                StringBuilder sb = new StringBuilder(str2.length() + 29);
                sb.append(str2);
                sb.append("_GmsSQLiteOpenHelper_onCreate");
                str = sb.toString();
            } else {
                str = "GmsSQLiteOpenHelper_onCreate";
            }
            amkr a2 = amlv.a(str, amlw.a);
            try {
                a(sQLiteDatabase);
                if (a2 != null) {
                    a2.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                apev.a(th, th);
            }
        } else {
            a(sQLiteDatabase);
            return;
        }
        throw th;
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (this.b) {
            jit.a(sQLiteDatabase);
            onCreate(sQLiteDatabase);
            return;
        }
        super.onDowngrade(sQLiteDatabase, i, i2);
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        String str;
        if (axda.a.a().r()) {
            String str2 = this.a;
            if (str2 != null) {
                StringBuilder sb = new StringBuilder(str2.length() + 27);
                sb.append(str2);
                sb.append("_GmsSQLiteOpenHelper_onOpen");
                str = sb.toString();
            } else {
                str = "GmsSQLiteOpenHelper_onOpen";
            }
            amkr a2 = amlv.a(str, amlw.a);
            try {
                b(sQLiteDatabase);
                if (a2 != null) {
                    a2.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                apev.a(th, th);
            }
        } else {
            b(sQLiteDatabase);
            return;
        }
        throw th;
    }

    public jjj(Context context, String str, String str2, int i, boolean z) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.b = true;
        this.a = str2;
        if (z) {
            a((SQLiteOpenHelper) this);
        }
    }

    public jjj(Context context, String str, String str2, DatabaseErrorHandler databaseErrorHandler) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 2, databaseErrorHandler);
        this.b = true;
        this.a = str2;
        a((SQLiteOpenHelper) this);
    }
}
