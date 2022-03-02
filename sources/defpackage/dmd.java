package defpackage;

import android.content.Context;

/* renamed from: dmd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dmd {
    private static volatile dmd i;
    public final Context a;
    public final Context b;
    public final jiq c = jiu.a;
    public final dmy d = new dmy(this);
    public final dpk e;
    public final dnd f;
    public final dpp g;
    public final dnc h;
    private final dkw j;
    private final dly k;
    private final dpy l;
    private final dkh m;
    private final dmv n;
    private final dls o;
    private final dmn p;

    protected dmd(dme dme) {
        Context context = dme.a;
        iva.a((Object) context, (Object) "Application context can't be null");
        Context context2 = dme.b;
        iva.a((Object) context2);
        this.a = context;
        this.b = context2;
        dpk dpk = new dpk(this);
        dpk.r();
        this.e = dpk;
        dpk a2 = a();
        String str = dmb.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
        sb.append("Google Analytics ");
        sb.append(str);
        sb.append(" is starting up.");
        a2.a(4, sb.toString(), (Object) null, (Object) null, (Object) null);
        dpp dpp = new dpp(this);
        dpp.r();
        this.g = dpp;
        dpy dpy = new dpy(this);
        dpy.r();
        this.l = dpy;
        dly dly = new dly(this, dme);
        dmv dmv = new dmv(this);
        dls dls = new dls(this);
        dmn dmn = new dmn(this);
        dnc dnc = new dnc(this);
        iva.a((Object) context);
        if (dkw.a == null) {
            synchronized (dkw.class) {
                if (dkw.a == null) {
                    dkw.a = new dkw(context);
                }
            }
        }
        dkw dkw = dkw.a;
        dkw.f = new dmc(this);
        this.j = dkw;
        dkh dkh = new dkh(this);
        dmv.r();
        this.n = dmv;
        dls.r();
        this.o = dls;
        dmn.r();
        this.p = dmn;
        dnc.r();
        this.h = dnc;
        dnd b2 = dme.b(this);
        b2.r();
        this.f = b2;
        dly.r();
        this.k = dly;
        a().b("Device AnalyticsService version", dmb.a);
        dpy e2 = dkh.a.e();
        e2.q();
        e2.q();
        if (e2.f) {
            e2.q();
            dkh.e = e2.g;
        }
        e2.q();
        dkh.c = true;
        this.m = dkh;
        dms dms = dly.a;
        dms.q();
        iva.a(!dms.a, (Object) "Analytics backend already started");
        dms.a = true;
        dms.g().a((Runnable) new dmq(dms));
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0052 A[Catch:{ ClassNotFoundException -> 0x004d, ClassCastException -> 0x004b, IllegalAccessException -> 0x0044, InstantiationException -> 0x003d, NoSuchMethodException -> 0x0036, InvocationTargetException -> 0x002f }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0078 A[Catch:{ ClassNotFoundException -> 0x004d, ClassCastException -> 0x004b, IllegalAccessException -> 0x0044, InstantiationException -> 0x003d, NoSuchMethodException -> 0x0036, InvocationTargetException -> 0x002f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.dmd a(android.content.Context r8) {
        /*
            defpackage.iva.a((java.lang.Object) r8)
            dmd r0 = i
            if (r0 != 0) goto L_0x008e
            java.lang.Class<dmd> r0 = defpackage.dmd.class
            monitor-enter(r0)
            dmd r1 = i     // Catch:{ all -> 0x008b }
            if (r1 != 0) goto L_0x0089
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x008b }
            r3 = 0
            r4 = 1
            java.lang.String r5 = "com.google.android.gms.analytics.internal.ModuleAnalyticsFactory"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException -> 0x004d, ClassCastException -> 0x004b, IllegalAccessException -> 0x0044, InstantiationException -> 0x003d, NoSuchMethodException -> 0x0036, InvocationTargetException -> 0x002f }
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x004d, ClassCastException -> 0x004b, IllegalAccessException -> 0x0044, InstantiationException -> 0x003d, NoSuchMethodException -> 0x0036, InvocationTargetException -> 0x002f }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r3] = r7     // Catch:{ ClassNotFoundException -> 0x004d, ClassCastException -> 0x004b, IllegalAccessException -> 0x0044, InstantiationException -> 0x003d, NoSuchMethodException -> 0x0036, InvocationTargetException -> 0x002f }
            java.lang.reflect.Constructor r5 = r5.getConstructor(r6)     // Catch:{ ClassNotFoundException -> 0x004d, ClassCastException -> 0x004b, IllegalAccessException -> 0x0044, InstantiationException -> 0x003d, NoSuchMethodException -> 0x0036, InvocationTargetException -> 0x002f }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x004d, ClassCastException -> 0x004b, IllegalAccessException -> 0x0044, InstantiationException -> 0x003d, NoSuchMethodException -> 0x0036, InvocationTargetException -> 0x002f }
            r6[r3] = r8     // Catch:{ ClassNotFoundException -> 0x004d, ClassCastException -> 0x004b, IllegalAccessException -> 0x0044, InstantiationException -> 0x003d, NoSuchMethodException -> 0x0036, InvocationTargetException -> 0x002f }
            java.lang.Object r5 = r5.newInstance(r6)     // Catch:{ ClassNotFoundException -> 0x004d, ClassCastException -> 0x004b, IllegalAccessException -> 0x0044, InstantiationException -> 0x003d, NoSuchMethodException -> 0x0036, InvocationTargetException -> 0x002f }
            dme r5 = (defpackage.dme) r5     // Catch:{ ClassNotFoundException -> 0x004d, ClassCastException -> 0x004b, IllegalAccessException -> 0x0044, InstantiationException -> 0x003d, NoSuchMethodException -> 0x0036, InvocationTargetException -> 0x002f }
            goto L_0x0050
        L_0x002f:
            r8 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x008b }
            r1.<init>(r8)     // Catch:{ all -> 0x008b }
            throw r1     // Catch:{ all -> 0x008b }
        L_0x0036:
            r8 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x008b }
            r1.<init>(r8)     // Catch:{ all -> 0x008b }
            throw r1     // Catch:{ all -> 0x008b }
        L_0x003d:
            r8 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x008b }
            r1.<init>(r8)     // Catch:{ all -> 0x008b }
            throw r1     // Catch:{ all -> 0x008b }
        L_0x0044:
            r8 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x008b }
            r1.<init>(r8)     // Catch:{ all -> 0x008b }
            throw r1     // Catch:{ all -> 0x008b }
        L_0x004b:
            r3 = move-exception
            goto L_0x004e
        L_0x004d:
            r3 = move-exception
        L_0x004e:
            r5 = 0
            r3 = 1
        L_0x0050:
            if (r3 == 0) goto L_0x0058
            dme r5 = new dme     // Catch:{ all -> 0x008b }
            r5.<init>(r8)     // Catch:{ all -> 0x008b }
            goto L_0x0059
        L_0x0058:
        L_0x0059:
            dmd r8 = new dmd     // Catch:{ all -> 0x008b }
            r8.<init>(r5)     // Catch:{ all -> 0x008b }
            i = r8     // Catch:{ all -> 0x008b }
            defpackage.dkh.a()     // Catch:{ all -> 0x008b }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x008b }
            long r3 = r3 - r1
            doy r1 = defpackage.doz.G     // Catch:{ all -> 0x008b }
            java.lang.Object r1 = r1.a()     // Catch:{ all -> 0x008b }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x008b }
            long r1 = r1.longValue()     // Catch:{ all -> 0x008b }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 <= 0) goto L_0x0089
            dpk r8 = r8.a()     // Catch:{ all -> 0x008b }
            java.lang.String r5 = "Slow initialization (ms)"
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x008b }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x008b }
            r8.c(r5, r3, r1)     // Catch:{ all -> 0x008b }
        L_0x0089:
            monitor-exit(r0)     // Catch:{ all -> 0x008b }
            goto L_0x008e
        L_0x008b:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008b }
            throw r8
        L_0x008e:
            dmd r8 = i
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmd.a(android.content.Context):dmd");
    }

    public final dkw b() {
        iva.a((Object) this.j);
        return this.j;
    }

    public final dly c() {
        a((dma) this.k);
        return this.k;
    }

    public final dkh d() {
        iva.a((Object) this.m);
        iva.b(this.m.c, "Analytics instance not initialized");
        return this.m;
    }

    public final dpy e() {
        a((dma) this.l);
        return this.l;
    }

    public final dls f() {
        a((dma) this.o);
        return this.o;
    }

    public final dmv g() {
        a((dma) this.n);
        return this.n;
    }

    public final dmn h() {
        a((dma) this.p);
        return this.p;
    }

    public static final void a(dma dma) {
        iva.a((Object) dma, (Object) "Analytics service not created/initialized");
        iva.b(dma.p(), "Analytics service not initialized");
    }

    public final dpk a() {
        a((dma) this.e);
        return this.e;
    }
}
