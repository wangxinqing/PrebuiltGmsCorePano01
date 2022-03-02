package defpackage;

import android.os.ConditionVariable;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ppr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ppr implements pqa {
    private final AtomicInteger a;
    public final aonk g;
    public final int h;
    public final int i;
    public final String j;
    protected final psc k;
    public final ConditionVariable l;
    public volatile Object m;

    public ppr(aonk aonk) {
        this(aonk, (String) null);
    }

    public static void a(int i2) {
        boolean z;
        if (i2 == 1 || i2 == 2) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "Invalid scheduling: %d", Integer.valueOf(i2));
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    /* access modifiers changed from: protected */
    public void b(Object obj) {
    }

    public final String d() {
        String name = this.g.name();
        if (name != null) {
            return name;
        }
        oso.b("Unknown task name enum: %d", (Object) Integer.valueOf(this.g.a()));
        return aonk.UNKNOWN.name();
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        a(3, 4);
    }

    /* access modifiers changed from: protected */
    public String f() {
        return d();
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            int i2 = this.a.get();
            if (!(i2 == 0 || i2 == 4)) {
                oso.e("Incomplete task %s with state %d.", this, Integer.valueOf(i2));
            }
        } finally {
            super.finalize();
        }
    }

    public final boolean g() {
        return axrm.b() && this.k != null;
    }

    public final Object h() {
        this.l.block();
        return this.m;
    }

    public final String toString() {
        return String.format(Locale.US, "%s(name=%s,scheduling=%d)", new Object[]{super.toString(), d(), Integer.valueOf(this.h)});
    }

    public ppr(aonk aonk, int i2) {
        this(aonk, i2, 3, (String) null, (psc) null);
    }

    public ppr(aonk aonk, int i2, int i3, String str, psc psc) {
        int i4;
        this.l = new ConditionVariable();
        this.a = new AtomicInteger(0);
        a(i2);
        if (i3 != 3) {
            i4 = 4;
        } else {
            i4 = i3;
        }
        iva.b(true, "Invalid waking: %d", Integer.valueOf(i4));
        this.g = aonk;
        this.h = i2;
        this.i = i3;
        this.k = psc;
        this.j = str == null ? "com.google.android.gms" : str;
    }

    /* access modifiers changed from: protected */
    public Object a() {
        b();
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3) {
        if (!this.a.compareAndSet(i2, i3)) {
            throw new IllegalStateException(String.format(Locale.US, "Invalid task state for %s. Expected %d, was %d.", new Object[]{this, Integer.valueOf(i2), Integer.valueOf(this.a.get())}));
        }
    }

    public ppr(aonk aonk, int i2, String str) {
        this(aonk, i2, 3, str, (psc) null);
    }

    /* access modifiers changed from: protected */
    public void a(RuntimeException runtimeException) {
        throw runtimeException;
    }

    public ppr(aonk aonk, String str) {
        this(aonk, 2, str);
    }

    public ppr(aonk aonk, psc psc) {
        this(aonk, 2, 3, (String) null, psc);
    }
}
