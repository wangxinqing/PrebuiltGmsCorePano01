package defpackage;

import android.os.Build;
import android.os.ParcelUuid;
import android.os.WorkSource;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.Strategy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: tql  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class tql extends tmz {
    public final tph j;
    public tps k;
    public tpp l;
    private tpv m;
    private tlh n;
    private tlh o;

    public tql(tph tph, tob tob, tnq tnq, tlt tlt) {
        super(tob, tnq, tlt, tph);
        this.j = tph;
    }

    private static boolean a(int i) {
        return aymi.d() && i == 0;
    }

    /* access modifiers changed from: protected */
    public void b(tlh tlh) {
        tph tph = this.j;
        String l2 = tlh.l();
        synchronized (tph.e) {
            if (tph.a()) {
                tph.b.f.d(l2);
            }
        }
        this.l = null;
        if (tlh == this.o) {
            tph tph2 = this.j;
            synchronized (tph2.d) {
                if (tph2.a()) {
                    tph2.b.e.d();
                }
            }
            this.o = null;
        }
        this.k = null;
        if (aymi.aj()) {
            tph tph3 = this.j;
            String l3 = tlh.l();
            synchronized (tph3.g) {
                if (tph3.a()) {
                    tph3.b.h.f(l3);
                }
            }
        }
        this.m = null;
        tph tph4 = this.j;
        String l4 = tlh.l();
        synchronized (tph4.j) {
            if (tph4.a()) {
                tph4.b.l.c(l4);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final String[] c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.BLUETOOTH");
        arrayList.add("android.permission.BLUETOOTH_ADMIN");
        arrayList.add("android.permission.ACCESS_WIFI_STATE");
        arrayList.add("android.permission.CHANGE_WIFI_STATE");
        if (Build.VERSION.SDK_INT >= 23) {
            arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
        }
        if (jkr.h()) {
            arrayList.add("android.permission.ACCESS_FINE_LOCATION");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* access modifiers changed from: protected */
    public List d() {
        return Arrays.asList(new asoe[]{asoe.WIFI_LAN, asoe.WEB_RTC, asoe.BLUETOOTH, asoe.BLE, asoe.NFC});
    }

    /* access modifiers changed from: protected */
    public asoe e() {
        return asoe.WIFI_LAN;
    }

    public Strategy g() {
        return Strategy.a;
    }

    public int h() {
        return 2;
    }

    static byte[] a(String str) {
        return Arrays.copyOf(jhg.a(str, "SHA-256"), 3);
    }

    /* access modifiers changed from: protected */
    public tmw a(tlh tlh, String str, DiscoveryOptions discoveryOptions) {
        boolean z;
        byte[] bArr;
        boolean z2;
        ArrayList a = anda.a();
        boolean z3 = true;
        if (aymi.I() && discoveryOptions.h) {
            tpv tpv = new tpv(this, tlh, str);
            if (tlh.a("android.permission.NFC") != 0) {
                ((anih) tky.a.d()).a("In startNfcDiscovery(), client %d failed to scan because of missing permissions", tlh.b());
            } else {
                tph tph = this.j;
                String c = tlh.c();
                if (aymi.w()) {
                    bArr = tlh.n();
                } else {
                    bArr = null;
                }
                synchronized (tph.j) {
                    if (tph.a()) {
                        if (!tph.b.d.a() || !tph.b.l.a(str, c, new toy(tpv), bArr)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            jjg jjg = tky.a;
                            tlh.b();
                            this.m = tpv;
                            a.add(asoe.NFC);
                        }
                    }
                    ((anih) tky.a.d()).a("In startNfcDiscovery(), client %d couldn't start scanning on NFC for serviceId %s.", tlh.b(), (Object) str);
                }
            }
        }
        if (aymi.q() && discoveryOptions.c && !discoveryOptions.e) {
            tps tps = new tps(this, tlh, str);
            tph tph2 = this.j;
            synchronized (tph2.d) {
                if (tph2.a()) {
                    if (!tph2.b.b.a() || !tph2.b.e.a(new tou(tps))) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        jjg jjg2 = tky.a;
                        tlh.b();
                        this.o = tlh;
                        this.k = tps;
                        a.add(asoe.BLUETOOTH);
                    }
                }
                ((anih) tky.a.d()).a("In startBluetoothDiscovery(), client %d couldn't start scanning on Bluetooth for serviceId %s.", tlh.b(), (Object) str);
            }
        }
        if (aymi.h() && discoveryOptions.d) {
            tpp tpp = new tpp(this, tlh, str);
            boolean z4 = discoveryOptions.e;
            ParcelUuid parcelUuid = discoveryOptions.f;
            tph tph3 = this.j;
            WorkSource a2 = jlr.a(tlh.c, tlh.d);
            synchronized (tph3.e) {
                if (tph3.a()) {
                    if (!z4) {
                        if (tph3.b.b.a()) {
                        }
                    }
                    boolean a3 = tph3.b.f.a(a2, str, new tov(tpp), z4 ? 1 : 0, parcelUuid);
                    if (a3) {
                        jjg jjg3 = tky.a;
                        tlh.b();
                        this.l = tpp;
                        a.add(asoe.BLE);
                    }
                }
            }
            ((anih) tky.a.d()).a("In startBleDiscovery(), client %d couldn't start scanning on BLE for serviceId %s.", tlh.b(), (Object) str);
        }
        if (aymi.aj() && discoveryOptions.g && !discoveryOptions.e) {
            tpy tpy = new tpy(this, tlh, str);
            tph tph4 = this.j;
            synchronized (tph4.g) {
                if (tph4.a()) {
                    if (!tph4.b.c.a() || !tph4.b.h.a(str, new tow(tpy))) {
                        z3 = false;
                    }
                    if (z3) {
                        jjg jjg4 = tky.a;
                        tlh.b();
                        a.add(asoe.WIFI_LAN);
                    }
                }
                ((anih) tky.a.d()).a("In startWifiLanDiscovery(), client %d couldn't start scanning on Wifi for serviceId %s.", tlh.b(), (Object) str);
            }
        }
        if (!a.isEmpty()) {
            return tmw.a(a);
        }
        ((anih) tky.a.b()).a("Failed startDiscovery() for client %d because we couldn't scan on Bluetooth, BLE, or Wifi LAN for serviceId %s", tlh.b(), (Object) str);
        return tmw.a();
    }

    /* access modifiers changed from: protected */
    public final String[] b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.BLUETOOTH");
        arrayList.add("android.permission.BLUETOOTH_ADMIN");
        arrayList.add("android.permission.ACCESS_WIFI_STATE");
        arrayList.add("android.permission.CHANGE_WIFI_STATE");
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0396  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.tmw a(defpackage.tlh r21, java.lang.String r22, java.lang.String r23, byte[] r24, byte[] r25, com.google.android.gms.nearby.connection.AdvertisingOptions r26) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r8 = r22
            r7 = r23
            r6 = r24
            r5 = r26
            java.util.ArrayList r4 = defpackage.anda.a()
            boolean r2 = defpackage.aymi.I()
            r3 = 1
            java.lang.Integer r18 = java.lang.Integer.valueOf(r3)
            r19 = 0
            if (r2 == 0) goto L_0x0182
            boolean r2 = r5.j
            if (r2 == 0) goto L_0x0182
            java.lang.String[] r2 = new java.lang.String[r3]
            java.lang.String r9 = "android.permission.NFC"
            r2[r19] = r9
            int r2 = r0.a((java.lang.String[]) r2)
            if (r2 == 0) goto L_0x0044
            jjg r2 = defpackage.tky.a
            anie r2 = r2.d()
            anih r2 = (defpackage.anih) r2
            java.lang.String r9 = defpackage.tky.a(r24)
            long r10 = r21.b()
            java.lang.String r12 = "In startNfcAdvertising(%s), client %d failed to advertise because of missing permissions"
            r2.a((java.lang.String) r12, (java.lang.Object) r9, (long) r10)
            goto L_0x0182
        L_0x0044:
            tph r2 = r1.j
            tqe r9 = new tqe
            r9.<init>(r1, r0, r6)
            java.lang.Object r10 = r2.j
            monitor-enter(r10)
            boolean r11 = r2.a()     // Catch:{ all -> 0x017f }
            if (r11 == 0) goto L_0x0164
            ulj r11 = r2.b     // Catch:{ all -> 0x017f }
            ult r11 = r11.d     // Catch:{ all -> 0x017f }
            boolean r11 = r11.a()     // Catch:{ all -> 0x017f }
            if (r11 == 0) goto L_0x0072
            ulj r2 = r2.b     // Catch:{ all -> 0x017f }
            uls r2 = r2.l     // Catch:{ all -> 0x017f }
            r9.getClass()     // Catch:{ all -> 0x017f }
            tos r11 = new tos     // Catch:{ all -> 0x017f }
            r11.<init>(r9)     // Catch:{ all -> 0x017f }
            boolean r2 = r2.a((java.lang.String) r8, (defpackage.tos) r11)     // Catch:{ all -> 0x017f }
            if (r2 == 0) goto L_0x0072
            r2 = 1
            goto L_0x0073
        L_0x0072:
            r2 = 0
        L_0x0073:
            monitor-exit(r10)     // Catch:{ all -> 0x017f }
            if (r2 == 0) goto L_0x0165
            jjg r2 = defpackage.tky.a
            defpackage.tky.a(r24)
            r21.b()
            tph r2 = r1.j
            boolean r2 = r2.a((java.lang.String) r8)
            if (r2 != 0) goto L_0x00b9
            tph r2 = r1.j
            tqc r9 = new tqc
            r9.<init>(r1, r0, r6)
            boolean r2 = r2.a((java.lang.String) r8, (defpackage.tpa) r9)
            if (r2 != 0) goto L_0x00b3
            jjg r2 = defpackage.tky.a
            anie r2 = r2.c()
            anih r2 = (defpackage.anih) r2
            java.lang.String r9 = defpackage.tky.a(r24)
            long r10 = r21.b()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.String r11 = "In startNfcAdvertising(%s), client %d failed to start listening for incoming Bluetooth connections to ServiceId %s"
            r2.a((java.lang.String) r11, (java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r8)
            tph r2 = r1.j
            r2.k(r8)
            goto L_0x0182
        L_0x00b3:
            defpackage.tky.a(r24)
            r21.b()
        L_0x00b9:
            byte[] r2 = a((java.lang.String) r22)
            int r9 = r20.h()
            tph r10 = r1.j
            java.lang.String r10 = r10.b()
            byte[] r9 = defpackage.tpj.a(r9, r7, r2, r6, r10)
            if (r9 != 0) goto L_0x0102
            jjg r9 = defpackage.tky.a
            anie r9 = r9.c()
            anih r9 = (defpackage.anih) r9
            java.lang.String r11 = defpackage.tky.a(r24)
            long r12 = r21.b()
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            int r10 = r20.h()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            java.lang.String r16 = defpackage.tky.a(r2)
            java.lang.String r17 = defpackage.tky.a(r24)
            java.lang.String r10 = "In startNfcAdvertising(%s), client %d failed to generate NfcTag {Version = %d, PCP = %d, EndpointId = %s, ServiceIdHash = %s, EndpointInfo = %s}"
            r13 = r18
            r15 = r23
            r9.a(r10, r11, r12, r13, r14, r15, r16, r17)
            tph r2 = r1.j
            r2.k(r8)
            goto L_0x0182
        L_0x0102:
            defpackage.tky.a(r24)
            r21.b()
            tph r2 = r1.j
            tqk r10 = new tqk
            r10.<init>(r1, r0)
            java.lang.Object r11 = r2.j
            monitor-enter(r11)
            boolean r12 = r2.a()     // Catch:{ all -> 0x0161 }
            if (r12 == 0) goto L_0x0141
            ulj r12 = r2.b     // Catch:{ all -> 0x0161 }
            ult r12 = r12.d     // Catch:{ all -> 0x0161 }
            boolean r12 = r12.a()     // Catch:{ all -> 0x0161 }
            if (r12 == 0) goto L_0x0130
            ulj r2 = r2.b     // Catch:{ all -> 0x0161 }
            uls r2 = r2.l     // Catch:{ all -> 0x0161 }
            r12 = r25
            boolean r2 = r2.a((java.lang.String) r8, (byte[]) r9, (byte[]) r12, (defpackage.tqk) r10)     // Catch:{ all -> 0x0161 }
            if (r2 == 0) goto L_0x0130
            r2 = 1
            goto L_0x0131
        L_0x0130:
            r2 = 0
        L_0x0131:
            monitor-exit(r11)     // Catch:{ all -> 0x0161 }
            if (r2 != 0) goto L_0x0135
            goto L_0x0142
        L_0x0135:
            defpackage.tky.a(r24)
            r21.b()
            asoe r2 = defpackage.asoe.NFC
            r4.add(r2)
            goto L_0x0182
        L_0x0141:
            monitor-exit(r11)     // Catch:{ all -> 0x0161 }
        L_0x0142:
            jjg r2 = defpackage.tky.a
            anie r2 = r2.d()
            anih r2 = (defpackage.anih) r2
            java.lang.String r10 = defpackage.tky.a(r24)
            long r11 = r21.b()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            java.lang.String r12 = "In startNfcAdvertising(%s), client %d couldn't become NFC discoverable with NfcTag %s"
            r2.a((java.lang.String) r12, (java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r9)
            tph r2 = r1.j
            r2.k(r8)
            goto L_0x0182
        L_0x0161:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0161 }
            throw r0
        L_0x0164:
            monitor-exit(r10)     // Catch:{ all -> 0x017f }
        L_0x0165:
            jjg r2 = defpackage.tky.a
            anie r2 = r2.c()
            anih r2 = (defpackage.anih) r2
            java.lang.String r9 = defpackage.tky.a(r24)
            long r10 = r21.b()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.String r11 = "In startNfcAdvertising(%s), client %d failed to start listening for incoming NFC connections to ServiceId %s"
            r2.a((java.lang.String) r11, (java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r8)
            goto L_0x0182
        L_0x017f:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x017f }
            throw r0
        L_0x0182:
            boolean r2 = defpackage.aymi.P()
            if (r2 == 0) goto L_0x01f8
            boolean r2 = r5.m
            if (r2 == 0) goto L_0x01f8
            boolean r2 = r5.g
            if (r2 != 0) goto L_0x01f8
            tph r2 = r1.j
            java.lang.Object r9 = r2.k
            monitor-enter(r9)
            ulj r2 = r2.b     // Catch:{ all -> 0x01f5 }
            umm r2 = r2.k     // Catch:{ all -> 0x01f5 }
            boolean r2 = r2.d()     // Catch:{ all -> 0x01f5 }
            monitor-exit(r9)     // Catch:{ all -> 0x01f5 }
            if (r2 != 0) goto L_0x01ef
            usu r2 = a((java.lang.String) r22, (java.lang.String) r23, (byte[]) r24)
            tph r9 = r1.j
            tqg r10 = new tqg
            r10.<init>(r1, r0, r6)
            java.lang.Object r11 = r9.k
            monitor-enter(r11)
            boolean r12 = r9.a()     // Catch:{ all -> 0x01ec }
            if (r12 == 0) goto L_0x01d1
            ulj r9 = r9.b     // Catch:{ all -> 0x01ec }
            umm r9 = r9.k     // Catch:{ all -> 0x01ec }
            r10.getClass()     // Catch:{ all -> 0x01ec }
            tot r12 = new tot     // Catch:{ all -> 0x01ec }
            r12.<init>(r10)     // Catch:{ all -> 0x01ec }
            boolean r2 = r9.a((defpackage.usu) r2, (defpackage.umk) r12)     // Catch:{ all -> 0x01ec }
            monitor-exit(r11)     // Catch:{ all -> 0x01ec }
            if (r2 != 0) goto L_0x01c8
            goto L_0x01d2
        L_0x01c8:
            jjg r2 = defpackage.tky.a
            defpackage.tky.a(r24)
            r21.b()
            goto L_0x01ef
        L_0x01d1:
            monitor-exit(r11)     // Catch:{ all -> 0x01ec }
        L_0x01d2:
            jjg r2 = defpackage.tky.a
            anie r2 = r2.c()
            anih r2 = (defpackage.anih) r2
            java.lang.String r9 = defpackage.tky.a(r24)
            long r10 = r21.b()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.String r11 = "In startListeningForWebRtcConnections(%s), client %d failed to start listening for incoming WebRTC connections to ServiceId %s"
            r2.a((java.lang.String) r11, (java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r8)
            goto L_0x01f8
        L_0x01ec:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x01ec }
            throw r0
        L_0x01ef:
            asoe r2 = defpackage.asoe.WEB_RTC
            r4.add(r2)
            goto L_0x01f8
        L_0x01f5:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x01f5 }
            throw r0
        L_0x01f8:
            boolean r2 = defpackage.aymi.q()
            if (r2 == 0) goto L_0x02df
            boolean r2 = r5.d
            if (r2 == 0) goto L_0x02df
            boolean r2 = r5.g
            if (r2 != 0) goto L_0x02df
            tph r2 = r1.j
            boolean r2 = r2.a((java.lang.String) r8)
            if (r2 != 0) goto L_0x023e
            tph r2 = r1.j
            tqc r9 = new tqc
            r9.<init>(r1, r0, r6)
            boolean r2 = r2.a((java.lang.String) r8, (defpackage.tpa) r9)
            if (r2 != 0) goto L_0x0236
            jjg r2 = defpackage.tky.a
            anie r2 = r2.c()
            anih r2 = (defpackage.anih) r2
            java.lang.String r9 = defpackage.tky.a(r24)
            long r10 = r21.b()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.String r11 = "In startBluetoothAdvertising(%s), client %d failed to start listening for incoming Bluetooth connections to ServiceId %s"
            r2.a((java.lang.String) r11, (java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r8)
            goto L_0x02df
        L_0x0236:
            jjg r2 = defpackage.tky.a
            defpackage.tky.a(r24)
            r21.b()
        L_0x023e:
            byte[] r2 = a((java.lang.String) r22)
            int r9 = r20.h()
            java.lang.String r9 = defpackage.tnd.a(r9, r7, r2, r6)
            if (r9 != 0) goto L_0x0280
            jjg r9 = defpackage.tky.a
            anie r9 = r9.c()
            anih r9 = (defpackage.anih) r9
            java.lang.String r11 = defpackage.tky.a(r24)
            long r12 = r21.b()
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            int r10 = r20.h()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            java.lang.String r16 = defpackage.tky.a(r2)
            java.lang.String r17 = defpackage.tky.a(r24)
            java.lang.String r10 = "In startBluetoothAdvertising(%s), client %d failed to generate BluetoothDeviceName {Version = %d, PCP = %d, EndpointId = %s, ServiceIdHash = %s, EndpointInfo = %s}"
            r13 = r18
            r15 = r23
            r9.a(r10, r11, r12, r13, r14, r15, r16, r17)
            tph r2 = r1.j
            r2.b(r8)
            goto L_0x02df
        L_0x0280:
            jjg r2 = defpackage.tky.a
            defpackage.tky.a(r24)
            r21.b()
            tph r2 = r1.j
            java.lang.Object r10 = r2.d
            monitor-enter(r10)
            boolean r11 = r2.a()     // Catch:{ all -> 0x02dc }
            if (r11 == 0) goto L_0x02bc
            ulj r11 = r2.b     // Catch:{ all -> 0x02dc }
            ulb r11 = r11.b     // Catch:{ all -> 0x02dc }
            boolean r11 = r11.a()     // Catch:{ all -> 0x02dc }
            if (r11 == 0) goto L_0x02a9
            ulj r2 = r2.b     // Catch:{ all -> 0x02dc }
            ujq r2 = r2.e     // Catch:{ all -> 0x02dc }
            boolean r2 = r2.b(r9)     // Catch:{ all -> 0x02dc }
            if (r2 == 0) goto L_0x02a9
            r2 = 1
            goto L_0x02aa
        L_0x02a9:
            r2 = 0
        L_0x02aa:
            monitor-exit(r10)     // Catch:{ all -> 0x02dc }
            if (r2 != 0) goto L_0x02ae
            goto L_0x02bd
        L_0x02ae:
            defpackage.tky.a(r24)
            r21.b()
            r1.n = r0
            asoe r2 = defpackage.asoe.BLUETOOTH
            r4.add(r2)
            goto L_0x02df
        L_0x02bc:
            monitor-exit(r10)     // Catch:{ all -> 0x02dc }
        L_0x02bd:
            jjg r2 = defpackage.tky.a
            anie r2 = r2.d()
            anih r2 = (defpackage.anih) r2
            java.lang.String r10 = defpackage.tky.a(r24)
            long r11 = r21.b()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            java.lang.String r12 = "In startBluetoothAdvertising(%s), client %d couldn't start Bluetooth advertising with BluetoothDeviceName %s"
            r2.a((java.lang.String) r12, (java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r9)
            tph r2 = r1.j
            r2.b(r8)
            goto L_0x02df
        L_0x02dc:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x02dc }
            throw r0
        L_0x02df:
            boolean r2 = defpackage.aymi.h()
            if (r2 == 0) goto L_0x049c
            boolean r2 = r5.e
            if (r2 == 0) goto L_0x0497
            byte[] r9 = r5.f
            boolean r10 = r5.g
            android.os.ParcelUuid r11 = r5.h
            tph r2 = r1.j
            java.lang.Object r12 = r2.e
            monitor-enter(r12)
            boolean r13 = r2.a()     // Catch:{ all -> 0x0494 }
            if (r13 == 0) goto L_0x0306
            ulj r2 = r2.b     // Catch:{ all -> 0x0494 }
            ukz r2 = r2.f     // Catch:{ all -> 0x0494 }
            boolean r2 = r2.e(r8)     // Catch:{ all -> 0x0494 }
            monitor-exit(r12)     // Catch:{ all -> 0x0494 }
            if (r2 != 0) goto L_0x034d
            goto L_0x0307
        L_0x0306:
            monitor-exit(r12)     // Catch:{ all -> 0x0494 }
        L_0x0307:
            tph r2 = r1.j
            tqa r12 = new tqa
            r12.<init>(r1, r0, r6)
            java.lang.Object r13 = r2.e
            monitor-enter(r13)
            boolean r14 = r2.a()     // Catch:{ all -> 0x0491 }
            if (r14 != 0) goto L_0x031e
            monitor-exit(r13)     // Catch:{ all -> 0x0491 }
            r12 = r4
            r15 = r5
            r0 = r6
            r13 = r7
            goto L_0x0475
        L_0x031e:
            if (r10 != 0) goto L_0x0332
            ulj r14 = r2.b     // Catch:{ all -> 0x0491 }
            ulb r14 = r14.b     // Catch:{ all -> 0x0491 }
            boolean r14 = r14.a()     // Catch:{ all -> 0x0491 }
            if (r14 == 0) goto L_0x032b
            goto L_0x0332
        L_0x032b:
            monitor-exit(r13)     // Catch:{ all -> 0x0491 }
            r12 = r4
            r15 = r5
            r0 = r6
            r13 = r7
            goto L_0x0475
        L_0x0332:
            ulj r2 = r2.b     // Catch:{ all -> 0x0491 }
            ukz r2 = r2.f     // Catch:{ all -> 0x0491 }
            r12.getClass()     // Catch:{ all -> 0x0491 }
            ton r14 = new ton     // Catch:{ all -> 0x0491 }
            r14.<init>(r12)     // Catch:{ all -> 0x0491 }
            boolean r2 = r2.a((java.lang.String) r8, (defpackage.ton) r14)     // Catch:{ all -> 0x0491 }
            monitor-exit(r13)     // Catch:{ all -> 0x0491 }
            if (r2 == 0) goto L_0x0471
            jjg r2 = defpackage.tky.a
            defpackage.tky.a(r24)
            r21.b()
        L_0x034d:
            boolean r2 = a((int) r10)
            if (r2 != 0) goto L_0x035d
            boolean r2 = defpackage.aymi.u()
            if (r2 == 0) goto L_0x039e
            boolean r2 = r5.l
            if (r2 == 0) goto L_0x039e
        L_0x035d:
            tph r2 = r1.j
            boolean r2 = r2.a((java.lang.String) r8)
            if (r2 != 0) goto L_0x039e
            tph r2 = r1.j
            tqc r12 = new tqc
            r12.<init>(r1, r0, r6)
            boolean r2 = r2.a((java.lang.String) r8, (defpackage.tpa) r12)
            if (r2 != 0) goto L_0x0396
            jjg r2 = defpackage.tky.a
            anie r2 = r2.c()
            anih r2 = (defpackage.anih) r2
            java.lang.String r9 = defpackage.tky.a(r24)
            long r10 = r21.b()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.String r11 = "In startBleAdvertising(%s), client %d failed to start listening for incoming Bluetooth connections to ServiceId %s"
            r2.a((java.lang.String) r11, (java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r8)
            tph r2 = r1.j
            r2.d(r8)
            r3 = r4
            r15 = r5
            r0 = r6
            r2 = r7
            goto L_0x04a0
        L_0x0396:
            jjg r2 = defpackage.tky.a
            defpackage.tky.a(r24)
            r21.b()
        L_0x039e:
            byte[] r12 = a((java.lang.String) r22)
            boolean r2 = a((int) r10)
            if (r2 == 0) goto L_0x03b0
            tph r2 = r1.j
            java.lang.String r2 = r2.b()
            r13 = r2
            goto L_0x03b2
        L_0x03b0:
            r2 = 0
            r13 = r2
        L_0x03b2:
            if (r11 != 0) goto L_0x03cb
            int r2 = r20.h()
            r14 = 0
            r15 = 1
            r3 = r12
            r12 = r4
            r4 = r23
            r15 = r5
            r5 = r24
            r0 = r6
            r6 = r13
            r13 = r7
            r7 = r14
            byte[] r2 = defpackage.tna.a(r2, r3, r4, r5, r6, r7)
            r14 = r2
            goto L_0x03df
        L_0x03cb:
            r12 = r4
            r15 = r5
            r0 = r6
            r13 = r7
            int r2 = r20.h()
            r3 = 0
            r6 = 0
            r7 = 1
            r4 = r23
            r5 = r24
            byte[] r2 = defpackage.tna.a(r2, r3, r4, r5, r6, r7)
            r14 = r2
        L_0x03df:
            if (r14 == 0) goto L_0x0454
            jjg r2 = defpackage.tky.a
            defpackage.tky.a(r24)
            r21.b()
            tph r2 = r1.j
            java.lang.Object r7 = r2.e
            monitor-enter(r7)
            boolean r3 = r2.a()     // Catch:{ all -> 0x044e }
            if (r3 != 0) goto L_0x03f6
            monitor-exit(r7)     // Catch:{ all -> 0x044e }
            goto L_0x0429
        L_0x03f6:
            if (r10 != 0) goto L_0x0405
            ulj r3 = r2.b     // Catch:{ all -> 0x044e }
            ulb r3 = r3.b     // Catch:{ all -> 0x044e }
            boolean r3 = r3.a()     // Catch:{ all -> 0x044e }
            if (r3 == 0) goto L_0x0403
            goto L_0x0405
        L_0x0403:
            monitor-exit(r7)     // Catch:{ all -> 0x044e }
            goto L_0x0429
        L_0x0405:
            ulj r2 = r2.b     // Catch:{ all -> 0x044e }
            ukz r2 = r2.f     // Catch:{ all -> 0x044e }
            r3 = r22
            r4 = r14
            r5 = r9
            r6 = r10
            r9 = r7
            r7 = r11
            boolean r2 = r2.a((java.lang.String) r3, (byte[]) r4, (byte[]) r5, (int) r6, (android.os.ParcelUuid) r7)     // Catch:{ all -> 0x0452 }
            monitor-exit(r9)     // Catch:{ all -> 0x0452 }
            if (r2 == 0) goto L_0x0429
            defpackage.tky.a(r24)
            r21.b()
            defpackage.tky.a(r14)
            asoe r2 = defpackage.asoe.BLE
            r12.add(r2)
            r3 = r12
            r2 = r13
            goto L_0x04a0
        L_0x0429:
            jjg r2 = defpackage.tky.a
            anie r2 = r2.c()
            anih r2 = (defpackage.anih) r2
            java.lang.String r3 = defpackage.tky.a(r24)
            long r4 = r21.b()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = defpackage.tky.a(r14)
            java.lang.String r6 = "In startBleAdvertising(%s), client %d couldn't start BLE Advertising with BleAdvertisement %s"
            r2.a((java.lang.String) r6, (java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r5)
            tph r2 = r1.j
            r2.d(r8)
            r3 = r12
            r2 = r13
            goto L_0x04a0
        L_0x044e:
            r0 = move-exception
            r9 = r7
        L_0x0450:
            monitor-exit(r9)     // Catch:{ all -> 0x0452 }
            throw r0
        L_0x0452:
            r0 = move-exception
            goto L_0x0450
        L_0x0454:
            jjg r2 = defpackage.tky.a
            anie r2 = r2.c()
            anih r2 = (defpackage.anih) r2
            java.lang.String r3 = defpackage.tky.a(r24)
            long r4 = r21.b()
            java.lang.String r6 = "In startBleAdvertising(%s), client %d failed to create an advertisement."
            r2.a((java.lang.String) r6, (java.lang.Object) r3, (long) r4)
            tph r2 = r1.j
            r2.d(r8)
            r3 = r12
            r2 = r13
            goto L_0x04a0
        L_0x0471:
            r12 = r4
            r15 = r5
            r0 = r6
            r13 = r7
        L_0x0475:
            jjg r2 = defpackage.tky.a
            anie r2 = r2.c()
            anih r2 = (defpackage.anih) r2
            java.lang.String r3 = defpackage.tky.a(r24)
            long r4 = r21.b()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "In startBleAdvertising(%s), client %d failed to start listening for incoming BLE connections to ServiceId %s"
            r2.a((java.lang.String) r5, (java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r8)
            r3 = r12
            r2 = r13
            goto L_0x04a0
        L_0x0491:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0491 }
            throw r0
        L_0x0494:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0494 }
            throw r0
        L_0x0497:
            r3 = r4
            r15 = r5
            r0 = r6
            r2 = r7
            goto L_0x04a0
        L_0x049c:
            r3 = r4
            r15 = r5
            r0 = r6
            r2 = r7
        L_0x04a0:
            boolean r4 = defpackage.aymi.aj()
            if (r4 == 0) goto L_0x0594
            boolean r4 = r15.i
            if (r4 == 0) goto L_0x0590
            boolean r4 = r15.g
            if (r4 != 0) goto L_0x0590
            int r4 = android.os.Build.VERSION.SDK_INT
            tph r4 = r1.j
            boolean r4 = r4.e(r8)
            if (r4 != 0) goto L_0x04ec
            tph r4 = r1.j
            tqi r5 = new tqi
            r6 = r0
            r0 = r21
            r5.<init>(r1, r0, r6)
            boolean r4 = r4.a((java.lang.String) r8, (defpackage.tpe) r5)
            if (r4 != 0) goto L_0x04e3
            jjg r2 = defpackage.tky.a
            anie r2 = r2.c()
            anih r2 = (defpackage.anih) r2
            java.lang.String r4 = defpackage.tky.a(r24)
            long r9 = r21.b()
            java.lang.Long r5 = java.lang.Long.valueOf(r9)
            java.lang.String r7 = "In startWifiLanAdvertising(%s), client %d failed to start listening for incoming Wifi LAN connections to ServiceId %s"
            r2.a((java.lang.String) r7, (java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r8)
            goto L_0x0597
        L_0x04e3:
            jjg r4 = defpackage.tky.a
            defpackage.tky.a(r24)
            r21.b()
            goto L_0x04ef
        L_0x04ec:
            r6 = r0
            r0 = r21
        L_0x04ef:
            byte[] r4 = a((java.lang.String) r22)
            int r5 = r20.h()
            android.net.nsd.NsdServiceInfo r5 = defpackage.tsa.a(r5, r2, r4, r6)
            if (r5 != 0) goto L_0x0532
            jjg r5 = defpackage.tky.a
            anie r5 = r5.c()
            r9 = r5
            anih r9 = (defpackage.anih) r9
            java.lang.String r11 = defpackage.tky.a(r24)
            long r12 = r21.b()
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            int r5 = r20.h()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
            java.lang.String r16 = defpackage.tky.a(r4)
            java.lang.String r17 = defpackage.tky.a(r24)
            java.lang.String r10 = "In startWifiLanAdvertising(%s), client %d failed to generate WifiLanServiceInfo {Version = %d, PCP = %d, EndpointId = %s, ServiceIdHash = %s, EndpointInfo = %s}"
            r13 = r18
            r15 = r23
            r9.a(r10, r11, r12, r13, r14, r15, r16, r17)
            tph r2 = r1.j
            r2.f(r8)
            goto L_0x0597
        L_0x0532:
            jjg r2 = defpackage.tky.a
            defpackage.tky.a(r24)
            r21.b()
            tph r2 = r1.j
            java.lang.Object r4 = r2.g
            monitor-enter(r4)
            boolean r7 = r2.a()     // Catch:{ all -> 0x058d }
            if (r7 == 0) goto L_0x056d
            ulj r7 = r2.b     // Catch:{ all -> 0x058d }
            upb r7 = r7.c     // Catch:{ all -> 0x058d }
            boolean r7 = r7.a()     // Catch:{ all -> 0x058d }
            if (r7 == 0) goto L_0x055c
            ulj r2 = r2.b     // Catch:{ all -> 0x058d }
            uoz r2 = r2.h     // Catch:{ all -> 0x058d }
            boolean r2 = r2.a((java.lang.String) r8, (android.net.nsd.NsdServiceInfo) r5)     // Catch:{ all -> 0x058d }
            if (r2 == 0) goto L_0x055c
            r19 = 1
            goto L_0x055d
        L_0x055c:
        L_0x055d:
            monitor-exit(r4)     // Catch:{ all -> 0x058d }
            if (r19 != 0) goto L_0x0561
            goto L_0x056e
        L_0x0561:
            defpackage.tky.a(r24)
            r21.b()
            asoe r2 = defpackage.asoe.WIFI_LAN
            r3.add(r2)
            goto L_0x0597
        L_0x056d:
            monitor-exit(r4)     // Catch:{ all -> 0x058d }
        L_0x056e:
            jjg r2 = defpackage.tky.a
            anie r2 = r2.d()
            anih r2 = (defpackage.anih) r2
            java.lang.String r4 = defpackage.tky.a(r24)
            long r9 = r21.b()
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            java.lang.String r9 = "In startWifiLanAdvertising(%s), client %d couldn't advertise with WifiLanServiceInfo %s"
            r2.a((java.lang.String) r9, (java.lang.Object) r4, (java.lang.Object) r7, (java.lang.Object) r5)
            tph r2 = r1.j
            r2.f(r8)
            goto L_0x0597
        L_0x058d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x058d }
            throw r0
        L_0x0590:
            r6 = r0
            r0 = r21
            goto L_0x0597
        L_0x0594:
            r6 = r0
            r0 = r21
        L_0x0597:
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L_0x05b7
            jjg r2 = defpackage.tky.a
            anie r2 = r2.b()
            anih r2 = (defpackage.anih) r2
            java.lang.String r3 = defpackage.tky.a(r24)
            long r4 = r21.b()
            java.lang.String r0 = "Failed startAdvertising(%s) for client %d"
            r2.a((java.lang.String) r0, (java.lang.Object) r3, (long) r4)
            tmw r0 = defpackage.tmw.a()
            return r0
        L_0x05b7:
            tmw r0 = defpackage.tmw.a(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tql.a(tlh, java.lang.String, java.lang.String, byte[], byte[], com.google.android.gms.nearby.connection.AdvertisingOptions):tmw");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: usx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: usa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: uwh} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r6v11 */
    /* JADX WARNING: type inference failed for: r6v16, types: [java.io.Closeable, uqe] */
    /* JADX WARNING: type inference failed for: r6v22 */
    /* JADX WARNING: type inference failed for: r6v23 */
    /* JADX WARNING: type inference failed for: r6v24 */
    /* JADX WARNING: type inference failed for: r6v25 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.tnm a(defpackage.tlh r14, defpackage.tms r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof defpackage.tmq
            r1 = 8007(0x1f47, float:1.122E-41)
            r2 = 2
            r3 = 13
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L_0x005b
            tmq r15 = (defpackage.tmq) r15
            jjg r0 = defpackage.tky.a
            r14.b()
            android.bluetooth.BluetoothDevice r0 = r15.a
            tph r6 = r13.j
            java.lang.String r7 = r15.d
            java.lang.String r8 = r15.b
            tfw r8 = r14.q(r8)
            upc r6 = r6.a((android.bluetooth.BluetoothDevice) r0, (java.lang.String) r7, (defpackage.tfw) r8)
            if (r6 == 0) goto L_0x0045
            tne r0 = defpackage.tne.a(r6)
            if (r0 == 0) goto L_0x002e
            r14.b()
            return r0
        L_0x002e:
            defpackage.jjt.a((java.io.Closeable) r6)
            tmr r14 = new tmr
            asoe r0 = defpackage.asoe.BLUETOOTH
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r15 = r15.b
            r1[r5] = r15
            java.lang.String r15 = "In bluetoothConnectImpl(), failed to create Bluetooth endpoint channel for endpoint %s"
            java.lang.String r15 = java.lang.String.format(r15, r1)
            r14.<init>(r0, r3, r15)
            throw r14
        L_0x0045:
            tmr r14 = new tmr
            asoe r3 = defpackage.asoe.BLUETOOTH
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r5] = r0
            java.lang.String r15 = r15.b
            r2[r4] = r15
            java.lang.String r15 = "In bluetoothConnectImpl(), failed to connect to Bluetooth device %s for endpoint %s"
            java.lang.String r15 = java.lang.String.format(r15, r2)
            r14.<init>(r3, r1, r15)
            throw r14
        L_0x005b:
            boolean r0 = r15 instanceof defpackage.tmp
            r6 = 0
            if (r0 == 0) goto L_0x00c9
            tmp r15 = (defpackage.tmp) r15
            jjg r0 = defpackage.tky.a
            r14.b()
            upv r0 = r15.a
            tph r7 = r13.j
            java.lang.String r8 = r15.d
            java.lang.String r9 = r15.b
            boolean r9 = c((defpackage.tlh) r14, (java.lang.String) r9)
            java.lang.String r10 = r15.b
            tfw r10 = r14.q(r10)
            java.lang.Object r11 = r7.e
            monitor-enter(r11)
            boolean r12 = r7.a()     // Catch:{ all -> 0x00c6 }
            if (r12 == 0) goto L_0x008c
            ulj r6 = r7.b     // Catch:{ all -> 0x00c6 }
            ukz r6 = r6.f     // Catch:{ all -> 0x00c6 }
            uqe r6 = r6.a((defpackage.upv) r0, (java.lang.String) r8, (int) r9, (defpackage.tfw) r10)     // Catch:{ all -> 0x00c6 }
            monitor-exit(r11)     // Catch:{ all -> 0x00c6 }
            goto L_0x008d
        L_0x008c:
            monitor-exit(r11)     // Catch:{ all -> 0x00c6 }
        L_0x008d:
            if (r6 == 0) goto L_0x00b0
            tnb r0 = defpackage.tnb.a(r6)
            if (r0 == 0) goto L_0x0099
            r14.b()
            return r0
        L_0x0099:
            defpackage.jjt.a((java.io.Closeable) r6)
            tmr r14 = new tmr
            asoe r0 = defpackage.asoe.BLE
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r15 = r15.b
            r1[r5] = r15
            java.lang.String r15 = "In bleConnectImpl(), failed to create BLE endpoint channel for endpoint %s"
            java.lang.String r15 = java.lang.String.format(r15, r1)
            r14.<init>(r0, r3, r15)
            throw r14
        L_0x00b0:
            tmr r14 = new tmr
            asoe r3 = defpackage.asoe.BLE
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r5] = r0
            java.lang.String r15 = r15.b
            r2[r4] = r15
            java.lang.String r15 = "In bleConnectImpl(), failed to connect to BLE device %s for endpoint %s"
            java.lang.String r15 = java.lang.String.format(r15, r2)
            r14.<init>(r3, r1, r15)
            throw r14
        L_0x00c6:
            r14 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00c6 }
            throw r14
        L_0x00c9:
            boolean r0 = r15 instanceof defpackage.tmy
            if (r0 == 0) goto L_0x013e
            tmy r15 = (defpackage.tmy) r15
            jjg r0 = defpackage.tky.a
            r14.b()
            android.net.nsd.NsdServiceInfo r0 = r15.a
            tph r1 = r13.j
            java.lang.String r7 = r15.b
            tfw r7 = r14.q(r7)
            java.lang.Object r8 = r1.g
            monitor-enter(r8)
            boolean r9 = r1.a()     // Catch:{ all -> 0x013b }
            if (r9 == 0) goto L_0x00fd
            ulj r9 = r1.b     // Catch:{ all -> 0x013b }
            upb r9 = r9.c     // Catch:{ all -> 0x013b }
            boolean r9 = r9.a()     // Catch:{ all -> 0x013b }
            if (r9 == 0) goto L_0x00fb
            ulj r1 = r1.b     // Catch:{ all -> 0x013b }
            uoz r1 = r1.h     // Catch:{ all -> 0x013b }
            uwh r6 = r1.a((android.net.nsd.NsdServiceInfo) r0, (defpackage.tfw) r7)     // Catch:{ all -> 0x013b }
            monitor-exit(r8)     // Catch:{ all -> 0x013b }
            goto L_0x00fe
        L_0x00fb:
            monitor-exit(r8)     // Catch:{ all -> 0x013b }
            goto L_0x00fe
        L_0x00fd:
            monitor-exit(r8)     // Catch:{ all -> 0x013b }
        L_0x00fe:
            if (r6 == 0) goto L_0x0121
            trz r0 = defpackage.trz.a(r6)
            if (r0 == 0) goto L_0x010a
            r14.b()
            return r0
        L_0x010a:
            defpackage.jjt.a((java.io.Closeable) r6)
            tmr r14 = new tmr
            asoe r0 = defpackage.asoe.WIFI_LAN
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r15 = r15.b
            r1[r5] = r15
            java.lang.String r15 = "In wifiLanConnectImpl(), failed to create Wifi LAN endpoint channel for endpoint %s"
            java.lang.String r15 = java.lang.String.format(r15, r1)
            r14.<init>(r0, r3, r15)
            throw r14
        L_0x0121:
            tmr r14 = new tmr
            asoe r1 = defpackage.asoe.WIFI_LAN
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getServiceName()
            r2[r5] = r0
            java.lang.String r15 = r15.b
            r2[r4] = r15
            java.lang.String r15 = "In wifiLanConnectImpl(), failed to connect to service %s for endpoint %s"
            java.lang.String r15 = java.lang.String.format(r15, r2)
            r14.<init>(r1, r3, r15)
            throw r14
        L_0x013b:
            r14 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x013b }
            throw r14
        L_0x013e:
            boolean r0 = r15 instanceof defpackage.tmu
            if (r0 == 0) goto L_0x01ac
            tmu r15 = (defpackage.tmu) r15
            tph r0 = r13.j
            java.lang.String r1 = r15.d
            usd r2 = r15.a
            java.lang.String r7 = r15.b
            tfw r7 = r14.q(r7)
            java.lang.Object r8 = r0.j
            monitor-enter(r8)
            boolean r9 = r0.a()     // Catch:{ all -> 0x01a9 }
            if (r9 == 0) goto L_0x016f
            ulj r9 = r0.b     // Catch:{ all -> 0x01a9 }
            ult r9 = r9.d     // Catch:{ all -> 0x01a9 }
            boolean r9 = r9.a()     // Catch:{ all -> 0x01a9 }
            if (r9 == 0) goto L_0x016d
            ulj r0 = r0.b     // Catch:{ all -> 0x01a9 }
            uls r0 = r0.l     // Catch:{ all -> 0x01a9 }
            usa r6 = r0.a(r1, r2, r7)     // Catch:{ all -> 0x01a9 }
            monitor-exit(r8)     // Catch:{ all -> 0x01a9 }
            goto L_0x0170
        L_0x016d:
            monitor-exit(r8)     // Catch:{ all -> 0x01a9 }
            goto L_0x0170
        L_0x016f:
            monitor-exit(r8)     // Catch:{ all -> 0x01a9 }
        L_0x0170:
            if (r6 == 0) goto L_0x0195
            tpi r0 = defpackage.tpi.a(r6)
            if (r0 == 0) goto L_0x017e
            jjg r15 = defpackage.tky.a
            r14.b()
            return r0
        L_0x017e:
            defpackage.jjt.a((java.io.Closeable) r6)
            tmr r14 = new tmr
            asoe r0 = defpackage.asoe.NFC
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r15 = r15.b
            r1[r5] = r15
            java.lang.String r15 = "In nfcConnectImpl(), failed to create NFC endpoint channel for endpoint %s"
            java.lang.String r15 = java.lang.String.format(r15, r1)
            r14.<init>(r0, r3, r15)
            throw r14
        L_0x0195:
            tmr r14 = new tmr
            asoe r0 = defpackage.asoe.NFC
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r15 = r15.b
            r1[r5] = r15
            java.lang.String r15 = "In nfcConnectImpl(), failed to connect to NFC device for endpoint %s"
            java.lang.String r15 = java.lang.String.format(r15, r1)
            r14.<init>(r0, r3, r15)
            throw r14
        L_0x01a9:
            r14 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x01a9 }
            throw r14
        L_0x01ac:
            boolean r14 = r15 instanceof defpackage.tmx
            if (r14 == 0) goto L_0x026f
            tmx r15 = (defpackage.tmx) r15
            tph r14 = r13.j
            usu r0 = r15.a
            java.lang.Object r1 = r14.k
            monitor-enter(r1)
            boolean r2 = r14.a()     // Catch:{ all -> 0x026c }
            if (r2 == 0) goto L_0x024e
            ulj r14 = r14.b     // Catch:{ all -> 0x026c }
            umm r14 = r14.k     // Catch:{ all -> 0x026c }
            java.lang.String r2 = "umm"
            java.lang.String r7 = "a"
            java.lang.String r8 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            monitor-enter(r14)     // Catch:{ all -> 0x026c }
            boolean r9 = r14.a()     // Catch:{ all -> 0x024b }
            if (r9 == 0) goto L_0x0245
            uml r9 = r14.c     // Catch:{ all -> 0x024b }
            uml r10 = defpackage.uml.NONE     // Catch:{ all -> 0x024b }
            if (r9 == r10) goto L_0x01ef
            jjg r0 = defpackage.ulh.a     // Catch:{ all -> 0x024b }
            anie r0 = r0.c()     // Catch:{ all -> 0x024b }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x024b }
            r9 = 254(0xfe, float:3.56E-43)
            anie r0 = r0.a((java.lang.String) r2, (java.lang.String) r7, (int) r9, (java.lang.String) r8)     // Catch:{ all -> 0x024b }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x024b }
            java.lang.String r2 = "Cannot connect with WebRTC because we are already acting as a %s."
            uml r7 = r14.c     // Catch:{ all -> 0x024b }
            r0.a((java.lang.String) r2, (java.lang.Object) r7)     // Catch:{ all -> 0x024b }
            monitor-exit(r14)     // Catch:{ all -> 0x024b }
            goto L_0x0249
        L_0x01ef:
            r14.b = r0     // Catch:{ all -> 0x024b }
            uml r9 = defpackage.uml.ANSWERER     // Catch:{ all -> 0x024b }
            r10 = 64
            byte[] r10 = defpackage.ulu.b(r10)     // Catch:{ all -> 0x024b }
            usu r10 = defpackage.usu.a(r10)     // Catch:{ all -> 0x024b }
            boolean r9 = r14.a((defpackage.uml) r9, (defpackage.usu) r10)     // Catch:{ all -> 0x024b }
            if (r9 == 0) goto L_0x0243
            monitor-exit(r14)     // Catch:{ all -> 0x024b }
            jjg r6 = defpackage.ulh.a     // Catch:{ all -> 0x026c }
            anie r6 = r6.d()     // Catch:{ all -> 0x026c }
            anih r6 = (defpackage.anih) r6     // Catch:{ all -> 0x026c }
            r9 = 265(0x109, float:3.71E-43)
            anie r2 = r6.a((java.lang.String) r2, (java.lang.String) r7, (int) r9, (java.lang.String) r8)     // Catch:{ all -> 0x026c }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x026c }
            java.lang.String r6 = "Attempting to make a WebRTC connection to %s."
            r2.a((java.lang.String) r6, (java.lang.Object) r0)     // Catch:{ all -> 0x026c }
            java.lang.String r0 = "WebRtc.connect"
            usp r2 = r14.a     // Catch:{ all -> 0x026c }
            aosh r2 = r2.b     // Catch:{ all -> 0x026c }
            umk r6 = defpackage.uly.a     // Catch:{ all -> 0x026c }
            aorr r2 = r14.a((defpackage.aorr) r2, (defpackage.umk) r6)     // Catch:{ all -> 0x026c }
            aymi r6 = defpackage.aymi.a     // Catch:{ all -> 0x026c }
            aymj r6 = r6.a()     // Catch:{ all -> 0x026c }
            long r6 = r6.aR()     // Catch:{ all -> 0x026c }
            java.lang.Object r0 = defpackage.thr.c(r0, r2, r6)     // Catch:{ all -> 0x026c }
            usx r0 = (defpackage.usx) r0     // Catch:{ all -> 0x026c }
            if (r0 != 0) goto L_0x0240
            monitor-enter(r14)     // Catch:{ all -> 0x026c }
            r14.c()     // Catch:{ all -> 0x023d }
            monitor-exit(r14)     // Catch:{ all -> 0x023d }
            goto L_0x0240
        L_0x023d:
            r15 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x023d }
            throw r15     // Catch:{ all -> 0x026c }
        L_0x0240:
            r6 = r0
            goto L_0x0249
        L_0x0243:
            monitor-exit(r14)     // Catch:{ all -> 0x024b }
            goto L_0x0249
        L_0x0245:
            r14.c()     // Catch:{ all -> 0x024b }
            monitor-exit(r14)     // Catch:{ all -> 0x024b }
        L_0x0249:
            monitor-exit(r1)     // Catch:{ all -> 0x026c }
            goto L_0x024f
        L_0x024b:
            r15 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x024b }
            throw r15     // Catch:{ all -> 0x026c }
        L_0x024e:
            monitor-exit(r1)     // Catch:{ all -> 0x026c }
        L_0x024f:
            if (r6 == 0) goto L_0x0258
            tro r14 = defpackage.tro.a(r6)
            jjg r15 = defpackage.tky.a
            return r14
        L_0x0258:
            tmr r14 = new tmr
            asoe r0 = defpackage.asoe.WEB_RTC
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r15 = r15.b
            r1[r5] = r15
            java.lang.String r15 = "In webRtcConnectImpl(), failed to connect to WebRTC device for endpoint %s"
            java.lang.String r15 = java.lang.String.format(r15, r1)
            r14.<init>(r0, r3, r15)
            throw r14
        L_0x026c:
            r14 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x026c }
            throw r14
        L_0x026f:
            tmr r14 = new tmr
            asoe r15 = r15.e
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r1 = r15.name()
            r0[r5] = r1
            java.lang.String r1 = "P2PClusterPCPHandler is unable to connect to the endpoint of unknown type %s."
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r14.<init>(r15, r3, r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tql.a(tlh, tms):tnm");
    }

    /* access modifiers changed from: protected */
    public void a(tlh tlh) {
        tph tph = this.j;
        String h = tlh.h();
        synchronized (tph.e) {
            if (tph.a()) {
                tph.b.f.b(h);
            }
        }
        if (tlh == this.n) {
            tph tph2 = this.j;
            synchronized (tph2.d) {
                if (tph2.a()) {
                    tph2.b.e.c();
                }
            }
            this.n = null;
        }
        if (aymi.aj()) {
            tph tph3 = this.j;
            String h2 = tlh.h();
            synchronized (tph3.g) {
                if (tph3.a()) {
                    tph3.b.h.d(h2);
                }
            }
        }
        tph tph4 = this.j;
        String h3 = tlh.h();
        synchronized (tph4.j) {
            if (tph4.a()) {
                tph4.b.l.a(h3);
            }
        }
        this.j.d(tlh.h());
        this.j.b(tlh.h());
        if (aymi.aj()) {
            this.j.f(tlh.h());
        }
        this.j.k(tlh.h());
        if (aymi.P()) {
            tph tph5 = this.j;
            synchronized (tph5.k) {
                if (tph5.a()) {
                    tph5.b.k.e();
                }
            }
        }
    }

    public final boolean a(tmq tmq) {
        tps tps = this.k;
        if (tps != null && tps.d.containsValue(tmq)) {
            return false;
        }
        tpp tpp = this.l;
        if (tpp != null && tpp.e.containsValue(tmq)) {
            return false;
        }
        tpv tpv = this.m;
        if (tpv == null || !tpv.e.containsValue(tmq)) {
            return true;
        }
        return false;
    }
}
