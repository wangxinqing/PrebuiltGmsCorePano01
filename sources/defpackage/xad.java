package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: xad  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xad implements wky {
    private final Status a;
    private final xfe b;

    public xad(Status status, xfe xfe) {
        this.a = status;
        this.b = xfe;
    }

    public final Status aO() {
        return this.a;
    }

    public final xfe b() {
        return this.b;
    }

    public final void c() {
        xfe xfe = this.b;
        if (xfe != null) {
            xfe.c();
        }
    }
}
