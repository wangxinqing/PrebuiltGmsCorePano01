package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class BasePendingResult extends icf {
    static final ThreadLocal f = new idp();
    public static final /* synthetic */ int l = 0;
    private final CountDownLatch a;
    private final ArrayList b;
    private icm c;
    private final AtomicReference d;
    private Status e;
    public final Object g;
    protected final idq h;
    public final WeakReference i;
    public icl j;
    public boolean k;
    private volatile boolean m;
    private idr mResultGuardian;
    private boolean n;
    private boolean o;
    private itp p;
    private volatile icq q;

    @Deprecated
    BasePendingResult() {
        this.g = new Object();
        this.a = new CountDownLatch(1);
        this.b = new ArrayList();
        this.d = new AtomicReference();
        this.k = false;
        this.h = new idq(Looper.getMainLooper());
        this.i = new WeakReference((Object) null);
    }

    public static icm b(icm icm) {
        if (icm != null) {
            return new idl(qvl.b.a(), icm);
        }
        return null;
    }

    private final void c(icl icl) {
        this.j = icl;
        this.p = null;
        this.a.countDown();
        this.e = this.j.aO();
        if (this.n) {
            this.c = null;
        } else if (this.c != null) {
            this.h.removeMessages(2);
            this.h.a(this.c, f());
        } else if (this.j instanceof ici) {
            this.mResultGuardian = new idr(this);
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ice) arrayList.get(i2)).a(this.e);
        }
        this.b.clear();
    }

    private final icl f() {
        icl icl;
        synchronized (this.g) {
            iva.a(!this.m, (Object) "Result has already been consumed.");
            iva.a(c(), (Object) "Result is not ready.");
            icl = this.j;
            this.j = null;
            this.c = null;
            this.m = true;
        }
        ihe ihe = (ihe) this.d.getAndSet((Object) null);
        if (ihe != null) {
            ihe.a.c.remove(this);
        }
        return icl;
    }

    public final icl a() {
        iva.b("await must not be called on the UI thread");
        iva.a(!this.m, (Object) "Result has already been consumed");
        iva.a(true, (Object) "Cannot await if then() has been called.");
        try {
            this.a.await();
        } catch (InterruptedException e2) {
            c(Status.b);
        }
        iva.a(c(), (Object) "Result is not ready.");
        return f();
    }

    /* access modifiers changed from: protected */
    public abstract icl b(Status status);

    public final boolean d() {
        boolean z;
        synchronized (this.g) {
            z = this.n;
        }
        return z;
    }

    public final void e() {
        boolean z = true;
        if (!this.k && !((Boolean) f.get()).booleanValue()) {
            z = false;
        }
        this.k = z;
    }

    public static void b(icl icl) {
        if (icl instanceof ici) {
            try {
                ((ici) icl).c();
            } catch (RuntimeException e2) {
                String valueOf = String.valueOf(icl);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e2);
            }
        }
    }

    public final icl a(long j2, TimeUnit timeUnit) {
        if (j2 > 0) {
            iva.b("await must not be called on the UI thread when time is greater than zero.");
        }
        iva.a(!this.m, (Object) "Result has already been consumed.");
        iva.a(true, (Object) "Cannot await if then() has been called.");
        try {
            if (!this.a.await(j2, timeUnit)) {
                c(Status.d);
            }
        } catch (InterruptedException e2) {
            c(Status.b);
        }
        iva.a(c(), (Object) "Result is not ready.");
        return f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.g
            monitor-enter(r0)
            boolean r1 = r2.n     // Catch:{ all -> 0x002a }
            if (r1 != 0) goto L_0x0028
            boolean r1 = r2.m     // Catch:{ all -> 0x002a }
            if (r1 != 0) goto L_0x0028
            itp r1 = r2.p     // Catch:{ all -> 0x002a }
            if (r1 != 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            r1.b()     // Catch:{ RemoteException -> 0x0014 }
            goto L_0x0015
        L_0x0014:
            r1 = move-exception
        L_0x0015:
            icl r1 = r2.j     // Catch:{ all -> 0x002a }
            b((defpackage.icl) r1)     // Catch:{ all -> 0x002a }
            r1 = 1
            r2.n = r1     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.e     // Catch:{ all -> 0x002a }
            icl r1 = r2.b((com.google.android.gms.common.api.Status) r1)     // Catch:{ all -> 0x002a }
            r2.c((defpackage.icl) r1)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.b():void");
    }

    @Deprecated
    protected BasePendingResult(Looper looper) {
        this.g = new Object();
        this.a = new CountDownLatch(1);
        this.b = new ArrayList();
        this.d = new AtomicReference();
        this.k = false;
        this.h = new idq(looper);
        this.i = new WeakReference((Object) null);
    }

    public final void c(Status status) {
        synchronized (this.g) {
            if (!c()) {
                a(b(status));
                this.o = true;
            }
        }
    }

    public final void a(ice ice) {
        boolean z;
        if (ice != null) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "Callback cannot be null.");
        synchronized (this.g) {
            if (c()) {
                ice.a(this.e);
            } else {
                this.b.add(new idm(qvl.b.a(), ice));
            }
        }
    }

    public final boolean c() {
        return this.a.getCount() == 0;
    }

    protected BasePendingResult(icc icc) {
        this.g = new Object();
        this.a = new CountDownLatch(1);
        this.b = new ArrayList();
        this.d = new AtomicReference();
        this.k = false;
        this.h = new idq(icc == null ? Looper.getMainLooper() : icc.c());
        this.i = new WeakReference(icc);
    }

    public final void a(icl icl) {
        synchronized (this.g) {
            if (this.o || this.n) {
                b(icl);
                return;
            }
            c();
            iva.a(!c(), (Object) "Results have already been set");
            iva.a(!this.m, (Object) "Result has already been consumed");
            c(icl);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.icm r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.g
            monitor-enter(r0)
            if (r5 == 0) goto L_0x0033
            boolean r1 = r4.m     // Catch:{ all -> 0x0038 }
            r2 = 1
            r1 = r1 ^ r2
            java.lang.String r3 = "Result has already been consumed."
            defpackage.iva.a((boolean) r1, (java.lang.Object) r3)     // Catch:{ all -> 0x0038 }
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            defpackage.iva.a((boolean) r2, (java.lang.Object) r1)     // Catch:{ all -> 0x0038 }
            boolean r1 = r4.d()     // Catch:{ all -> 0x0038 }
            if (r1 != 0) goto L_0x0031
            boolean r1 = r4.c()     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x0029
            idq r1 = r4.h     // Catch:{ all -> 0x0038 }
            icl r2 = r4.f()     // Catch:{ all -> 0x0038 }
            r1.a(r5, r2)     // Catch:{ all -> 0x0038 }
            goto L_0x002f
        L_0x0029:
            icm r5 = b((defpackage.icm) r5)     // Catch:{ all -> 0x0038 }
            r4.c = r5     // Catch:{ all -> 0x0038 }
        L_0x002f:
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            return
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            return
        L_0x0033:
            r5 = 0
            r4.c = r5     // Catch:{ all -> 0x0038 }
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            return
        L_0x0038:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.a(icm):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.icm r5, long r6, java.util.concurrent.TimeUnit r8) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.g
            monitor-enter(r0)
            if (r5 == 0) goto L_0x0041
            boolean r1 = r4.m     // Catch:{ all -> 0x0046 }
            r2 = 1
            r1 = r1 ^ r2
            java.lang.String r3 = "Result has already been consumed."
            defpackage.iva.a((boolean) r1, (java.lang.Object) r3)     // Catch:{ all -> 0x0046 }
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            defpackage.iva.a((boolean) r2, (java.lang.Object) r1)     // Catch:{ all -> 0x0046 }
            boolean r1 = r4.d()     // Catch:{ all -> 0x0046 }
            if (r1 != 0) goto L_0x003f
            boolean r1 = r4.c()     // Catch:{ all -> 0x0046 }
            if (r1 != 0) goto L_0x0034
            icm r5 = b((defpackage.icm) r5)     // Catch:{ all -> 0x0046 }
            r4.c = r5     // Catch:{ all -> 0x0046 }
            idq r5 = r4.h     // Catch:{ all -> 0x0046 }
            long r6 = r8.toMillis(r6)     // Catch:{ all -> 0x0046 }
            r8 = 2
            android.os.Message r8 = r5.obtainMessage(r8, r4)     // Catch:{ all -> 0x0046 }
            r5.sendMessageDelayed(r8, r6)     // Catch:{ all -> 0x0046 }
            goto L_0x003d
        L_0x0034:
            idq r6 = r4.h     // Catch:{ all -> 0x0046 }
            icl r7 = r4.f()     // Catch:{ all -> 0x0046 }
            r6.a(r5, r7)     // Catch:{ all -> 0x0046 }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            return
        L_0x003f:
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            return
        L_0x0041:
            r5 = 0
            r4.c = r5     // Catch:{ all -> 0x0046 }
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            return
        L_0x0046:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.a(icm, long, java.util.concurrent.TimeUnit):void");
    }

    public final void a(ihe ihe) {
        this.d.set(ihe);
    }

    /* access modifiers changed from: protected */
    public final void a(itp itp) {
        synchronized (this.g) {
            this.p = itp;
        }
    }
}
