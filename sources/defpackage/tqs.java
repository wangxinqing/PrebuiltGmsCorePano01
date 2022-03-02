package defpackage;

import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.Strategy;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: tqs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tqs extends tqt {
    public final tph m;

    public tqs(tph tph, tob tob, tnq tnq, tlt tlt) {
        super(tph, tob, tnq, tlt);
        this.m = tph;
    }

    /* access modifiers changed from: protected */
    public final tmw a(tlh tlh, String str, DiscoveryOptions discoveryOptions) {
        ArrayList a = anda.a();
        a.addAll(super.a(tlh, str, discoveryOptions).b);
        if (aymi.T() && discoveryOptions.i && !discoveryOptions.e) {
            if (!this.m.a(str, (toz) new tqo(this, tlh, str))) {
                ((anih) tky.a.d()).a("In startWifiAwareDiscovery(), client %d couldn't start scanning on Wifi Aware for serviceId %s.", tlh.b(), (Object) str);
            } else {
                jjg jjg = tky.a;
                tlh.b();
                a.add(asoe.WIFI_AWARE);
            }
        }
        if (!a.isEmpty()) {
            return tmw.a(a);
        }
        ((anih) tky.a.b()).a("Failed startDiscovery() for client %d", tlh.b());
        return tmw.a();
    }

    /* access modifiers changed from: protected */
    public final void b(tlh tlh) {
        super.b(tlh);
        this.m.i(tlh.l());
    }

    /* access modifiers changed from: protected */
    public final boolean c(tlh tlh) {
        return !e(tlh) && !f(tlh);
    }

    /* access modifiers changed from: protected */
    public final List d() {
        return Arrays.asList(new asoe[]{asoe.WEB_RTC, asoe.WIFI_AWARE, asoe.WIFI_LAN, asoe.WIFI_DIRECT, asoe.WIFI_HOTSPOT, asoe.BLUETOOTH, asoe.BLE, asoe.NFC});
    }

    /* access modifiers changed from: protected */
    public final asoe e() {
        return asoe.WIFI_AWARE;
    }

    public final Strategy g() {
        return Strategy.c;
    }

    public final int h() {
        return 3;
    }

    /* access modifiers changed from: protected */
    public final boolean d(tlh tlh) {
        return !e(tlh) && !f(tlh);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.tmw a(defpackage.tlh r17, java.lang.String r18, java.lang.String r19, byte[] r20, byte[] r21, com.google.android.gms.nearby.connection.AdvertisingOptions r22) {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            r2 = r20
            r3 = r22
            java.util.ArrayList r4 = defpackage.anda.a()
            tmw r5 = super.a(r17, r18, r19, r20, r21, r22)
            java.util.List r5 = r5.b
            r4.addAll(r5)
            boolean r5 = defpackage.aymi.T()
            if (r5 == 0) goto L_0x00f3
            boolean r5 = r3.k
            if (r5 == 0) goto L_0x00f0
            boolean r3 = r3.g
            if (r3 != 0) goto L_0x00f0
            tph r3 = r1.m
            java.lang.Object r5 = r3.h
            monitor-enter(r5)
            boolean r6 = r3.a()     // Catch:{ all -> 0x00ed }
            if (r6 == 0) goto L_0x003f
            ulj r3 = r3.b     // Catch:{ all -> 0x00ed }
            ump r3 = r3.i     // Catch:{ all -> 0x00ed }
            uvx r3 = r3.b     // Catch:{ all -> 0x00ed }
            boolean r3 = r3.a((java.lang.String) r0)     // Catch:{ all -> 0x00ed }
            monitor-exit(r5)     // Catch:{ all -> 0x00ed }
            if (r3 != 0) goto L_0x003c
            goto L_0x0040
        L_0x003c:
            r6 = r17
            goto L_0x0073
        L_0x003f:
            monitor-exit(r5)     // Catch:{ all -> 0x00ed }
        L_0x0040:
            tph r3 = r1.m
            tqq r5 = new tqq
            r6 = r17
            r5.<init>(r1, r6, r2)
            r7 = 0
            boolean r3 = r3.a((java.lang.String) r0, (java.lang.String) r7, (defpackage.tpb) r5)
            if (r3 != 0) goto L_0x006b
            jjg r3 = defpackage.tky.a
            anie r3 = r3.c()
            anih r3 = (defpackage.anih) r3
            java.lang.String r5 = defpackage.tky.a(r20)
            long r7 = r17.b()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.String r8 = "In startWifiAwareAdvertising(%s), client %d failed to start listening for incoming Wifi Aware connections to ServiceId %s"
            r3.a((java.lang.String) r8, (java.lang.Object) r5, (java.lang.Object) r7, (java.lang.Object) r0)
            goto L_0x00f5
        L_0x006b:
            jjg r3 = defpackage.tky.a
            defpackage.tky.a(r20)
            r17.b()
        L_0x0073:
            byte[] r3 = a((java.lang.String) r18)
            r5 = r19
            byte[] r7 = defpackage.trt.a(r5, r3, r2)
            if (r7 != 0) goto L_0x00b2
            jjg r7 = defpackage.tky.a
            anie r7 = r7.c()
            anih r7 = (defpackage.anih) r7
            java.lang.String r9 = defpackage.tky.a(r20)
            long r10 = r17.b()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r8 = 1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r8 = 3
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            java.lang.String r14 = defpackage.tky.a(r3)
            java.lang.String r15 = defpackage.tky.a(r20)
            java.lang.String r8 = "In startWifiAwareAdvertising(%s), client %d failed to generate WifiAwareServiceInfo {Version = %d, PCP = %d, EndpointId = %s, ServiceIdHash = %s, EndpointInfo = %s}"
            r13 = r19
            r7.a(r8, r9, r10, r11, r12, r13, r14, r15)
            tph r3 = r1.m
            r3.g(r0)
            goto L_0x00f5
        L_0x00b2:
            jjg r3 = defpackage.tky.a
            defpackage.tky.a(r20)
            r17.b()
            tph r3 = r1.m
            boolean r3 = r3.a((java.lang.String) r0, (byte[]) r7)
            if (r3 != 0) goto L_0x00e1
            jjg r3 = defpackage.tky.a
            anie r3 = r3.d()
            anih r3 = (defpackage.anih) r3
            java.lang.String r5 = defpackage.tky.a(r20)
            long r8 = r17.b()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.String r9 = "In startWifiAwareAdvertising(%s), client %d couldn't become Wifi Aware discoverable with WifiAwareServiceInfo %s"
            r3.a((java.lang.String) r9, (java.lang.Object) r5, (java.lang.Object) r8, (java.lang.Object) r7)
            tph r3 = r1.m
            r3.g(r0)
            goto L_0x00f5
        L_0x00e1:
            defpackage.tky.a(r20)
            r17.b()
            asoe r0 = defpackage.asoe.WIFI_AWARE
            r4.add(r0)
            goto L_0x00f5
        L_0x00ed:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00ed }
            throw r0
        L_0x00f0:
            r6 = r17
            goto L_0x00f5
        L_0x00f3:
            r6 = r17
        L_0x00f5:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0115
            jjg r0 = defpackage.tky.a
            anie r0 = r0.b()
            anih r0 = (defpackage.anih) r0
            java.lang.String r2 = defpackage.tky.a(r20)
            long r3 = r17.b()
            java.lang.String r5 = "Failed startAdvertising(%s) for client %d"
            r0.a((java.lang.String) r5, (java.lang.Object) r2, (long) r3)
            tmw r0 = defpackage.tmw.a()
            return r0
        L_0x0115:
            tmw r0 = defpackage.tmw.a(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqs.a(tlh, java.lang.String, java.lang.String, byte[], byte[], com.google.android.gms.nearby.connection.AdvertisingOptions):tmw");
    }

    /* access modifiers changed from: protected */
    public final tnm a(tlh tlh, tms tms) {
        if (!(tms instanceof tqr)) {
            return super.a(tlh, tms);
        }
        tqr tqr = (tqr) tms;
        uvz a = this.m.a(tqr.a, (String) null, tlh.q(tqr.b));
        if (a != null) {
            trs a2 = trs.a(a);
            if (a2 != null) {
                jjg jjg = tky.a;
                tlh.b();
                return a2;
            }
            jjt.a((Closeable) a);
            throw new tmr(asoe.WIFI_AWARE, 13, String.format("In wifiAwareConnectImpl(), failed to create Wifi Aware endpoint channel for endpoint %s", new Object[]{tqr.b}));
        }
        throw new tmr(asoe.WIFI_AWARE, 13, String.format("In wifiAwareConnectImpl(), failed to connect to Wifi Aware device for endpoint %s", new Object[]{tqr.b}));
    }

    /* access modifiers changed from: protected */
    public final void a(tlh tlh) {
        super.a(tlh);
        this.m.h(tlh.h());
        this.m.g(tlh.h());
    }
}
