package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: agvx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class agvx {
    private static final Object a = new Object();
    public static Context b = null;
    private static Collection e;
    private static amsv f;
    private static final AtomicInteger h = new AtomicInteger();
    final agvw c;
    final String d;
    private final Object g;
    private volatile int i = -1;
    private volatile Object j;

    public agvx(agvw agvw, String str, Object obj) {
        String str2 = agvw.a;
        if (str2 == null && agvw.b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        } else if (str2 == null || agvw.b == null) {
            this.c = agvw;
            this.d = str;
            this.g = obj;
        } else {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
    }

    public static agvx a(agvw agvw, String str, double d2) {
        return new agvr(agvw, str, Double.valueOf(d2));
    }

    public static void b(Context context) {
        synchronized (a) {
            if (b == null) {
                a(context);
            }
        }
    }

    private final Object d() {
        agvc agvc;
        Object a2;
        boolean z = this.c.g;
        String b2 = agvf.a(b).a("gms:phenotype:phenotype_flag:debug_bypass_phenotype");
        if (b2 == null || !aeeg.c.matcher(b2).matches()) {
            if (this.c.b == null) {
                agvc = agvz.a(b, this.c.a);
            } else if (agvi.a(b, this.c.b)) {
                boolean z2 = this.c.h;
                agvc = aguy.a(b.getContentResolver(), this.c.b);
            } else {
                agvc = null;
            }
            if (!(agvc == null || (a2 = agvc.a(b())) == null)) {
                return a(a2);
            }
        }
        return null;
    }

    private final Object e() {
        amqy amqy;
        String str;
        agvw agvw = this.c;
        if (!agvw.e && ((amqy = agvw.i) == null || ((Boolean) amqy.a(b)).booleanValue())) {
            agvf a2 = agvf.a(b);
            agvw agvw2 = this.c;
            if (!agvw2.e) {
                str = a(agvw2.c);
            } else {
                str = null;
            }
            String b2 = a2.a(str);
            if (b2 != null) {
                return a((Object) b2);
            }
        }
        return null;
    }

    public abstract Object a(Object obj);

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (r1 == null) goto L_0x0033;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c() {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = h
            int r0 = r0.get()
            int r1 = r6.i
            if (r1 >= r0) goto L_0x0072
            monitor-enter(r6)
            int r1 = r6.i     // Catch:{ all -> 0x006f }
            if (r1 >= r0) goto L_0x006d
            android.content.Context r1 = b     // Catch:{ all -> 0x006f }
            if (r1 == 0) goto L_0x0065
            agvw r1 = r6.c     // Catch:{ all -> 0x006f }
            boolean r1 = r1.f     // Catch:{ all -> 0x006f }
            if (r1 == 0) goto L_0x0027
            java.lang.Object r1 = r6.e()     // Catch:{ all -> 0x006f }
            if (r1 == 0) goto L_0x0020
            goto L_0x0035
        L_0x0020:
            java.lang.Object r1 = r6.d()     // Catch:{ all -> 0x006f }
            if (r1 != 0) goto L_0x0035
            goto L_0x0033
        L_0x0027:
            java.lang.Object r1 = r6.d()     // Catch:{ all -> 0x006f }
            if (r1 != 0) goto L_0x0035
            java.lang.Object r1 = r6.e()     // Catch:{ all -> 0x006f }
            if (r1 != 0) goto L_0x0035
        L_0x0033:
            java.lang.Object r1 = r6.g     // Catch:{ all -> 0x006f }
        L_0x0035:
            amsv r2 = f     // Catch:{ all -> 0x006f }
            java.lang.Object r2 = r2.a()     // Catch:{ all -> 0x006f }
            amri r2 = (defpackage.amri) r2     // Catch:{ all -> 0x006f }
            boolean r3 = r2.a()     // Catch:{ all -> 0x006f }
            if (r3 == 0) goto L_0x0060
            java.lang.Object r1 = r2.b()     // Catch:{ all -> 0x006f }
            agvg r1 = (defpackage.agvg) r1     // Catch:{ all -> 0x006f }
            agvw r2 = r6.c     // Catch:{ all -> 0x006f }
            android.net.Uri r3 = r2.b     // Catch:{ all -> 0x006f }
            java.lang.String r4 = r2.a     // Catch:{ all -> 0x006f }
            java.lang.String r2 = r2.d     // Catch:{ all -> 0x006f }
            java.lang.String r5 = r6.d     // Catch:{ all -> 0x006f }
            java.lang.String r1 = r1.a(r3, r4, r2, r5)     // Catch:{ all -> 0x006f }
            if (r1 == 0) goto L_0x005e
            java.lang.Object r1 = r6.a((java.lang.Object) r1)     // Catch:{ all -> 0x006f }
            goto L_0x0060
        L_0x005e:
            java.lang.Object r1 = r6.g     // Catch:{ all -> 0x006f }
        L_0x0060:
            r6.j = r1     // Catch:{ all -> 0x006f }
            r6.i = r0     // Catch:{ all -> 0x006f }
            goto L_0x006d
        L_0x0065:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006f }
            java.lang.String r1 = "Must call PhenotypeFlag.init() first"
            r0.<init>(r1)     // Catch:{ all -> 0x006f }
            throw r0     // Catch:{ all -> 0x006f }
        L_0x006d:
            monitor-exit(r6)     // Catch:{ all -> 0x006f }
            goto L_0x0072
        L_0x006f:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x006f }
            throw r0
        L_0x0072:
            java.lang.Object r0 = r6.j
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agvx.c():java.lang.Object");
    }

    public static agvx a(agvw agvw, String str, int i2) {
        return new agvp(agvw, str, Integer.valueOf(i2));
    }

    public static agvx a(agvw agvw, String str, long j2) {
        return new agvo(agvw, str, Long.valueOf(j2));
    }

    public static agvx a(agvw agvw, String str, Object obj, agvv agvv) {
        return new agvu(agvw, str, obj, agvv);
    }

    public final String b() {
        return a(this.c.d);
    }

    public static agvx a(agvw agvw, String str, String str2) {
        return new agvs(agvw, str, str2);
    }

    public final void b(Object obj) {
        if (obj != null) {
            this.j = obj;
            this.i = Integer.MAX_VALUE;
            if (e == null) {
                e = new ArrayList();
            }
            e.add(this);
            return;
        }
        this.i = -1;
    }

    public static agvx a(agvw agvw, String str, boolean z) {
        return new agvq(agvw, str, Boolean.valueOf(z));
    }

    public static agvx a(agvw agvw, String str, byte[] bArr) {
        return new agvt(agvw, str, bArr);
    }

    private final String a(String str) {
        if (str != null && str.isEmpty()) {
            return this.d;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.d);
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    static void a() {
        h.incrementAndGet();
    }

    public static void a(Context context) {
        synchronized (a) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (b != context) {
                aguy.c();
                agvz.c();
                agvf.a();
                a();
                b = context;
                f = amta.a(agvn.a);
            }
        }
    }
}
