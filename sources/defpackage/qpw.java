package defpackage;

import android.database.Cursor;

/* renamed from: qpw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qpw {
    public static void a(Cursor cursor, int i, int i2, qry qry) {
        while (!cursor.isAfterLast()) {
            qry.a(new qro(Long.valueOf(cursor.getLong(i)), Integer.valueOf(cursor.getInt(i2))));
            cursor.moveToNext();
        }
    }
}
