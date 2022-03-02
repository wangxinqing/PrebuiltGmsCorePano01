package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;

/* renamed from: yhz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yhz extends ygu {
    private final ygj a;
    private final String b;
    private final yia c;

    public yhz(ygj ygj, String str, byte[] bArr, String str2) {
        super("SetAppSpecificPropertiesOperationCall", avtj.SET_APP_SPECIFIC_PROPERTIES);
        iva.a((Object) ygj);
        this.a = ygj;
        this.b = str;
        this.c = new yia(str, bArr, str2);
    }

    public final avst a() {
        yia yia = this.c;
        avss avss = (avss) avst.m.o();
        String str = yia.a;
        int i = 0;
        if (avss.c) {
            avss.c();
            avss.c = false;
        }
        avst avst = (avst) avss.b;
        str.getClass();
        int i2 = avst.a | 1;
        avst.a = i2;
        avst.b = str;
        if (yia.d == 1) {
            i = 16;
        }
        avst.a = i2 | 64;
        avst.j = i;
        return (avst) avss.i();
    }

    public final void b(Context context) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    public final void b(Context context, yfw yfw) {
        Cursor query;
        yia yia = this.c;
        SQLiteDatabase writableDatabase = yfw.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            yia.a = ygb.a(yia.a, yia.b);
            query = writableDatabase.query("Packages", new String[]{"dynamicParams"}, "packageName = ? AND androidPackageName = ?", new String[]{yia.a, yia.b}, (String) null, (String) null, (String) null);
            if (query.moveToFirst()) {
                if (!Arrays.equals(yia.c, query.getBlob(0))) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("dynamicParams", yia.c);
                    if (writableDatabase.updateWithOnConflict("Packages", contentValues, "packageName = ?", new String[]{yia.a}, 5) >= 0) {
                        writableDatabase.setTransactionSuccessful();
                        yia.d = 1;
                    } else {
                        throw new SQLiteException(String.valueOf(yia.a).concat(" failed to update dynamic params."));
                    }
                } else {
                    yia.d = 2;
                }
                if (query != null) {
                    query.close();
                }
                writableDatabase.endTransaction();
                if (yia.d == 1 && yhs.a(this.b, 17)) {
                    yij.a(context, 17, this.b);
                }
                this.a.c(Status.a);
                return;
            }
            throw new yfy(29503);
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
        throw th;
    }

    public final void a(Status status) {
        this.a.c(status);
    }
}
