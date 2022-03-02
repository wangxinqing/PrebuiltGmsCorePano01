package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: xbg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xbg implements wlm {
    private final Status a;
    private final xfk b;
    private final String c;

    public xbg(Status status, xfk xfk, String str) {
        this.a = status;
        this.b = xfk;
        this.c = str;
    }

    public final Status aO() {
        return this.a;
    }

    public final xfk b() {
        return this.b;
    }

    public final void c() {
        xfk xfk = this.b;
        if (xfk != null) {
            xfk.c();
        }
    }

    public final String d() {
        return this.c;
    }
}
