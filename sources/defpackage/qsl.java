package defpackage;

import android.database.Cursor;

/* renamed from: qsl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qsl extends qsg {
    public qsl(Cursor cursor) {
        this.a = cursor;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ qsv c() {
        Cursor cursor = this.a;
        long j = cursor.getLong(cursor.getColumnIndex("_id"));
        Cursor cursor2 = this.a;
        qsu qsu = new qsu(Long.valueOf(j), Long.valueOf(cursor2.getLong(cursor2.getColumnIndex("date_modified"))));
        int columnIndex = this.a.getColumnIndex("media_type");
        if (columnIndex != -1) {
            qsu.h = Integer.valueOf(this.a.getInt(columnIndex));
        }
        return qsu;
    }
}
