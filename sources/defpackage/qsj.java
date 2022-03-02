package defpackage;

import android.database.Cursor;

/* renamed from: qsj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qsj extends qsg {
    public qsj(Cursor cursor) {
        this.a = cursor;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ qsv c() {
        qsq qsq = new qsq();
        Cursor cursor = this.a;
        qsq.a = Long.valueOf(cursor.getLong(cursor.getColumnIndex("_id")));
        Cursor cursor2 = this.a;
        qsq.b = Long.valueOf(cursor2.getLong(cursor2.getColumnIndex("date_modified")));
        Cursor cursor3 = this.a;
        qsq.c = cursor3.getString(cursor3.getColumnIndex("title"));
        Cursor cursor4 = this.a;
        qsq.d = cursor4.getString(cursor4.getColumnIndex("album"));
        Cursor cursor5 = this.a;
        qsq.e = Long.valueOf(cursor5.getLong(cursor5.getColumnIndex("album_id")));
        Cursor cursor6 = this.a;
        qsq.f = cursor6.getString(cursor6.getColumnIndex("artist"));
        Cursor cursor7 = this.a;
        qsq.g = Long.valueOf(cursor7.getLong(cursor7.getColumnIndex("artist_id")));
        return new qsr(qsq);
    }
}
