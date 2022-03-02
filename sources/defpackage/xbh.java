package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: xbh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xbh implements wlc {
    private final Status a;
    private final xfk b;

    public xbh(Status status, xfk xfk) {
        this.a = status;
        this.b = xfk;
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
}
