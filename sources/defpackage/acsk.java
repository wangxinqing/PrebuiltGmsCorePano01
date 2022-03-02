package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Message;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

/* renamed from: acsk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acsk extends jfo {
    final /* synthetic */ acsl a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public acsk(acsl acsl, jfp jfp) {
        super(jfp);
        this.a = acsl;
    }

    public final void handleMessage(Message message) {
        boolean z;
        boolean z2;
        Cursor query;
        int i = message.what;
        int i2 = acso.b;
        int i3 = -1;
        if (azpj.b()) {
            try {
                query = acsm.a((Context) ihs.b()).getReadableDatabase().query("eastworld_stats", new String[]{"mtv_day"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
                if (query.moveToFirst()) {
                    int i4 = query.getInt(query.getColumnIndexOrThrow("mtv_day"));
                    if (query != null) {
                        query.close();
                    }
                    i3 = i4;
                } else if (query != null) {
                    query.close();
                }
            } catch (SQLiteException e) {
            } catch (Throwable th) {
                apev.a(th, th);
            }
        } else {
            i3 = acso.a.getInt(":mtvDayOfYear", -1);
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        int i5 = instance.get(6);
        if (i5 == i3) {
            z = false;
        } else if (azpj.b()) {
            acsm a2 = acsm.a((Context) ihs.b());
            ContentValues contentValues = new ContentValues();
            contentValues.put("mtv_day", Integer.valueOf(i5));
            try {
                a2.getWritableDatabase().update("eastworld_stats", contentValues, (String) null, (String[]) null);
                z = true;
            } catch (SQLiteException e2) {
                z = true;
            }
        } else {
            SharedPreferences.Editor edit = acso.a.edit();
            edit.putInt(":mtvDayOfYear", i5);
            edit.apply();
            z = true;
        }
        if (i == 1) {
            z2 = acso.a();
        } else {
            z2 = false;
        }
        acsl acsl = this.a;
        int i6 = acsl.e;
        aucd a3 = acso.a(z, z2, i, acsl.d);
        List list = this.a.a;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((acsr) list.get(i7)).a(i, z, z2, a3);
        }
        acso.a((avvf) a3.i());
        return;
        throw th;
    }
}
