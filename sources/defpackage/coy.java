package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: coy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class coy implements cpb {
    private final long a;
    private final cmm b;

    public coy(long j, cmm cmm) {
        this.a = j;
        this.b = cmm;
    }

    public final Object a(Object obj) {
        long j = this.a;
        cmm cmm = this.b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        cme cme = (cme) cmm;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{cme.a, String.valueOf(cpu.a(cme.c))}) <= 0) {
            contentValues.put("backend_name", cme.a);
            contentValues.put("priority", Integer.valueOf(cpu.a(cme.c)));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }
}
