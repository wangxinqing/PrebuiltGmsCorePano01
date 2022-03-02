package defpackage;

import android.database.Cursor;

/* renamed from: kkt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kkt implements kkp {
    public static final kkt a = new kkt();

    private kkt() {
    }

    public final /* bridge */ /* synthetic */ Object a(kqg kqg, Cursor cursor) {
        int i = kor.d;
        String a2 = kot.CONTENT_HASH.k.a(cursor);
        String a3 = kot.BASE_CONTENT_HASH.k.a(cursor);
        Long b = kot.ACTION_ID.k.b(cursor);
        long longValue = kot.ENTRY_ID.k.b(cursor).longValue();
        String a4 = kot.UPLOAD_URI.k.a(cursor);
        return new kor(kqg, kou.a.a.b(cursor).longValue(), a2, a3, b, knc.a(longValue), a4);
    }
}
