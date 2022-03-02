package defpackage;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: iso  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iso {
    public final Object a = new Object();
    public HashMap b;
    public HashMap c;
    private final oi d;
    private final long e;
    private final long f;

    public iso(int i, long j, long j2, TimeUnit timeUnit) {
        this.e = TimeUnit.NANOSECONDS.convert(j, timeUnit);
        this.f = TimeUnit.NANOSECONDS.convert(j2, timeUnit);
        boolean z = true;
        if (!b() && !c()) {
            z = false;
        }
        iva.b(z, "ExpirableLruCache has both access and write expiration negative");
        this.d = new isn(this, i);
        if (b()) {
            this.b = new HashMap();
        }
        if (c()) {
            this.c = new HashMap();
        }
    }

    public final Object a(Object obj) {
        Object a2;
        synchronized (this.a) {
            long nanoTime = System.nanoTime();
            if (!b() || !this.b.containsKey(obj) || nanoTime - ((Long) this.b.get(obj)).longValue() <= this.e) {
                if (c() && this.c.containsKey(obj)) {
                    if (nanoTime - ((Long) this.c.get(obj)).longValue() <= this.f) {
                    }
                }
                a2 = this.d.a(obj);
                if (a2 != null && this.e > 0) {
                    this.b.put(obj, Long.valueOf(System.nanoTime()));
                }
            }
            this.d.b(obj);
            a2 = this.d.a(obj);
            this.b.put(obj, Long.valueOf(System.nanoTime()));
        }
        return a2;
    }

    public final boolean b() {
        return this.e >= 0;
    }

    public final boolean c() {
        return this.f >= 0;
    }

    public final void a() {
        this.d.a();
    }

    public final void a(Object obj, Object obj2) {
        if (c()) {
            long nanoTime = System.nanoTime();
            synchronized (this.a) {
                this.c.put(obj, Long.valueOf(nanoTime));
            }
        }
        this.d.a(obj, obj2);
    }
}
