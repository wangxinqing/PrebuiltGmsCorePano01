package defpackage;

import android.database.Cursor;

/* renamed from: qsi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qsi extends qsg {
    public qsi(Cursor cursor) {
        this.a = cursor;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ qsv c() {
        qso qso = new qso();
        Cursor cursor = this.a;
        qso.b = Long.valueOf(cursor.getLong(cursor.getColumnIndex("_id")));
        Cursor cursor2 = this.a;
        qso.a = cursor2.getString(cursor2.getColumnIndex("artist"));
        return new qsp(qso);
    }
}
