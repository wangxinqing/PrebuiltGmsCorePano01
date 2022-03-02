package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: cox  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cox implements cpb {
    private final cpe a;
    private final cmm b;

    public cox(cpe cpe, cmm cmm) {
        this.a = cpe;
        this.b = cmm;
    }

    public final Object a(Object obj) {
        cpe cpe = this.a;
        Long a2 = cpe.a((SQLiteDatabase) obj, this.b);
        if (a2 == null) {
            return false;
        }
        return (Boolean) cpe.a(cpe.c().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{a2.toString()}), cos.a);
    }
}
