package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: pnw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pnw extends pnv {
    private final int c = this.a.getColumnIndex("phone");

    public pnw(SQLiteDatabase sQLiteDatabase, String str) {
        super(sQLiteDatabase, str, "phones", pmp.a);
    }

    /* access modifiers changed from: protected */
    public final ContentValues a(long j, long j2, int i, String str, int i2) {
        return pmw.b(j, j2, this.a.getString(this.c), i, str, i2);
    }
}
