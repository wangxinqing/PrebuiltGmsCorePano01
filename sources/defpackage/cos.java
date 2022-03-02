package defpackage;

import android.database.Cursor;

/* renamed from: cos  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cos implements cpb {
    static final cpb a = new cos();

    private cos() {
    }

    public final Object a(Object obj) {
        return Boolean.valueOf(((Cursor) obj).moveToNext());
    }
}
