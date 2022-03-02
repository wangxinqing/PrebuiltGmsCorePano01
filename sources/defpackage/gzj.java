package defpackage;

import android.content.Context;

/* renamed from: gzj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gzj {
    private final hol a;

    public gzj(hol hol) {
        this.a = hol;
    }

    public static gzj a(Context context) {
        return new gzj(new hol(context, "ANDROID_CHECKIN_METRICS_LOG", (String) null));
    }

    public final void a(gzg gzg) {
        this.a.a((audx) gzg).b();
    }
}
