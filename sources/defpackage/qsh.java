package defpackage;

import android.database.Cursor;

/* renamed from: qsh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qsh extends qsg {
    public qsh(Cursor cursor) {
        this.a = cursor;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ qsv c() {
        qsm qsm = new qsm();
        Cursor cursor = this.a;
        qsm.a = Long.valueOf(cursor.getLong(cursor.getColumnIndex("_id")));
        Cursor cursor2 = this.a;
        qsm.b = cursor2.getString(cursor2.getColumnIndex("album"));
        Cursor cursor3 = this.a;
        qsm.c = cursor3.getString(cursor3.getColumnIndex("album_art"));
        Cursor cursor4 = this.a;
        qsm.d = cursor4.getString(cursor4.getColumnIndex("artist"));
        Cursor cursor5 = this.a;
        qsm.e = Integer.valueOf(cursor5.getInt(cursor5.getColumnIndex("numsongs")));
        return new qsn(qsm);
    }
}
