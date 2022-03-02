package defpackage;

import android.os.UpdateEngineCallback;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: adnn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adnn extends UpdateEngineCallback {
    public static final /* synthetic */ int e = 0;
    private static final iwd f = adnt.e("SynchronizedUpdateEngine");
    private static final long g = TimeUnit.SECONDS.toMillis(10);
    public final AtomicInteger a = new AtomicInteger(-1);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final adrn c = ((adrn) adrn.a.b());
    public final adnq d = ((adnq) adnq.b.b());
    private final AtomicBoolean h = new AtomicBoolean(false);
    private final Object i = new Object();
    private final Object j = new Object();
    private final Deque k = new ArrayDeque();
    private adnm l = null;

    private adnn() {
    }

    public static adnn a() {
        return new adnn();
    }

    private final adnm g() {
        adnm adnm;
        synchronized (this.j) {
            adnm = this.l;
        }
        return adnm;
    }

    private final void h() {
        synchronized (this.i) {
            for (adnl adnl : this.k) {
                if (adnl.a()) {
                    adnl.a.countDown();
                }
            }
        }
    }

    private final void i() {
        try {
            adnq adnq = this.d;
            adnq.a.c("cancel()", new Object[0]);
            adnq.d.cancel();
        } catch (Exception e2) {
            f.e("Error when calling UpdateEngine.cancel() (note that this error might be expected).", e2, new Object[0]);
        }
    }

    private final void j() {
        try {
            adnq adnq = this.d;
            if (((Boolean) adnq.c.b(adls.i)).booleanValue()) {
                adnq.a.c("resetStatus()", new Object[0]);
                adnq.d.resetStatus();
                adnq.c.a(adls.i.b(false));
            }
            this.c.a(adls.m.b(false));
        } catch (Exception e2) {
            f.e("Error when calling UpdateEngine.resetStatus() (note that this error might be expected).", e2, new Object[0]);
        }
    }

    public final void b() {
        adnq adnq = this.d;
        synchronized (adnq.e) {
            adnq.i.add(this);
            if (!adnq.h) {
                adnq.h = true;
                adnq.d.bind(adnq);
            }
            int i2 = adnq.f;
            if (i2 != -1) {
                onStatusUpdate(i2, adnq.g);
            }
        }
        this.h.set(true);
    }

    public final void c() {
        adnq adnq = this.d;
        synchronized (adnq.e) {
            adnq.i.remove(this);
        }
    }

    public final void d() {
        iva.b(this.h.get(), "stop() called before binding to UpdateEngine.");
        f.c("stop()", new Object[0]);
        try {
            this.b.set(true);
            int f2 = f();
            if (!(f2 == 0 || f2 == 6)) {
                i();
                if (!a(adng.a, g)) {
                    f.e("Failed to get updated status from update engine after cancel.", new Object[0]);
                }
            }
        } finally {
            h();
        }
    }

    public final void e() {
        iva.b(this.h.get(), "reset() called before binding to UpdateEngine.");
        f.c("reset()", new Object[0]);
        try {
            this.b.set(true);
            int f2 = f();
            if (f2 != 0) {
                if (f2 != 6) {
                    i();
                    if (!a(adni.a, g)) {
                        f.e("Failed to get updated status from update engine after cancel.", new Object[0]);
                    }
                } else {
                    j();
                    if (!a(adnh.a, g)) {
                        f.e("Failed to get updated status from update engine after reset status.", new Object[0]);
                    }
                }
                if (f() == 6) {
                    j();
                    if (!a(adnj.a, g)) {
                        f.e("Failed to get updated status from update engine after reset status.", new Object[0]);
                    }
                }
            }
        } finally {
            h();
        }
    }

    public final int f() {
        iva.b(this.h.get(), "GetStatus called before binding to UpdateEngine.");
        a(adnk.a);
        return this.d.a();
    }

    public final void onPayloadApplicationComplete(int i2) {
        float f2;
        this.a.set(i2);
        adnm g2 = g();
        if (g2 != null) {
            int a2 = this.d.a();
            adnq adnq = this.d;
            synchronized (adnq.e) {
                f2 = adnq.g;
            }
            g2.a(a2, i2, f2);
        }
        h();
    }

    public final void onStatusUpdate(int i2, float f2) {
        adnm g2 = g();
        if (g2 != null) {
            g2.a(i2, this.a.get(), f2);
        }
        h();
    }

    private final void a(jks jks) {
        adnl adnl = new adnl(this, jks);
        synchronized (this.i) {
            if (!adnl.a()) {
                this.k.add(adnl);
                try {
                    adnl.a.await();
                    synchronized (this.i) {
                        this.k.remove(adnl);
                    }
                } catch (Throwable th) {
                    synchronized (this.i) {
                        this.k.remove(adnl);
                        throw th;
                    }
                }
            }
        }
    }

    private final boolean a(jks jks, long j2) {
        adnl adnl = new adnl(this, jks);
        synchronized (this.i) {
            if (adnl.a()) {
                return true;
            }
            this.k.add(adnl);
            try {
                boolean await = adnl.a.await(j2, TimeUnit.MILLISECONDS);
                synchronized (this.i) {
                    this.k.remove(adnl);
                }
                return await;
            } catch (Throwable th) {
                synchronized (this.i) {
                    this.k.remove(adnl);
                    throw th;
                }
            }
        }
    }

    public final int a(adqq adqq, List list) {
        iva.b(this.h.get(), "start() called before binding to UpdateEngine.");
        iwd iwd = f;
        Object[] objArr = new Object[2];
        amrg a2 = amrh.a((Object) adqq);
        a2.a("url", (Object) adqq.a);
        adqr adqr = adqq.c;
        if (adqr == null) {
            adqr = adqr.d;
        }
        a2.a("payload_binary_file.offset", adqr.b);
        adqr adqr2 = adqq.c;
        if (adqr2 == null) {
            adqr2 = adqr.d;
        }
        a2.a("payload_binary_file.length", adqr2.c);
        a2.a("properties", (Object) adqq.b);
        objArr[0] = a2.toString();
        objArr[1] = Integer.valueOf(list.size());
        iwd.c("start(%s, additionalProperties.size=%d)", objArr);
        if (this.b.get()) {
            return this.a.get();
        }
        if (f() == 6) {
            this.a.set(0);
            return 0;
        }
        this.a.set(-1);
        if (this.d.a() == 0) {
            try {
                adnq adnq = this.d;
                String str = adqq.a;
                adqr adqr3 = adqq.c;
                if (adqr3 == null) {
                    adqr3 = adqr.d;
                }
                long j2 = adqr3.b;
                adqr adqr4 = adqq.c;
                if (adqr4 == null) {
                    adqr4 = adqr.d;
                }
                adnq.a.c("applyPayload()", new Object[0]);
                adnq.c.a(adls.i.b(true));
                adnq.d.applyPayload(str, j2, adqr4.c, (String[]) anbs.a((Iterable) amym.a(adqq.b, list), String.class));
                this.c.a(adls.m.b(Boolean.valueOf(!list.contains("SWITCH_SLOT_ON_REBOOT=0"))));
            } catch (Exception e2) {
                f.e("Error when calling UpdateEngine.applyPayload().", e2, new Object[0]);
                this.a.set(1);
            }
        }
        a(adnf.a);
        return this.a.get();
    }

    public final void a(adnm adnm) {
        synchronized (this.j) {
            this.l = adnm;
        }
    }
}
