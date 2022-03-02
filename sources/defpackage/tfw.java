package defpackage;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: tfw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tfw {
    private final Set a;
    private final AtomicBoolean b;

    public tfw() {
        this(false);
    }

    public final void a() {
        ob<tfv> obVar;
        if (!this.b.getAndSet(true)) {
            synchronized (this) {
                obVar = new ob((Collection) this.a);
            }
            for (tfv a2 : obVar) {
                a2.a();
            }
        }
    }

    public final synchronized void b(tfv tfv) {
        this.a.remove(tfv);
    }

    public final synchronized AtomicBoolean c() {
        return this.b;
    }

    public tfw(boolean z) {
        this.a = new ob();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        this.b = atomicBoolean;
        atomicBoolean.set(z);
    }

    public final synchronized boolean b() {
        return this.b.get();
    }

    public final synchronized void a(tfv tfv) {
        this.a.add(tfv);
    }
}
