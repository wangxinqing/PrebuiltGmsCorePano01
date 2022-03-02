package defpackage;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.os.Build;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: ahrx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahrx implements ahsw {
    private static ahrx k;
    public final ajrh a;
    public final ahux b;
    public final Object c = new Object();
    public ahrw d;
    public final List e = new ArrayList();
    public final SparseArray f;
    public int g = 0;
    public long h = 200;
    public final Context i;
    public final ahtn j;
    private final SensorEventListener l;

    private ahrx(Context context, ajbg ajbg, ajrh ajrh) {
        this.i = context.getApplicationContext();
        this.a = ahvx.a(ajrh);
        this.b = new ahux(context, ajbg, new ajbt());
        this.j = new ahtn(context);
        this.l = new ahrt(this);
        this.f = new SparseArray();
    }

    public static synchronized ahrx a(Context context, ajbg ajbg, ajrh ajrh) {
        ahrx ahrx;
        synchronized (ahrx.class) {
            int i2 = Build.VERSION.SDK_INT;
            if (k == null) {
                k = new ahrx(context, ajbg, ajrh);
            }
            ahrx = k;
        }
        return ahrx;
    }

    private final void a() {
        ahrw ahrw = this.d;
        if (this.f.size() == 0 && ahrw != null) {
            if (ahrw.c) {
                synchronized (ahrw.d.c) {
                    for (ahsy ahsy : ahrw.d.e) {
                        ajrh ajrh = ahrw.d.a;
                        String valueOf = String.valueOf(ahsy);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                        sb.append("DataReader ");
                        sb.append(valueOf);
                        sb.append(" started by shutdown.");
                        sb.toString();
                        ahrw.b.post(ahsy);
                    }
                    ahrw.d.e.clear();
                    ahrw.b.getLooper().quitSafely();
                }
            }
            this.d = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.ahsy r6, defpackage.ahvk r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.c
            monitor-enter(r0)
            ahrw r1 = r5.d     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0043
            ahux r2 = r5.b     // Catch:{ all -> 0x0048 }
            boolean r2 = r2.a()     // Catch:{ all -> 0x0048 }
            if (r2 == 0) goto L_0x003e
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0048 }
            android.util.SparseArray r2 = r5.f     // Catch:{ all -> 0x0048 }
            int r2 = r2.size()     // Catch:{ all -> 0x0048 }
            r5.g = r2     // Catch:{ all -> 0x0048 }
            ahtn r2 = r5.j     // Catch:{ all -> 0x0048 }
            android.hardware.SensorEventListener r3 = r5.l     // Catch:{ all -> 0x0048 }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0048 }
            android.hardware.SensorManager r2 = r2.a     // Catch:{ all -> 0x0048 }
            r2.flush(r3)     // Catch:{ all -> 0x0048 }
            android.os.Handler r1 = r1.b     // Catch:{ all -> 0x0048 }
            ahru r2 = new ahru     // Catch:{ all -> 0x0048 }
            r2.<init>(r5, r6)     // Catch:{ all -> 0x0048 }
            long r3 = r5.h     // Catch:{ all -> 0x0048 }
            boolean r1 = r1.postDelayed(r2, r3)     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0039
            java.util.List r7 = r5.e     // Catch:{ all -> 0x0048 }
            r7.add(r6)     // Catch:{ all -> 0x0048 }
            goto L_0x003c
        L_0x0039:
            r7.b()     // Catch:{ all -> 0x0048 }
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x003e:
            r7.b()     // Catch:{ all -> 0x0048 }
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0043:
            r7.b()     // Catch:{ all -> 0x0048 }
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahrx.a(ahsy, ahvk):void");
    }

    /* access modifiers changed from: protected */
    public final void a(ahup ahup) {
        if (!ahup.y || this.j.a(ahup) == null) {
            String valueOf = String.valueOf(ahup);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 76);
            sb.append("Not a supported sensor or the device doesn't have the sensor. Scanner Type: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0085, code lost:
        if (r4 == null) goto L_0x0087;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r6, defpackage.ahup r7) {
        /*
            r5 = this;
            r5.a(r7)
            java.lang.Object r0 = r5.c
            monitor-enter(r0)
            boolean r1 = r7.y     // Catch:{ all -> 0x00c0 }
            if (r1 != 0) goto L_0x002d
            java.lang.String r6 = r7.z     // Catch:{ all -> 0x00c0 }
            java.lang.String r7 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00c0 }
            int r7 = r7.length()     // Catch:{ all -> 0x00c0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c0 }
            int r7 = r7 + 26
            r1.<init>(r7)     // Catch:{ all -> 0x00c0 }
            java.lang.String r7 = "ScannerType "
            r1.append(r7)     // Catch:{ all -> 0x00c0 }
            r1.append(r6)     // Catch:{ all -> 0x00c0 }
            java.lang.String r6 = " not supported"
            r1.append(r6)     // Catch:{ all -> 0x00c0 }
            r1.toString()     // Catch:{ all -> 0x00c0 }
            goto L_0x00bb
        L_0x002d:
            int r1 = r7.x     // Catch:{ all -> 0x00c0 }
            ahtn r2 = r5.j     // Catch:{ all -> 0x00c0 }
            android.hardware.Sensor r2 = r2.a((defpackage.ahup) r7)     // Catch:{ all -> 0x00c0 }
            android.util.SparseArray r3 = r5.f     // Catch:{ all -> 0x00c0 }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x00c0 }
            ahrv r3 = (defpackage.ahrv) r3     // Catch:{ all -> 0x00c0 }
            if (r3 != 0) goto L_0x0040
            goto L_0x0087
        L_0x0040:
            java.util.Map r4 = r3.b     // Catch:{ all -> 0x00c0 }
            java.lang.Object r4 = r4.remove(r6)     // Catch:{ all -> 0x00c0 }
            r3.a()     // Catch:{ all -> 0x00c0 }
            java.util.Map r3 = r3.b     // Catch:{ all -> 0x00c0 }
            int r3 = r3.size()     // Catch:{ all -> 0x00c0 }
            if (r3 != 0) goto L_0x0085
            android.util.SparseArray r3 = r5.f     // Catch:{ all -> 0x00c0 }
            r3.remove(r1)     // Catch:{ all -> 0x00c0 }
            defpackage.amrl.a((java.lang.Object) r2)     // Catch:{ all -> 0x00c0 }
            ahtn r1 = r5.j     // Catch:{ all -> 0x00c0 }
            android.hardware.SensorEventListener r3 = r5.l     // Catch:{ all -> 0x00c0 }
            android.hardware.SensorManager r1 = r1.a     // Catch:{ all -> 0x00c0 }
            r1.unregisterListener(r3, r2)     // Catch:{ all -> 0x00c0 }
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x00c0 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00c0 }
            int r2 = r2.length()     // Catch:{ all -> 0x00c0 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c0 }
            int r2 = r2 + 64
            r3.<init>(r2)     // Catch:{ all -> 0x00c0 }
            java.lang.String r2 = "Canceling batch for scanner type "
            r3.append(r2)     // Catch:{ all -> 0x00c0 }
            r3.append(r1)     // Catch:{ all -> 0x00c0 }
            java.lang.String r1 = " because no client requests it."
            r3.append(r1)     // Catch:{ all -> 0x00c0 }
            r3.toString()     // Catch:{ all -> 0x00c0 }
        L_0x0085:
            if (r4 != 0) goto L_0x00bb
        L_0x0087:
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x00c0 }
            java.lang.String r1 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00c0 }
            int r1 = r1.length()     // Catch:{ all -> 0x00c0 }
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x00c0 }
            int r2 = r2.length()     // Catch:{ all -> 0x00c0 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c0 }
            int r1 = r1 + 39
            int r1 = r1 + r2
            r3.<init>(r1)     // Catch:{ all -> 0x00c0 }
            java.lang.String r1 = "ClientId "
            r3.append(r1)     // Catch:{ all -> 0x00c0 }
            r3.append(r6)     // Catch:{ all -> 0x00c0 }
            java.lang.String r6 = " for scanner type "
            r3.append(r6)     // Catch:{ all -> 0x00c0 }
            r3.append(r7)     // Catch:{ all -> 0x00c0 }
            java.lang.String r6 = " not exists."
            r3.append(r6)     // Catch:{ all -> 0x00c0 }
            r3.toString()     // Catch:{ all -> 0x00c0 }
        L_0x00bb:
            r5.a()     // Catch:{ all -> 0x00c0 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c0 }
            return
        L_0x00c0:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c0 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahrx.a(java.lang.String, ahup):void");
    }

    public final void a(Set set, long j2, ahvk ahvk) {
        ahsy ahsy;
        synchronized (this.c) {
            ahsy = new ahsy(this.i, this.b, ahvk, set, j2, -1, this.j, this);
        }
        a(ahsy, ahvk);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a9, code lost:
        if (r8 == false) goto L_0x00ad;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:32:0x00b3=Splitter:B:32:0x00b3, B:25:0x00ad=Splitter:B:25:0x00ad} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r17, defpackage.ahup r18, int r19, int r20) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = r20
            r1.a(r2)
            java.lang.String r4 = java.lang.String.valueOf(r18)
            java.lang.String r5 = java.lang.String.valueOf(r17)
            int r5 = r5.length()
            java.lang.String r6 = java.lang.String.valueOf(r4)
            int r6 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r5 = r5 + 81
            int r5 = r5 + r6
            r7.<init>(r5)
            java.lang.String r5 = "startBatch: clientId="
            r7.append(r5)
            r7.append(r0)
            java.lang.String r5 = " scannerType="
            r7.append(r5)
            r7.append(r4)
            java.lang.String r4 = " sensorDelay="
            r7.append(r4)
            r4 = r19
            r7.append(r4)
            java.lang.String r5 = " bufferSize="
            r7.append(r5)
            r7.append(r3)
            r7.toString()
            java.lang.Object r5 = r1.c
            monitor-enter(r5)
            ahux r6 = r1.b     // Catch:{ all -> 0x0151 }
            java.lang.Object r7 = r6.d     // Catch:{ all -> 0x0151 }
            monitor-enter(r7)     // Catch:{ all -> 0x0151 }
            boolean r8 = r6.g     // Catch:{ all -> 0x014e }
            r9 = 0
            r10 = 1
            if (r8 != 0) goto L_0x00b2
            boolean r8 = r6.e     // Catch:{ all -> 0x014e }
            if (r8 != 0) goto L_0x00b0
            int[] r8 = defpackage.ahux.a     // Catch:{ all -> 0x014e }
            int r11 = r8.length     // Catch:{ all -> 0x014e }
            r12 = 0
        L_0x0062:
            if (r12 >= r11) goto L_0x0071
            r13 = r8[r12]     // Catch:{ all -> 0x014e }
            ahtn r15 = r6.j     // Catch:{ all -> 0x014e }
            android.hardware.Sensor r13 = r15.a((int) r13)     // Catch:{ all -> 0x014e }
            if (r13 != 0) goto L_0x0072
            int r12 = r12 + 1
            goto L_0x0062
        L_0x0071:
            r13 = r9
        L_0x0072:
            if (r13 == 0) goto L_0x00ac
            ajbg r8 = r6.b     // Catch:{ all -> 0x014e }
            ajbe r11 = defpackage.ajbe.COLLECTIONLIB     // Catch:{ all -> 0x014e }
            r14 = 600000(0x927c0, double:2.964394E-318)
            r8.b(r11, r14, r9)     // Catch:{ all -> 0x014e }
            ahuw r8 = new ahuw     // Catch:{ all -> 0x014e }
            r8.<init>(r6)     // Catch:{ all -> 0x014e }
            r6.f = r8     // Catch:{ all -> 0x014e }
            r6.g = r10     // Catch:{ all -> 0x014e }
            qvr r11 = new qvr     // Catch:{ all -> 0x014e }
            android.os.Looper r12 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x014e }
            r11.<init>((android.os.Looper) r12)     // Catch:{ all -> 0x014e }
            ahtn r12 = r6.j     // Catch:{ all -> 0x014e }
            boolean r8 = r12.a(r8, r13, r10, r11)     // Catch:{ all -> 0x014e }
            if (r8 == 0) goto L_0x00a0
            java.lang.Runnable r6 = r6.i     // Catch:{ all -> 0x014e }
            r12 = 5000(0x1388, double:2.4703E-320)
            r11.postDelayed(r6, r12)     // Catch:{ all -> 0x014e }
            goto L_0x00a8
        L_0x00a0:
            r11 = 0
            r13 = 0
            r6.a(r13, r11)     // Catch:{ all -> 0x014e }
            r6.f = r9     // Catch:{ all -> 0x014e }
        L_0x00a8:
            monitor-exit(r7)     // Catch:{ all -> 0x014e }
            if (r8 == 0) goto L_0x00ad
            goto L_0x00b3
        L_0x00ac:
            monitor-exit(r7)     // Catch:{ all -> 0x014e }
        L_0x00ad:
            monitor-exit(r5)     // Catch:{ all -> 0x0151 }
            r2 = 0
            return r2
        L_0x00b0:
            monitor-exit(r7)     // Catch:{ all -> 0x014e }
            goto L_0x00b3
        L_0x00b2:
            monitor-exit(r7)     // Catch:{ all -> 0x014e }
        L_0x00b3:
            ahrw r6 = r1.d     // Catch:{ all -> 0x0151 }
            if (r6 != 0) goto L_0x00d0
            ahrw r6 = new ahrw     // Catch:{ all -> 0x0151 }
            r6.<init>(r1)     // Catch:{ all -> 0x0151 }
            r1.d = r6     // Catch:{ all -> 0x0151 }
            r6.start()     // Catch:{ all -> 0x0151 }
            java.util.concurrent.CountDownLatch r7 = r6.a     // Catch:{ InterruptedException -> 0x00ca }
            r7.await()     // Catch:{ InterruptedException -> 0x00ca }
            r6.c = r10     // Catch:{ InterruptedException -> 0x00ca }
            r6 = 0
            goto L_0x00d1
        L_0x00ca:
            r0 = move-exception
            r1.d = r9     // Catch:{ all -> 0x0151 }
            monitor-exit(r5)     // Catch:{ all -> 0x0151 }
            r6 = 0
            return r6
        L_0x00d0:
            r6 = 0
        L_0x00d1:
            boolean r7 = r2.y     // Catch:{ all -> 0x0151 }
            if (r7 != 0) goto L_0x00f8
            java.lang.String r0 = r2.z     // Catch:{ all -> 0x0151 }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0151 }
            int r2 = r2.length()     // Catch:{ all -> 0x0151 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0151 }
            int r2 = r2 + 31
            r3.<init>(r2)     // Catch:{ all -> 0x0151 }
            java.lang.String r2 = "ScannerType "
            r3.append(r2)     // Catch:{ all -> 0x0151 }
            r3.append(r0)     // Catch:{ all -> 0x0151 }
            java.lang.String r0 = " not supported yet."
            r3.append(r0)     // Catch:{ all -> 0x0151 }
            r3.toString()     // Catch:{ all -> 0x0151 }
            r10 = 0
            goto L_0x0149
        L_0x00f8:
            int r7 = r2.x     // Catch:{ all -> 0x0151 }
            ahtn r8 = r1.j     // Catch:{ all -> 0x0151 }
            android.hardware.Sensor r11 = r8.a((defpackage.ahup) r2)     // Catch:{ all -> 0x0151 }
            android.util.SparseArray r8 = r1.f     // Catch:{ all -> 0x0151 }
            java.lang.Object r8 = r8.get(r7)     // Catch:{ all -> 0x0151 }
            ahrv r8 = (defpackage.ahrv) r8     // Catch:{ all -> 0x0151 }
            if (r8 != 0) goto L_0x013d
            ahrv r8 = new ahrv     // Catch:{ all -> 0x0151 }
            int r2 = r2.A     // Catch:{ all -> 0x0151 }
            r8.<init>(r0, r2, r3)     // Catch:{ all -> 0x0151 }
            android.util.SparseArray r0 = r1.f     // Catch:{ all -> 0x0151 }
            r0.put(r7, r8)     // Catch:{ all -> 0x0151 }
            defpackage.amrl.a((java.lang.Object) r11)     // Catch:{ all -> 0x0151 }
            ahrw r0 = r1.d     // Catch:{ all -> 0x0151 }
            defpackage.amrl.a((java.lang.Object) r0)     // Catch:{ all -> 0x0151 }
            ahtn r0 = r1.j     // Catch:{ all -> 0x0151 }
            android.hardware.SensorEventListener r9 = r1.l     // Catch:{ all -> 0x0151 }
            ahrw r2 = r1.d     // Catch:{ all -> 0x0151 }
            android.os.Handler r13 = r2.b     // Catch:{ all -> 0x0151 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0151 }
            android.hardware.SensorManager r8 = r0.a     // Catch:{ all -> 0x0151 }
            r12 = 2147483647(0x7fffffff, float:NaN)
            r10 = r11
            r11 = r19
            boolean r10 = r8.registerListener(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0151 }
            if (r10 != 0) goto L_0x0149
            android.util.SparseArray r0 = r1.f     // Catch:{ all -> 0x0151 }
            r0.remove(r7)     // Catch:{ all -> 0x0151 }
            r10 = 0
            goto L_0x0149
        L_0x013d:
            java.util.Map r2 = r8.b     // Catch:{ all -> 0x0151 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)     // Catch:{ all -> 0x0151 }
            r2.put(r0, r3)     // Catch:{ all -> 0x0151 }
            r8.a()     // Catch:{ all -> 0x0151 }
        L_0x0149:
            r16.a()     // Catch:{ all -> 0x0151 }
            monitor-exit(r5)     // Catch:{ all -> 0x0151 }
            return r10
        L_0x014e:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x014e }
            throw r0     // Catch:{ all -> 0x0151 }
        L_0x0151:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0151 }
            goto L_0x0155
        L_0x0154:
            throw r0
        L_0x0155:
            goto L_0x0154
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahrx.a(java.lang.String, ahup, int, int):boolean");
    }
}
