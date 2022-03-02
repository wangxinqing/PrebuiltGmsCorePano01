package defpackage;

import android.os.Bundle;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* renamed from: ahky  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahky implements ahki {
    private int a;
    private int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final ajqp g;
    private final ahkx h;
    private final boolean i;
    private final List j;
    private final List k;
    private int l;

    public ahky(ajqp ajqp, ahkx ahkx, boolean z) {
        int i2;
        int i3;
        if (!z) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        if (!z) {
            i3 = 5;
        } else {
            i3 = 4;
        }
        this.l = 0;
        ativ.b(true);
        ativ.b(true);
        this.g = ajqp;
        this.h = ahkx;
        this.i = z;
        this.c = i2;
        this.d = i3;
        this.e = i2;
        this.f = i3;
        this.a = i2;
        this.b = i3;
        this.j = new ArrayList(i2 - 1);
        this.k = new ArrayList(i3);
    }

    private static final ActivityRecognitionResult a(List list) {
        int i2;
        int size = list.size();
        ActivityRecognitionResult activityRecognitionResult = null;
        for (int i3 = 0; i3 < size; i3++) {
            ActivityRecognitionResult activityRecognitionResult2 = (ActivityRecognitionResult) list.get(i3);
            if (activityRecognitionResult == null || activityRecognitionResult.b < activityRecognitionResult2.b) {
                activityRecognitionResult = activityRecognitionResult2;
            }
        }
        TreeMap treeMap = new TreeMap();
        int size2 = list.size();
        int i4 = 0;
        while (i4 < size2) {
            Iterator it = ((ActivityRecognitionResult) list.get(i4)).a.iterator();
            while (true) {
                i2 = i4 + 1;
                if (!it.hasNext()) {
                    break;
                }
                DetectedActivity detectedActivity = (DetectedActivity) it.next();
                Integer num = (Integer) treeMap.get(Integer.valueOf(detectedActivity.a()));
                if (num == null) {
                    num = 0;
                }
                treeMap.put(Integer.valueOf(detectedActivity.a()), Integer.valueOf(num.intValue() + detectedActivity.e));
            }
            i4 = i2;
        }
        return new ActivityRecognitionResult(ahin.a(treeMap, (double) list.size(), true), activityRecognitionResult.b, activityRecognitionResult.c, activityRecognitionResult.d, activityRecognitionResult.c());
    }

    public final ActivityRecognitionResult a(TreeMap treeMap, long j2, long j3, long j4, Bundle bundle) {
        return ahkh.a();
    }

    public final void b() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0230  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.location.ActivityRecognitionResult a(com.google.android.gms.location.ActivityRecognitionResult r14) {
        /*
            r13 = this;
            int r0 = r13.l
            r1 = 1
            int r0 = r0 + r1
            r13.l = r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r0 = r14.a
            r3.addAll(r0)
            com.google.android.gms.location.ActivityRecognitionResult r0 = new com.google.android.gms.location.ActivityRecognitionResult
            long r4 = r14.b
            long r6 = r14.c
            int r8 = r14.d
            android.os.Bundle r9 = r14.c()
            r2 = r0
            r2.<init>((java.util.List) r3, (long) r4, (long) r6, (int) r8, (android.os.Bundle) r9)
            java.util.List r2 = r13.k
            r2.add(r0)
            boolean r2 = r13.i
            if (r2 == 0) goto L_0x004f
            r2 = 7
            int r2 = r0.a((int) r2)
            r3 = 8
            int r3 = r0.a((int) r3)
            r4 = 100
            if (r3 != r4) goto L_0x0039
            goto L_0x003c
        L_0x0039:
            if (r2 == r4) goto L_0x003c
            goto L_0x004f
        L_0x003c:
            com.google.android.gms.location.ActivityRecognitionResult r14 = new com.google.android.gms.location.ActivityRecognitionResult
            java.util.List r6 = r0.a
            long r7 = r0.b
            long r9 = r0.c
            int r11 = r0.d
            android.os.Bundle r12 = r0.c()
            r5 = r14
            r5.<init>((java.util.List) r6, (long) r7, (long) r9, (int) r11, (android.os.Bundle) r12)
            return r14
        L_0x004f:
            boolean r2 = r13.i
            if (r2 == 0) goto L_0x005a
            ahkx r2 = r13.h
            ahix r2 = (defpackage.ahix) r2
            com.google.android.gms.location.ActivityRecognitionResult r2 = r2.v
            goto L_0x0060
        L_0x005a:
            ahkx r2 = r13.h
            ahix r2 = (defpackage.ahix) r2
            com.google.android.gms.location.ActivityRecognitionResult r2 = r2.u
        L_0x0060:
            ahkx r3 = r13.h
            ahix r3 = (defpackage.ahix) r3
            com.google.android.gms.location.ActivityRecognitionResult r3 = r3.u
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 44
            r5.<init>(r4)
            java.lang.String r4 = "isFirstResultSameAsPreviousReport: previous="
            r5.append(r4)
            r5.append(r3)
            r5.toString()
            if (r2 == 0) goto L_0x00eb
            java.util.List r3 = r13.j
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x00eb
            com.google.android.gms.location.DetectedActivity r3 = r0.b()
            int r3 = r3.a()
            com.google.android.gms.location.DetectedActivity r2 = r2.b()
            int r2 = r2.a()
            if (r3 != r2) goto L_0x00eb
            com.google.android.gms.location.DetectedActivity r2 = r0.a()
            int r2 = r2.a()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r2.intValue()
            if (r3 == 0) goto L_0x00c6
            int r3 = r2.intValue()
            if (r3 == r1) goto L_0x00c6
            int r3 = r2.intValue()
            r4 = 2
            if (r3 == r4) goto L_0x00c6
            int r2 = r2.intValue()
            r3 = 3
            if (r2 != r3) goto L_0x00eb
        L_0x00c6:
            java.util.List r14 = r13.k
            com.google.android.gms.location.ActivityRecognitionResult r14 = a((java.util.List) r14)
            java.lang.String r0 = java.lang.String.valueOf(r14)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 25
            r2.<init>(r1)
            java.lang.String r1 = "Same as last. Reporting: "
            r2.append(r1)
            r2.append(r0)
            r2.toString()
            return r14
        L_0x00eb:
            com.google.android.gms.location.DetectedActivity r2 = r0.a()
            int r2 = r2.a()
            r3 = 5
            if (r2 == r3) goto L_0x02c6
            ahkx r2 = r13.h
            boolean r3 = defpackage.axwx.h()
            if (r3 == 0) goto L_0x0144
            com.google.android.gms.location.DetectedActivity r3 = r0.a()
            int r3 = r3.a()
            if (r3 != 0) goto L_0x0144
            ahix r2 = (defpackage.ahix) r2
            ahmc r2 = r2.F
            boolean r2 = r2.b()
            if (r2 != 0) goto L_0x0113
            goto L_0x0144
        L_0x0113:
            com.google.android.gms.location.ActivityRecognitionResult r14 = new com.google.android.gms.location.ActivityRecognitionResult
            java.util.List r4 = r0.a
            long r5 = r0.b
            long r7 = r0.c
            int r9 = r0.d
            android.os.Bundle r10 = r0.c()
            r3 = r14
            r3.<init>((java.util.List) r4, (long) r5, (long) r7, (int) r9, (android.os.Bundle) r10)
            java.lang.String r0 = java.lang.String.valueOf(r14)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 68
            r2.<init>(r1)
            java.lang.String r1 = "Detecting as in vehicle and Bluetooth classifier agrees. Reporting: "
            r2.append(r1)
            r2.append(r0)
            r2.toString()
            return r14
        L_0x0144:
            java.util.List r2 = r13.j
            int r2 = r2.size()
            int r2 = r2 + -1
        L_0x014c:
            if (r2 < 0) goto L_0x0174
            java.util.List r3 = r13.j
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.location.ActivityRecognitionResult r3 = (com.google.android.gms.location.ActivityRecognitionResult) r3
            com.google.android.gms.location.DetectedActivity r4 = r0.b()
            int r4 = r4.a()
            com.google.android.gms.location.DetectedActivity r3 = r3.b()
            int r3 = r3.a()
            if (r4 == r3) goto L_0x0171
            java.util.List r3 = r13.j
            int r3 = r3.size()
            int r2 = r2 + r1
            int r3 = r3 - r2
            goto L_0x017a
        L_0x0171:
            int r2 = r2 + -1
            goto L_0x014c
        L_0x0174:
            java.util.List r2 = r13.j
            int r3 = r2.size()
        L_0x017a:
            int r3 = r3 + r1
            int r2 = r13.a
            int r4 = r13.l
            int r5 = r2 - r3
            int r4 = r4 + r5
            int r5 = r13.b
            r6 = 0
            if (r4 <= r5) goto L_0x0189
            r4 = 1
            goto L_0x018a
        L_0x0189:
            r4 = 0
        L_0x018a:
            r5 = 4
            r7 = 0
            if (r3 < r2) goto L_0x018f
            goto L_0x0193
        L_0x018f:
            if (r4 != 0) goto L_0x0193
        L_0x0191:
            r2 = r7
            goto L_0x01de
        L_0x0193:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r8 = 72
            r2.<init>(r8)
            java.lang.String r8 = "Will reporting activity: consistent="
            r2.append(r8)
            r2.append(r3)
            java.lang.String r8 = " maxAttemptsReached="
            r2.append(r8)
            r2.append(r4)
            r2.toString()
            java.util.List r2 = r13.k
            com.google.android.gms.location.ActivityRecognitionResult r2 = a((java.util.List) r2)
            com.google.android.gms.location.DetectedActivity r4 = r2.b()
            int r4 = r4.a()
            int r8 = r13.e
            int r9 = r13.l
            int r10 = r13.f
            int r11 = r8 - r3
            int r9 = r9 + r11
            if (r9 <= r10) goto L_0x01c7
            goto L_0x01de
        L_0x01c7:
            if (r3 >= r8) goto L_0x01de
            if (r4 != r1) goto L_0x01cc
        L_0x01cb:
            goto L_0x01d9
        L_0x01cc:
            if (r4 == 0) goto L_0x01cb
            r3 = 16
            if (r4 == r3) goto L_0x01cb
            r3 = 17
            if (r4 == r3) goto L_0x01cb
            if (r4 != r5) goto L_0x01de
            goto L_0x01cb
        L_0x01d9:
            r13.a = r8
            r13.b = r10
            goto L_0x0191
        L_0x01de:
            if (r2 == 0) goto L_0x0230
            ajqp r14 = r13.g
            com.google.android.gms.location.ActivityRecognitionResult r14 = r14.c(r2)
            ajqp r0 = r13.g
            boolean r2 = defpackage.axwx.n()
            if (r2 != 0) goto L_0x01ef
            goto L_0x0207
        L_0x01ef:
            ahix r0 = (defpackage.ahix) r0
            boolean r0 = r0.at
            if (r0 == 0) goto L_0x0207
            com.google.android.gms.location.DetectedActivity r0 = r14.a()
            int r0 = r0.a()
            if (r0 != r1) goto L_0x0207
            ahnk r0 = defpackage.ahnk.PHONE_RELABEL_BICYCLE_TO_UNKNOWN_WITH_WIFI
            int r0 = r0.am
            com.google.android.gms.location.ActivityRecognitionResult r14 = defpackage.ahix.a((com.google.android.gms.location.ActivityRecognitionResult) r14, (int) r0)
        L_0x0207:
            int r0 = r13.l
            java.lang.String r1 = java.lang.String.valueOf(r14)
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 53
            r3.<init>(r2)
            java.lang.String r2 = "Reporting activity: attempts="
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = " finalResult="
            r3.append(r0)
            r3.append(r1)
            r3.toString()
            return r14
        L_0x0230:
            java.util.List r1 = r13.j
            int r1 = r1.size()
            int r2 = r13.a
            int r2 = r2 + -1
            java.lang.String r3 = " "
            if (r1 >= r2) goto L_0x0272
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.util.List r2 = r13.j
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r4 = r4.length()
            java.lang.String r8 = java.lang.String.valueOf(r2)
            int r8 = r8.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r4 = r4 + 31
            int r4 = r4 + r8
            r9.<init>(r4)
            java.lang.String r4 = "Not enough history to decide: "
            r9.append(r4)
            r9.append(r1)
            r9.append(r3)
            r9.append(r2)
            r9.toString()
            goto L_0x02a5
        L_0x0272:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.util.List r2 = r13.j
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r4 = r4.length()
            java.lang.String r8 = java.lang.String.valueOf(r2)
            int r8 = r8.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r4 = r4 + 15
            int r4 = r4 + r8
            r9.<init>(r4)
            java.lang.String r4 = "Inconsistent: "
            r9.append(r4)
            r9.append(r1)
            r9.append(r3)
            r9.append(r2)
            r9.toString()
        L_0x02a5:
            com.google.android.gms.location.DetectedActivity r0 = r0.a()
            int r0 = r0.a()
            if (r0 != r5) goto L_0x02b0
            goto L_0x02b5
        L_0x02b0:
            java.util.List r0 = r13.j
            r0.add(r14)
        L_0x02b5:
            java.util.List r14 = r13.j
            int r14 = r14.size()
            int r0 = r13.a
            if (r14 < r0) goto L_0x02c5
            java.util.List r14 = r13.j
            r14.remove(r6)
            goto L_0x02b5
        L_0x02c5:
            return r7
        L_0x02c6:
            java.lang.RuntimeException r14 = new java.lang.RuntimeException
            java.lang.String r0 = "TILTING is unexpected."
            r14.<init>(r0)
            goto L_0x02cf
        L_0x02ce:
            throw r14
        L_0x02cf:
            goto L_0x02ce
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahky.a(com.google.android.gms.location.ActivityRecognitionResult):com.google.android.gms.location.ActivityRecognitionResult");
    }

    public final void a() {
        this.j.clear();
        this.k.clear();
        this.l = 0;
        this.a = this.c;
        this.b = this.d;
    }
}
