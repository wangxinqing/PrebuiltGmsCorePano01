package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.search.administration.AppIndexingErrorInfo;
import com.google.android.gms.search.administration.AppIndexingUserActionInfo;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.Thing;
import java.util.ArrayList;
import java.util.List;

/* renamed from: oxx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oxx {
    private static oxx b;
    public final oxw a;
    private ivk c = null;
    private final Context d;

    public oxx(Context context) {
        this.a = new oxw(context);
        this.d = context;
    }

    public static synchronized oxx a(Context context) {
        oxx oxx;
        synchronized (oxx.class) {
            if (b == null) {
                b = new oxx(context);
            }
            oxx = b;
        }
        return oxx;
    }

    private final synchronized boolean c() {
        if (!d()) {
            return false;
        }
        return this.c.getBoolean("LoggingEnabled", false);
    }

    private final boolean d() {
        if (this.c == null) {
            try {
                this.c = new ivk(this.d, "3pErrorCachePreferences", true);
            } catch (Exception e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 64);
                sb.append("Something went wrong in the initialization of SharedPreferences ");
                sb.append(valueOf);
                oso.b(sb.toString());
            }
            if (this.c == null) {
                return false;
            }
        }
        return true;
    }

    public final boolean b() {
        return ((Boolean) ozx.aw.c()).booleanValue() && c();
    }

    private final void a(String str, String str2) {
        this.a.getWritableDatabase().delete(str2, "[package]=?", new String[]{str});
    }

    private final void a(byte[] bArr, String str, String str2) {
        SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("package", str);
            contentValues.put("data", bArr);
            writableDatabase.insertOrThrow(str2, (String) null, contentValues);
            StringBuilder sb = new StringBuilder(str2.length() + 97);
            sb.append("[package]=? AND [id] NOT IN ( SELECT [id] FROM [");
            sb.append(str2);
            sb.append("] WHERE [");
            sb.append("package");
            sb.append("]=? ORDER BY [");
            sb.append("id");
            sb.append("] DESC LIMIT ");
            sb.append(100);
            sb.append(")");
            writableDatabase.delete(str2, sb.toString(), new String[]{str, str});
            writableDatabase.setTransactionSuccessful();
        } finally {
            writableDatabase.endTransaction();
        }
    }

    public final List a(String str, String str2, Parcelable.Creator creator) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        StringBuilder sb = new StringBuilder(str2.length() + 58);
        sb.append("SELECT [data] FROM [");
        sb.append(str2);
        sb.append("] WHERE [package]=? ORDER BY [id] DESC");
        Cursor rawQuery = this.a.getReadableDatabase().rawQuery(sb.toString(), new String[]{str});
        try {
            int columnIndex = rawQuery.getColumnIndex("data");
            while (rawQuery.moveToNext()) {
                byte[] blob = rawQuery.getBlob(columnIndex);
                i += blob.length;
                if (i > 524288) {
                    break;
                }
                try {
                    arrayList.add((AbstractSafeParcelable) ivy.a(blob, creator));
                } catch (Throwable th) {
                }
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return arrayList;
        } catch (Throwable th2) {
            apev.a(th, th2);
        }
        throw th;
    }

    public final void a(String str) {
        if (((Boolean) ozx.av.c()).booleanValue()) {
            a(str, "errors");
        }
        if (((Boolean) ozx.ay.c()).booleanValue()) {
            a(str, "user_actions");
        }
    }

    public final void a(String str, int i) {
        SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        StringBuilder sb = new StringBuilder(49);
        sb.append("[timestamp]<=(strftime('%s','now') - ");
        sb.append(i);
        sb.append(")");
        writableDatabase.delete(str, sb.toString(), (String[]) null);
    }

    public final void a(String str, aolv aolv, aolx aolx, String str2, Thing thing, ActionImpl actionImpl) {
        if (a()) {
            AppIndexingErrorInfo appIndexingErrorInfo = new AppIndexingErrorInfo();
            appIndexingErrorInfo.a = str;
            appIndexingErrorInfo.b = aolv.a();
            appIndexingErrorInfo.c = aolx.a();
            appIndexingErrorInfo.d = str2;
            appIndexingErrorInfo.e = System.currentTimeMillis();
            appIndexingErrorInfo.f = thing;
            appIndexingErrorInfo.g = actionImpl;
            a(ivy.a(appIndexingErrorInfo), str, "errors");
        }
    }

    public final void a(String str, ActionImpl actionImpl) {
        if (b()) {
            AppIndexingUserActionInfo appIndexingUserActionInfo = new AppIndexingUserActionInfo();
            appIndexingUserActionInfo.a = str;
            appIndexingUserActionInfo.b = System.currentTimeMillis();
            appIndexingUserActionInfo.c = actionImpl;
            a(ivy.a(appIndexingUserActionInfo), str, "user_actions");
        }
    }

    public final synchronized void a(boolean z) {
        if (((Boolean) ozx.at.c()).booleanValue() && d()) {
            SharedPreferences.Editor edit = this.c.edit();
            edit.putBoolean("LoggingEnabled", z);
            edit.apply();
        }
    }

    public final boolean a() {
        return ((Boolean) ozx.at.c()).booleanValue() && c();
    }
}
