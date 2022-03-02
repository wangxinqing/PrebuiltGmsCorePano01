package defpackage;

import android.hardware.SensorEvent;
import android.os.Looper;

/* renamed from: ahuo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class ahuo {
    private volatile boolean a = false;
    private volatile boolean b = false;
    private volatile ahun c;
    protected final ajrh g;
    public final ahsr h;
    protected final ahss i;
    protected final ahyt j;
    protected volatile ahrh k;

    public ahuo(ahsr ahsr, ahss ahss, ajrh ajrh) {
        boolean z = false;
        amrl.a((Object) ahsr, (Object) "No Handler specified!");
        this.h = ahsr;
        this.g = ahvx.a(ajrh);
        this.j = new ahyt(getClass().getSimpleName());
        Looper looper = ahsr.getLooper();
        if (looper != null) {
            amrl.a(this.j.a == looper.getThread() ? true : z, (Object) "Scanner should be called in handler's thread.");
        }
        this.i = ahss;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: package-private */
    public final synchronized void a(ahrh ahrh, ahun ahun) {
        this.j.a();
        amrl.a(!this.a, (Object) "Start should be called only once!");
        this.k = ahrh;
        if (ahrh != null) {
            ahrh.a();
        }
        this.c = ahun;
        a();
        this.a = true;
        new Object[1][0] = getClass().getSimpleName();
    }

    /* access modifiers changed from: protected */
    public abstract void b();

    /* access modifiers changed from: package-private */
    public final synchronized void h() {
        amrl.a(this.a, (Object) "Call start before calling stop!");
        if (!this.b) {
            this.b = true;
            if (this.k != null) {
                this.k.b();
            }
            b();
            new Object[1][0] = getClass().getSimpleName();
            return;
        }
        new Object[1][0] = getClass().getSimpleName();
    }

    /* access modifiers changed from: protected */
    public final synchronized boolean i() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(ahun ahun) {
        a((ahrh) null, ahun);
    }

    /* access modifiers changed from: protected */
    public final void a(ahup ahup, long j2, SensorEvent sensorEvent) {
        if (this.c != null) {
            ahsu ahsu = (ahsu) this.c;
            if (ahsu.k != null) {
                ahsu.k.a(ahup, j2, sensorEvent);
            }
        }
    }
}
