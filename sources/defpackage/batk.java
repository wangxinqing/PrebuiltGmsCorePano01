package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: batk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class batk extends bauc {
    public bauc a;

    public batk(bauc bauc) {
        if (bauc != null) {
            this.a = bauc;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final bauc a(long j, TimeUnit timeUnit) {
        return this.a.a(j, timeUnit);
    }

    public final bauc b(long j) {
        return this.a.b(j);
    }

    public final void e() {
        this.a.e();
    }

    public final boolean f() {
        return this.a.f();
    }

    public final long g() {
        return this.a.g();
    }

    public final bauc h() {
        return this.a.h();
    }

    public final bauc i() {
        return this.a.i();
    }
}
