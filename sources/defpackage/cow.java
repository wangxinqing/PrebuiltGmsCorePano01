package defpackage;

import android.database.Cursor;

/* renamed from: cow  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cow implements cpb {
    static final cpb a = new cow();

    private cow() {
    }

    public final Object a(Object obj) {
        Cursor cursor = (Cursor) obj;
        clo clo = cpe.a;
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }
}
