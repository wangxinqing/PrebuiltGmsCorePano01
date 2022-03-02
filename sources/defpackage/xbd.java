package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: xbd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xbd implements wla {
    private final Status a;
    private final xfh b;

    public xbd(Status status, xfh xfh) {
        this.a = status;
        this.b = xfh;
    }

    public final Status aO() {
        return this.a;
    }

    public final xfh b() {
        return this.b;
    }

    public final void c() {
        xfh xfh = this.b;
        if (xfh != null) {
            xfh.c();
        }
    }
}
