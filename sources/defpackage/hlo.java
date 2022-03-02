package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: hlo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hlo {
    private final hkx a = ((hkx) hkx.i.b());
    private final hls b = ((hls) hls.e.b());

    private hlo() {
    }

    public static hlo a() {
        return new hlo();
    }

    public final void a(pyv pyv) {
        anhj a2 = hln.a.iterator();
        while (a2.hasNext()) {
            a(pyv, ((Integer) a2.next()).intValue());
        }
    }

    public final void a(pyv pyv, int i) {
        this.a.a(pyv, hkx.c(i));
        this.a.a(pyv, hkx.a(i));
        this.a.a(pyv, hkx.b(i));
        hls hls = this.b;
        SQLiteDatabase a2 = hls.g.a();
        a2.beginTransaction();
        try {
            hls.g.a().delete("sync_entities", hls.b, new String[]{pyv.d, String.valueOf(i)});
            a2.setTransactionSuccessful();
        } finally {
            a2.endTransaction();
        }
    }
}
