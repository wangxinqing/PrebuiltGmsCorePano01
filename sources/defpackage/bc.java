package defpackage;

import android.os.Handler;

/* renamed from: bc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bc implements aj {
    public static final bc g = new bc();
    public int a = 0;
    public int b = 0;
    public boolean c = true;
    public Handler d;
    public final al e = new al(this);
    public final Runnable f = new ay(this);
    final az h = new az(this);
    private boolean i = true;

    private bc() {
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        int i2 = this.a + 1;
        this.a = i2;
        if (i2 == 1 && this.i) {
            this.e.a(ac.ON_START);
            this.i = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        int i2 = this.b + 1;
        this.b = i2;
        if (i2 != 1) {
            return;
        }
        if (this.c) {
            this.e.a(ac.ON_RESUME);
            this.c = false;
            return;
        }
        this.d.removeCallbacks(this.f);
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (this.a == 0 && this.c) {
            this.e.a(ac.ON_STOP);
            this.i = true;
        }
    }

    public final ae getLifecycle() {
        return this.e;
    }
}
