package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: pnu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pnu extends pnv {
    private final int c = this.a.getColumnIndex("email");

    public pnu(SQLiteDatabase sQLiteDatabase, String str) {
        super(sQLiteDatabase, str, "emails", pmo.a);
    }

    /* access modifiers changed from: protected */
    public final ContentValues a(long j, long j2, int i, String str, int i2) {
        return pmw.a(j, j2, this.a.getString(this.c), i, str, i2);
    }
}
