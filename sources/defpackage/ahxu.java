package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ahxu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahxu {
    public static final List j;
    public final ArrayList a = new ArrayList();
    public final Object b = new Object();
    public final boolean c;
    public boolean d = false;
    public boolean e = true;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public int i = 99;
    private boolean k = false;

    static {
        ArrayList arrayList = new ArrayList();
        j = arrayList;
        arrayList.add(new ahyw(6, 0, 11));
        j.add(new ahyw(11, 1, 16));
        j.add(new ahyw(16, 1, 23));
    }

    public ahxu(boolean z) {
        this.c = z;
    }

    private final int f() {
        boolean a2 = a();
        boolean z = this.e;
        if (a2 && !z && this.d) {
            return 1;
        }
        if (!a2) {
            return 99;
        }
        if (!z) {
            return this.d ? 99 : 23;
        }
        return 22;
    }

    public final synchronized void a(int i2, int i3, boolean z) {
        float f2;
        boolean z2;
        float a2 = ajqz.a(i2, i3);
        if (!z) {
            f2 = 0.6f;
        } else {
            f2 = 0.2f;
        }
        if (a2 >= f2) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.d = z2;
        b();
    }

    public final String c() {
        return String.format("[canEnableForScheduler: %s, canEnableForCollector: %s, enabledInClient: %s, enabledInServer: %s, enabledInGservices: %s, hasRequiredSensors: %s, screenOn: %s, isBatteryHealthy: %s, isInWhitelist: %s, nlpEnabled: %s, isInDeepIdleMode: %s]", new Object[]{Boolean.valueOf(this.h), Integer.valueOf(this.i), true, Boolean.valueOf(this.f), Boolean.valueOf(ahxc.a(8)), Boolean.valueOf(this.c), Boolean.valueOf(this.e), Boolean.valueOf(this.d), Boolean.valueOf(ayez.b()), Boolean.valueOf(this.g), Boolean.valueOf(this.k)});
    }

    public final boolean d() {
        return this.g && ahwx.a();
    }

    public final synchronized void e() {
        b();
    }

    public final void b() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (a() == this.h) {
            if (f() != 1) {
                z = false;
            } else {
                z = true;
            }
            if (this.i != 1) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z != z2) {
                z3 = true;
            }
        } else {
            z3 = true;
        }
        this.h = a();
        this.i = f();
        if (z3) {
            synchronized (this.b) {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ((ajqu) it.next()).a(this);
                }
                c();
            }
        }
    }

    public final synchronized void a(boolean z) {
        this.e = z;
        b();
    }

    public final void c(boolean z) {
        this.k = z;
        b();
    }

    public final boolean a() {
        return this.c && this.f && ayez.b() && d() && !this.k && ahxc.a(8);
    }

    public final void b(boolean z) {
        this.g = z;
        b();
    }
}
