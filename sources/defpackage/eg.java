package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: eg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class eg {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final eb b;
    private volatile C0000do c;

    public eg(eb ebVar) {
        this.b = ebVar;
    }

    private final C0000do c() {
        return this.b.a(a());
    }

    /* access modifiers changed from: protected */
    public abstract String a();

    public final void a(C0000do doVar) {
        if (doVar == this.c) {
            this.a.set(false);
        }
    }

    public final C0000do b() {
        eb.j();
        if (!this.a.compareAndSet(false, true)) {
            return c();
        }
        if (this.c == null) {
            this.c = c();
        }
        return this.c;
    }
}
