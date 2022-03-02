package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aqby  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqby extends azyl {
    private final AtomicReference b = new AtomicReference(aqbx.a(1));

    public aqby(azxl azxl) {
        super(azxl);
    }

    public final void a(int i) {
        int i2 = ((aqbx) this.b.get()).b;
        if (i2 == 1 || i2 == 4) {
            throw new IllegalStateException("Not started");
        }
        amrl.a(true, (Object) "Number requested must be non-negative");
        this.a.a(i);
    }

    public final void b() {
        aqbx aqbx;
        do {
            aqbx = (aqbx) this.b.get();
            if (aqbx.b == 2) {
            } else {
                throw new IllegalStateException("Call was either not started or already half-closed.");
            }
        } while (!this.b.compareAndSet(aqbx, aqbx.a(3)));
        this.a.b();
    }

    public final void a(azxk azxk, baaf baaf) {
        aqbx aqbx;
        aqbx aqbx2;
        do {
            aqbx = (aqbx) this.b.get();
            if (aqbx.b == 1) {
                aqbx2 = aqbx.a(2);
            } else {
                aqbx2 = aqbx;
            }
        } while (!this.b.compareAndSet(aqbx, aqbx2));
        int i = aqbx.b;
        if (i == 1) {
            this.a.a(azxk, baaf);
        } else if (i == 4) {
            azxk.a(aqbx.a, new baaf());
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Already started");
            this.a.a("start() called more than once", (Throwable) illegalStateException);
            throw illegalStateException;
        }
    }

    public final void a(Object obj) {
        amrl.a(obj, (Object) "Message must be non-null");
        int i = ((aqbx) this.b.get()).b;
        if (i == 2) {
            this.a.a(obj);
        } else if (i != 5) {
            throw new IllegalStateException("Call was either not started or already half-closed.");
        }
    }

    public final void a(String str, Throwable th) {
        aqbx aqbx;
        aqbx aqbx2;
        babj babj = babj.c;
        if (str != null) {
            babj = babj.a(str);
        }
        if (th != null) {
            babj = babj.b(th);
        }
        do {
            aqbx = (aqbx) this.b.get();
            int i = aqbx.b;
            if (i != 4) {
                aqbx2 = i != 1 ? aqbx.a(5, babj) : aqbx.a(4, babj);
            } else {
                aqbx2 = aqbx;
            }
        } while (!this.b.compareAndSet(aqbx, aqbx2));
        this.a.a(str, th);
    }
}
