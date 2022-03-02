package defpackage;

import android.database.Cursor;

/* renamed from: kkq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kkq implements kkp {
    private final kmp a;

    public kkq(kmp kmp) {
        this.a = kmp;
    }

    public final /* bridge */ /* synthetic */ Object a(kqg kqg, Cursor cursor) {
        iva.a(this.a.x());
        int i = kmq.c;
        kmq kmq = new kmq(kqg, kmt.a.a.b(cursor).longValue(), kms.ENTRY_ID.c.b(cursor).longValue(), kms.SDK_APP_ID.c.a(cursor));
        iva.a(this.a.h() == kmq.a);
        return kmq;
    }
}
