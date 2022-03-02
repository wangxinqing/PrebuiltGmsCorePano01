package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.List;

/* renamed from: ahsu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahsu extends ahuo implements ahun {
    public final List a;
    private final boolean b;
    private final ahvk c;
    private final Context d;
    private final int e;
    private final int f;
    private boolean l = false;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0211 A[LOOP:1: B:86:0x020f->B:87:0x0211, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0227  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ahsu(android.content.Context r19, java.util.Set r20, java.util.Map r21, defpackage.ahvk r22, defpackage.ahuu r23, defpackage.ahyk r24, defpackage.ajbl r25, long r26, long r28, boolean r30, defpackage.ahsr r31, boolean r32, defpackage.ahss r33, defpackage.ajrh r34, defpackage.aizx r35, int r36, int r37) {
        /*
            r18 = this;
            r1 = r18
            r14 = r19
            r0 = r20
            r15 = r22
            r12 = r31
            r2 = r33
            r3 = r34
            r1.<init>(r12, r2, r3)
            r13 = 0
            r1.l = r13
            r1.d = r14
            r1.c = r15
            r2 = r36
            r1.f = r2
            r2 = r37
            r1.e = r2
            ahup r2 = defpackage.ahup.SOUND
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x0039
            ahup r2 = defpackage.ahup.RAW_AUDIO
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L_0x0031
            goto L_0x0039
        L_0x0031:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Cannot collect both sound features and raw audio in parallel."
            r0.<init>(r2)
            throw r0
        L_0x0039:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            ahup r2 = defpackage.ahup.CELL
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x0063
            java.lang.String r2 = "phone"
            java.lang.Object r2 = r14.getSystemService(r2)
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2
            if (r15 != 0) goto L_0x0063
            int r3 = r2.getSimState()
            r4 = 5
            if (r3 != r4) goto L_0x0063
            ahse r3 = new ahse
            ahss r4 = r1.i
            ajrh r5 = r1.g
            r3.<init>(r2, r12, r4, r5)
            r11.add(r3)
        L_0x0063:
            ahup r2 = defpackage.ahup.WIFI
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L_0x006e
            r13 = r11
            goto L_0x00dc
        L_0x006e:
            if (r25 == 0) goto L_0x0245
            if (r15 != 0) goto L_0x00db
            aiyk r2 = defpackage.aiyk.g
            r3 = r25
            aixp r3 = (defpackage.aixp) r3
            android.net.wifi.WifiManager r4 = r3.d
            android.content.Context r3 = r3.a
            boolean r2 = r2.a((android.net.wifi.WifiManager) r4, (android.content.Context) r3)
            if (r2 == 0) goto L_0x00d9
            if (r30 != 0) goto L_0x0088
            ahyx r2 = defpackage.ahyx.a
            r5 = r2
            goto L_0x008b
        L_0x0088:
            ahyo r2 = defpackage.ahyo.a
            r5 = r2
        L_0x008b:
            ahup r2 = defpackage.ahup.WIFI_RTT
            boolean r2 = r0.contains(r2)
            r3 = 0
            if (r2 == 0) goto L_0x00a2
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r2 < r4) goto L_0x00a2
            ahwb r2 = new ahwb
            r2.<init>()
            r16 = r2
            goto L_0x00a4
        L_0x00a2:
            r16 = r3
        L_0x00a4:
            boolean r2 = a(r19)
            if (r2 == 0) goto L_0x00c1
            ahwh r17 = new ahwh
            ahss r6 = r1.i
            ajrh r7 = r1.g
            r2 = r17
            r3 = r19
            r4 = r31
            r8 = r35
            r9 = r26
            r13 = r11
            r11 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11)
            goto L_0x00d5
        L_0x00c1:
            r13 = r11
            ahvz r17 = new ahvz
            ahss r6 = r1.i
            ajrh r7 = r1.g
            r2 = r17
            r3 = r19
            r4 = r31
            r8 = r26
            r10 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r10)
        L_0x00d5:
            r13.add(r2)
            goto L_0x00dc
        L_0x00d9:
            r13 = r11
            goto L_0x00dc
        L_0x00db:
            r13 = r11
        L_0x00dc:
            ahup r2 = defpackage.ahup.SOUND
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x00fb
            ahvo r8 = new ahvo
            ahss r5 = r1.i
            ajrh r6 = r1.g
            ajbt r7 = new ajbt
            r7.<init>()
            r2 = r8
            r3 = r19
            r4 = r31
            r2.<init>(r3, r4, r5, r6, r7)
            r13.add(r8)
            goto L_0x011d
        L_0x00fb:
            ahup r2 = defpackage.ahup.RAW_AUDIO
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x011d
            ahub r10 = new ahub
            ahss r5 = r1.i
            ajrh r6 = r1.g
            ajbt r7 = new ajbt
            r7.<init>()
            int r8 = r1.f
            int r9 = r1.e
            r2 = r10
            r3 = r19
            r4 = r31
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r13.add(r10)
        L_0x011d:
            ahup r2 = defpackage.ahup.DEVICE_STATE
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x0131
            ahta r2 = new ahta
            ahss r3 = r1.i
            ajrh r4 = r1.g
            r2.<init>(r14, r12, r3, r4)
            r13.add(r2)
        L_0x0131:
            ahup r2 = defpackage.ahup.BLUETOOTH_DEVICE
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x0151
            android.bluetooth.BluetoothAdapter r2 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            if (r2 == 0) goto L_0x0151
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto L_0x0151
            ahsa r2 = new ahsa
            ahss r3 = r1.i
            ajrh r4 = r1.g
            r2.<init>(r14, r12, r3, r4)
            r13.add(r2)
        L_0x0151:
            ahup r2 = defpackage.ahup.GPS
            boolean r4 = r0.contains(r2)
            ahup r2 = defpackage.ahup.GPS_SATELLITE
            boolean r5 = r0.contains(r2)
            ahup r2 = defpackage.ahup.GNSS_MEASUREMENTS
            boolean r6 = r0.contains(r2)
            ahup r2 = defpackage.ahup.GNSS_NAVIGATION_MESSAGE
            boolean r7 = r0.contains(r2)
            if (r4 == 0) goto L_0x016c
            goto L_0x0177
        L_0x016c:
            if (r5 != 0) goto L_0x0177
            if (r6 != 0) goto L_0x0177
            if (r7 == 0) goto L_0x0173
            goto L_0x0177
        L_0x0173:
            r15 = r13
            r16 = 0
            goto L_0x01ca
        L_0x0177:
            java.lang.String r0 = "location"
            java.lang.Object r0 = r14.getSystemService(r0)
            android.location.LocationManager r0 = (android.location.LocationManager) r0
            if (r15 != 0) goto L_0x01c7
            java.lang.String r2 = "gps"
            boolean r0 = r0.isProviderEnabled(r2)     // Catch:{ SecurityException -> 0x01a9 }
            if (r0 != 0) goto L_0x018e
            r15 = r13
            r16 = 0
            goto L_0x01ca
        L_0x018e:
            ahtl r0 = new ahtl     // Catch:{ SecurityException -> 0x01a9 }
            ahss r10 = r1.i     // Catch:{ SecurityException -> 0x01a9 }
            ajrh r11 = r1.g     // Catch:{ SecurityException -> 0x01a9 }
            r2 = r0
            r3 = r19
            r8 = r24
            r9 = r31
            r15 = r13
            r16 = 0
            r12 = r28
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SecurityException -> 0x01a7 }
            r15.add(r0)     // Catch:{ SecurityException -> 0x01a7 }
            goto L_0x01ca
        L_0x01a7:
            r0 = move-exception
            goto L_0x01ad
        L_0x01a9:
            r0 = move-exception
            r15 = r13
            r16 = 0
        L_0x01ad:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "GPS scan skipped: can't check GPS "
            int r3 = r0.length()
            if (r3 != 0) goto L_0x01c3
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            goto L_0x01ca
        L_0x01c3:
            r2.concat(r0)
            goto L_0x01ca
        L_0x01c7:
            r15 = r13
            r16 = 0
        L_0x01ca:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r2 = "sensor"
            java.lang.Object r2 = r14.getSystemService(r2)
            android.hardware.SensorManager r2 = (android.hardware.SensorManager) r2
            java.util.Set r3 = r21.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x01df:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x020a
            java.lang.Object r4 = r3.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.util.List r5 = r2.getSensorList(r4)
            if (r5 == 0) goto L_0x01fb
            int r5 = r5.size()
            if (r5 != 0) goto L_0x01df
        L_0x01fb:
            java.util.Locale r5 = java.util.Locale.ENGLISH
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5[r16] = r4
            r0.add(r4)
            goto L_0x01df
        L_0x020a:
            int r2 = r0.size()
            r13 = 0
        L_0x020f:
            if (r13 >= r2) goto L_0x021f
            java.lang.Object r3 = r0.get(r13)
            java.lang.Integer r3 = (java.lang.Integer) r3
            r5 = r21
            r5.remove(r3)
            int r13 = r13 + 1
            goto L_0x020f
        L_0x021f:
            r5 = r21
            boolean r0 = r21.isEmpty()
            if (r0 != 0) goto L_0x023e
            ahut r0 = new ahut
            ahss r8 = r1.i
            ajrh r9 = r1.g
            r2 = r0
            r3 = r19
            r4 = r22
            r5 = r21
            r6 = r23
            r7 = r31
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r15.add(r0)
        L_0x023e:
            r1.a = r15
            r2 = r32
            r1.b = r2
            return
        L_0x0245:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "wifiService can't be null when WiFi scan is requested."
            r0.<init>(r2)
            goto L_0x024e
        L_0x024d:
            throw r0
        L_0x024e:
            goto L_0x024d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahsu.<init>(android.content.Context, java.util.Set, java.util.Map, ahvk, ahuu, ahyk, ajbl, long, long, boolean, ahsr, boolean, ahss, ajrh, aizx, int, int):void");
    }

    static final boolean a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                if (context.checkSelfPermission("android.permission.LOCATION_HARDWARE") != 0 || context.getSystemService("wifiscanner") == null) {
                    return false;
                }
                return true;
            } catch (NoSuchMethodError e2) {
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void b() {
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((ahuo) list.get(i)).h();
        }
        ahss ahss = this.i;
        if (ahss != null) {
            ahss.a();
        }
        if (this.b) {
            this.h.a();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.List r0 = r8.a     // Catch:{ all -> 0x0083 }
            int r1 = r0.size()     // Catch:{ all -> 0x0083 }
            r2 = 0
            r3 = 0
        L_0x0009:
            if (r3 >= r1) goto L_0x0017
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x0083 }
            ahuo r4 = (defpackage.ahuo) r4     // Catch:{ all -> 0x0083 }
            r4.a(r8)     // Catch:{ all -> 0x0083 }
            int r3 = r3 + 1
            goto L_0x0009
        L_0x0017:
            ahvk r0 = r8.c     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x0081
            boolean r1 = r0.d     // Catch:{ all -> 0x0083 }
            if (r1 == 0) goto L_0x007a
            boolean r1 = r8.l     // Catch:{ all -> 0x0083 }
            if (r1 != 0) goto L_0x0075
            ahrh r1 = r8.k     // Catch:{ all -> 0x0083 }
            android.content.Context r3 = r8.d     // Catch:{ all -> 0x0083 }
            r0.a(r1, r3)     // Catch:{ all -> 0x0083 }
            java.lang.String r1 = "alarm"
            java.lang.Object r1 = r3.getSystemService(r1)     // Catch:{ all -> 0x0083 }
            android.app.AlarmManager r1 = (android.app.AlarmManager) r1     // Catch:{ all -> 0x0083 }
            java.util.concurrent.atomic.AtomicLong r4 = defpackage.ahvk.i     // Catch:{ all -> 0x0083 }
            long r4 = r4.incrementAndGet()     // Catch:{ all -> 0x0083 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0083 }
            r7 = 73
            r6.<init>(r7)     // Catch:{ all -> 0x0083 }
            java.lang.String r7 = "com.google.location.lbs.collectionlib.BATCHING_ALARM."
            r6.append(r7)     // Catch:{ all -> 0x0083 }
            r6.append(r4)     // Catch:{ all -> 0x0083 }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x0083 }
            r0.j = r4     // Catch:{ all -> 0x0083 }
            android.content.Intent r4 = new android.content.Intent     // Catch:{ all -> 0x0083 }
            java.lang.String r5 = r0.j     // Catch:{ all -> 0x0083 }
            r4.<init>(r5)     // Catch:{ all -> 0x0083 }
            android.app.PendingIntent r2 = android.app.PendingIntent.getBroadcast(r3, r2, r4, r2)     // Catch:{ all -> 0x0083 }
            r0.h = r2     // Catch:{ all -> 0x0083 }
            android.content.IntentFilter r2 = new android.content.IntentFilter     // Catch:{ all -> 0x0083 }
            java.lang.String r4 = r0.j     // Catch:{ all -> 0x0083 }
            r2.<init>(r4)     // Catch:{ all -> 0x0083 }
            android.content.BroadcastReceiver r4 = r0.n     // Catch:{ all -> 0x0083 }
            r3.registerReceiver(r4, r2)     // Catch:{ all -> 0x0083 }
            r2 = 2
            r3 = 30000(0x7530, double:1.4822E-319)
            android.app.PendingIntent r5 = r0.h     // Catch:{ all -> 0x0083 }
            defpackage.ahvk.a((android.app.AlarmManager) r1, (int) r2, (long) r3, (android.app.PendingIntent) r5)     // Catch:{ all -> 0x0083 }
            r0.g = r1     // Catch:{ all -> 0x0083 }
            r0 = 1
            r8.l = r0     // Catch:{ all -> 0x0083 }
            monitor-exit(r8)
            return
        L_0x0075:
            r0.a()     // Catch:{ all -> 0x0083 }
            monitor-exit(r8)
            return
        L_0x007a:
            ahrh r1 = r8.k     // Catch:{ all -> 0x0083 }
            android.content.Context r2 = r8.d     // Catch:{ all -> 0x0083 }
            r0.a(r1, r2)     // Catch:{ all -> 0x0083 }
        L_0x0081:
            monitor-exit(r8)
            return
        L_0x0083:
            r0 = move-exception
            monitor-exit(r8)
            goto L_0x0087
        L_0x0086:
            throw r0
        L_0x0087:
            goto L_0x0086
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahsu.a():void");
    }
}
