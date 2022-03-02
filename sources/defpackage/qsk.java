package defpackage;

import android.database.Cursor;

/* renamed from: qsk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qsk extends qsg {
    public qsk(Cursor cursor) {
        this.a = cursor;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ qsv c() {
        qss qss = new qss();
        Cursor cursor = this.a;
        qss.b = Long.valueOf(cursor.getLong(cursor.getColumnIndex("_id")));
        Cursor cursor2 = this.a;
        qss.a = cursor2.getString(cursor2.getColumnIndex("name"));
        return new qst(qss);
    }
}
