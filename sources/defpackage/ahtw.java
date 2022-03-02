package defpackage;

import android.os.SystemClock;

/* renamed from: ahtw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahtw extends ahum {
    private final boolean a;
    private long b;
    private aqek c;
    private aqek d;

    public ahtw(ahss ahss, ajrh ajrh) {
        this(ahss, ajrh, true);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.d = this.c;
        ahss ahss = this.h;
        if (ahss != null) {
            ahss.a(this.d);
            this.h.d();
        }
        this.c = null;
    }

    public ahtw(ahss ahss, ajrh ajrh, boolean z) {
        super(ahss, ajrh, new ahuz(false));
        this.b = -1;
        this.c = null;
        this.d = null;
        this.a = z;
    }

    /* access modifiers changed from: protected */
    public final boolean a(aqek aqek, aqek aqek2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.b == -1) {
            this.b = elapsedRealtime;
        }
        if (this.h != null) {
            aqek.b(6, (Object) aqek2);
            this.h.a(aqek2.b(3), aqek);
        }
        if (!this.a || elapsedRealtime - this.b > 300000) {
            this.c = null;
            return true;
        }
        if (this.c == null) {
            this.c = ahvx.a(aqek);
            aqek a2 = ahvx.a(aqek2);
            a2.g(3, 0);
            this.c.b(6, (Object) a2);
            return true;
        }
        int j = aqek.j(4);
        for (int i = 0; i < j; i++) {
            this.c.a(4, (Object) aqek.f(4, i));
        }
        return true;
    }
}
