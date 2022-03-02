package defpackage;

import android.content.Context;

/* renamed from: cgd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cgd {
    public final cgs a;

    public cgd(cgs cgs) {
        this.a = cgs;
    }

    public static ahmu a(Context context, cgr cgr) {
        String valueOf = String.valueOf(cgr.e);
        return new ahmu(cgv.values(), ajrd.a(context, valueOf.length() == 0 ? new String("indooroutdoor/") : "indooroutdoor/".concat(valueOf), cgr.d, -1), cgr.d);
    }
}
