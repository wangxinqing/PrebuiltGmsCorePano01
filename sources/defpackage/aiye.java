package defpackage;

import android.content.Context;
import android.net.wifi.RttManager;
import android.net.wifi.ScanResult;
import android.net.wifi.rtt.RangingRequest;
import android.net.wifi.rtt.WifiRttManager;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: aiye  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class aiye extends aiyb {
    public static final /* synthetic */ int e = 0;
    final bir b = new bir(Math.min(6, RangingRequest.getMaxPeers()), SystemClock.elapsedRealtime(), this.c);
    final ajqy c = new ajqy((arpv) null);
    aiax d;

    /* JADX WARNING: Removed duplicated region for block: B:88:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0321  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(android.net.wifi.rtt.WifiRttManager r18, java.util.List r19, android.net.wifi.RttManager.RttListener r20, defpackage.aicn r21, java.util.concurrent.Executor r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            r2 = r22
            long r3 = android.os.SystemClock.elapsedRealtime()
            r5 = -15000(0xffffffffffffc568, double:NaN)
            long r5 = r5 + r3
            aiax r7 = r0.d
            r8 = 0
            if (r7 == 0) goto L_0x0026
            aiav r9 = r7.a
            if (r9 == 0) goto L_0x0026
            aibo r7 = r7.b
            if (r9 != r7) goto L_0x0023
            long r9 = r7.e
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 < 0) goto L_0x0023
            aibe r8 = r7.c
            goto L_0x0027
        L_0x0023:
            r0.d = r8
            goto L_0x0027
        L_0x0026:
        L_0x0027:
            long r5 = defpackage.aydu.h()
            int r6 = (int) r5
            ajqy r5 = r0.c
            r5.a()
            r5 = 2
            r7 = 0
            r9 = 1
            if (r8 == 0) goto L_0x008a
            r3 = r6 & 4
            if (r3 == 0) goto L_0x0086
            bir r3 = r0.b
            java.util.List r4 = r3.c
            int r6 = r4.size()
            r10 = 0
        L_0x0043:
            if (r10 >= r6) goto L_0x0077
            java.lang.Object r11 = r4.get(r10)
            biq r11 = (defpackage.biq) r11
            arpv r12 = r3.b
            java.lang.String r13 = r11.a()
            long r13 = defpackage.arvy.a((java.lang.String) r13)
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            arpu r12 = r12.a(r13)
            if (r12 == 0) goto L_0x0074
            int[] r13 = new int[r5]
            long r14 = r12.b
            defpackage.aema.a((long) r14, (int[]) r13)
            int r12 = r8.b
            int r14 = r8.c
            r15 = r13[r7]
            r13 = r13[r9]
            double r12 = defpackage.aell.a((int) r12, (int) r14, (int) r15, (int) r13)
            r11.c = r12
        L_0x0074:
            int r10 = r10 + 1
            goto L_0x0043
        L_0x0077:
            java.util.List r4 = r3.c
            java.util.Comparator r5 = defpackage.bip.a
            java.util.Collections.sort(r4, r5)
            int r4 = r3.a
            java.util.List r3 = r3.a(r4)
            goto L_0x02fa
        L_0x0086:
            r0 = r19
            goto L_0x02f9
        L_0x008a:
            r5 = r5 & r6
            if (r5 == 0) goto L_0x02f7
            bir r5 = r0.b
            long r10 = r5.e
            r12 = 60000(0xea60, double:2.9644E-319)
            long r10 = r10 + r12
            int r6 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r6 > 0) goto L_0x009a
            goto L_0x009f
        L_0x009a:
            java.util.List r6 = r5.c
            r6.clear()
        L_0x009f:
            r5.e = r3
            java.util.List r3 = r5.c
            java.util.Iterator r3 = r3.iterator()
        L_0x00a7:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00c1
            java.lang.Object r4 = r3.next()
            biq r4 = (defpackage.biq) r4
            int r6 = r4.b
            int r6 = r6 + -5
            r4.b = r6
            r4 = -100
            if (r6 > r4) goto L_0x00a7
            r3.remove()
            goto L_0x00a7
        L_0x00c1:
            boolean r3 = r19.isEmpty()
            if (r3 == 0) goto L_0x00cf
            int r3 = r5.a
            java.util.List r3 = r5.a(r3)
            goto L_0x02fa
        L_0x00cf:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r19.size()
            r6 = 0
        L_0x00d9:
            if (r6 < r4) goto L_0x02d1
            int r4 = r3.size()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r8 = 44
            r6.<init>(r8)
            java.lang.String r8 = "SIZE (known RTT WiFi Scan List): "
            r6.append(r8)
            r6.append(r4)
            r6.toString()
            java.util.List r4 = r5.c
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0135
            int r4 = r3.size()
            r6 = 0
        L_0x00fe:
            if (r6 >= r4) goto L_0x0156
            java.lang.Object r8 = r3.get(r6)
            android.net.wifi.ScanResult r8 = (android.net.wifi.ScanResult) r8
            java.util.List r10 = r5.c
            int r11 = r10.size()
            r12 = 0
        L_0x010d:
            if (r12 >= r11) goto L_0x0128
            java.lang.Object r13 = r10.get(r12)
            biq r13 = (defpackage.biq) r13
            int r12 = r12 + 1
            java.lang.String r14 = r13.a()
            java.lang.String r15 = r8.BSSID
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x010d
            int r8 = r8.level
            r13.b = r8
            goto L_0x0132
        L_0x0128:
            java.util.List r10 = r5.c
            biq r11 = new biq
            r11.<init>(r8)
            r10.add(r11)
        L_0x0132:
            int r6 = r6 + 1
            goto L_0x00fe
        L_0x0135:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r6 = r3.size()
            r8 = 0
        L_0x013f:
            if (r8 >= r6) goto L_0x0152
            java.lang.Object r10 = r3.get(r8)
            android.net.wifi.ScanResult r10 = (android.net.wifi.ScanResult) r10
            biq r11 = new biq
            r11.<init>(r10)
            r4.add(r11)
            int r8 = r8 + 1
            goto L_0x013f
        L_0x0152:
            r5.c = r4
            r5.d = r3
        L_0x0156:
            java.util.List r4 = r5.c
            java.util.Comparator r6 = defpackage.bio.a
            java.util.Collections.sort(r4, r6)
            java.util.List r8 = r5.c
            int r10 = r8.size()
            r4 = 0
        L_0x0164:
            java.lang.String r6 = " RSSI: "
            if (r4 < r10) goto L_0x025a
            java.util.List r3 = r5.c
            int r3 = r3.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r8 = 37
            r4.<init>(r8)
            java.lang.String r8 = "SIZE (AP Aggregate List): "
            r4.append(r8)
            r4.append(r3)
            r4.toString()
            int r3 = r5.a
            java.util.List r3 = r5.a(r3)
            int r4 = r3.size()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r10 = 42
            r8.<init>(r10)
            java.lang.String r10 = "SIZE (Ranging candidate List): "
            r8.append(r10)
            r8.append(r4)
            r8.toString()
            int r4 = r3.size()
            r8 = 0
            r10 = 0
        L_0x01a2:
            if (r8 >= r4) goto L_0x01f3
            java.lang.Object r11 = r3.get(r8)
            android.net.wifi.ScanResult r11 = (android.net.wifi.ScanResult) r11
            java.lang.String r12 = r11.BSSID
            int r13 = r11.level
            java.lang.String r14 = java.lang.String.valueOf(r12)
            int r14 = r14.length()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            int r14 = r14 + 36
            r15.<init>(r14)
            java.lang.String r14 = "SCAN SUBSET USED: "
            r15.append(r14)
            r15.append(r12)
            r15.append(r6)
            r15.append(r13)
            r15.toString()
            java.util.List r12 = r5.d
            int r13 = r12.size()
            r14 = 0
        L_0x01d5:
            int r15 = r8 + 1
            if (r14 >= r13) goto L_0x01f0
            java.lang.Object r15 = r12.get(r14)
            android.net.wifi.ScanResult r15 = (android.net.wifi.ScanResult) r15
            java.lang.String r7 = r11.BSSID
            java.lang.String r15 = r15.BSSID
            boolean r7 = r7.equals(r15)
            if (r7 != 0) goto L_0x01ea
            goto L_0x01ec
        L_0x01ea:
            int r10 = r10 + 1
        L_0x01ec:
            int r14 = r14 + 1
            r7 = 0
            goto L_0x01d5
        L_0x01f0:
            r8 = r15
            r7 = 0
            goto L_0x01a2
        L_0x01f3:
            r5.d = r3
            int[] r4 = r5.f
            r6 = r4[r10]
            int r6 = r6 + r9
            r4[r10] = r6
            int r4 = r5.g
            int r4 = r4 + r9
            r5.g = r4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r7 = 30
            r6.<init>(r7)
            java.lang.String r7 = "SAME="
            r6.append(r7)
            r6.append(r10)
            java.lang.String r7 = " N="
            r6.append(r7)
            r6.append(r4)
            r6.toString()
            r7 = 0
        L_0x021c:
            int r4 = r5.a
            if (r7 > r4) goto L_0x0258
            int[] r4 = r5.f
            r4 = r4[r7]
            int r6 = r5.g
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r9 = 68
            r8.<init>(r9)
            java.lang.String r9 = "COUNT["
            r8.append(r9)
            r8.append(r7)
            java.lang.String r9 = "]="
            r8.append(r9)
            r8.append(r4)
            java.lang.String r10 = " PERCENT ["
            r8.append(r10)
            r8.append(r7)
            r8.append(r9)
            float r4 = (float) r4
            r9 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 * r9
            float r6 = (float) r6
            float r4 = r4 / r6
            r8.append(r4)
            r8.toString()
            int r7 = r7 + 1
            goto L_0x021c
        L_0x0258:
            goto L_0x02fa
        L_0x025a:
            java.lang.Object r7 = r8.get(r4)
            biq r7 = (defpackage.biq) r7
            java.lang.String r11 = r7.a()
            int r12 = r3.size()
            r13 = 0
        L_0x0269:
            if (r13 >= r12) goto L_0x0280
            int r14 = r13 + 1
            java.lang.Object r13 = r3.get(r13)
            android.net.wifi.ScanResult r13 = (android.net.wifi.ScanResult) r13
            java.lang.String r13 = r13.BSSID
            boolean r13 = r13.equals(r11)
            if (r13 == 0) goto L_0x027e
            java.lang.String r11 = " *"
            goto L_0x0282
        L_0x027e:
            r13 = r14
            goto L_0x0269
        L_0x0280:
            java.lang.String r11 = ""
        L_0x0282:
            java.lang.String r12 = r7.a()
            android.net.wifi.ScanResult r13 = r7.a
            int r13 = r13.level
            int r14 = r7.b
            r15 = r10
            double r9 = r7.c
            java.lang.String r7 = java.lang.String.valueOf(r12)
            int r7 = r7.length()
            int r16 = r11.length()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r7 = r7 + 91
            int r7 = r7 + r16
            r0.<init>(r7)
            java.lang.String r7 = "RTT-AP in AGGREGATE: "
            r0.append(r7)
            r0.append(r12)
            r0.append(r6)
            r0.append(r13)
            java.lang.String r6 = " Weight: "
            r0.append(r6)
            r0.append(r14)
            java.lang.String r6 = " Range: "
            r0.append(r6)
            r0.append(r9)
            r0.append(r11)
            r0.toString()
            int r4 = r4 + 1
            r0 = r17
            r10 = r15
            r7 = 0
            r9 = 1
            goto L_0x0164
        L_0x02d1:
            r0 = r19
            java.lang.Object r7 = r0.get(r6)
            android.net.wifi.ScanResult r7 = (android.net.wifi.ScanResult) r7
            arpv r8 = r5.b
            java.lang.String r9 = r7.BSSID
            long r9 = defpackage.arvy.a((java.lang.String) r9)
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            arpu r8 = r8.a(r9)
            if (r8 != 0) goto L_0x02ec
            goto L_0x02ef
        L_0x02ec:
            r3.add(r7)
        L_0x02ef:
            int r6 = r6 + 1
            r0 = r17
            r7 = 0
            r9 = 1
            goto L_0x00d9
        L_0x02f7:
            r0 = r19
        L_0x02f9:
            r3 = r0
        L_0x02fa:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0321
            boolean r0 = r18.isAvailable()
            if (r0 != 0) goto L_0x0307
            goto L_0x0321
        L_0x0307:
            android.net.wifi.rtt.RangingRequest$Builder r0 = new android.net.wifi.rtt.RangingRequest$Builder
            r0.<init>()
            android.net.wifi.rtt.RangingRequest$Builder r0 = r0.addAccessPoints(r3)
            android.net.wifi.rtt.RangingRequest r0 = r0.build()
            aiyd r3 = new aiyd
            r4 = r21
            r3.<init>(r1, r4)
            r1 = r18
            r1.startRanging(r0, r2, r3)
            return
        L_0x0321:
            aiyc r0 = new aiyc
            r0.<init>(r1)
            r2.execute(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiye.a(android.net.wifi.rtt.WifiRttManager, java.util.List, android.net.wifi.RttManager$RttListener, aicn, java.util.concurrent.Executor):void");
    }

    public final void a(aiax aiax) {
        this.d = aiax;
    }

    public final void a(Context context, aibp[] aibpArr, RttManager.RttListener rttListener, aicn aicn, Executor executor) {
        WifiRttManager wifiRttManager = (WifiRttManager) context.getSystemService("wifirtt");
        if (wifiRttManager != null) {
            ArrayList arrayList = new ArrayList();
            for (aixd aixd : aibpArr) {
                if (aixd instanceof aixd) {
                    arrayList.add(aixd.k);
                } else {
                    String valueOf = String.valueOf(aixd);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
                    sb.append("startWifiRanging: non-RealWifiRttDevice is ");
                    sb.append(valueOf);
                    sb.toString();
                }
            }
            a(wifiRttManager, (List) arrayList, rttListener, aicn, executor);
        }
    }

    public final boolean a(Context context) {
        WifiRttManager wifiRttManager = (WifiRttManager) context.getSystemService("wifirtt");
        return wifiRttManager != null && wifiRttManager.isAvailable();
    }

    public final boolean a(Context context, List list, RttManager.RttListener rttListener, aicn aicn, Executor executor) {
        int i;
        WifiRttManager wifiRttManager = (WifiRttManager) context.getSystemService("wifirtt");
        if (wifiRttManager == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            aixs[] aixsArr = (aixs[]) list.get(i2);
            int length = aixsArr.length;
            int i3 = 0;
            while (true) {
                i = i2 + 1;
                if (i3 >= length) {
                    break;
                }
                ScanResult scanResult = aixsArr[i3].k;
                if (scanResult != null) {
                    arrayList.add(scanResult);
                }
                i3++;
            }
            i2 = i;
        }
        a(wifiRttManager, (List) arrayList, rttListener, aicn, executor);
        return true;
    }
}
