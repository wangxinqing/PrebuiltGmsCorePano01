package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.ConditionVariable;
import android.os.WorkSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: ppp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ppp {
    public final Object a;
    public Set b;
    public final Set c;
    public int d;
    public final ConditionVariable e;
    public int f;
    final ThreadLocal g;
    public acrz h;
    private int i;
    private final jfc j;
    private final jfc k;
    private final Context l;
    private HashMap m;
    private final Intent n;
    private final String o;

    public ppp() {
        this.a = new Object();
        this.b = new HashSet();
        this.c = new HashSet();
        this.i = 0;
        this.d = 0;
        this.e = new ConditionVariable(true);
        this.g = new ThreadLocal();
    }

    public final void a() {
        boolean z;
        boolean z2;
        synchronized (this.a) {
            boolean z3 = true;
            if (this.d >= 0) {
                z = true;
            } else {
                z = false;
            }
            iva.a(z);
            if (this.i >= this.d) {
                z2 = true;
            } else {
                z2 = false;
            }
            iva.a(z2);
            if (this.f < 0) {
                z3 = false;
            }
            iva.a(z3);
        }
    }

    public final void b(int i2) {
        iva.a(a(i2), "Must be in a thread with scheduling %d vs %d", Integer.valueOf(i2), this.g.get());
    }

    /* access modifiers changed from: protected */
    public final void c(ppr ppr) {
        if (this.h == null) {
            acrz acrz = new acrz(this.l, 1, "Icing", (String) null, "com.google.android.gms", "ICING");
            this.h = acrz;
            acrz.c(new WorkSource());
        }
        ppq ppq = (ppq) this.m.get(ppr.j);
        if (ppq == null) {
            ppq = new ppq(ppr.j, this.l);
            this.m.put(ppr.j, ppq);
        }
        if (ppq.b == 0) {
            try {
                this.h.a(ppq.a);
            } catch (ArrayIndexOutOfBoundsException e2) {
                oso.d("Failed to add work source %s for task %s", ppr.j, ppr.d());
            }
        }
        ppq.b++;
        this.h.a(String.valueOf(ppr.d()).concat("-pending"), axry.b());
    }

    public final void d(ppr ppr) {
        a(ppr, 0);
    }

    public final void a(ppr ppr) {
        synchronized (this.a) {
            a();
            boolean z = true;
            if (this.d == 1) {
                if (!this.b.isEmpty()) {
                    Set set = this.b;
                    this.b = new HashSet();
                    d(new ppn(set));
                }
            }
            ppq ppq = (ppq) this.m.get(ppr.j);
            if (ppq == null || ppq.b <= 0) {
                z = false;
            }
            iva.a(z, (Object) "acquireWakeLockLocked must be called before releaseWakeLockLocked");
            this.h.c(ppr.d());
            int i2 = ppq.b - 1;
            ppq.b = i2;
            if (i2 == 0) {
                this.h.b(ppq.a);
            }
            int i3 = this.d - 1;
            this.d = i3;
            if (i3 == 0) {
                oso.a("%s: On dead called", (Object) this.o);
                this.l.stopService(this.n);
            }
            int i4 = this.i - 1;
            this.i = i4;
            if (i4 == 0) {
                this.e.open();
            }
            a();
        }
    }

    public final void b(ppr ppr) {
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 == 0) {
            this.b.addAll(this.c);
            this.l.startService(this.n);
        }
        c(ppr);
    }

    public ppp(Context context, String str, Intent intent) {
        this.a = new Object();
        this.b = new HashSet();
        this.c = new HashSet();
        this.i = 0;
        this.d = 0;
        this.e = new ConditionVariable(true);
        this.g = new ThreadLocal();
        this.j = jfm.a(4, 9);
        this.k = jfm.a(1, 10);
        this.m = new HashMap();
        this.l = context;
        this.n = intent;
        this.o = str;
    }

    public final void a(ppr ppr, long j2) {
        boolean z;
        jfc jfc;
        Long valueOf = Long.valueOf(j2);
        oso.a("Scheduling task: %s %d", (Object) ppr, (Object) valueOf);
        if (j2 < 0 || j2 > 5000) {
            z = false;
        } else {
            z = true;
        }
        iva.b(z, "Delay out of range: %d", valueOf);
        ppr.a(ppr.h);
        List<Runnable> emptyList = Collections.emptyList();
        iva.a((Object) emptyList);
        for (Runnable a2 : emptyList) {
            iva.a((Object) a2);
        }
        synchronized (this.a) {
            a();
            if (this.f != 0) {
                if (!(ppr instanceof ppn)) {
                    oso.e("Scheduling new tasks while awaiting pending to complete: %s.", (Object) ppr);
                }
            }
            this.b.addAll(emptyList);
            this.i++;
            this.e.close();
            if (ppr.i == 3) {
                b(ppr);
            }
            a();
        }
        ppr.a(0, 1);
        ppo ppo = new ppo(this, ppr);
        int i2 = ppo.a.h;
        if (i2 == 1) {
            jfc = this.j;
        } else if (i2 == 2) {
            jfc = this.k;
        } else {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Invalid task scheduling: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        jfi.a(jfc.a((Runnable) ppo, j2, TimeUnit.MILLISECONDS));
    }

    public final boolean a(int i2) {
        ppr.a(i2);
        return this.g.get() != null && ((Integer) this.g.get()).intValue() == i2;
    }
}
