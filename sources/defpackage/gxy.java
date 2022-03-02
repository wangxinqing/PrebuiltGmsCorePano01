package defpackage;

/* renamed from: gxy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gxy {
    private final gxz a;
    private gxx b = null;
    private Boolean c = null;
    private long d = System.currentTimeMillis();

    public gxy(gxz gxz) {
        this.a = gxz;
        gxz.a(this);
        this.d = System.currentTimeMillis();
    }

    public final synchronized void a() {
        this.d = 0;
    }

    public final synchronized void a(gxx gxx) {
        Boolean bool = this.c;
        if (bool != null) {
            gxx.a(bool.booleanValue());
        } else {
            this.b = gxx;
        }
    }

    public final synchronized void a(boolean z, long j) {
        if (j >= this.d) {
            this.c = Boolean.valueOf(z);
            this.a.b(this);
            gxx gxx = this.b;
            if (gxx != null) {
                gxx.a(z);
            }
        }
    }
}
