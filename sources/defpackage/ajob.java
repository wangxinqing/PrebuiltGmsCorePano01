package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.ulr.ApiActivity;
import com.google.android.ulr.ApiActivityExtraRow;
import com.google.android.ulr.ApiActivityReading;
import com.google.android.ulr.ApiExperiment;
import com.google.android.ulr.ApiExperimentTokens;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: ajob  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajob {
    public static ArrayList a = null;
    public static ajit b = null;
    public static ajit c = null;
    public static ajit d = null;
    private static Map e = null;
    private static ajno f = null;

    public static String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "unknown" : "type5" : "type3" : "type1";
    }

    public static ApiExperimentTokens b(Context context) {
        ajit ajit = b;
        if (ajit != null) {
            return ajit.a(context);
        }
        return null;
    }

    public static ApiExperimentTokens c(Context context) {
        ajit ajit = c;
        if (ajit != null) {
            return ajit.a(context);
        }
        return null;
    }

    public static ApiExperimentTokens d(Context context) {
        ajit ajit = d;
        if (ajit != null) {
            return ajit.a(context);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01ee A[Catch:{ RuntimeException -> 0x021b }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01af A[Catch:{ RuntimeException -> 0x021b }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01b8 A[Catch:{ RuntimeException -> 0x021b }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01be A[Catch:{ RuntimeException -> 0x021b }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01e4 A[Catch:{ RuntimeException -> 0x021b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList a(java.util.List r34) {
        /*
            int r0 = r34.size()
            if (r0 <= 0) goto L_0x030a
            java.util.ArrayList r2 = new java.util.ArrayList
            int r0 = r34.size()
            r2.<init>(r0)
            int r3 = r34.size()
            r5 = 0
        L_0x0014:
            if (r5 >= r3) goto L_0x0308
            r6 = r34
            java.lang.Object r0 = r6.get(r5)
            r7 = r0
            ajjx r7 = (defpackage.ajjx) r7
            int r0 = r7.a
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0032
            double r8 = r7.g
            long r8 = java.lang.Math.round(r8)
            int r0 = (int) r8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9 = r0
            goto L_0x0033
        L_0x0032:
            r9 = 0
        L_0x0033:
            int r0 = r7.a
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0041
            boolean r0 = r7.k
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r10 = r0
            goto L_0x0042
        L_0x0041:
            r10 = 0
        L_0x0042:
            int r0 = r7.a
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0051
            float r0 = r7.f
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11 = r0
            goto L_0x0052
        L_0x0051:
            r11 = 0
        L_0x0052:
            int r0 = r7.a
            r0 = r0 & 64
            if (r0 == 0) goto L_0x0061
            float r0 = r7.h
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12 = r0
            goto L_0x0062
        L_0x0061:
            r12 = 0
        L_0x0062:
            int r0 = r7.a
            r8 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r8
            if (r0 == 0) goto L_0x0076
            float r0 = r7.t
            int r0 = java.lang.Math.round(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r18 = r0
            goto L_0x0078
        L_0x0076:
            r18 = 0
        L_0x0078:
            int r0 = r7.a
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0086
            int r0 = r7.m
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r13 = r0
            goto L_0x0087
        L_0x0086:
            r13 = 0
        L_0x0087:
            int r0 = r7.a
            r8 = r0 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x0091
            java.lang.String r8 = r7.l
            r14 = r8
            goto L_0x0092
        L_0x0091:
            r14 = 0
        L_0x0092:
            r0 = r0 & 1
            java.lang.String r15 = "GCoreUlr"
            if (r0 != 0) goto L_0x00d2
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r19 = r5
            long r4 = r7.d
            int r8 = r7.c
            ajjw r8 = defpackage.ajjw.a(r8)
            if (r8 == 0) goto L_0x00a7
            goto L_0x00a9
        L_0x00a7:
            ajjw r8 = defpackage.ajjw.WIFI
        L_0x00a9:
            int r8 = r8.f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r20 = r3
            r3 = 77
            r1.<init>(r3)
            java.lang.String r3 = "Location missing position; timestamp="
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = "; source="
            r1.append(r3)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            defpackage.ajix.b((java.lang.String) r15, (java.lang.Throwable) r0)
            r1 = 0
            r16 = 0
            goto L_0x00eb
        L_0x00d2:
            r20 = r3
            r19 = r5
            ajka r0 = r7.b
            if (r0 == 0) goto L_0x00db
            goto L_0x00dd
        L_0x00db:
            ajka r0 = defpackage.ajka.d
        L_0x00dd:
            int r1 = r0.b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r0 = r0.c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r16 = r0
        L_0x00eb:
            int r0 = r7.a
            r0 = r0 & 8
            if (r0 == 0) goto L_0x00fb
            float r0 = r7.e
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r17 = r0
            goto L_0x00fd
        L_0x00fb:
            r17 = 0
        L_0x00fd:
            com.google.android.ulr.ApiLocation r25 = new com.google.android.ulr.ApiLocation
            r8 = r25
            r3 = r15
            r15 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            int r0 = r7.a
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0123
            int r0 = r7.c
            ajjw r0 = defpackage.ajjw.a(r0)
            if (r0 == 0) goto L_0x0115
            goto L_0x0117
        L_0x0115:
            ajjw r0 = defpackage.ajjw.WIFI
        L_0x0117:
            java.lang.String r0 = r0.name()
            java.util.Locale r4 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toLowerCase(r4)
            r4 = r0
            goto L_0x0124
        L_0x0123:
            r4 = 0
        L_0x0124:
            java.util.ArrayList r23 = a
            aucx r0 = r7.n
            int r0 = r0.size()
            r5 = 3
            r8 = 1
            if (r0 <= 0) goto L_0x0223
            aucx r0 = r7.n
            if (r0 == 0) goto L_0x0223
            boolean r9 = r0.isEmpty()     // Catch:{ RuntimeException -> 0x021b }
            if (r9 != 0) goto L_0x0223
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ RuntimeException -> 0x021b }
            int r10 = r0.size()     // Catch:{ RuntimeException -> 0x021b }
            r9.<init>(r10)     // Catch:{ RuntimeException -> 0x021b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ RuntimeException -> 0x021b }
        L_0x0147:
            boolean r10 = r0.hasNext()     // Catch:{ RuntimeException -> 0x021b }
            if (r10 == 0) goto L_0x021a
            java.lang.Object r10 = r0.next()     // Catch:{ RuntimeException -> 0x021b }
            ajkf r10 = (defpackage.ajkf) r10     // Catch:{ RuntimeException -> 0x021b }
            int r11 = r10.a     // Catch:{ RuntimeException -> 0x021b }
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0147
            r12 = r11 & 2
            if (r12 == 0) goto L_0x0147
            r11 = r11 & 4
            java.lang.String r12 = "unknown"
            if (r11 == 0) goto L_0x01a6
            int r11 = r10.d     // Catch:{ RuntimeException -> 0x021b }
            int r11 = defpackage.ajke.a(r11)     // Catch:{ RuntimeException -> 0x021b }
            if (r11 == 0) goto L_0x016c
            goto L_0x016d
        L_0x016c:
            r11 = 1
        L_0x016d:
            int r11 = r11 + -1
            if (r11 == 0) goto L_0x0187
            if (r11 == r8) goto L_0x0182
            if (r11 == r1) goto L_0x017f
            if (r11 == r5) goto L_0x017c
            java.lang.String r12 = "securedOther"
            r33 = r12
            goto L_0x01a9
        L_0x017c:
            java.lang.String r12 = "wpaEap"
            goto L_0x0184
        L_0x017f:
            java.lang.String r12 = "wpaPsk"
            goto L_0x0184
        L_0x0182:
            java.lang.String r12 = "none"
        L_0x0184:
            r33 = r12
            goto L_0x01a9
        L_0x0187:
            int r11 = r10.d     // Catch:{ RuntimeException -> 0x021b }
            int r11 = defpackage.ajke.a(r11)     // Catch:{ RuntimeException -> 0x021b }
            if (r11 == 0) goto L_0x0190
            goto L_0x0191
        L_0x0190:
            r11 = 1
        L_0x0191:
            int r11 = r11 + -1
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x021b }
            r14 = 35
            r13.<init>(r14)     // Catch:{ RuntimeException -> 0x021b }
            java.lang.String r14 = "Unknown wifi auth type: "
            r13.append(r14)     // Catch:{ RuntimeException -> 0x021b }
            r13.append(r11)     // Catch:{ RuntimeException -> 0x021b }
            r13.toString()     // Catch:{ RuntimeException -> 0x021b }
            goto L_0x01a7
        L_0x01a6:
        L_0x01a7:
            r33 = r12
        L_0x01a9:
            int r11 = r10.a     // Catch:{ RuntimeException -> 0x021b }
            r11 = r11 & 8
            if (r11 == 0) goto L_0x01b8
            boolean r11 = r10.e     // Catch:{ RuntimeException -> 0x021b }
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch:{ RuntimeException -> 0x021b }
            r28 = r11
            goto L_0x01ba
        L_0x01b8:
            r28 = 0
        L_0x01ba:
            int r11 = r10.g     // Catch:{ RuntimeException -> 0x021b }
            if (r11 == 0) goto L_0x01e4
            com.google.android.ulr.RttRangingProto r18 = new com.google.android.ulr.RttRangingProto     // Catch:{ RuntimeException -> 0x021b }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)     // Catch:{ RuntimeException -> 0x021b }
            int r11 = r10.k     // Catch:{ RuntimeException -> 0x021b }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r11)     // Catch:{ RuntimeException -> 0x021b }
            int r11 = r10.j     // Catch:{ RuntimeException -> 0x021b }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r11)     // Catch:{ RuntimeException -> 0x021b }
            int r11 = r10.i     // Catch:{ RuntimeException -> 0x021b }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r11)     // Catch:{ RuntimeException -> 0x021b }
            int r11 = r10.h     // Catch:{ RuntimeException -> 0x021b }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r11)     // Catch:{ RuntimeException -> 0x021b }
            r12 = r18
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ RuntimeException -> 0x021b }
            r30 = r18
            goto L_0x01e6
        L_0x01e4:
            r30 = 0
        L_0x01e6:
            java.lang.String r11 = r10.l     // Catch:{ RuntimeException -> 0x021b }
            boolean r12 = defpackage.azss.d()     // Catch:{ RuntimeException -> 0x021b }
            if (r12 == 0) goto L_0x01fa
            int r11 = r10.a     // Catch:{ RuntimeException -> 0x021b }
            r11 = r11 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x01f7
            java.lang.String r11 = r10.l     // Catch:{ RuntimeException -> 0x021b }
            goto L_0x01fa
        L_0x01f7:
            r31 = 0
            goto L_0x01fc
        L_0x01fa:
            r31 = r11
        L_0x01fc:
            com.google.android.ulr.WifiStrengthProto r11 = new com.google.android.ulr.WifiStrengthProto     // Catch:{ RuntimeException -> 0x021b }
            int r12 = r10.f     // Catch:{ RuntimeException -> 0x021b }
            java.lang.Integer r27 = java.lang.Integer.valueOf(r12)     // Catch:{ RuntimeException -> 0x021b }
            long r12 = r10.b     // Catch:{ RuntimeException -> 0x021b }
            java.lang.Long r29 = java.lang.Long.valueOf(r12)     // Catch:{ RuntimeException -> 0x021b }
            int r10 = r10.c     // Catch:{ RuntimeException -> 0x021b }
            java.lang.Integer r32 = java.lang.Integer.valueOf(r10)     // Catch:{ RuntimeException -> 0x021b }
            r26 = r11
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)     // Catch:{ RuntimeException -> 0x021b }
            r9.add(r11)     // Catch:{ RuntimeException -> 0x021b }
            goto L_0x0147
        L_0x021a:
            goto L_0x0224
        L_0x021b:
            r0 = move-exception
            java.lang.String r9 = "Best-effort Wifi scan conversion failed"
            defpackage.ajix.b((java.lang.String) r3, (java.lang.String) r9, (java.lang.Throwable) r0)
            r9 = 0
            goto L_0x0224
        L_0x0223:
            r9 = 0
        L_0x0224:
            com.google.android.ulr.ApiReadingInfo r0 = new com.google.android.ulr.ApiReadingInfo
            int r10 = r7.a
            r10 = r10 & 512(0x200, float:7.175E-43)
            if (r10 == 0) goto L_0x0233
            boolean r10 = r7.j
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            goto L_0x0234
        L_0x0233:
            r10 = 0
        L_0x0234:
            int r11 = r7.a
            r11 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L_0x027f
            ajjp r11 = r7.o
            if (r11 == 0) goto L_0x023f
            goto L_0x0241
        L_0x023f:
            ajjp r11 = defpackage.ajjp.f
        L_0x0241:
            int r12 = r11.a
            r12 = r12 & r8
            if (r12 == 0) goto L_0x0266
            int r12 = r11.b
            int r12 = defpackage.ajjo.a(r12)
            if (r12 == 0) goto L_0x024f
            goto L_0x0250
        L_0x024f:
            r12 = 1
        L_0x0250:
            int r12 = r12 + -1
            if (r12 == 0) goto L_0x0263
            if (r12 == r8) goto L_0x0260
            if (r12 == r1) goto L_0x025d
            if (r12 == r5) goto L_0x0266
            java.lang.String r1 = "wireless"
            goto L_0x0267
        L_0x025d:
            java.lang.String r1 = "usb"
            goto L_0x0267
        L_0x0260:
            java.lang.String r1 = "ac"
            goto L_0x0267
        L_0x0263:
            java.lang.String r1 = "notCharging"
            goto L_0x0267
        L_0x0266:
            r1 = 0
        L_0x0267:
            com.google.android.ulr.ApiBatteryCondition r5 = new com.google.android.ulr.ApiBatteryCondition
            int r12 = r11.c
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            int r13 = r11.d
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            int r11 = r11.e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r5.<init>(r1, r12, r13, r11)
            goto L_0x0280
        L_0x027f:
            r5 = 0
        L_0x0280:
            r0.<init>(r10, r5, r4, r9)
            int r1 = r7.a
            r4 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r4
            if (r1 == 0) goto L_0x0293
            long r4 = r7.r
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r22 = r1
            goto L_0x0295
        L_0x0293:
            r22 = 0
        L_0x0295:
            int r1 = r7.a
            r4 = 131072(0x20000, float:1.83671E-40)
            r4 = r4 & r1
            if (r4 == 0) goto L_0x02a1
            boolean r4 = r7.s
            if (r4 == 0) goto L_0x02a1
            goto L_0x02a2
        L_0x02a1:
            r8 = 0
        L_0x02a2:
            r1 = r1 & 4
            if (r1 == 0) goto L_0x02af
            long r4 = r7.d
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r29 = r1
            goto L_0x02b1
        L_0x02af:
            r29 = 0
        L_0x02b1:
            if (r29 != 0) goto L_0x02db
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            int r4 = r7.c
            ajjw r4 = defpackage.ajjw.a(r4)
            if (r4 == 0) goto L_0x02be
            goto L_0x02c0
        L_0x02be:
            ajjw r4 = defpackage.ajjw.WIFI
        L_0x02c0:
            int r4 = r4.f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r9 = 46
            r5.<init>(r9)
            java.lang.String r9 = "Location missing timestamp; source="
            r5.append(r9)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r1.<init>(r4)
            defpackage.ajix.b((java.lang.String) r3, (java.lang.Throwable) r1)
        L_0x02db:
            com.google.android.ulr.ApiLocationReading r1 = new com.google.android.ulr.ApiLocationReading
            boolean r3 = defpackage.azsa.b()
            if (r3 != 0) goto L_0x02ea
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)
            r24 = r3
            goto L_0x02ec
        L_0x02ea:
            r24 = 0
        L_0x02ec:
            int r3 = r7.p
            java.lang.Integer r27 = java.lang.Integer.valueOf(r3)
            int r3 = r7.q
            java.lang.Integer r28 = java.lang.Integer.valueOf(r3)
            r21 = r1
            r26 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29)
            r2.add(r1)
            int r5 = r19 + 1
            r3 = r20
            goto L_0x0014
        L_0x0308:
            r1 = r2
            goto L_0x030b
        L_0x030a:
            r1 = 0
        L_0x030b:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 11
            r3.<init>(r2)
            java.lang.String r2 = "Locations: "
            r3.append(r2)
            r3.append(r0)
            r3.toString()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajob.a(java.util.List):java.util.ArrayList");
    }

    public static ArrayList b(List list) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        Long l;
        Integer num;
        Float f2;
        Double d2;
        Boolean bool;
        String str2;
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList3 = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) list.get(i);
            List<DetectedActivity> list2 = activityRecognitionResult.a;
            Bundle c2 = activityRecognitionResult.c();
            if (list2.size() > 0 || (c2 != null && c2.size() > 0)) {
                if (list2.size() > 0) {
                    arrayList = new ArrayList(list2.size());
                    for (DetectedActivity detectedActivity : list2) {
                        int a2 = detectedActivity.a();
                        switch (a2) {
                            case 0:
                                str2 = "inVehicle";
                                break;
                            case 1:
                                str2 = "onBicycle";
                                break;
                            case 2:
                                str2 = "onFoot";
                                break;
                            case 3:
                                str2 = "still";
                                break;
                            case 4:
                                str2 = "unknown";
                                break;
                            case 5:
                                str2 = "tilting";
                                break;
                            case 6:
                                str2 = "exitingVehicle";
                                break;
                            case 7:
                                str2 = "walking";
                                break;
                            case 8:
                                str2 = "running";
                                break;
                            default:
                                switch (a2) {
                                    case 16:
                                        str2 = "inRoadVehicle";
                                        break;
                                    case 17:
                                        str2 = "inRailVehicle";
                                        break;
                                    case 18:
                                        str2 = "inTwoWheelerVehicle";
                                        break;
                                    case 19:
                                        str2 = "inFourWheelerVehicle";
                                        break;
                                    case 20:
                                        str2 = "inCar";
                                        break;
                                    case 21:
                                        str2 = "inBus";
                                        break;
                                    default:
                                        str2 = "_unsupported";
                                        break;
                                }
                        }
                        if (!str2.equals("_unsupported")) {
                            arrayList.add(new ApiActivity(Integer.valueOf(detectedActivity.e), str2));
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (c2 == null || c2.size() == 0) {
                    arrayList2 = null;
                } else {
                    arrayList2 = new ArrayList(c2.size());
                    for (String str3 : c2.keySet()) {
                        Object obj = c2.get(str3);
                        if (obj != null) {
                            if (obj instanceof Integer) {
                                bool = null;
                                d2 = null;
                                f2 = null;
                                l = null;
                                str = null;
                                num = (Integer) obj;
                            } else if (obj instanceof Boolean) {
                                d2 = null;
                                f2 = null;
                                num = null;
                                l = null;
                                str = null;
                                bool = (Boolean) obj;
                            } else if (obj instanceof Double) {
                                bool = null;
                                f2 = null;
                                num = null;
                                l = null;
                                str = null;
                                d2 = (Double) obj;
                            } else if (obj instanceof Float) {
                                bool = null;
                                d2 = null;
                                num = null;
                                l = null;
                                str = null;
                                f2 = (Float) obj;
                            } else if (obj instanceof Long) {
                                bool = null;
                                d2 = null;
                                f2 = null;
                                num = null;
                                str = null;
                                l = (Long) obj;
                            } else if (obj instanceof String) {
                                bool = null;
                                d2 = null;
                                f2 = null;
                                num = null;
                                l = null;
                                str = (String) obj;
                            } else {
                                ajix.c("GCoreUlr", 27, String.format(Locale.ENGLISH, "ActivityRecognitionResult extras bundle contains object (%s) with unsupported type.", new Object[]{obj.toString()}));
                            }
                            ApiActivityExtraRow apiActivityExtraRow = r13;
                            ApiActivityExtraRow apiActivityExtraRow2 = new ApiActivityExtraRow(bool, d2, f2, num, l, str3, str, "value");
                            arrayList2.add(apiActivityExtraRow);
                        }
                    }
                }
                arrayList3.add(new ApiActivityReading(arrayList, arrayList2, Long.valueOf(activityRecognitionResult.b)));
            }
        }
        return arrayList3;
    }

    public static synchronized void a() {
        ApiExperiment apiExperiment;
        Integer num;
        synchronized (ajob.class) {
            if (f != null) {
                Map a2 = aeeg.a(f.a, "user_location_reporting:experiment:");
                if (a2.isEmpty()) {
                    a = null;
                    e = a2;
                    return;
                }
                if (e != null) {
                    if (e.keySet().equals(a2.keySet())) {
                        return;
                    }
                }
                e = a2;
                HashMap hashMap = new HashMap();
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (String str : a2.keySet()) {
                    String[] split = str.split(":");
                    int length = split.length;
                    if (length < 4) {
                        String valueOf = String.valueOf(str);
                        ajix.c("GCoreUlr", valueOf.length() == 0 ? new String("Incomplete experiment specification: ") : "Incomplete experiment specification: ".concat(valueOf));
                        apiExperiment = null;
                    } else {
                        try {
                            int parseInt = Integer.parseInt(split[2]);
                            String str2 = split[3];
                            if ("experiment".equals(str2) || "control".equals(str2)) {
                                if (length > 4) {
                                    try {
                                        num = Integer.valueOf(split[4]);
                                    } catch (NumberFormatException e2) {
                                        String str3 = split[4];
                                        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 32 + String.valueOf(str).length());
                                        sb.append("Bad subgroup ");
                                        sb.append(str3);
                                        sb.append(" in specification: ");
                                        sb.append(str);
                                        ajix.c("GCoreUlr", sb.toString());
                                        apiExperiment = null;
                                    }
                                } else {
                                    num = null;
                                }
                                apiExperiment = new ApiExperiment(str2, Integer.valueOf(parseInt), num);
                            } else {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 29 + String.valueOf(str).length());
                                sb2.append("Bad group ");
                                sb2.append(str2);
                                sb2.append(" in specification: ");
                                sb2.append(str);
                                ajix.c("GCoreUlr", sb2.toString());
                                apiExperiment = null;
                            }
                        } catch (NumberFormatException e3) {
                            String str4 = split[2];
                            StringBuilder sb3 = new StringBuilder(String.valueOf(str4).length() + 37 + String.valueOf(str).length());
                            sb3.append("Bad experiment ID ");
                            sb3.append(str4);
                            sb3.append(" in specification: ");
                            sb3.append(str);
                            ajix.c("GCoreUlr", sb3.toString());
                            apiExperiment = null;
                        }
                    }
                    if (apiExperiment != null) {
                        Integer c2 = apiExperiment.c();
                        if ("control".equalsIgnoreCase(apiExperiment.b())) {
                            hashMap.put(c2, apiExperiment);
                        } else {
                            hashSet.add(c2);
                            arrayList.add(apiExperiment);
                        }
                    }
                }
                int size = hashMap.size();
                hashMap.keySet().removeAll(hashSet);
                if (size != hashMap.size()) {
                    ajix.b("GCoreUlr", 6, "experiment and control groups overlap");
                }
                arrayList.addAll(hashMap.values());
                a = arrayList;
            }
        }
    }

    static synchronized void a(ajno ajno) {
        synchronized (ajob.class) {
            f = ajno;
            if (e == null) {
                a();
            }
        }
    }

    public static synchronized void a(Context context) {
        synchronized (ajob.class) {
            a(new ajno(context.getContentResolver()));
            if (b == null) {
                b = new ajit("com.google.android.gms.ulr");
            }
            if (c == null) {
                c = new ajit("com.google.android.location");
            }
            if (d == null) {
                d = new ajit("com.google.android.gms.beacon");
            }
        }
    }
}
