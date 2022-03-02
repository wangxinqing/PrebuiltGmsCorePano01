package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: aiys  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiys implements aiyy {
    public final ReentrantLock a;
    public final Condition b;
    public Boolean c = null;
    public List d = Collections.emptyList();
    private final aiyz e;

    public aiys(aiyz aiyz) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.a = reentrantLock;
        this.b = reentrantLock.newCondition();
        this.e = aiyz;
        aiyz.e = this;
    }

    public final boolean a() {
        this.a.lock();
        try {
            b();
            return this.c.booleanValue();
        } finally {
            this.a.unlock();
        }
    }

    public final void b() {
        if (this.c == null) {
            try {
                if (c()) {
                    long nanos = TimeUnit.SECONDS.toNanos(1);
                    while (this.c == null && nanos > 0) {
                        nanos = this.b.awaitNanos(nanos);
                    }
                }
                if (this.c != null) {
                    return;
                }
            } catch (InterruptedException e2) {
                String valueOf = String.valueOf(e2.getMessage());
                if (valueOf.length() == 0) {
                    new String("Interrupted while waiting for query response: ");
                } else {
                    "Interrupted while waiting for query response: ".concat(valueOf);
                }
                if (this.c != null) {
                    return;
                }
            } catch (Throwable th) {
                if (this.c == null) {
                    this.c = false;
                    this.d = Collections.emptyList();
                }
                throw th;
            }
            this.c = false;
            this.d = Collections.emptyList();
        }
    }

    public final boolean c() {
        return this.e.a(aiyr.a(arii.QUERY));
    }

    public final void d() {
        this.a.lock();
        try {
            this.c = null;
            this.d = Collections.emptyList();
        } finally {
            this.a.unlock();
        }
    }

    public final int[] e() {
        return ((long) this.e.a()) >= axyr.d() ? ajaj.o : ajaj.n;
    }
}
