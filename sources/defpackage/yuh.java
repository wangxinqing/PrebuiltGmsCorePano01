package defpackage;

import android.content.Context;
import com.google.android.gms.plus.internal.PlusSession;

/* renamed from: yuh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yuh implements yui {
    public final icc a(Context context, int i, String str) {
        ibz ibz = new ibz(context);
        ibz.b = str;
        ibq ibq = wlt.a;
        wlr wlr = new wlr();
        wlr.a = i;
        ibz.a(ibq, (ibj) wlr.a());
        return ibz.b();
    }

    public final yuv a(Context context, PlusSession plusSession, ica ica, icb icb) {
        ibz ibz = new ibz(context);
        ibz.a(plusSession.b);
        ibz.a(plusSession.c);
        return new ywg(context, ibz.a(), plusSession, ica, icb);
    }
}
