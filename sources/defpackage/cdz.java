package defpackage;

import android.content.Context;
import com.google.android.contextmanager.producer.module.indooroutdoor.WifiFeatureGroupGenerator;
import java.util.concurrent.TimeUnit;

/* renamed from: cdz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cdz extends ccv {
    public static final long b = TimeUnit.SECONDS.toMillis(5);
    public static final long j = TimeUnit.SECONDS.toMillis(10);
    public static final ccj k = new ccj(new cdx(), "IndoorOutdoorProducer", new int[]{57}, (int[]) null, true);
    private final cer l = new cer(awvb.am, awvb.al, awvb.ak);
    private cgn m;

    public cdz(Context context, bsz bsz, String str, but but) {
        super(context, bsz, k, str, but);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(defpackage.cgn r8) {
        /*
            r7 = this;
            cer r0 = r7.l
            int r0 = r0.b
            r1 = 100
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x0038
            r1 = 102(0x66, float:1.43E-43)
            if (r0 == r1) goto L_0x0037
            r1 = 104(0x68, float:1.46E-43)
            if (r0 == r1) goto L_0x0035
            r1 = 105(0x69, float:1.47E-43)
            if (r0 == r1) goto L_0x0033
            jjg r1 = defpackage.bxk.a
            anie r1 = r1.b()
            anih r1 = (defpackage.anih) r1
            r2 = 200(0xc8, float:2.8E-43)
            java.lang.String r4 = "cdz"
            java.lang.String r5 = "a"
            java.lang.String r6 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r1 = r1.a((java.lang.String) r4, (java.lang.String) r5, (int) r2, (java.lang.String) r6)
            anih r1 = (defpackage.anih) r1
            java.lang.String r2 = "[IndoorOutdoorProducer] Unknown priority %s"
            r1.a((java.lang.String) r2, (int) r0)
            r2 = 0
            goto L_0x003a
        L_0x0033:
            r2 = 0
            goto L_0x003a
        L_0x0035:
            r2 = 0
            goto L_0x0039
        L_0x0037:
            goto L_0x003a
        L_0x0038:
        L_0x0039:
            r3 = 1
        L_0x003a:
            cgl r0 = r8.c
            r0.a = r2
            if (r2 == 0) goto L_0x0048
            boolean r1 = r0.b
            if (r1 == 0) goto L_0x004b
            r0.a()
            goto L_0x004b
        L_0x0048:
            r0.b()
        L_0x004b:
            r8.a(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdz.a(cgn):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void c() {
        /*
            r9 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            cgn r1 = r9.m
            r2 = 0
            r0[r2] = r1
            cer r1 = r9.l
            int r1 = r1.b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 1
            r0[r3] = r1
            cer r1 = r9.l
            long r4 = r1.c
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r4 = 2
            r0[r4] = r1
            cgn r0 = r9.m
            java.lang.String r1 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r4 = "cdz"
            if (r0 != 0) goto L_0x0052
            cdy r0 = new cdy
            r0.<init>(r9)
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            cgn r6 = new cgn     // Catch:{ IOException -> 0x0039 }
            android.content.Context r7 = r9.d     // Catch:{ IOException -> 0x0039 }
            r6.<init>(r7, r0, r5)     // Catch:{ IOException -> 0x0039 }
            r9.m = r6     // Catch:{ IOException -> 0x0039 }
            goto L_0x0052
        L_0x0039:
            r0 = move-exception
            jjg r0 = defpackage.bxk.a
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r2 = 227(0xe3, float:3.18E-43)
            java.lang.String r3 = "c"
            anie r0 = r0.a((java.lang.String) r4, (java.lang.String) r3, (int) r2, (java.lang.String) r1)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "[IndoorOutdoorProducer] The IndoorOutdoorGenerator couldn't be initialized due to an IOException"
            r0.a((java.lang.String) r1)
            return
        L_0x0052:
            cer r0 = r9.l
            long r5 = r0.c
            r7 = 5000(0x1388, double:2.4703E-320)
            long r5 = java.lang.Math.max(r5, r7)
            cgn r0 = r9.m
            cgp r0 = r0.a
            defpackage.cgp.a(r5)
            r0.c = r5
            r0.a()
            cgn r0 = r9.m
            cer r5 = r9.l
            int r5 = r5.b
            r6 = 100
            if (r5 == r6) goto L_0x009d
            r6 = 102(0x66, float:1.43E-43)
            if (r5 == r6) goto L_0x009b
            r6 = 104(0x68, float:1.46E-43)
            if (r5 == r6) goto L_0x0099
            r6 = 105(0x69, float:1.47E-43)
            if (r5 == r6) goto L_0x0097
            jjg r6 = defpackage.bxk.a
            anie r6 = r6.b()
            anih r6 = (defpackage.anih) r6
            r7 = 200(0xc8, float:2.8E-43)
            java.lang.String r8 = "a"
            anie r1 = r6.a((java.lang.String) r4, (java.lang.String) r8, (int) r7, (java.lang.String) r1)
            anih r1 = (defpackage.anih) r1
            java.lang.String r4 = "[IndoorOutdoorProducer] Unknown priority %s"
            r1.a((java.lang.String) r4, (int) r5)
            r1 = 0
            goto L_0x009f
        L_0x0097:
            r1 = 0
            goto L_0x009f
        L_0x0099:
            r1 = 1
            goto L_0x009f
        L_0x009b:
            r1 = 0
            goto L_0x009e
        L_0x009d:
            r1 = 1
        L_0x009e:
            r2 = 1
        L_0x009f:
            cgl r4 = r0.c
            r4.a = r2
            if (r2 == 0) goto L_0x00ad
            boolean r2 = r4.b
            if (r2 == 0) goto L_0x00b0
            r4.a()
            goto L_0x00b0
        L_0x00ad:
            r4.b()
        L_0x00b0:
            r0.a(r1)
            cgn r0 = r9.m
            boolean r1 = r0.e
            if (r1 != 0) goto L_0x0100
            r0.e = r3
            com.google.android.contextmanager.producer.module.indooroutdoor.WifiFeatureGroupGenerator r1 = r0.b
            boolean r2 = r1.c
            if (r2 != 0) goto L_0x00d2
            r1.c = r3
            android.content.Context r2 = r1.a
            android.content.IntentFilter r4 = new android.content.IntentFilter
            java.lang.String r5 = "android.net.wifi.SCAN_RESULTS"
            r4.<init>(r5)
            r5 = 0
            android.os.Handler r6 = r1.b
            r2.registerReceiver(r1, r4, r5, r6)
        L_0x00d2:
            cgp r1 = r0.a
            boolean r2 = r1.e
            if (r2 == 0) goto L_0x00d9
            goto L_0x00de
        L_0x00d9:
            r1.e = r3
            r1.a()
        L_0x00de:
            cgj r1 = r0.d
            boolean r2 = r1.b
            if (r2 != 0) goto L_0x00f0
            r1.b = r3
            android.os.Handler r2 = r1.e
            cgh r4 = new cgh
            r4.<init>(r1)
            r2.post(r4)
        L_0x00f0:
            cgl r0 = r0.c
            boolean r1 = r0.b
            if (r1 != 0) goto L_0x0100
            r0.b = r3
            boolean r1 = r0.a
            if (r1 == 0) goto L_0x0100
            r0.a()
            return
        L_0x0100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdz.c():void");
    }

    /* access modifiers changed from: protected */
    public final void b() {
        cgn cgn = this.m;
        if (cgn != null && cgn.e) {
            cgp cgp = cgn.a;
            cgp.e = false;
            cgp.a();
            WifiFeatureGroupGenerator wifiFeatureGroupGenerator = cgn.b;
            if (wifiFeatureGroupGenerator.c) {
                wifiFeatureGroupGenerator.a.unregisterReceiver(wifiFeatureGroupGenerator);
                wifiFeatureGroupGenerator.c = false;
            }
            cgl cgl = cgn.c;
            cgl.b();
            cgl.b = false;
            cgj cgj = cgn.d;
            if (cgj.b) {
                cgj.e.post(new cgi(cgj));
                cgj.b = false;
            }
            cgn.e = false;
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
        c();
    }

    public final void a(cas cas) {
        new Object[1][0] = cas;
        this.l.a(cas);
        c();
    }

    public final void a(cas cas, cas cas2) {
        Object[] objArr = {cas, cas2};
        this.l.a(cas, cas2);
        c();
    }
}
