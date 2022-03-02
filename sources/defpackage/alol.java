package defpackage;

import java.util.Random;

/* renamed from: alol  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alol extends alop {
    private final long a = Math.abs(new Random().nextLong());

    public alol(alrt alrt) {
        super(alrt);
    }

    public final synchronized alrr a(amiw amiw) {
        alrr alrr;
        alrr = new alrr(this.a, amiw, System.currentTimeMillis());
        this.c.add(alrr);
        return alrr;
    }

    public final void a() {
        throw null;
    }

    public final synchronized alse b() {
        return alse.a;
    }

    public final synchronized boolean c() {
        return false;
    }
}
