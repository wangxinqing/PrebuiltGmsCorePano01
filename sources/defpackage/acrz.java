package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.os.Process;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: acrz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acrz {
    public static volatile acrx n = new acrt();
    private static final long o = TimeUnit.DAYS.toMillis(366);
    private static ScheduledExecutorService y;
    public final Object a;
    public int b;
    public final Set c;
    public boolean d;
    public long e;
    public boolean f;
    public boolean g;
    quu h;
    public final int i;
    public final String j;
    public final String k;
    public final String l;
    public final Context m;
    private final PowerManager.WakeLock p;
    private Future q;
    private long r;
    private int s;
    private WorkSource t;
    private String u;
    private final String v;
    private final Map w;
    private AtomicInteger x;

    public acrz(Context context, int i2, String str, String str2, String str3) {
        this(context, i2, str, str2, str3, (String) null);
    }

    private static long a(String str, String str2, long j2) {
        long max = Math.max(Math.min(n.a(str, str2), o), 1);
        return j2 > 0 ? Math.min(j2, max) : max;
    }

    private final void c(String str, long j2) {
        boolean z;
        long a2 = a(this.v, str, j2);
        if (a2 == j2) {
            z = true;
        } else {
            z = false;
        }
        synchronized (this.a) {
            if (!e()) {
                this.h = quu.a(n.d(), n.e());
                this.p.acquire();
                this.e = SystemClock.elapsedRealtime();
            }
            this.b++;
            this.s++;
            String d2 = d(str);
            acrv acrv = (acrv) this.w.get(d2);
            if (acrv == null) {
                acrv = new acrv();
                this.w.put(d2, acrv);
            }
            Runnable h2 = n.h();
            if (acrv.b != null) {
                acrv.a();
            }
            acrv.b = h2;
            int i2 = acrv.a + 1;
            acrv.a = i2;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = Long.MAX_VALUE;
            if (Long.MAX_VALUE - elapsedRealtime > a2) {
                j3 = elapsedRealtime + a2;
            }
            if (j3 > this.r) {
                this.r = j3;
                this.f = z;
                Future future = this.q;
                if (future != null) {
                    future.cancel(false);
                }
                this.q = y.schedule(new acrs(this), a2, TimeUnit.MILLISECONDS);
            }
            this.g = false;
            if (i2 == 1) {
                a(7, d2, a2);
            }
        }
    }

    private final String d(String str) {
        return (!this.d || TextUtils.isEmpty(str)) ? this.k : str;
    }

    public final acry b(String str, long j2) {
        acry acry = new acry(this, str);
        long a2 = a(this.v, str, j2);
        synchronized (this.a) {
            c(str, a2);
            this.c.add(acry);
            acry.b = y.schedule(new acru(new WeakReference(acry)), a2, TimeUnit.MILLISECONDS);
        }
        return acry;
    }

    public final boolean e() {
        boolean z;
        synchronized (this.a) {
            z = this.b > 0;
        }
        return z;
    }

    public final void f() {
        int i2;
        int i3;
        float f2;
        boolean z;
        synchronized (this.a) {
            if (e()) {
                if (this.d) {
                    int i4 = this.b - 1;
                    this.b = i4;
                    if (i4 > 0) {
                        return;
                    }
                } else {
                    this.b = 0;
                }
                d();
                for (acrv acrv : this.w.values()) {
                    acrv.a = 0;
                    acrv.a();
                }
                this.w.clear();
                Future future = this.q;
                if (future != null) {
                    future.cancel(false);
                    this.q = null;
                    this.r = 0;
                }
                jcv g2 = n.g();
                if (g2 != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long elapsedRealtime = SystemClock.elapsedRealtime() - this.e;
                    if (this.g) {
                        i2 = this.f ? 2 : 3;
                    } else {
                        i2 = 1;
                    }
                    Context context = this.m;
                    String str = this.j;
                    int i5 = this.i;
                    int i6 = this.s;
                    if (axdm.b()) {
                        double a2 = axdm.a.a().a();
                        if (i2 == 1) {
                            i3 = i6;
                            f2 = (float) (axdm.a.a().e() * a2);
                        } else if (i2 != 2) {
                            i3 = i6;
                            f2 = (float) (a2 * axdm.a.a().b());
                        } else {
                            i3 = i6;
                            f2 = (float) (axdm.a.a().h() * a2);
                        }
                        jcu jcu = g2.b;
                        if (f2 > 0.0f && ((jcs) jcu).b.nextFloat() < f2) {
                            boolean b2 = jiy.b(context);
                            boolean d2 = jiy.d(context);
                            if (!axdm.a.a().g() || !jiy.c(context)) {
                                z = false;
                            } else {
                                z = true;
                            }
                            g2.a.submit(new jct(context, currentTimeMillis, str, i2, f2, i5, i3, elapsedRealtime, b2, d2, z));
                        }
                    }
                }
                this.s = 0;
                if (!this.p.isHeld()) {
                    Log.e("WakeLock", String.valueOf(this.j).concat(" should be held!"));
                } else {
                    try {
                        int i7 = Build.VERSION.SDK_INT;
                        this.p.release();
                        quu quu = this.h;
                        if (quu != null) {
                            quu.close();
                            this.h = null;
                        }
                    } catch (RuntimeException e2) {
                        if (e2.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.j).concat(" failed to release!"), e2);
                            quu quu2 = this.h;
                            if (quu2 != null) {
                                quu2.close();
                            }
                            return;
                        }
                        throw e2;
                    } catch (Throwable th) {
                        quu quu3 = this.h;
                        if (quu3 != null) {
                            quu3.close();
                            this.h = null;
                        }
                        throw th;
                    }
                }
            }
        }
    }

    public acrz(Context context, int i2, String str, String str2, String str3, String str4) {
        char c2;
        this.a = new Object();
        this.b = 0;
        this.c = new HashSet();
        this.d = true;
        this.w = new HashMap();
        this.x = new AtomicInteger(0);
        iva.a((Object) context, (Object) "WakeLock: context must not be null");
        iva.a(str, (Object) "WakeLock: wakeLockName must not be empty");
        this.i = i2;
        this.k = str2;
        this.l = str4;
        this.m = context.getApplicationContext();
        this.v = str;
        this.h = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            this.j = valueOf.length() == 0 ? new String("*gcore*:") : "*gcore*:".concat(valueOf);
        } else if (!n.c() || "com.google.android.gms".equals(str3)) {
            this.j = str;
        } else {
            String valueOf2 = String.valueOf(str);
            this.j = valueOf2.length() == 0 ? new String("*gcore*:") : "*gcore*:".concat(valueOf2);
        }
        this.p = ((PowerManager) context.getSystemService("power")).newWakeLock(i2, str);
        if (jlr.a(context)) {
            if (jlh.d(str3)) {
                if (ikz.b()) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 57);
                    sb.append("callingPackage is not supposed to be empty for wakelock ");
                    sb.append(str);
                    sb.append("!");
                    Log.w("WakeLock", sb.toString(), new IllegalArgumentException());
                    str3 = "com.google.android.gms";
                } else {
                    str3 = context.getPackageName();
                }
            }
            if (n.b()) {
                acrw f2 = n.f();
                if (f2 != null) {
                    str3 = str3 == null ? f2.b : str3;
                    if (str4 == null) {
                        str4 = f2.a;
                    }
                }
                if (!jkr.h()) {
                    int i3 = this.i;
                    if ((268435456 & i3) != 0 && ((c2 = (char) i3) == 6 || c2 == 10 || c2 == 26)) {
                        str4 = null;
                    }
                }
            }
            if (!n.a() || str3 == null || str4 == null) {
                this.t = jlr.a(context, str3);
            } else {
                this.u = str3;
                this.t = jlr.a(context, str3, str4);
            }
            a(this.t);
        }
        if (y == null) {
            y = qvj.b.c(2);
        }
    }

    private final void d(WorkSource workSource) {
        try {
            this.p.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e2) {
            Log.wtf("WakeLock", e2.toString());
        }
    }

    private final void a(int i2, String str, long j2) {
        Context context = this.m;
        String valueOf = String.valueOf(String.valueOf((((long) Process.myPid()) << 32) | ((long) System.identityHashCode(this.p))));
        String valueOf2 = String.valueOf(TextUtils.isEmpty(str) ? "" : str);
        jds.a(context, valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2), i2, this.j, str, this.l, this.i, a(), j2);
    }

    public final void d() {
        if (!this.c.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.c);
            this.c.clear();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((acry) arrayList.get(i2)).a();
            }
        }
    }

    public final List a() {
        List b2 = jlr.b(this.t);
        if (this.u == null) {
            return b2;
        }
        ArrayList arrayList = new ArrayList(b2);
        arrayList.add(this.u);
        return arrayList;
    }

    public final void b() {
        this.x.incrementAndGet();
        c((String) null, 0);
    }

    public final void b(WorkSource workSource) {
        if (workSource != null && jlr.a(this.m)) {
            try {
                WorkSource workSource2 = this.t;
                if (workSource2 != null) {
                    workSource2.remove(workSource);
                }
                d(this.t);
            } catch (ArrayIndexOutOfBoundsException e2) {
                Log.e("WakeLock", e2.toString());
            }
        }
    }

    public final void a(long j2) {
        this.x.incrementAndGet();
        c((String) null, j2);
    }

    public final void a(WorkSource workSource) {
        if (workSource != null && jlr.a(this.m)) {
            WorkSource workSource2 = this.t;
            if (workSource2 != null) {
                workSource2.add(workSource);
            } else {
                this.t = workSource;
            }
            d(this.t);
        }
    }

    public final void b(String str) {
        synchronized (this.a) {
            String d2 = d(str);
            if (!this.w.containsKey(d2)) {
                Log.w("WakeLock", String.valueOf(this.j).concat(" counter does not exist"));
            } else {
                acrv acrv = (acrv) this.w.get(d2);
                if (acrv != null) {
                    int i2 = acrv.a - 1;
                    acrv.a = i2;
                    if (i2 == 0) {
                        acrv.a();
                    }
                    if (acrv.a == 0) {
                        this.w.remove(d2);
                        a(8, d2, 0);
                    }
                }
            }
            f();
        }
    }

    public final void a(String str) {
        this.x.incrementAndGet();
        c(str, 0);
    }

    public final void a(String str, long j2) {
        this.x.incrementAndGet();
        c(str, j2);
    }

    public final void a(boolean z) {
        synchronized (this.a) {
            this.d = z;
        }
    }

    public final void c() {
        c((String) null);
    }

    public final void c(WorkSource workSource) {
        if (jlr.a(this.m)) {
            d(workSource);
            this.t = workSource;
            this.u = null;
        }
    }

    public final void c(String str) {
        if (this.x.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.j).concat(" release without a matched acquire!"));
        }
        b(str);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public acrz(android.content.Context r8, java.lang.String r9) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x0008
            java.lang.String r0 = r8.getPackageName()
            r6 = r0
            goto L_0x000a
        L_0x0008:
            r0 = 0
            r6 = r0
        L_0x000a:
            r3 = 1
            r5 = 0
            r1 = r7
            r2 = r8
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acrz.<init>(android.content.Context, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public acrz(android.content.Context r8, java.lang.String r9, java.lang.String r10) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x0008
            java.lang.String r0 = r8.getPackageName()
            r6 = r0
            goto L_0x000a
        L_0x0008:
            r0 = 0
            r6 = r0
        L_0x000a:
            r3 = 1
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acrz.<init>(android.content.Context, java.lang.String, java.lang.String):void");
    }
}
