package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: svv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class svv implements swn {
    private static volatile svv y;
    private final suk A;
    private final sxn B;
    private final sor C;
    private final sxh D;
    private Boolean E;
    private long F;
    private volatile Boolean G;
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final spc f;
    public final spg g;
    public final svf h;
    public final sut i;
    public final svs j;
    public final szj k;
    public final jiq l;
    public final sxd m;
    public suj n;
    public sye o;
    public spn p;
    public suh q;
    public svi r;
    public boolean s = false;
    protected Boolean t;
    protected Boolean u;
    public int v;
    public final AtomicInteger w = new AtomicInteger(0);
    public final long x;
    private final sys z;

    public svv(swt swt) {
        Bundle bundle;
        boolean z2 = false;
        iva.a((Object) swt);
        spc spc = new spc(swt.a);
        this.f = spc;
        sub.a = spc;
        this.a = swt.a;
        this.b = swt.b;
        this.c = swt.c;
        this.d = swt.d;
        this.e = swt.h;
        this.G = swt.e;
        InitializationParams initializationParams = swt.g;
        if (!(initializationParams == null || (bundle = initializationParams.g) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.t = (Boolean) obj;
            }
            Object obj2 = initializationParams.g.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.u = (Boolean) obj2;
            }
        }
        agvx.a(this.a);
        this.l = jiu.a;
        this.x = System.currentTimeMillis();
        this.g = new spg(this);
        svf svf = new svf(this);
        svf.l();
        this.h = svf;
        sut sut = new sut(this);
        sut.l();
        this.i = sut;
        szj szj = new szj(this);
        szj.l();
        this.k = szj;
        suk suk = new suk(this);
        suk.l();
        this.A = suk;
        this.C = new sor(this);
        sxn sxn = new sxn(this);
        sxn.m();
        this.B = sxn;
        sxd sxd = new sxd(this);
        sxd.m();
        this.m = sxd;
        sys sys = new sys(this);
        sys.m();
        this.z = sys;
        sxh sxh = new sxh(this);
        sxh.l();
        this.D = sxh;
        svs svs = new svs(this);
        svs.l();
        this.j = svs;
        InitializationParams initializationParams2 = swt.g;
        if (initializationParams2 == null) {
            z2 = true;
        } else if (initializationParams2.b == 0) {
            z2 = true;
        }
        if (!this.f.a) {
            if (this.a.getApplicationContext() instanceof Application) {
                int i2 = Build.VERSION.SDK_INT;
                sxd e2 = e();
                if (e2.z().getApplicationContext() instanceof Application) {
                    Application application = (Application) e2.z().getApplicationContext();
                    if (e2.b == null) {
                        e2.b = new sxc(e2);
                    }
                    if (z2) {
                        application.unregisterActivityLifecycleCallbacks(e2.b);
                        application.registerActivityLifecycleCallbacks(e2.b);
                        e2.E().k.a("Registered activity lifecycle callback");
                    }
                }
            } else {
                E().f.a("Application context is not an Application");
            }
        }
        this.j.a((Runnable) new svu(this, swt));
    }

    public static svv a(Context context) {
        return a(context, (InitializationParams) null);
    }

    private final void w() {
        if (!this.s) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    public final sut E() {
        a((swm) this.i);
        return this.i;
    }

    public final svs F() {
        a((swm) this.j);
        return this.j;
    }

    public final sys d() {
        a((sot) this.z);
        return this.z;
    }

    public final sxd e() {
        a((sot) this.m);
        return this.m;
    }

    public final szj f() {
        a((swl) this.k);
        return this.k;
    }

    public final suk g() {
        a((swl) this.A);
        return this.A;
    }

    public final suj h() {
        a((sot) this.n);
        return this.n;
    }

    public final sxh i() {
        a((swm) this.D);
        return this.D;
    }

    public final boolean j() {
        return TextUtils.isEmpty(this.b);
    }

    public final sxn k() {
        a((sot) this.B);
        return this.B;
    }

    public final sye l() {
        a((sot) this.o);
        return this.o;
    }

    public final spn m() {
        a((swm) this.p);
        return this.p;
    }

    public final suh n() {
        a((sot) this.q);
        return this.q;
    }

    public final sor o() {
        sor sor = this.C;
        if (sor != null) {
            return sor;
        }
        throw new IllegalStateException("Component not created");
    }

    public final void p() {
        F().h();
    }

    public final boolean q() {
        Boolean bool;
        if (ayjk.b() && this.g.a(sud.aI)) {
            return r() == 0;
        }
        p();
        w();
        if (this.g.d() || ((bool = this.u) != null && bool.booleanValue())) {
            return false;
        }
        Boolean d2 = a().d();
        if (d2 != null) {
            return d2.booleanValue();
        }
        Boolean e2 = this.g.e();
        if (e2 != null) {
            return e2.booleanValue();
        }
        Boolean bool2 = this.t;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        if (ifr.b()) {
            return false;
        }
        if (!this.g.a(sud.R) || this.G == null) {
            return true;
        }
        return this.G.booleanValue();
    }

    public final int r() {
        p();
        if (this.g.d()) {
            return 1;
        }
        Boolean bool = this.u;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        Boolean d2 = a().d();
        if (d2 == null) {
            Boolean e2 = this.g.e();
            if (e2 == null) {
                Boolean bool2 = this.t;
                if (bool2 == null) {
                    if (ifr.b()) {
                        return 6;
                    }
                    if (!this.g.a(sud.R) || this.G == null || this.G.booleanValue()) {
                        return 0;
                    }
                    return 7;
                } else if (!bool2.booleanValue()) {
                    return 5;
                } else {
                    return 0;
                }
            } else if (!e2.booleanValue()) {
                return 4;
            } else {
                return 0;
            }
        } else if (!d2.booleanValue()) {
            return 3;
        } else {
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final void s() {
        if (this.f.a) {
            throw new IllegalStateException("Unexpected call on package side");
        }
    }

    /* access modifiers changed from: package-private */
    public final void t() {
        if (!this.f.a) {
            throw new IllegalStateException("Unexpected call on client side");
        }
    }

    /* access modifiers changed from: package-private */
    public final void u() {
        this.w.incrementAndGet();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean v() {
        /*
            r6 = this;
            r6.w()
            r6.p()
            java.lang.Boolean r0 = r6.E
            if (r0 != 0) goto L_0x000b
            goto L_0x002a
        L_0x000b:
            long r1 = r6.F
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x002a
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00c4
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r6.F
            long r0 = r0 - r2
            long r0 = java.lang.Math.abs(r0)
            r2 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x00c4
        L_0x002a:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.F = r0
            spc r0 = r6.f
            boolean r0 = r0.a
            r1 = 1
            if (r0 == 0) goto L_0x003e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r6.E = r0
            return r1
        L_0x003e:
            szj r0 = r6.f()
            java.lang.String r2 = "android.permission.INTERNET"
            boolean r0 = r0.e(r2)
            r2 = 0
            if (r0 == 0) goto L_0x007f
            szj r0 = r6.f()
            java.lang.String r3 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = r0.e(r3)
            if (r0 == 0) goto L_0x007f
            android.content.Context r0 = r6.a
            jnh r0 = defpackage.jni.b(r0)
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x007d
            spg r0 = r6.g
            boolean r0 = r0.k()
            if (r0 != 0) goto L_0x007d
            android.content.Context r0 = r6.a
            boolean r0 = defpackage.svm.a(r0)
            if (r0 == 0) goto L_0x007f
            android.content.Context r0 = r6.a
            boolean r0 = defpackage.szj.a((android.content.Context) r0)
            if (r0 == 0) goto L_0x007f
            r0 = 1
            goto L_0x0080
        L_0x007d:
            r0 = 1
            goto L_0x0080
        L_0x007f:
            r0 = 0
        L_0x0080:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.E = r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00c4
            szj r0 = r6.f()
            suh r3 = r6.n()
            java.lang.String r3 = r3.p()
            suh r4 = r6.n()
            java.lang.String r4 = r4.q()
            suh r5 = r6.n()
            r5.l()
            boolean r0 = r0.c((java.lang.String) r3, (java.lang.String) r4)
            if (r0 != 0) goto L_0x00bd
            suh r0 = r6.n()
            java.lang.String r0 = r0.q()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00bd
            r1 = 0
            goto L_0x00be
        L_0x00bd:
        L_0x00be:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r6.E = r0
        L_0x00c4:
            java.lang.Boolean r0 = r6.E
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.svv.v():boolean");
    }

    public static svv a(Context context, InitializationParams initializationParams) {
        Bundle bundle;
        if (initializationParams != null && (initializationParams.e == null || initializationParams.f == null)) {
            initializationParams = new InitializationParams(initializationParams.a, initializationParams.b, initializationParams.c, initializationParams.d, (String) null, (String) null, initializationParams.g);
        }
        iva.a((Object) context);
        iva.a((Object) context.getApplicationContext());
        if (y == null) {
            synchronized (svv.class) {
                if (y == null) {
                    y = new svv(new swt(context, initializationParams));
                }
            }
        } else if (!(initializationParams == null || (bundle = initializationParams.g) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            y.G = Boolean.valueOf(initializationParams.g.getBoolean("dataCollectionDefaultEnabled"));
        }
        return y;
    }

    private static final void a(sot sot) {
        if (sot == null) {
            throw new IllegalStateException("Component not created");
        } else if (!sot.k()) {
            String valueOf = String.valueOf(sot.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    private static final void a(swl swl) {
        if (swl == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void a(swm swm) {
        if (swm == null) {
            throw new IllegalStateException("Component not created");
        } else if (!swm.g()) {
            String valueOf = String.valueOf(swm.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final svf a() {
        a((swl) this.h);
        return this.h;
    }
}
