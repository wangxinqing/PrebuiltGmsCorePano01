package defpackage;

import android.database.Cursor;

/* renamed from: kpj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kpj implements kkp {
    public static final kpj a = new kpj();

    private kpj() {
    }

    public final /* bridge */ /* synthetic */ Object a(kqg kqg, Cursor cursor) {
        knc knc;
        int i = kpk.f;
        Long b = kpm.ENTRY_ID.i.b(cursor);
        int intValue = kpm.EVENT_TYPE.i.b(cursor).intValue();
        if (b != null) {
            knc = knc.a(b.longValue());
        } else {
            knc = null;
        }
        long longValue = kpm.LAST_UPDATE_TIME.i.b(cursor).longValue();
        return new kpk(kqg, kpn.a.a.b(cursor).longValue(), knc, kpm.SERIALIZED_SUBSCRIPTION_DETAILS.i.a(cursor), kpm.ANDROID_APP_ID.i.b(cursor).longValue(), intValue, longValue);
    }
}
