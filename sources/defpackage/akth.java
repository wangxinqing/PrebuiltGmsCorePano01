package defpackage;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

/* renamed from: akth  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akth {
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        if ((r0 & 2) == 0) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.akri a(defpackage.atak r8) {
        /*
            if (r8 == 0) goto L_0x000e
            int r0 = r8.a
            r1 = r0 & 1
            if (r1 != 0) goto L_0x0009
            goto L_0x000e
        L_0x0009:
            r0 = r0 & 2
            if (r0 == 0) goto L_0x000e
            goto L_0x001e
        L_0x000e:
            r0 = 6
            java.lang.String r1 = "Places"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 != 0) goto L_0x0018
            goto L_0x001e
        L_0x0018:
            java.lang.String r0 = "PlaceLocation does not have placeId or location"
            defpackage.alfy.a(r1, r0)
        L_0x001e:
            float r0 = r8.d
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0027
            r7 = r0
            goto L_0x002b
        L_0x0027:
            r0 = 1117782016(0x42a00000, float:80.0)
            r7 = 1117782016(0x42a00000, float:80.0)
        L_0x002b:
            akri r0 = new akri
            java.lang.String r2 = r8.b
            avoq r1 = r8.c
            if (r1 == 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            avoq r1 = defpackage.avoq.c
        L_0x0036:
            double r3 = r1.a
            avoq r8 = r8.c
            if (r8 != 0) goto L_0x003e
            avoq r8 = defpackage.avoq.c
        L_0x003e:
            double r5 = r8.b
            r1 = r0
            r1.<init>(r2, r3, r5, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akth.a(atak):akri");
    }

    public static aszm a(LatLngBounds latLngBounds, int i, List list) {
        aucd o = aszm.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aszm aszm = (aszm) o.b;
        if (!aszm.b.a()) {
            aszm.b = aucj.a(aszm.b);
        }
        auab.a((Iterable) list, (List) aszm.b);
        aszw a = a(latLngBounds);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aszm aszm2 = (aszm) o.b;
        a.getClass();
        aszm2.c = a;
        int i2 = aszm2.a | 1;
        aszm2.a = i2;
        aszm2.a = i2 | 2;
        aszm2.d = i;
        return (aszm) o.i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x019c A[EDGE_INSN: B:81:0x019c->B:67:0x019c ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.aszr a(android.content.Context r20, com.google.android.gms.maps.model.LatLng r21, int r22, com.google.android.gms.location.places.internal.PlacesParams r23) {
        /*
            aszr r0 = defpackage.aszr.f
            aucd r1 = r0.o()
            avoq r0 = a((com.google.android.gms.maps.model.LatLng) r21)
            boolean r2 = r1.c
            r3 = 0
            if (r2 == 0) goto L_0x0014
            r1.c()
            r1.c = r3
        L_0x0014:
            aucj r2 = r1.b
            aszr r2 = (defpackage.aszr) r2
            r0.getClass()
            r2.b = r0
            int r0 = r2.a
            r4 = 1
            r0 = r0 | r4
            r2.a = r0
            r0 = r0 | 2
            r2.a = r0
            r5 = r22
            r2.c = r5
            r5 = r23
            java.lang.String r5 = r5.c
            r5.getClass()
            r6 = 4
            r0 = r0 | r6
            r2.a = r0
            r2.e = r5
            int r0 = android.os.Build.VERSION.SDK_INT
            jnh r0 = defpackage.jni.b(r20)
            java.lang.String r2 = "android.permission.ACCESS_WIFI_STATE"
            int r0 = r0.a((java.lang.String) r2)
            if (r0 != 0) goto L_0x019e
            long r7 = defpackage.azcf.d()
            r9 = 0
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x019e
            r9 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r7 * r9
            long r9 = defpackage.azcf.e()
            int r5 = (int) r9
            if (r5 <= 0) goto L_0x019e
            android.content.Context r0 = r20.getApplicationContext()
            java.lang.String r9 = "wifi"
            java.lang.Object r0 = r0.getSystemService(r9)
            r9 = r0
            android.net.wifi.WifiManager r9 = (android.net.wifi.WifiManager) r9
            boolean r0 = r9.isWifiEnabled()
            if (r0 == 0) goto L_0x019e
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r5)
            java.util.List r0 = r9.getScanResults()
            if (r0 == 0) goto L_0x019e
            java.util.Iterator r11 = r0.iterator()
            r12 = 0
        L_0x007f:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x019b
            java.lang.Object r0 = r11.next()
            r13 = r0
            android.net.wifi.ScanResult r13 = (android.net.wifi.ScanResult) r13
            java.lang.String r0 = r13.SSID
            boolean r0 = defpackage.agxx.b(r0)
            if (r0 != 0) goto L_0x0197
            long r14 = r13.timestamp
            long r16 = android.os.SystemClock.elapsedRealtime()
            r18 = 1000(0x3e8, double:4.94E-321)
            long r16 = r16 * r18
            long r16 = r16 - r14
            int r0 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0195
            aszq r0 = defpackage.aszq.g
            aucd r14 = r0.o()
            java.lang.String r0 = r13.BSSID
            java.util.regex.Pattern r15 = defpackage.akub.a
            java.util.regex.Matcher r15 = r15.matcher(r0)
            boolean r15 = r15.matches()
            if (r15 == 0) goto L_0x00cf
            java.lang.String r15 = ":"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replace(r15, r2)
            aoor r0 = defpackage.aoor.a(r0)     // Catch:{ NumberFormatException -> 0x00ce }
            r15 = r7
            long r6 = r0.a     // Catch:{ NumberFormatException -> 0x00cc }
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ NumberFormatException -> 0x00cc }
            goto L_0x00d1
        L_0x00cc:
            r0 = move-exception
            goto L_0x00d0
        L_0x00ce:
            r0 = move-exception
        L_0x00cf:
            r15 = r7
        L_0x00d0:
            r0 = 0
        L_0x00d1:
            if (r0 == 0) goto L_0x00ec
            long r6 = r0.longValue()
            boolean r0 = r14.c
            if (r0 != 0) goto L_0x00dc
            goto L_0x00e1
        L_0x00dc:
            r14.c()
            r14.c = r3
        L_0x00e1:
            aucj r0 = r14.b
            aszq r0 = (defpackage.aszq) r0
            int r2 = r0.a
            r2 = r2 | r4
            r0.a = r2
            r0.b = r6
        L_0x00ec:
            int r0 = r13.level
            boolean r2 = r14.c
            if (r2 != 0) goto L_0x00f3
            goto L_0x00f8
        L_0x00f3:
            r14.c()
            r14.c = r3
        L_0x00f8:
            aucj r2 = r14.b
            aszq r2 = (defpackage.aszq) r2
            int r6 = r2.a
            r6 = r6 | 2
            r2.a = r6
            r2.c = r0
            java.lang.String r0 = r13.capabilities
            java.lang.String r2 = "WPA-PSK"
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L_0x012f
            java.lang.String r2 = "WPA-EAP"
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L_0x012d
            r2 = 0
        L_0x0117:
            java.lang.String[] r6 = defpackage.akub.b
            int r6 = r6.length
            if (r2 >= r6) goto L_0x012b
            java.lang.String[] r6 = defpackage.akub.b
            r6 = r6[r2]
            boolean r6 = r0.contains(r6)
            if (r6 != 0) goto L_0x0129
            int r2 = r2 + 1
            goto L_0x0117
        L_0x0129:
            r0 = 5
            goto L_0x0130
        L_0x012b:
            r0 = 1
            goto L_0x0130
        L_0x012d:
            r0 = 4
            goto L_0x0130
        L_0x012f:
            r0 = 3
        L_0x0130:
            boolean r2 = r14.c
            if (r2 != 0) goto L_0x0135
            goto L_0x013a
        L_0x0135:
            r14.c()
            r14.c = r3
        L_0x013a:
            aucj r2 = r14.b
            aszq r2 = (defpackage.aszq) r2
            int r0 = r0 + -1
            r2.d = r0
            int r0 = r2.a
            r6 = 4
            r0 = r0 | r6
            r2.a = r0
            int r0 = r13.frequency
            boolean r2 = r14.c
            if (r2 != 0) goto L_0x014f
            goto L_0x0154
        L_0x014f:
            r14.c()
            r14.c = r3
        L_0x0154:
            aucj r2 = r14.b
            aszq r2 = (defpackage.aszq) r2
            int r7 = r2.a
            r7 = r7 | 16
            r2.a = r7
            r2.f = r0
            java.lang.String r0 = r13.BSSID
            android.net.wifi.WifiInfo r2 = r9.getConnectionInfo()
            java.lang.String r2 = r2.getBSSID()
            boolean r0 = r2.equals(r0)
            boolean r2 = r14.c
            if (r2 != 0) goto L_0x0173
            goto L_0x0178
        L_0x0173:
            r14.c()
            r14.c = r3
        L_0x0178:
            aucj r2 = r14.b
            aszq r2 = (defpackage.aszq) r2
            int r7 = r2.a
            r7 = r7 | 8
            r2.a = r7
            r2.e = r0
            aucj r0 = r14.i()
            aszq r0 = (defpackage.aszq) r0
            r10.add(r0)
            int r12 = r12 + 1
            if (r12 < r5) goto L_0x0192
            goto L_0x019c
        L_0x0192:
            r7 = r15
            goto L_0x007f
        L_0x0195:
            r15 = r7
            goto L_0x0198
        L_0x0197:
            r15 = r7
        L_0x0198:
            r7 = r15
            goto L_0x007f
        L_0x019b:
        L_0x019c:
            r2 = r10
            goto L_0x019f
        L_0x019e:
            r2 = 0
        L_0x019f:
            if (r2 != 0) goto L_0x01a2
            goto L_0x01c5
        L_0x01a2:
            boolean r0 = r1.c
            if (r0 != 0) goto L_0x01a7
            goto L_0x01ac
        L_0x01a7:
            r1.c()
            r1.c = r3
        L_0x01ac:
            aucj r0 = r1.b
            aszr r0 = (defpackage.aszr) r0
            aucx r3 = r0.d
            boolean r3 = r3.a()
            if (r3 != 0) goto L_0x01c0
            aucx r3 = r0.d
            aucx r3 = defpackage.aucj.a((defpackage.aucx) r3)
            r0.d = r3
        L_0x01c0:
            aucx r0 = r0.d
            defpackage.auab.a((java.lang.Iterable) r2, (java.util.List) r0)
        L_0x01c5:
            aucj r0 = r1.i()
            aszr r0 = (defpackage.aszr) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akth.a(android.content.Context, com.google.android.gms.maps.model.LatLng, int, com.google.android.gms.location.places.internal.PlacesParams):aszr");
    }

    public static aszw a(LatLngBounds latLngBounds) {
        aucd o = aszw.d.o();
        avoq a = a(latLngBounds.b);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aszw aszw = (aszw) o.b;
        a.getClass();
        aszw.c = a;
        aszw.a |= 2;
        avoq a2 = a(latLngBounds.a);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aszw aszw2 = (aszw) o.b;
        a2.getClass();
        aszw2.b = a2;
        aszw2.a |= 1;
        return (aszw) o.i();
    }

    private static avoq a(LatLng latLng) {
        aucd o = avoq.c.o();
        double d = latLng.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        avoq avoq = (avoq) o.b;
        avoq.a = d;
        avoq.b = latLng.b;
        return (avoq) o.i();
    }

    public static LatLng a(avoq avoq) {
        double d = 0.0d;
        double d2 = avoq != null ? avoq.a : 0.0d;
        if (avoq != null) {
            d = avoq.b;
        }
        return new LatLng(d2, d);
    }
}
