package defpackage;

import android.content.Context;
import java.util.List;

/* renamed from: tul  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tul {
    private static final anax a = d();
    private static final anax b = c();
    private static final anax c = e();
    private final tzr d;
    private final tza e;
    private final txr f;
    private final tsu g;
    private final arwg h;
    private final Context i;

    public tul(Context context) {
        this.i = context;
        this.d = (tzr) thl.a(context, tzr.class);
        this.e = (tza) thl.a(context, tza.class);
        this.f = (txr) thl.a(context, txr.class);
        this.g = (tsu) thl.a(context, tsu.class);
        this.h = (arwg) thl.a(context, arwg.class);
    }

    public static List a() {
        if (aymw.n()) {
            return d().e();
        }
        return a.e();
    }

    public static List b() {
        if (aymw.n()) {
            return c().e();
        }
        return b.e();
    }

    private static anax c() {
        anav j = anax.j();
        j.b("com.google.android.gms.nearby.ACTION_FAST_PAIR_SCANNER_DOWNGRADE");
        j.b("com.google.android.gms.nearby.ACTION_FAST_PAIR_SCANNER_LOW_LATENCY_BURST");
        j.b("com.google.android.gms.nearby.ACTION_FAST_PAIR_SCANNER_LOW_LATENCY_BURST_FOR_BATTERY");
        if (aymw.ab() && aymw.X()) {
            j.b("com.google.android.gms.nearby.ACTION_FAST_PAIR_SCANNER_LOW_LATENCY_BURST_FOR_PAIRING");
        }
        if (aymw.ab() && aymw.v() && aymw.a.a().aX()) {
            j.b("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_NOTIFICATION_CLICKED");
        }
        if (aymw.E()) {
            j.b("com.google.android.gms.nearby.ACTION_FAST_PAIR_HALF_SHEET_CANCEL");
        }
        return j.a();
    }

    private static anax d() {
        anav j = anax.j();
        j.b("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_AUTO_TEST_SETUP");
        if (aymw.ab()) {
            j.b("android.intent.action.SCREEN_ON");
            j.b("android.intent.action.SCREEN_OFF");
            j.b("android.net.wifi.STATE_CHANGE");
            j.b("android.net.conn.CONNECTIVITY_CHANGE");
            j.b("android.bluetooth.adapter.action.STATE_CHANGED");
            j.b("com.google.android.gms.nearby.discovery:ACTION_MAGIC_PAIR");
            j.b("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_UNPAIR");
            j.b("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_PAIRING_PROCESS_DONE");
            j.b("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_NOTIFICATION_DISMISSED");
            j.b("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_NOTIFICATION_BANNED");
            if (aymw.a.a().aD()) {
                j.b("android.intent.action.LOCALE_CHANGED");
            }
        }
        return j.a();
    }

    private static anax e() {
        anav j = anax.j();
        j.b((Iterable) c());
        j.b((Iterable) d());
        return j.a();
    }

    public static boolean a(String str) {
        if (aymw.n()) {
            return e().contains(str);
        }
        return c.contains(str);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03e4, code lost:
        if (r14 != false) goto L_0x03e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03e6, code lost:
        r14 = r4.a.toUri(1);
        ((defpackage.anih) defpackage.tsp.a.d()).a("FastPairUtils: Item launched. launchedUrl %s", (java.lang.Object) r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03fa, code lost:
        ((defpackage.anih) defpackage.tsp.a.c()).a("FastPairUtils: Failed to launch intent %s", (java.lang.Object) r4);
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0408, code lost:
        ((defpackage.anih) defpackage.tsp.a.d()).a("FastPairHandler: Finished launching %s, %s", (java.lang.Object) r2.getAction(), (java.lang.Object) r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x041d, code lost:
        if (r2.getAction() == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0427, code lost:
        if (r2.getAction().equals("com.google.android.gms.nearby.discovery:ACTION_MAGIC_PAIR") != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0429, code lost:
        if (r14 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x042b, code lost:
        r13.e.a(r2.getIntExtra("com.google.android.gms.nearby.discovery.fastpair:EXTRA_NOTIFICATION_ID", -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Intent r14) {
        /*
            r13 = this;
            arwg r0 = r13.h
            r0.b()
            jjg r0 = defpackage.tsp.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = r14.getAction()
            java.lang.String r2 = "FastPairHandler: Received action %s"
            r0.a((java.lang.String) r2, (java.lang.Object) r1)
            java.lang.String r0 = "com.google.android.gms.nearby.discovery.fastpair:EXTRA_NOTIFICATION_ID"
            r1 = -1
            int r2 = r14.getIntExtra(r0, r1)
            java.lang.String r3 = "com.google.android.gms.nearby.discovery:EXTRA_PRIVATE_BLE_ADDRESS"
            java.lang.String r7 = r14.getStringExtra(r3)
            java.lang.String r3 = "com.google.android.gms.nearby.discovery:EXTRA_PUBLIC_ADDRESS"
            java.lang.String r3 = r14.getStringExtra(r3)
            java.lang.String r4 = r14.getAction()
            int r5 = r4.hashCode()
            r10 = 3
            r6 = 4
            r8 = 6
            r9 = 5
            java.lang.String r11 = "com.google.android.gms.nearby.discovery:ACTION_MAGIC_PAIR"
            r12 = 1
            switch(r5) {
                case -2128145023: goto L_0x00f7;
                case -2055695898: goto L_0x00ed;
                case -1530327060: goto L_0x00e3;
                case -1454123155: goto L_0x00d9;
                case -1433975472: goto L_0x00ce;
                case -1172645946: goto L_0x00c3;
                case -687493489: goto L_0x00b8;
                case -343630553: goto L_0x00ad;
                case -19011148: goto L_0x00a2;
                case 169758562: goto L_0x0097;
                case 257738786: goto L_0x008b;
                case 314392461: goto L_0x0080;
                case 388740751: goto L_0x0074;
                case 411712845: goto L_0x0069;
                case 639823527: goto L_0x005d;
                case 941344472: goto L_0x0051;
                case 1949616771: goto L_0x0046;
                case 2108582660: goto L_0x003d;
                default: goto L_0x003b;
            }
        L_0x003b:
            goto L_0x0101
        L_0x003d:
            boolean r4 = r4.equals(r11)
            if (r4 == 0) goto L_0x0101
            r4 = 1
            goto L_0x0102
        L_0x0046:
            java.lang.String r5 = "com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_PAIRING_PROCESS_DONE"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0101
            r4 = 3
            goto L_0x0102
        L_0x0051:
            java.lang.String r5 = "com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_NOTIFICATION_BANNED"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0101
            r4 = 9
            goto L_0x0102
        L_0x005d:
            java.lang.String r5 = "com.google.android.gms.nearby.ACTION_FAST_PAIR_SCANNER_LOW_LATENCY_BURST_FOR_BATTERY"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0101
            r4 = 11
            goto L_0x0102
        L_0x0069:
            java.lang.String r5 = "com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_UNPAIR"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0101
            r4 = 2
            goto L_0x0102
        L_0x0074:
            java.lang.String r5 = "com.google.android.gms.nearby.ACTION_FAST_PAIR_SCANNER_LOW_LATENCY_BURST"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0101
            r4 = 13
            goto L_0x0102
        L_0x0080:
            java.lang.String r5 = "com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_NOTIFICATION_CLICKED"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0101
            r4 = 0
            goto L_0x0102
        L_0x008b:
            java.lang.String r5 = "com.google.android.gms.nearby.ACTION_FAST_PAIR_HALF_SHEET_CANCEL"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0101
            r4 = 17
            goto L_0x0102
        L_0x0097:
            java.lang.String r5 = "com.google.android.gms.nearby.ACTION_FAST_PAIR_SCANNER_LOW_LATENCY_BURST_FOR_PAIRING"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0101
            r4 = 12
            goto L_0x0102
        L_0x00a2:
            java.lang.String r5 = "android.intent.action.LOCALE_CHANGED"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0101
            r4 = 10
            goto L_0x0102
        L_0x00ad:
            java.lang.String r5 = "android.net.wifi.STATE_CHANGE"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0101
            r4 = 15
            goto L_0x0102
        L_0x00b8:
            java.lang.String r5 = "com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_NOTIFICATION_DISMISSED"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0101
            r4 = 8
            goto L_0x0102
        L_0x00c3:
            java.lang.String r5 = "android.net.conn.CONNECTIVITY_CHANGE"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0101
            r4 = 16
            goto L_0x0102
        L_0x00ce:
            java.lang.String r5 = "com.google.android.gms.nearby.ACTION_FAST_PAIR_SCANNER_DOWNGRADE"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0101
            r4 = 14
            goto L_0x0102
        L_0x00d9:
            java.lang.String r5 = "android.intent.action.SCREEN_ON"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0101
            r4 = 4
            goto L_0x0102
        L_0x00e3:
            java.lang.String r5 = "android.bluetooth.adapter.action.STATE_CHANGED"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0101
            r4 = 6
            goto L_0x0102
        L_0x00ed:
            java.lang.String r5 = "com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_AUTO_TEST_SETUP"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0101
            r4 = 7
            goto L_0x0102
        L_0x00f7:
            java.lang.String r5 = "android.intent.action.SCREEN_OFF"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0101
            r4 = 5
            goto L_0x0102
        L_0x0101:
            r4 = -1
        L_0x0102:
            java.lang.String r5 = "com.google.android.gms.nearby.discovery.fastpair.MODEL_ID"
            switch(r4) {
                case 0: goto L_0x0353;
                case 1: goto L_0x032e;
                case 2: goto L_0x0326;
                case 3: goto L_0x02f9;
                case 4: goto L_0x02e5;
                case 5: goto L_0x02d1;
                case 6: goto L_0x025b;
                case 7: goto L_0x0233;
                case 8: goto L_0x021b;
                case 9: goto L_0x0205;
                case 10: goto L_0x01ed;
                case 11: goto L_0x01bc;
                case 12: goto L_0x0191;
                case 13: goto L_0x0181;
                case 14: goto L_0x0175;
                case 15: goto L_0x0146;
                case 16: goto L_0x0146;
                case 17: goto L_0x0108;
                default: goto L_0x0107;
            }
        L_0x0107:
            return
        L_0x0108:
            java.lang.String r0 = "com.google.android.gms.nearby.discovery.fastpair.halfsheet:ADDRESS"
            java.lang.String r14 = r14.getStringExtra(r0)
            jjg r0 = defpackage.tsp.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "FastPairHandler: HalfSheetManager report cancel device address %s"
            r0.a((java.lang.String) r1, (java.lang.Object) r14)
            android.content.Context r0 = r13.i
            java.lang.Class<tyw> r1 = defpackage.tyw.class
            java.lang.Object r0 = defpackage.thl.a((android.content.Context) r0, (java.lang.Class) r1)
            tyw r0 = (defpackage.tyw) r0
            android.util.LruCache r1 = r0.b
            java.lang.Object r14 = r1.get(r14)
            java.lang.Integer r14 = (java.lang.Integer) r14
            if (r14 == 0) goto L_0x0145
            jjg r1 = defpackage.tsp.a
            anie r1 = r1.d()
            anih r1 = (defpackage.anih) r1
            java.lang.String r2 = "HalfSheetManager: id %s half sheet is canceled"
            r1.a((java.lang.String) r2, (java.lang.Object) r14)
            tyu r0 = r0.a
            int r14 = r14.intValue()
            r0.a(r14, r8)
        L_0x0145:
            return
        L_0x0146:
            java.lang.String r0 = "networkInfo"
            android.os.Parcelable r14 = r14.getParcelableExtra(r0)
            android.net.NetworkInfo r14 = (android.net.NetworkInfo) r14
            if (r14 == 0) goto L_0x0174
            boolean r14 = r14.isConnected()
            if (r14 == 0) goto L_0x0174
            aymw r14 = defpackage.aymw.a
            aymx r14 = r14.a()
            boolean r14 = r14.au()
            if (r14 == 0) goto L_0x0174
            android.content.Context r14 = r13.i
            java.lang.Class<tvs> r0 = defpackage.tvs.class
            java.lang.Object r14 = defpackage.thl.a((android.content.Context) r14, (java.lang.Class) r0)
            tvs r14 = (defpackage.tvs) r14
            tvr r14 = r14.a
            tub r14 = r14.c
            r14.b()
        L_0x0174:
            return
        L_0x0175:
            boolean r14 = defpackage.aymw.ab()
            if (r14 == 0) goto L_0x0180
            tzr r14 = r13.d
            r14.c()
        L_0x0180:
            return
        L_0x0181:
            boolean r14 = defpackage.aymw.ab()
            if (r14 == 0) goto L_0x0190
            tzr r14 = r13.d
            long r0 = defpackage.aymt.n()
            r14.a((long) r0)
        L_0x0190:
            return
        L_0x0191:
            boolean r14 = defpackage.aymw.ab()
            if (r14 == 0) goto L_0x01ae
            boolean r14 = defpackage.aymw.X()
            if (r14 != 0) goto L_0x019e
            goto L_0x01ae
        L_0x019e:
            tzr r14 = r13.d
            aymt r0 = defpackage.aymt.a
            aymu r0 = r0.a()
            long r0 = r0.al()
            r14.a((long) r0)
            return
        L_0x01ae:
            jjg r14 = defpackage.tsp.a
            anie r14 = r14.d()
            anih r14 = (defpackage.anih) r14
            java.lang.String r0 = "FastPairHandler: low latency burst for pairing is not supported."
            r14.a((java.lang.String) r0)
            return
        L_0x01bc:
            boolean r14 = defpackage.aymw.ab()
            if (r14 == 0) goto L_0x01df
            aymw r14 = defpackage.aymw.a
            aymx r14 = r14.a()
            boolean r14 = r14.bw()
            if (r14 != 0) goto L_0x01cf
            goto L_0x01df
        L_0x01cf:
            tzr r14 = r13.d
            aymt r0 = defpackage.aymt.a
            aymu r0 = r0.a()
            long r0 = r0.ak()
            r14.a((long) r0)
            return
        L_0x01df:
            jjg r14 = defpackage.tsp.a
            anie r14 = r14.d()
            anih r14 = (defpackage.anih) r14
            java.lang.String r0 = "FastPairHandler: low latency burst for battery is not supported."
            r14.a((java.lang.String) r0)
            return
        L_0x01ed:
            jjg r14 = defpackage.tsp.a
            anie r14 = r14.d()
            anih r14 = (defpackage.anih) r14
            java.lang.String r0 = "FastPairHandler: user locale change evict memory cache"
            r14.a((java.lang.String) r0)
            txr r14 = r13.f
            r14.evictAll()
            txs r14 = r14.a
            r14.c()
            return
        L_0x0205:
            if (r2 == r1) goto L_0x021a
            tsu r4 = r13.g
            asom r0 = defpackage.asom.FAST_PAIR_NOTIFICATION_DO_NOT_SHOW_CLICKED
            java.lang.String r6 = r14.getStringExtra(r5)
            r8 = 0
            r5 = r0
            r4.a((defpackage.asom) r5, (java.lang.String) r6, (java.lang.String) r7, (long) r8)
            tza r14 = r13.e
            r14.a((int) r2)
        L_0x021a:
            return
        L_0x021b:
            if (r2 == r1) goto L_0x0232
            tsu r4 = r13.g
            asom r0 = defpackage.asom.FAST_PAIR_NOTIFICATION_DISMISSED
            java.lang.String r6 = r14.getStringExtra(r5)
            r8 = 0
            r5 = r0
            r4.a((defpackage.asom) r5, (java.lang.String) r6, (java.lang.String) r7, (long) r8)
            tza r14 = r13.e
            tyy r14 = r14.e
            r14.a(r2, r10)
        L_0x0232:
            return
        L_0x0233:
            jjg r14 = defpackage.tsp.a
            anie r14 = r14.d()
            anih r14 = (defpackage.anih) r14
            java.lang.String r0 = "FastPairAutoTest: LogLevel info"
            r14.a((java.lang.String) r0)
            jjg r14 = defpackage.tsp.a
            anie r14 = r14.c()
            anih r14 = (defpackage.anih) r14
            java.lang.String r0 = "FastPairAutoTest: LogLevel warning"
            r14.a((java.lang.String) r0)
            jjg r14 = defpackage.tsp.a
            anie r14 = r14.b()
            anih r14 = (defpackage.anih) r14
            java.lang.String r0 = "FastPairAutoTest: LogLevel severe"
            r14.a((java.lang.String) r0)
            return
        L_0x025b:
            android.content.Context r14 = r13.i
            boolean r14 = defpackage.tga.a((android.content.Context) r14)
            if (r14 == 0) goto L_0x02d0
            boolean r14 = defpackage.aymw.ab()
            if (r14 == 0) goto L_0x02d0
            aymw r14 = defpackage.aymw.a
            aymx r14 = r14.a()
            boolean r14 = r14.g()
            if (r14 == 0) goto L_0x02d0
            aymw r14 = defpackage.aymw.a
            aymx r14 = r14.a()
            boolean r14 = r14.w()
            if (r14 != 0) goto L_0x0288
            tzr r14 = r13.d
            boolean r14 = r14.g()
            goto L_0x02b1
        L_0x0288:
            jjg r14 = defpackage.tsp.a
            anie r14 = r14.d()
            anih r14 = (defpackage.anih) r14
            boolean r0 = defpackage.arxk.b()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = defpackage.arxk.a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r2 = defpackage.arxk.c()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r3 = "FastPairScanner2: isBleEnabled? bleEnabled:%b, btEnabled:%b, bleScanAvailable:%b"
            r14.a((java.lang.String) r3, (java.lang.Object) r0, (java.lang.Object) r1, (java.lang.Object) r2)
            boolean r14 = defpackage.arxk.b()
        L_0x02b1:
            tzr r0 = r13.d
            boolean r0 = r0.f()
            if (r14 == 0) goto L_0x02c6
            if (r0 == 0) goto L_0x02bc
            goto L_0x02c6
        L_0x02bc:
            tzr r14 = r13.d
            long r0 = defpackage.aymt.n()
            r14.a((long) r0)
            return
        L_0x02c6:
            if (r14 != 0) goto L_0x02d0
            if (r0 == 0) goto L_0x02d0
            tzr r14 = r13.d
            r14.e()
            return
        L_0x02d0:
            return
        L_0x02d1:
            android.content.Context r14 = r13.i
            boolean r14 = defpackage.tga.a((android.content.Context) r14)
            if (r14 == 0) goto L_0x02e4
            boolean r14 = defpackage.aymw.ab()
            if (r14 == 0) goto L_0x02e4
            tzr r14 = r13.d
            r14.e()
        L_0x02e4:
            return
        L_0x02e5:
            android.content.Context r14 = r13.i
            boolean r14 = defpackage.tga.a((android.content.Context) r14)
            if (r14 == 0) goto L_0x02f8
            boolean r14 = defpackage.aymw.ab()
            if (r14 == 0) goto L_0x02f8
            tzr r14 = r13.d
            r14.b()
        L_0x02f8:
            return
        L_0x02f9:
            java.lang.String r0 = "com.google.android.gms.nearby.discovery:EXTRA_NOTIFICATION_ID"
            int r0 = r14.getIntExtra(r0, r1)
            java.lang.String r1 = "com.google.android.gms.nearby.discovery:EXTRA_SUCCESS"
            boolean r14 = r14.getBooleanExtra(r1, r12)
            tza r1 = r13.e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r14 == 0) goto L_0x031b
            if (r3 == 0) goto L_0x0315
            android.util.LruCache r14 = r1.b
            r14.put(r3, r2)
        L_0x0315:
            tyy r14 = r1.e
            r14.a(r0, r9)
            return
        L_0x031b:
            tyy r14 = r1.e
            r14.b(r0)
            android.util.LruCache r14 = r1.b
            r14.remove(r7)
            return
        L_0x0326:
            if (r3 == 0) goto L_0x032d
            tza r14 = r13.e
            r14.a((java.lang.String) r3)
        L_0x032d:
            return
        L_0x032e:
            if (r2 == r1) goto L_0x0352
            tza r14 = r13.e
            arwg r0 = r14.i
            android.util.LruCache r1 = r14.c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.get(r3)
            arwm r1 = (defpackage.arwm) r1
            r0.e(r1)
            android.util.LruCache r0 = r14.c
            r0.remove(r3)
            tyy r0 = r14.e
            r0.a(r2, r6)
            tyx r14 = r14.h
            r14.a(r2)
        L_0x0352:
            return
        L_0x0353:
            tsu r4 = r13.g
            asom r2 = defpackage.asom.FAST_PAIR_NOTIFICATION_CLICKED
            java.lang.String r6 = r14.getStringExtra(r5)
            r8 = 0
            r5 = r2
            r4.a((defpackage.asom) r5, (java.lang.String) r6, (java.lang.String) r7, (long) r8)
            java.lang.String r2 = "com.google.android.gms.nearby.discovery:ACTION_FORWARDED_ACTION_URL"
            android.os.Parcelable r2 = r14.getParcelableExtra(r2)
            android.content.Intent r2 = (android.content.Intent) r2
            if (r2 != 0) goto L_0x0379
            jjg r14 = defpackage.tsp.a
            anie r14 = r14.c()
            anih r14 = (defpackage.anih) r14
            java.lang.String r0 = "FastPairHandler: Notification clicked with malformatted redirect intent"
            r14.a((java.lang.String) r0)
            return
        L_0x0379:
            java.lang.String r3 = "com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID"
            boolean r4 = r2.hasExtra(r3)
            if (r4 == 0) goto L_0x0385
            r2.removeExtra(r3)
        L_0x0385:
            java.lang.String r3 = r14.getPackage()
            if (r3 == 0) goto L_0x0435
            java.lang.String r3 = r14.getPackage()
            android.content.Context r4 = r13.i
            java.lang.String r4 = r4.getPackageName()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x039d
            goto L_0x0435
        L_0x039d:
            java.lang.String r3 = "com.google.android.gms.nearby.discovery:ACTION_FORWARDED_ACTION_URL_TYPE"
            int r14 = r14.getIntExtra(r3, r1)
            android.content.Context r3 = r13.i
            uam r4 = new uam
            java.lang.String r5 = r2.getPackage()
            r4.<init>(r2, r14, r5)
            int r14 = r4.b
            switch(r14) {
                case 1: goto L_0x03d6;
                case 2: goto L_0x03cf;
                case 3: goto L_0x03d6;
                case 4: goto L_0x03cf;
                case 5: goto L_0x03c8;
                case 6: goto L_0x03c2;
                default: goto L_0x03b4;
            }
        L_0x03b4:
            jjg r14 = defpackage.tsp.a
            anie r14 = r14.c()
            anih r14 = (defpackage.anih) r14
            java.lang.String r3 = "FastPairUtils: Failed to match intent type with redirect scheme"
            r14.a((java.lang.String) r3)
            goto L_0x03fa
        L_0x03c2:
            android.content.Intent r14 = r4.a
            r3.sendBroadcast(r14)
            goto L_0x03e6
        L_0x03c8:
            android.content.Intent r14 = r4.a
            boolean r14 = defpackage.tvq.b(r3, r14)
            goto L_0x03e4
        L_0x03cf:
            android.content.Intent r14 = r4.a
            boolean r14 = defpackage.tvq.a((android.content.Context) r3, (android.content.Intent) r14)
            goto L_0x03e4
        L_0x03d6:
            android.content.Intent r14 = r4.a
            boolean r14 = defpackage.tvq.a((android.content.Context) r3, (android.content.Intent) r14)
            if (r14 != 0) goto L_0x03e4
            android.content.Intent r14 = r4.a
            boolean r14 = defpackage.tvq.b(r3, r14)
        L_0x03e4:
            if (r14 == 0) goto L_0x03fa
        L_0x03e6:
            android.content.Intent r14 = r4.a
            java.lang.String r14 = r14.toUri(r12)
            jjg r3 = defpackage.tsp.a
            anie r3 = r3.d()
            anih r3 = (defpackage.anih) r3
            java.lang.String r4 = "FastPairUtils: Item launched. launchedUrl %s"
            r3.a((java.lang.String) r4, (java.lang.Object) r14)
            goto L_0x0408
        L_0x03fa:
            jjg r14 = defpackage.tsp.a
            anie r14 = r14.c()
            anih r14 = (defpackage.anih) r14
            java.lang.String r3 = "FastPairUtils: Failed to launch intent %s"
            r14.a((java.lang.String) r3, (java.lang.Object) r4)
            r14 = 0
        L_0x0408:
            jjg r3 = defpackage.tsp.a
            anie r3 = r3.d()
            anih r3 = (defpackage.anih) r3
            java.lang.String r4 = r2.getAction()
            java.lang.String r5 = "FastPairHandler: Finished launching %s, %s"
            r3.a((java.lang.String) r5, (java.lang.Object) r4, (java.lang.Object) r14)
            java.lang.String r3 = r2.getAction()
            if (r3 == 0) goto L_0x0434
            java.lang.String r3 = r2.getAction()
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L_0x0434
            if (r14 == 0) goto L_0x0434
            tza r14 = r13.e
            int r0 = r2.getIntExtra(r0, r1)
            r14.a((int) r0)
        L_0x0434:
            return
        L_0x0435:
            jjg r0 = defpackage.tsp.a
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            java.lang.String r14 = r14.getPackage()
            java.lang.String r1 = "FastPairHandler: ignoring click action from invalid package, %s"
            r0.a((java.lang.String) r1, (java.lang.Object) r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tul.a(android.content.Intent):void");
    }
}
