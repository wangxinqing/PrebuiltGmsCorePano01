package defpackage;

import android.content.Context;

/* renamed from: ajhz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajhz {
    public final ajie a;
    public final ajhv b;
    public final ajmn c;
    public final boolean d;
    public ajhw e;
    public boolean f;
    final ajhy g;
    private final ajhx h;
    private final ajhu i;
    private final ajmo j;
    private int k = 0;

    public ajhz(Context context, ajhv ajhv, ajmo ajmo, ajmn ajmn) {
        ajhx ajhx = new ajhx(context);
        ajie ajie = new ajie(context);
        boolean c2 = ajnw.c(context);
        ajhu ajhu = new ajhu(context);
        ajhy ajhy = new ajhy(this);
        this.g = ajhy;
        this.h = ajhx;
        this.a = ajie;
        ajie.a(ajhy);
        this.b = ajhv;
        this.i = ajhu;
        this.d = c2;
        this.j = ajmo;
        this.c = ajmn;
    }

    public static void a(RuntimeException runtimeException) {
        ajix.b("GCoreUlr", 12, "Unexpected exception thrown by BleScanReportingController", runtimeException);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        r0 = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean e() {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x0024
            aztb r0 = defpackage.aztb.a
            aztc r0 = r0.a()
            boolean r0 = r0.O()
            if (r0 == 0) goto L_0x0024
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L_0x0024
            android.bluetooth.BluetoothAdapter r0 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            if (r0 == 0) goto L_0x0024
            boolean r0 = r0.isBleScanAlwaysAvailable()
            if (r0 == 0) goto L_0x0024
            r0 = 1
            return r0
        L_0x0024:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajhz.e():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        if (defpackage.ajht.g() != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean b() {
        /*
            r3 = this;
            monitor-enter(r3)
            ajhw r0 = r3.e     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0023
            int r0 = r3.k     // Catch:{ all -> 0x0026 }
            r1 = 1
            if (r0 == r1) goto L_0x0015
            r2 = 2
            if (r0 == r2) goto L_0x000e
            goto L_0x0023
        L_0x000e:
            boolean r0 = defpackage.ajht.g()     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x001b
            goto L_0x0023
        L_0x0015:
            boolean r0 = defpackage.ajht.g()     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0023
        L_0x001b:
            r3.d()     // Catch:{ all -> 0x0026 }
            r3.c()     // Catch:{ all -> 0x0026 }
            monitor-exit(r3)
            return r1
        L_0x0023:
            r0 = 0
            monitor-exit(r3)
            return r0
        L_0x0026:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajhz.b():boolean");
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [ajht] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r24 = this;
            r0 = r24
            boolean r1 = r0.f
            if (r1 == 0) goto L_0x0092
            boolean r1 = defpackage.ajif.a()
            if (r1 != 0) goto L_0x0012
            boolean r1 = e()
            if (r1 == 0) goto L_0x0092
        L_0x0012:
            ajhw r1 = r0.e
            if (r1 == 0) goto L_0x0018
            goto L_0x008c
        L_0x0018:
            boolean r1 = defpackage.ajht.g()
            java.lang.String r2 = "GCoreUlr"
            if (r1 == 0) goto L_0x003f
            r1 = 2
            r0.k = r1
            ajhx r1 = r0.h
            ajhv r3 = r0.b
            java.lang.String r4 = "GMS BLE building low power scanner"
            defpackage.ajix.a((java.lang.String) r2, (java.lang.String) r4)
            ajht r2 = new ajht
            android.content.Context r4 = r1.a
            jbs r5 = new jbs
            r5.<init>(r4)
            android.content.Context r1 = r1.a
            ajid r1 = defpackage.ajid.a((android.content.Context) r1)
            r2.<init>(r4, r5, r1, r3)
            goto L_0x008a
        L_0x003f:
            r1 = 1
            r0.k = r1
            ajhx r1 = r0.h
            ajhv r7 = r0.b
            ajhu r6 = r0.i
            ajmn r10 = r0.c
            ajmo r11 = r0.j
            java.lang.String r3 = "GMS BLE building location-aware scanner"
            defpackage.ajix.a((java.lang.String) r2, (java.lang.String) r3)
            android.content.Context r4 = r1.a
            aztb r1 = defpackage.aztb.a
            aztc r1 = r1.a()
            boolean r17 = r1.k()
            long r18 = defpackage.aztb.d()
            long r20 = defpackage.aztb.h()
            long r22 = defpackage.aztb.i()
            ajic r5 = new ajic
            jiu r14 = defpackage.jiu.a
            ajid r15 = defpackage.ajid.a((android.content.Context) r4)
            jbs r1 = new jbs
            r1.<init>(r4)
            r12 = r5
            r13 = r4
            r16 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r20, r22)
            ajhs r2 = new ajhs
            jbs r8 = new jbs
            r8.<init>(r4)
            jiu r9 = defpackage.jiu.a
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x008a:
            r0.e = r2
        L_0x008c:
            ajhw r1 = r0.e
            r1.a()
            return
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajhz.c():void");
    }

    public final void d() {
        ajhw ajhw = this.e;
        if (ajhw != null) {
            try {
                ajhw.b();
                this.e = null;
                this.k = 0;
            } catch (RuntimeException e2) {
                a(e2);
            }
        }
    }

    public final void a() {
        this.f = false;
        d();
        ajie ajie = this.a;
        if (ajie.e) {
            try {
                ajie.a.unregisterReceiver(ajie.f);
            } catch (IllegalArgumentException e2) {
            }
            ajie.e = false;
        }
    }
}
