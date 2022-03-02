package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.nearby.discovery.fastpair.battery.BatteryAdvertisement;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: txb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class txb {
    public final txd a;
    public final Map b = new HashMap();
    public final Set c = new HashSet();
    public auay d = null;
    private final Context e;
    private arxt f;
    private aryx g;
    private final txe h;
    private final arwm i = new twz(this, "dismissBatteryNotification");

    public txb(Context context) {
        this.e = context;
        this.a = (txd) thl.a(context, txd.class);
        this.h = new txe(context);
        if (aymw.f()) {
            this.g = (aryx) thl.a(context, aryx.class);
            if (aymw.a.a().n()) {
                this.g.a(new txa(this));
            }
        }
    }

    private final void c(BatteryAdvertisement batteryAdvertisement) {
        aehb.a(this.e);
        txe txe = this.h;
        String str = batteryAdvertisement.a;
        TrueWirelessHeadset a2 = batteryAdvertisement.a();
        if (aymw.a.a().bp()) {
            Intent intent = new Intent("com.google.android.gms.nearby.discovery.ACTION_BATTERY_CHANGED");
            intent.setPackage(aymt.a.a().aY());
            intent.putExtra("com.google.android.gms.nearby.discovery.EXTRA_DEVICE_ADDRESS", str);
            intent.putExtra("com.google.android.gms.nearby.discovery.EXTRA_BATTERY_DETAIL", a2);
            txe.a.sendBroadcast(intent);
            return;
        }
        ((anih) tsp.a.d()).a("SmartBatteryHelper: disabled.");
    }

    private final void d(BatteryAdvertisement batteryAdvertisement) {
        TrueWirelessHeadset a2;
        if (aymw.a.a().M()) {
            auay auay = this.d;
            if ((auay == null || !auay.equals(batteryAdvertisement.f)) && batteryAdvertisement.c) {
                int i2 = batteryAdvertisement.s;
                if (i2 == 0) {
                    throw null;
                } else if (i2 == 1) {
                    jjg jjg = tsp.a;
                    this.a.a(batteryAdvertisement.a);
                }
            }
            auay auay2 = this.d;
            if (auay2 != null) {
                if (auay2.equals(batteryAdvertisement.f)) {
                    arwg arwg = (arwg) thl.a(this.e, arwg.class);
                    if (!f(batteryAdvertisement)) {
                        ((anih) tsp.a.d()).a("FastPairBattery: suppress battery notification with %s", (Object) batteryAdvertisement);
                        e(batteryAdvertisement);
                        arwg.e(this.i);
                        return;
                    }
                    if (batteryAdvertisement.r) {
                        TrueWirelessHeadset a3 = batteryAdvertisement.a();
                        if (a3 != null) {
                            this.a.a(a3, batteryAdvertisement.a, batteryAdvertisement.f);
                            batteryAdvertisement.r = false;
                            ((anih) tsp.a.d()).a("FastPairBattery: update battery notification with %s", (Object) batteryAdvertisement);
                        } else {
                            return;
                        }
                    }
                    arwg.e(this.i);
                    int i3 = batteryAdvertisement.s;
                    if (i3 == 0) {
                        throw null;
                    } else if (i3 == 1) {
                        arwg.a(this.i, TimeUnit.SECONDS.toMillis(aymt.f()));
                    }
                }
            } else if (!batteryAdvertisement.q && f(batteryAdvertisement)) {
                if (!f(batteryAdvertisement)) {
                    batteryAdvertisement.q = false;
                    ((anih) tsp.a.d()).a("FastPairBattery: ignore creation, it's a suppress battery notification, %s", (Object) batteryAdvertisement);
                } else if (batteryAdvertisement.d <= aymt.i() && (a2 = batteryAdvertisement.a()) != null) {
                    this.a.a(a2, batteryAdvertisement.a, batteryAdvertisement.f);
                    batteryAdvertisement.q = true;
                    batteryAdvertisement.r = false;
                    ((anih) tsp.a.d()).a("FastPairBattery: create battery notification with %s", (Object) batteryAdvertisement);
                    int i4 = batteryAdvertisement.s;
                    if (i4 == 0) {
                        throw null;
                    } else if (i4 == 1) {
                        ((arwg) thl.a(this.e, arwg.class)).a(this.i, TimeUnit.SECONDS.toMillis(aymt.f()));
                    }
                } else {
                    return;
                }
                this.d = batteryAdvertisement.f;
                if (!batteryAdvertisement.c) {
                    ((anih) tsp.a.d()).a("FastPairBattery: Increasing scan frequency.");
                    if (aymw.ab()) {
                        thp.a(this.e, "com.google.android.gms.nearby.ACTION_FAST_PAIR_SCANNER_LOW_LATENCY_BURST_FOR_BATTERY");
                    } else {
                        thp.a(this.e, "com.google.android.gms.nearby.ACTION_LOW_LATENCY_SCAN_BURST");
                    }
                }
            }
        }
    }

    private final synchronized void e(BatteryAdvertisement batteryAdvertisement) {
        a(batteryAdvertisement);
        if (batteryAdvertisement != null) {
            this.a.a(batteryAdvertisement.a);
        }
    }

    private final boolean f(BatteryAdvertisement batteryAdvertisement) {
        if (!batteryAdvertisement.c) {
            return true;
        }
        if (!b(batteryAdvertisement.a)) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr = batteryAdvertisement.b;
            if (i2 >= bArr.length) {
                return false;
            }
            byte b2 = bArr[i2];
            int a2 = BatteryAdvertisement.a(b2);
            if (a2 != -1) {
                if (((long) a2) <= (i2 != 2 ? aymt.e() : aymt.d()) && !BatteryAdvertisement.b(b2)) {
                    return true;
                }
            }
            i2++;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: aucj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: uaj} */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0088, code lost:
        r0 = r4.c;
        r4 = defpackage.aubs.c();
        r5 = defpackage.uaj.K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r0 = r0.h();
        r5 = (defpackage.aucj) r5.c(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r6 = defpackage.aueh.a.a((java.lang.Object) r5);
        r6.a(r5, defpackage.aubd.a(r0), r4);
        r6.d(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r0.a(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        defpackage.aucj.b(r5);
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bf, code lost:
        if ((r0.getCause() instanceof defpackage.auda) != false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c7, code lost:
        throw ((defpackage.auda) r0.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d0, code lost:
        if ((r0.getCause() instanceof defpackage.auda) == false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00db, code lost:
        throw new defpackage.auda(r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e2, code lost:
        throw ((defpackage.auda) r0.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e9, code lost:
        java.lang.Thread.currentThread().interrupt();
        r4 = (defpackage.anih) defpackage.tsp.a.c();
        r4.a((java.lang.Throwable) r0);
        r4.a("FastPairBattery: Failed to read device from Footprints");
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0104, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e8 A[ExcHandler: InterruptedException (r0v11 'e' java.lang.InterruptedException A[CUSTOM_DECLARE]), Splitter:B:14:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0104 A[EDGE_INSN: B:37:?->B:65:0x0104 ?: BREAK  , ExcHandler: ExecutionException (e java.util.concurrent.ExecutionException), Splitter:B:14:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0118 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0173 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.nearby.discovery.fastpair.battery.BatteryAdvertisement a(java.lang.String r9) {
        /*
            r8 = this;
            android.content.Context r0 = r8.e
            java.lang.Class<ttf> r1 = defpackage.ttf.class
            java.lang.Object r0 = defpackage.thl.a((android.content.Context) r0, (java.lang.Class) r1)
            ttf r0 = (defpackage.ttf) r0
            tzi r0 = r0.a((java.lang.String) r9)
            r1 = 0
            if (r0 != 0) goto L_0x001f
            jjg r0 = defpackage.tsp.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            java.lang.String r2 = "FastPairBattery: No associated accountKey is found when query battery info, address:%s"
            r0.a((java.lang.String) r2, (java.lang.Object) r9)
            return r1
        L_0x001f:
            jjg r2 = defpackage.tsp.a
            anie r2 = r2.d()
            anih r2 = (defpackage.anih) r2
            java.lang.String r3 = "FastPairBattery: query battery advertisement, address: %s"
            r2.a((java.lang.String) r3, (java.lang.Object) r9)
            auay r2 = r0.c
            monitor-enter(r8)
            com.google.android.gms.nearby.discovery.fastpair.battery.BatteryAdvertisement r3 = r8.b((defpackage.auay) r2)     // Catch:{ all -> 0x0174 }
            monitor-exit(r8)     // Catch:{ all -> 0x0174 }
            int r4 = r0.a
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0042
            uaj r0 = r0.n
            if (r0 != 0) goto L_0x0116
            uaj r0 = defpackage.uaj.K
            goto L_0x0116
        L_0x0042:
            monitor-enter(r8)     // Catch:{ ExecutionException -> 0x0104, auda -> 0x0102, InterruptedException -> 0x00e8 }
            arxt r0 = r8.f     // Catch:{ all -> 0x00e5 }
            if (r0 != 0) goto L_0x0053
            android.content.Context r0 = r8.e     // Catch:{ all -> 0x00e5 }
            java.lang.Class<arxt> r4 = defpackage.arxt.class
            java.lang.Object r0 = defpackage.thl.a((android.content.Context) r0, (java.lang.Class) r4)     // Catch:{ all -> 0x00e5 }
            arxt r0 = (defpackage.arxt) r0     // Catch:{ all -> 0x00e5 }
            r8.f = r0     // Catch:{ all -> 0x00e5 }
        L_0x0053:
            monitor-exit(r8)     // Catch:{ all -> 0x00e5 }
            arxt r0 = r8.f     // Catch:{ ExecutionException -> 0x0104, auda -> 0x0102, InterruptedException -> 0x00e8 }
            aorr r0 = r0.a()     // Catch:{ ExecutionException -> 0x0104, auda -> 0x0102, InterruptedException -> 0x00e8 }
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x0104, auda -> 0x0102, InterruptedException -> 0x00e8 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ ExecutionException -> 0x0104, auda -> 0x0102, InterruptedException -> 0x00e8 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ ExecutionException -> 0x0104, auda -> 0x0102, InterruptedException -> 0x00e8 }
        L_0x0064:
            boolean r4 = r0.hasNext()     // Catch:{ ExecutionException -> 0x0104, auda -> 0x0102, InterruptedException -> 0x00e8 }
            if (r4 != 0) goto L_0x007a
            jjg r0 = defpackage.tsp.a     // Catch:{ ExecutionException -> 0x0104, auda -> 0x0102, InterruptedException -> 0x00e8 }
            anie r0 = r0.d()     // Catch:{ ExecutionException -> 0x0104, auda -> 0x0102, InterruptedException -> 0x00e8 }
            anih r0 = (defpackage.anih) r0     // Catch:{ ExecutionException -> 0x0104, auda -> 0x0102, InterruptedException -> 0x00e8 }
            java.lang.String r4 = "FastPairBattery: No matched accountKey on Footprints"
            r0.a((java.lang.String) r4)     // Catch:{ ExecutionException -> 0x0104, auda -> 0x0102, InterruptedException -> 0x00e8 }
            r0 = r1
            goto L_0x0116
        L_0x007a:
            java.lang.Object r4 = r0.next()     // Catch:{ ExecutionException -> 0x0104, auda -> 0x0102, InterruptedException -> 0x00e8 }
            tzj r4 = (defpackage.tzj) r4     // Catch:{ ExecutionException -> 0x0104, auda -> 0x0102, InterruptedException -> 0x00e8 }
            auay r5 = r4.b     // Catch:{ ExecutionException -> 0x0104, auda -> 0x0102, InterruptedException -> 0x00e8 }
            boolean r5 = r5.equals(r2)     // Catch:{ ExecutionException -> 0x0104, auda -> 0x0102, InterruptedException -> 0x00e8 }
            if (r5 == 0) goto L_0x0064
            auay r0 = r4.c     // Catch:{ ExecutionException -> 0x0104, auda -> 0x0102, InterruptedException -> 0x00e8 }
            aubs r4 = defpackage.aubs.c()     // Catch:{ ExecutionException -> 0x0104, auda -> 0x0102, InterruptedException -> 0x00e8 }
            uaj r5 = defpackage.uaj.K     // Catch:{ ExecutionException -> 0x0104, auda -> 0x0102, InterruptedException -> 0x00e8 }
            aubc r0 = r0.h()     // Catch:{ auda -> 0x00e3, ExecutionException -> 0x0104, InterruptedException -> 0x00e8 }
            r6 = 4
            java.lang.Object r5 = r5.c(r6)     // Catch:{ auda -> 0x00e3, ExecutionException -> 0x0104, InterruptedException -> 0x00e8 }
            aucj r5 = (defpackage.aucj) r5     // Catch:{ auda -> 0x00e3, ExecutionException -> 0x0104, InterruptedException -> 0x00e8 }
            aueh r6 = defpackage.aueh.a     // Catch:{ IOException -> 0x00c9, RuntimeException -> 0x00b8 }
            aueq r6 = r6.a((java.lang.Object) r5)     // Catch:{ IOException -> 0x00c9, RuntimeException -> 0x00b8 }
            aubd r7 = defpackage.aubd.a((defpackage.aubc) r0)     // Catch:{ IOException -> 0x00c9, RuntimeException -> 0x00b8 }
            r6.a(r5, r7, r4)     // Catch:{ IOException -> 0x00c9, RuntimeException -> 0x00b8 }
            r6.d(r5)     // Catch:{ IOException -> 0x00c9, RuntimeException -> 0x00b8 }
            r4 = 0
            r0.a((int) r4)     // Catch:{ auda -> 0x00b6, ExecutionException -> 0x0104, InterruptedException -> 0x00e8 }
            defpackage.aucj.b((defpackage.aucj) r5)     // Catch:{ ExecutionException -> 0x0104, auda -> 0x0102, InterruptedException -> 0x00e8 }
            r0 = r5
            uaj r0 = (defpackage.uaj) r0     // Catch:{ ExecutionException -> 0x0104, auda -> 0x0102, InterruptedException -> 0x00e8 }
            goto L_0x0116
        L_0x00b6:
            r0 = move-exception
            throw r0     // Catch:{ auda -> 0x00e3, ExecutionException -> 0x0104, InterruptedException -> 0x00e8 }
        L_0x00b8:
            r0 = move-exception
            java.lang.Throwable r4 = r0.getCause()     // Catch:{ auda -> 0x00e3, ExecutionException -> 0x0104, InterruptedException -> 0x00e8 }
            boolean r4 = r4 instanceof defpackage.auda     // Catch:{ auda -> 0x00e3, ExecutionException -> 0x0104, InterruptedException -> 0x00e8 }
            if (r4 == 0) goto L_0x00c8
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ auda -> 0x00e3, ExecutionException -> 0x0104, InterruptedException -> 0x00e8 }
            auda r0 = (defpackage.auda) r0     // Catch:{ auda -> 0x00e3, ExecutionException -> 0x0104, InterruptedException -> 0x00e8 }
            throw r0     // Catch:{ auda -> 0x00e3, ExecutionException -> 0x0104, InterruptedException -> 0x00e8 }
        L_0x00c8:
            throw r0     // Catch:{ auda -> 0x00e3, ExecutionException -> 0x0104, InterruptedException -> 0x00e8 }
        L_0x00c9:
            r0 = move-exception
            java.lang.Throwable r4 = r0.getCause()     // Catch:{ auda -> 0x00e3, ExecutionException -> 0x0104, InterruptedException -> 0x00e8 }
            boolean r4 = r4 instanceof defpackage.auda     // Catch:{ auda -> 0x00e3, ExecutionException -> 0x0104, InterruptedException -> 0x00e8 }
            if (r4 != 0) goto L_0x00dc
            auda r4 = new auda     // Catch:{ auda -> 0x00e3, ExecutionException -> 0x0104, InterruptedException -> 0x00e8 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ auda -> 0x00e3, ExecutionException -> 0x0104, InterruptedException -> 0x00e8 }
            r4.<init>((java.lang.String) r0)     // Catch:{ auda -> 0x00e3, ExecutionException -> 0x0104, InterruptedException -> 0x00e8 }
            throw r4     // Catch:{ auda -> 0x00e3, ExecutionException -> 0x0104, InterruptedException -> 0x00e8 }
        L_0x00dc:
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ auda -> 0x00e3, ExecutionException -> 0x0104, InterruptedException -> 0x00e8 }
            auda r0 = (defpackage.auda) r0     // Catch:{ auda -> 0x00e3, ExecutionException -> 0x0104, InterruptedException -> 0x00e8 }
            throw r0     // Catch:{ auda -> 0x00e3, ExecutionException -> 0x0104, InterruptedException -> 0x00e8 }
        L_0x00e3:
            r0 = move-exception
            throw r0     // Catch:{ ExecutionException -> 0x0104, auda -> 0x0102, InterruptedException -> 0x00e8 }
        L_0x00e5:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00e5 }
            throw r0     // Catch:{ ExecutionException -> 0x0104, auda -> 0x0102, InterruptedException -> 0x00e8 }
        L_0x00e8:
            r0 = move-exception
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r4.interrupt()
            jjg r4 = defpackage.tsp.a
            anie r4 = r4.c()
            anih r4 = (defpackage.anih) r4
            r4.a((java.lang.Throwable) r0)
            java.lang.String r0 = "FastPairBattery: Failed to read device from Footprints"
            r4.a((java.lang.String) r0)
            r0 = r1
            goto L_0x0116
        L_0x0102:
            r0 = move-exception
            goto L_0x0105
        L_0x0104:
            r0 = move-exception
        L_0x0105:
            jjg r4 = defpackage.tsp.a
            anie r4 = r4.c()
            anih r4 = (defpackage.anih) r4
            r4.a((java.lang.Throwable) r0)
            java.lang.String r0 = "FastPairBattery: Failed to read device from Footprints"
            r4.a((java.lang.String) r0)
            r0 = r1
        L_0x0116:
            if (r0 == 0) goto L_0x0173
            if (r3 != 0) goto L_0x0136
            boolean r4 = defpackage.arwx.a(r0)
            if (r4 == 0) goto L_0x0136
            com.google.android.gms.nearby.discovery.fastpair.battery.BatteryAdvertisement r3 = new com.google.android.gms.nearby.discovery.fastpair.battery.BatteryAdvertisement
            r3.<init>()
            r3.a = r9
            r9 = 3
            byte[] r9 = new byte[r9]
            r9 = {127, 127, 127} // fill-array
            r3.a((byte[]) r9)
            r3.f = r2
            r3.a((defpackage.uaj) r0)
            goto L_0x0137
        L_0x0136:
        L_0x0137:
            if (r3 == 0) goto L_0x0172
            uab r9 = defpackage.uab.MAIN
            uac r9 = defpackage.uac.a((defpackage.uaj) r0, (defpackage.uab) r9)
            android.content.Context r1 = r8.e
            android.net.Uri r9 = r9.a(r1)
            r3.k = r9
            uab r9 = defpackage.uab.LEFT
            uac r9 = defpackage.uac.a((defpackage.uaj) r0, (defpackage.uab) r9)
            android.content.Context r1 = r8.e
            android.net.Uri r9 = r9.a(r1)
            r3.l = r9
            uab r9 = defpackage.uab.RIGHT
            uac r9 = defpackage.uac.a((defpackage.uaj) r0, (defpackage.uab) r9)
            android.content.Context r1 = r8.e
            android.net.Uri r9 = r9.a(r1)
            r3.m = r9
            uab r9 = defpackage.uab.CASE
            uac r9 = defpackage.uac.a((defpackage.uaj) r0, (defpackage.uab) r9)
            android.content.Context r0 = r8.e
            android.net.Uri r9 = r9.a(r0)
            r3.n = r9
            return r3
        L_0x0172:
            return r1
        L_0x0173:
            return r3
        L_0x0174:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0174 }
            goto L_0x0178
        L_0x0177:
            throw r9
        L_0x0178:
            goto L_0x0177
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txb.a(java.lang.String):com.google.android.gms.nearby.discovery.fastpair.battery.BatteryAdvertisement");
    }

    /* access modifiers changed from: package-private */
    public final BatteryAdvertisement b(auay auay) {
        return (BatteryAdvertisement) this.b.get(auay);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0075, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b(com.google.android.gms.nearby.discovery.fastpair.battery.BatteryAdvertisement r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r7.b     // Catch:{ all -> 0x0078 }
            int r0 = r0.length     // Catch:{ all -> 0x0078 }
            r1 = 3
            if (r0 != r1) goto L_0x0076
            auay r0 = r7.f     // Catch:{ all -> 0x0078 }
            r1 = 0
            if (r0 != 0) goto L_0x001b
            jjg r0 = defpackage.tsp.a     // Catch:{ all -> 0x0078 }
            anie r0 = r0.c()     // Catch:{ all -> 0x0078 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0078 }
            java.lang.String r2 = "FastPairBattery: invalid batteryAdvertisement when updateCache, %s"
            r0.a((java.lang.String) r2, (java.lang.Object) r7)     // Catch:{ all -> 0x0078 }
            r7 = r1
            goto L_0x006f
        L_0x001b:
            com.google.android.gms.nearby.discovery.fastpair.battery.BatteryAdvertisement r2 = r6.b((defpackage.auay) r0)     // Catch:{ all -> 0x0078 }
            if (r2 != 0) goto L_0x0030
            java.util.Map r2 = r6.b     // Catch:{ all -> 0x0078 }
            r2.put(r0, r7)     // Catch:{ all -> 0x0078 }
            java.lang.String r0 = r7.a     // Catch:{ all -> 0x0078 }
            byte[] r2 = r7.b     // Catch:{ all -> 0x0078 }
            com.google.android.gms.nearby.discovery.fastpair.battery.BatteryAdvertisement.a(r0, r1, r2)     // Catch:{ all -> 0x0078 }
            jjg r0 = defpackage.tsp.a     // Catch:{ all -> 0x0078 }
            goto L_0x006f
        L_0x0030:
            byte[] r0 = r2.b     // Catch:{ all -> 0x0078 }
            byte[] r1 = r7.b     // Catch:{ all -> 0x0078 }
            boolean r0 = java.util.Arrays.equals(r0, r1)     // Catch:{ all -> 0x0078 }
            r1 = 1
            if (r0 != 0) goto L_0x004c
            java.lang.String r0 = r2.a     // Catch:{ all -> 0x0078 }
            byte[] r3 = r2.b     // Catch:{ all -> 0x0078 }
            byte[] r4 = r7.b     // Catch:{ all -> 0x0078 }
            com.google.android.gms.nearby.discovery.fastpair.battery.BatteryAdvertisement.a(r0, r3, r4)     // Catch:{ all -> 0x0078 }
            byte[] r0 = r7.b     // Catch:{ all -> 0x0078 }
            r2.b = r0     // Catch:{ all -> 0x0078 }
            r2.r = r1     // Catch:{ all -> 0x0078 }
            r0 = 1
            goto L_0x004d
        L_0x004c:
            r0 = 0
        L_0x004d:
            int r3 = r7.s     // Catch:{ all -> 0x0078 }
            if (r3 == r1) goto L_0x0052
            goto L_0x005c
        L_0x0052:
            boolean r4 = r2.c     // Catch:{ all -> 0x0078 }
            boolean r5 = r7.c     // Catch:{ all -> 0x0078 }
            if (r4 == r5) goto L_0x005c
            r2.c = r5     // Catch:{ all -> 0x0078 }
            r2.r = r1     // Catch:{ all -> 0x0078 }
        L_0x005c:
            r2.s = r3     // Catch:{ all -> 0x0078 }
            double r3 = r7.d     // Catch:{ all -> 0x0078 }
            r2.d = r3     // Catch:{ all -> 0x0078 }
            long r3 = r7.e     // Catch:{ all -> 0x0078 }
            r2.e = r3     // Catch:{ all -> 0x0078 }
            if (r0 != 0) goto L_0x0069
            goto L_0x006c
        L_0x0069:
            r6.c(r2)     // Catch:{ all -> 0x0078 }
        L_0x006c:
            jjg r7 = defpackage.tsp.a     // Catch:{ all -> 0x0078 }
            r7 = r2
        L_0x006f:
            if (r7 == 0) goto L_0x0074
            r6.d(r7)     // Catch:{ all -> 0x0078 }
        L_0x0074:
            monitor-exit(r6)
            return
        L_0x0076:
            monitor-exit(r6)
            return
        L_0x0078:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txb.b(com.google.android.gms.nearby.discovery.fastpair.battery.BatteryAdvertisement):void");
    }

    public final boolean b(String str) {
        boolean contains;
        aryx aryx = this.g;
        if (aryx == null) {
            synchronized (this.c) {
                contains = this.c.contains(str);
            }
            return contains;
        } else if (aryx.a(str, (List) amzy.a((Object) 2, (Object) 1)) == null) {
            return false;
        } else {
            return true;
        }
    }

    public final synchronized void a(auay auay) {
        BatteryAdvertisement batteryAdvertisement = (BatteryAdvertisement) this.b.remove(auay);
        if (auay.equals(this.d)) {
            ((anih) tsp.a.d()).a("FastPairBattery: Dismiss battery notification when adv removed");
            e(batteryAdvertisement);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(defpackage.auay r2, java.lang.String r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.nearby.discovery.fastpair.battery.BatteryAdvertisement r2 = r1.b((defpackage.auay) r2)     // Catch:{ all -> 0x002b }
            if (r2 != 0) goto L_0x0016
            jjg r2 = defpackage.tsp.a     // Catch:{ all -> 0x002b }
            anie r2 = r2.d()     // Catch:{ all -> 0x002b }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x002b }
            java.lang.String r3 = "FastPairBattery: no cached battery advertisement when device name is changed"
            r2.a((java.lang.String) r3)     // Catch:{ all -> 0x002b }
            monitor-exit(r1)
            return
        L_0x0016:
            java.lang.String r0 = r2.g     // Catch:{ all -> 0x002b }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0029
            r2.g = r3     // Catch:{ all -> 0x002b }
            r3 = 1
            r2.r = r3     // Catch:{ all -> 0x002b }
            r1.c(r2)     // Catch:{ all -> 0x002b }
            r1.d(r2)     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r1)
            return
        L_0x002b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txb.a(auay, java.lang.String):void");
    }

    public final synchronized void a(BatteryAdvertisement batteryAdvertisement) {
        if (batteryAdvertisement != null) {
            batteryAdvertisement.q = false;
        }
        this.a.a();
        this.d = null;
    }

    public final void a(String str, boolean z) {
        if (!aymw.f()) {
            synchronized (this.c) {
                if (z) {
                    this.c.add(str);
                } else {
                    this.c.remove(str);
                }
            }
            ((anih) tsp.a.d()).a("FastPairBattery, connection state of %s changes to %b", (Object) str, z);
        }
    }
}
