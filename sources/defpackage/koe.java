package defpackage;

import android.database.Cursor;

/* renamed from: koe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class koe implements kkp {
    public final /* bridge */ /* synthetic */ Object a(kqg kqg, Cursor cursor) {
        knc knc;
        Cursor cursor2 = cursor;
        int i = kof.h;
        long c = koh.ACCOUNT_ID.h.c(cursor2);
        String a = koh.PAYLOAD.h.a(cursor2);
        int c2 = (int) koh.ATTEMPT_COUNT.h.c(cursor2);
        Long b = koh.REQUIRED_ENTRY_ID.h.b(cursor2);
        if (b != null) {
            knc = knc.a(b.longValue());
        } else {
            knc = null;
        }
        return new kof(kqg, koi.a.a.b(cursor2).longValue(), c, a, knc, c2, koh.APPLY_LOCALLY_TIMESTAMP.h.c(cursor2), koh.IS_PAUSED.h.e(cursor2), koh.TRANSFER_PREFERENCES_OVERRIDE.h.a(cursor2));
    }
}
