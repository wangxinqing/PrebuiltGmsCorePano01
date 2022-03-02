package defpackage;

import android.database.Cursor;

/* renamed from: kkv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kkv implements kkp {
    public static final kkv a = new kkv();

    private kkv() {
    }

    public final /* bridge */ /* synthetic */ Object a(kqg kqg, Cursor cursor) {
        int i = kpu.c;
        String a2 = kpw.CONTENT_HASH.d.a(cursor);
        long longValue = kpw.ENTRY_ID.d.b(cursor).longValue();
        long longValue2 = kpw.VERSION.d.b(cursor).longValue();
        return new kpu(kqg, kpx.a.a.b(cursor).longValue(), a2, knc.a(longValue), longValue2);
    }
}
