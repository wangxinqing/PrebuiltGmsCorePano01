package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import java.lang.reflect.Array;
import java.util.Map;

/* renamed from: ahir  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ahir extends ahvl {
    final /* synthetic */ ahis a;

    protected ahir(ahis ahis) {
        this.a = ahis;
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r19v1 */
    /* JADX WARNING: type inference failed for: r19v2 */
    /* JADX WARNING: type inference failed for: r19v9 */
    /* JADX WARNING: type inference failed for: r19v10 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ahip a(long r29, long r31, defpackage.ahyq r33) {
        /*
            r28 = this;
            r0 = r28
            r7 = r29
            r9 = r31
            r11 = r33
            ahis r1 = r0.a
            ahil r1 = r1.d
            r2 = r29
            r4 = r31
            r6 = r33
            aibm r1 = r1.a((long) r2, (long) r4, (defpackage.ahyq) r6)
            java.lang.Object r2 = r1.a
            java.lang.Object r3 = r1.b
            java.lang.Object r1 = r1.c
            r4 = r2
            ahip r4 = (defpackage.ahip) r4
            int r5 = r4.a
            if (r5 != 0) goto L_0x017d
            long r12 = r4.a()
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r5 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r5 != 0) goto L_0x0174
            int r5 = r11.b
            int r5 = r5 + -1
            long r12 = r11.a((int) r5)
            r14 = -3200000000(0xffffffff4143e000, double:NaN)
            long r12 = r12 + r14
            r5 = 3
            double[] r5 = new double[r5]
            int r14 = r11.b
            int r14 = r14 + -1
            r15 = 0
        L_0x0046:
            int r6 = r11.b
            r16 = r4
            if (r14 < r6) goto L_0x004f
            r18 = r5
            goto L_0x0098
        L_0x004f:
            if (r14 < 0) goto L_0x0096
            long r18 = r11.a((int) r14)
            int r6 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r6 < 0) goto L_0x0093
            r6 = 0
            r18 = r5[r6]
            float r4 = r11.a(r14, r6)
            double r6 = (double) r4
            java.lang.Double.isNaN(r6)
            double r18 = r18 + r6
            r4 = 0
            r5[r4] = r18
            r4 = 1
            r6 = r5[r4]
            float r8 = r11.a(r14, r4)
            r18 = r5
            double r4 = (double) r8
            java.lang.Double.isNaN(r4)
            double r6 = r6 + r4
            r4 = 1
            r18[r4] = r6
            r4 = 2
            r5 = r18[r4]
            float r7 = r11.a(r14, r4)
            double r7 = (double) r7
            java.lang.Double.isNaN(r7)
            double r5 = r5 + r7
            r18[r4] = r5
            int r15 = r15 + 1
            int r14 = r14 + -1
            r7 = r29
            r4 = r16
            r5 = r18
            goto L_0x0046
        L_0x0093:
            r18 = r5
            goto L_0x0098
        L_0x0096:
            r18 = r5
        L_0x0098:
            double r4 = (double) r15
            r6 = 0
            r7 = r18[r6]
            java.lang.Double.isNaN(r4)
            double r7 = r7 / r4
            r18[r6] = r7
            r6 = 1
            r7 = r18[r6]
            java.lang.Double.isNaN(r4)
            double r7 = r7 / r4
            r18[r6] = r7
            r6 = 2
            r7 = r18[r6]
            java.lang.Double.isNaN(r4)
            double r7 = r7 / r4
            r18[r6] = r7
            ahis r4 = r0.a
            ahli r5 = r4.m
            double r6 = r4.n
            long r11 = r5.c
            int r8 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r8 <= 0) goto L_0x0156
            double[] r8 = r5.a
            if (r8 == 0) goto L_0x0143
            ajra r11 = new ajra
            r12 = r18
            r11.<init>(r12)
            ajra r13 = new ajra
            r13.<init>(r8)
            double r14 = r13.a
            r8 = r5
            double r4 = r13.b
            r17 = r2
            r18 = r3
            double r2 = r13.c
            r19 = r1
            double r0 = r11.a
            double r0 = r0 * r14
            double r14 = r11.b
            double r14 = r14 * r4
            double r0 = r0 + r14
            double r4 = r11.c
            double r4 = r4 * r2
            double r0 = r0 + r4
            double r2 = r11.a()
            double r4 = r13.a()
            double r2 = r2 * r4
            double r0 = r0 / r2
            double r0 = java.lang.Math.acos(r0)
            double r0 = java.lang.Math.toDegrees(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 67
            r2.<init>(r3)
            java.lang.String r3 = "Angle change since last classification is: "
            r2.append(r3)
            r2.append(r0)
            r2.toString()
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0140
            long r0 = r8.b
            long r2 = r8.c
            com.google.android.gms.location.ActivityRecognitionResult r4 = new com.google.android.gms.location.ActivityRecognitionResult
            com.google.android.gms.location.DetectedActivity r5 = new com.google.android.gms.location.DetectedActivity
            r6 = 5
            r7 = 100
            r5.<init>(r6, r7)
            r6 = r29
            long r0 = r6 - r0
            r13 = 2
            long r0 = r0 / r13
            long r22 = r6 - r0
            long r0 = r9 - r2
            long r0 = r0 / r13
            long r24 = r9 - r0
            ahnk r0 = defpackage.ahnk.SOFTWARE_TILT_FROYO
            int r0 = r0.am
            r27 = 0
            r20 = r4
            r21 = r5
            r26 = r0
            r20.<init>((com.google.android.gms.location.DetectedActivity) r21, (long) r22, (long) r24, (int) r26, (android.os.Bundle) r27)
            goto L_0x014f
        L_0x0140:
            r6 = r29
            goto L_0x014e
        L_0x0143:
            r6 = r29
            r19 = r1
            r17 = r2
            r8 = r5
            r12 = r18
            r18 = r3
        L_0x014e:
            r4 = 0
        L_0x014f:
            r8.a = r12
            r8.b = r6
            r8.c = r9
            goto L_0x015d
        L_0x0156:
            r19 = r1
            r17 = r2
            r18 = r3
            r4 = 0
        L_0x015d:
            if (r4 == 0) goto L_0x0171
            r0 = r28
            ahis r1 = r0.a
            aicn r1 = r1.q
            r2 = 0
            defpackage.ahis.a(r1, r4, r2)
            ahis r1 = r0.a
            ahiq r1 = r1.e
            r1.c(r4)
            goto L_0x0185
        L_0x0171:
            r0 = r28
            goto L_0x0185
        L_0x0174:
            r19 = r1
            r17 = r2
            r18 = r3
            r16 = r4
            goto L_0x0185
        L_0x017d:
            r19 = r1
            r17 = r2
            r18 = r3
            r16 = r4
        L_0x0185:
            java.util.Iterator r1 = r19.iterator()
        L_0x0189:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01a5
            java.lang.Object r2 = r1.next()
            com.google.android.gms.location.ActivityRecognitionResult r2 = (com.google.android.gms.location.ActivityRecognitionResult) r2
            ahis r3 = r0.a
            ahiq r3 = r3.e
            r3.a((com.google.android.gms.location.ActivityRecognitionResult) r2)
            ahis r3 = r0.a
            aicn r3 = r3.q
            r4 = 0
            defpackage.ahis.a(r3, r2, r4)
            goto L_0x0189
        L_0x01a5:
            if (r18 != 0) goto L_0x01a8
            goto L_0x01b3
        L_0x01a8:
            ahis r1 = r0.a
            ahiq r1 = r1.e
            r3 = r18
            com.google.android.gms.location.ActivityRecognitionResult r3 = (com.google.android.gms.location.ActivityRecognitionResult) r3
            r1.b(r3)
        L_0x01b3:
            java.lang.String r1 = java.lang.String.valueOf(r17)
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 23
            r3.<init>(r2)
            java.lang.String r2 = "detectActivity returns "
            r3.append(r2)
            r3.append(r1)
            r3.toString()
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahir.a(long, long, ahyq):ahip");
    }

    /* access modifiers changed from: protected */
    public abstract void a(long j, long j2, ahyq ahyq, ahyq ahyq2, ahyq ahyq3);

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x02f1, code lost:
        if (r0 != 2) goto L_0x02f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x02f3, code lost:
        r7 = 100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02f6, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02f7, code lost:
        r2 = new defpackage.ahkl(new com.google.android.gms.location.ActivityRecognitionResult(new com.google.android.gms.location.DetectedActivity(9, r7), r33, r35, defpackage.ahko.a.am, (android.os.Bundle) null), defpackage.ahip.c, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ahip b(long r33, long r35, defpackage.ahyq r37) {
        /*
            r32 = this;
            r0 = r32
            r1 = r37
            ahis r2 = r0.a
            ahko r2 = r2.h
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r1.b
            r5 = -1
            int r4 = r4 + r5
            r6 = 0
            r7 = 1
            r8 = 0
        L_0x0014:
            r9 = 2500000000(0x9502f900, double:1.2351641146E-314)
            int r9 = defpackage.ahil.a((defpackage.ahyq) r1, (int) r4, (long) r9)
            if (r9 == r5) goto L_0x0328
            int r12 = r4 + 1
            int r12 = r12 - r9
            ahyq r12 = r1.b(r9, r12)
            int r13 = r12.b
            r14 = 4
            if (r13 < r14) goto L_0x031b
            java.util.Locale r8 = java.util.Locale.ENGLISH
            r8 = 2
            java.lang.Object[] r13 = new java.lang.Object[r8]
            int r14 = r1.b
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13[r6] = r14
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r13[r7] = r4
            int r4 = r12.b
            if (r4 == 0) goto L_0x02c0
            axwo r4 = defpackage.axwo.a
            axwp r4 = r4.a()
            double r13 = r4.offBodyDetectionLowerAngularThreshold()
            float r4 = (float) r13
            axwo r13 = defpackage.axwo.a
            axwp r13 = r13.a()
            double r13 = r13.offBodyDetectionUpperAngularThreshold()
            float r13 = (float) r13
            axwo r14 = defpackage.axwo.a
            axwp r14 = r14.a()
            double r14 = r14.offBodyDetectionEnergyThreshold()
            float r14 = (float) r14
            boolean r15 = r2.c
            int r15 = r2.e
            int r10 = r15 + -1
            if (r15 == 0) goto L_0x02bd
            if (r10 == 0) goto L_0x007c
            if (r10 == r7) goto L_0x0078
            r15 = r12
            double r11 = defpackage.axwo.c()
            float r4 = (float) r11
            r17 = r4
            goto L_0x007f
        L_0x0078:
            r15 = r12
            r17 = r13
            goto L_0x007f
        L_0x007c:
            r15 = r12
            r17 = r4
        L_0x007f:
            java.util.Locale r4 = java.util.Locale.ENGLISH
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.Float r11 = java.lang.Float.valueOf(r17)
            r4[r6] = r11
            ahkn r4 = r2.b
            r11 = 3
            if (r4 != 0) goto L_0x008f
            goto L_0x00bc
        L_0x008f:
            long r12 = r4.a
            long r12 = r35 - r12
            r18 = 600000(0x927c0, double:2.964394E-318)
            int r4 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r4 <= 0) goto L_0x009c
            r4 = 1
            goto L_0x009d
        L_0x009c:
            r4 = 0
        L_0x009d:
            java.util.Locale r12 = java.util.Locale.ENGLISH
            java.lang.Object[] r12 = new java.lang.Object[r11]
            ahkn r13 = r2.b
            long r10 = r13.a
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r12[r6] = r10
            java.lang.Long r10 = java.lang.Long.valueOf(r35)
            r12[r7] = r10
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r4)
            r12[r8] = r10
            if (r4 == 0) goto L_0x00bc
            r4 = 0
            r2.b = r4
        L_0x00bc:
            ahkn r4 = new ahkn
            r21 = 0
            r22 = 0
            r23 = 0
            r18 = r4
            r19 = r35
            r18.<init>(r19, r21, r22, r23)
            r11 = 0
            r12 = 0
        L_0x00cd:
            r13 = r15
            int r15 = r13.b
            if (r12 >= r15) goto L_0x0122
            float r15 = r4.b
            float r16 = r13.a(r12, r6)
            float r15 = r15 + r16
            r4.b = r15
            float r15 = r4.c
            float r16 = r13.a(r12, r7)
            float r15 = r15 + r16
            r4.c = r15
            float r15 = r4.d
            float r16 = r13.a(r12, r8)
            float r15 = r15 + r16
            r4.d = r15
            if (r12 <= 0) goto L_0x011e
            int r15 = r12 + -1
            float r16 = r13.a(r12, r6)
            float r18 = r13.a(r15, r6)
            float r16 = r16 - r18
            float r18 = r13.a(r12, r7)
            float r19 = r13.a(r15, r7)
            float r18 = r18 - r19
            float r19 = r13.a(r12, r8)
            float r15 = r13.a(r15, r8)
            float r19 = r19 - r15
            float r16 = r16 * r16
            float r18 = r18 * r18
            float r16 = r16 + r18
            float r19 = r19 * r19
            float r16 = r16 + r19
            float r11 = r11 + r16
        L_0x011e:
            int r12 = r12 + 1
            r15 = r13
            goto L_0x00cd
        L_0x0122:
            float r12 = (float) r15
            r15 = 1065353216(0x3f800000, float:1.0)
            float r12 = r15 / r12
            ahkn r4 = r4.a((float) r12)
            ahkn r12 = new ahkn
            r21 = 0
            r22 = 0
            r23 = 0
            r18 = r12
            r19 = r35
            r18.<init>(r19, r21, r22, r23)
            r10 = 0
        L_0x013b:
            int r5 = r13.b
            if (r10 >= r5) goto L_0x0170
            float r5 = r13.a(r10, r6)
            float r6 = r4.b
            float r5 = r5 - r6
            float r6 = r13.a(r10, r7)
            float r7 = r4.c
            float r6 = r6 - r7
            float r7 = r13.a(r10, r8)
            float r8 = r4.d
            float r7 = r7 - r8
            float r8 = r12.b
            float r5 = r5 * r5
            float r8 = r8 + r5
            r12.b = r8
            float r5 = r12.c
            float r6 = r6 * r6
            float r5 = r5 + r6
            r12.c = r5
            float r5 = r12.d
            float r7 = r7 * r7
            float r5 = r5 + r7
            r12.d = r5
            int r10 = r10 + 1
            r5 = -1
            r6 = 0
            r7 = 1
            r8 = 2
            goto L_0x013b
        L_0x0170:
            float r5 = (float) r5
            float r15 = r15 / r5
            r12.a((float) r15)
            java.util.Locale r5 = java.util.Locale.ENGLISH
            r6 = 2
            java.lang.Object[] r5 = new java.lang.Object[r6]
            java.lang.Float r6 = java.lang.Float.valueOf(r17)
            r7 = 0
            r5[r7] = r6
            java.lang.Float r7 = java.lang.Float.valueOf(r11)
            r8 = 1
            r5[r8] = r7
            ahkn r5 = r2.b
            if (r5 == 0) goto L_0x0221
            ahkn r7 = new ahkn
            long r0 = r5.a
            float r8 = r4.c
            float r10 = r5.d
            float r12 = r4.d
            float r15 = r5.c
            r30 = r9
            float r9 = r5.b
            r31 = r3
            float r3 = r4.b
            float r16 = r8 * r10
            float r18 = r12 * r15
            float r21 = r16 - r18
            float r12 = r12 * r9
            float r10 = r10 * r3
            float r22 = r12 - r10
            float r3 = r3 * r15
            float r8 = r8 * r9
            float r23 = r3 - r8
            r18 = r7
            r19 = r0
            r18.<init>(r19, r21, r22, r23)
            float r0 = r7.a((defpackage.ahkn) r7)
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            double r0 = (double) r0
            float r3 = r4.a((defpackage.ahkn) r5)
            double r7 = (double) r3
            double r0 = java.lang.Math.atan2(r0, r7)
            double r0 = java.lang.Math.toDegrees(r0)
            float r0 = (float) r0
            float r0 = java.lang.Math.abs(r0)
            java.lang.String r1 = r4.toString()
            java.lang.String r3 = r5.toString()
            java.lang.String r5 = java.lang.String.valueOf(r1)
            int r5 = r5.length()
            java.lang.String r7 = java.lang.String.valueOf(r3)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r5 = r5 + 58
            int r5 = r5 + r7
            r8.<init>(r5)
            java.lang.String r5 = "angleBetween: this = "
            r8.append(r5)
            r8.append(r1)
            java.lang.String r1 = ", other = "
            r8.append(r1)
            r8.append(r3)
            java.lang.String r1 = ", degrees = "
            r8.append(r1)
            r8.append(r0)
            r8.toString()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.util.Locale r1 = java.util.Locale.ENGLISH
            r3 = 2
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r3 = 0
            r1[r3] = r0
            r3 = 1
            r1[r3] = r6
            goto L_0x0226
        L_0x0221:
            r31 = r3
            r30 = r9
            r0 = 0
        L_0x0226:
            int r1 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r1 <= 0) goto L_0x024e
            aicn r1 = r2.d
            if (r1 == 0) goto L_0x024c
            ahiy r3 = new ahiy
            aico r19 = defpackage.aico.OFF_BODY_RESULT
            long r20 = r1.b()
            int r22 = java.lang.Math.round(r11)
            r5 = -998637568(0xffffffffc47a0000, float:-1000.0)
            int r23 = java.lang.Math.round(r5)
            r18 = r3
            r24 = r11
            r18.<init>(r19, r20, r22, r23, r24)
            r1.a((defpackage.aicl) r3)
            r1 = 1
            goto L_0x0274
        L_0x024c:
            r1 = 1
            goto L_0x0274
        L_0x024e:
            ahkn r1 = r2.b
            if (r1 != 0) goto L_0x0269
            java.util.Locale r1 = java.util.Locale.ENGLISH
            r3 = 2
            java.lang.Object[] r1 = new java.lang.Object[r3]
            int r3 = r13.b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 0
            r1[r5] = r3
            java.lang.String r3 = r4.toString()
            r5 = 1
            r1[r5] = r3
            r1 = 3
            goto L_0x0274
        L_0x0269:
            float r1 = r0.floatValue()
            int r1 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r1 <= 0) goto L_0x0273
            r1 = 1
            goto L_0x0274
        L_0x0273:
            r1 = 2
        L_0x0274:
            ahkk r10 = new ahkk
            int r3 = r13.b
            ahkn r5 = r2.b
            r6 = 0
            long r7 = r13.a((int) r6)
            r15 = 1000000(0xf4240, double:4.940656E-318)
            long r24 = r7 / r15
            int r6 = r13.b
            r7 = -1
            int r6 = r6 + r7
            long r6 = r13.a((int) r6)
            long r26 = r6 / r15
            int r6 = r2.e
            r16 = r10
            r18 = r14
            r19 = r4
            r20 = r3
            r21 = r5
            r22 = r0
            r23 = r11
            r28 = r6
            r29 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r26, r28, r29)
            r0 = 3
            if (r1 != r0) goto L_0x02a9
            goto L_0x02ab
        L_0x02a9:
            r2.e = r1
        L_0x02ab:
            r2.b = r4
            java.util.Locale r0 = java.util.Locale.ENGLISH
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            ahkn r1 = r2.b
            java.lang.String r1 = r1.toString()
            r3 = 0
            r0[r3] = r1
            r0 = r10
            goto L_0x02c5
        L_0x02bd:
            r0 = 0
            throw r0
        L_0x02c0:
            r31 = r3
            r30 = r9
            r0 = 0
        L_0x02c5:
            r1 = r31
            r1.add(r0)
            int r0 = r0.k
            r3 = 2
            if (r0 != r3) goto L_0x02d0
            goto L_0x02f0
        L_0x02d0:
            r3 = 1
            if (r0 == r3) goto L_0x02f0
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            r0 = r37
            r5 = r30
            int r3 = defpackage.ahil.a((defpackage.ahyq) r0, (int) r5, (long) r3)
            r4 = -1
            if (r3 == r4) goto L_0x0334
            int r3 = r3 + 1
            r4 = r3
            r5 = -1
            r6 = 0
            r7 = 1
            r8 = 1
            r3 = r1
            r1 = r0
            r0 = r32
            goto L_0x0014
        L_0x02f0:
            r2 = 2
            if (r0 != r2) goto L_0x02f6
            r7 = 100
            goto L_0x02f7
        L_0x02f6:
            r7 = 0
        L_0x02f7:
            com.google.android.gms.location.ActivityRecognitionResult r0 = new com.google.android.gms.location.ActivityRecognitionResult
            com.google.android.gms.location.DetectedActivity r2 = new com.google.android.gms.location.DetectedActivity
            r3 = 9
            r2.<init>(r3, r7)
            ahnk r3 = defpackage.ahko.a
            int r3 = r3.am
            r25 = 0
            r18 = r0
            r19 = r2
            r20 = r33
            r22 = r35
            r24 = r3
            r18.<init>((com.google.android.gms.location.DetectedActivity) r19, (long) r20, (long) r22, (int) r24, (android.os.Bundle) r25)
            ahkl r2 = new ahkl
            ahip r3 = defpackage.ahip.c
            r2.<init>(r0, r3, r1)
            goto L_0x0340
        L_0x031b:
            r0 = r1
            r1 = r3
            r5 = r9
            r4 = -1
            r4 = r5
            r5 = -1
            r6 = 0
            r7 = 1
            r1 = r0
            r0 = r32
            goto L_0x0014
        L_0x0328:
            r0 = r1
            r1 = r3
            if (r8 != 0) goto L_0x0334
            int r0 = r0.b
            long r2 = (long) r0
            ahip r0 = defpackage.ahip.b(r2)
            goto L_0x033a
        L_0x0334:
            r2 = 5000(0x1388, double:2.4703E-320)
            ahip r0 = defpackage.ahip.a((long) r2)
        L_0x033a:
            ahkl r2 = new ahkl
            r3 = 0
            r2.<init>(r3, r0, r1)
        L_0x0340:
            java.util.Locale r0 = java.util.Locale.ENGLISH
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r3 = 0
            r0[r3] = r2
            com.google.android.gms.location.ActivityRecognitionResult r0 = r2.a
            if (r0 == 0) goto L_0x0379
            java.util.List r0 = r0.a
            int r0 = r0.size()
            if (r0 != r1) goto L_0x0371
            com.google.android.gms.location.ActivityRecognitionResult r0 = r2.a
            com.google.android.gms.location.DetectedActivity r0 = r0.a()
            int r0 = r0.a()
            r1 = 9
            if (r0 != r1) goto L_0x036e
            r0 = r32
            ahis r1 = r0.a
            ahiq r1 = r1.e
            com.google.android.gms.location.ActivityRecognitionResult r3 = r2.a
            r1.d(r3)
            goto L_0x037b
        L_0x036e:
            r0 = r32
            goto L_0x0373
        L_0x0371:
            r0 = r32
        L_0x0373:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0379:
            r0 = r32
        L_0x037b:
            ahip r1 = r2.b
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahir.b(long, long, ahyq):ahip");
    }

    /* access modifiers changed from: protected */
    public final void c(long j, long j2, ahyq ahyq) {
        double[][] dArr;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        ActivityRecognitionResult activityRecognitionResult;
        ahir ahir = this;
        double[][] a2 = ahmx.a(ahyq, 50.0d);
        double[] dArr2 = a2[0];
        double[] dArr3 = a2[1];
        double[] dArr4 = a2[2];
        int length = dArr2.length;
        double[] dArr5 = new double[length];
        double[] dArr6 = new double[length];
        int i = 0;
        while (i < length) {
            double[][] dArr7 = a2;
            double[] dArr8 = dArr4;
            double[] dArr9 = dArr5;
            ahir ahir2 = ahir;
            double[] dArr10 = dArr2;
            double[] dArr11 = dArr3;
            dArr9[i] = Math.abs(dArr10[i]) + Math.abs(dArr11[i]) + Math.abs(dArr8[i]);
            double d = dArr10[i];
            double d2 = dArr11[i];
            double d3 = dArr8[i];
            dArr6[i] = Math.sqrt((d * d) + (d2 * d2) + (d3 * d3));
            i++;
            dArr3 = dArr11;
            dArr2 = dArr10;
            dArr4 = dArr8;
            a2 = dArr7;
            ahir = ahir2;
            dArr5 = dArr9;
        }
        ahne ahne = new ahne();
        double a3 = ahmx.a(dArr2);
        double a4 = ahmx.a(dArr3);
        double[] dArr12 = dArr3;
        double a5 = ahmx.a(dArr4);
        double[] dArr13 = dArr4;
        double a6 = ahmx.a(dArr5);
        double[] dArr14 = dArr2;
        double a7 = ahmx.a(dArr6);
        ahne.a = (float) a3;
        ahne.b = (float) a4;
        ahne.c = (float) a5;
        ahne.d = (float) a6;
        ahne.e = (float) a7;
        double c = ahmx.c(dArr14) - (a3 * a3);
        double c2 = ahmx.c(dArr12) - (a4 * a4);
        double c3 = ahmx.c(dArr13) - (a5 * a5);
        double c4 = ahmx.c(dArr6) - (a7 * a7);
        if (c4 >= 1.0E-10d) {
            dArr = a2;
            f = (float) (c / c4);
        } else {
            dArr = a2;
            f = 0.0f;
        }
        ahne.G = f;
        ahne.H = c4 >= 1.0E-10d ? (float) (c2 / c4) : 0.0f;
        ahne.I = c4 >= 1.0E-10d ? (float) (c3 / c4) : 0.0f;
        double[] dArr15 = dArr14;
        double a8 = ahnd.a(dArr15, a3);
        double d4 = a3;
        double[] dArr16 = dArr12;
        double a9 = ahnd.a(dArr16, a4);
        double d5 = a4;
        double[] dArr17 = dArr13;
        double a10 = ahnd.a(dArr17, a5);
        double d6 = a5;
        double d7 = a6;
        double[] dArr18 = dArr16;
        double d8 = a7;
        double a11 = ahnd.a(dArr5, a6);
        double a12 = ahnd.a(dArr6, d8);
        double[] dArr19 = dArr6;
        ahne.u = (float) a8;
        ahne.v = (float) a9;
        ahne.w = (float) a10;
        double[] dArr20 = dArr5;
        double d9 = a11;
        double[] dArr21 = dArr17;
        ahne.x = (float) d9;
        ahne.y = (float) a12;
        if (Math.abs(d4) >= 1.0E-10d) {
            f2 = (float) (a8 / d4);
        } else {
            f2 = 0.0f;
        }
        ahne.z = f2;
        if (Math.abs(d5) >= 1.0E-10d) {
            f3 = (float) (a9 / d5);
        } else {
            f3 = 0.0f;
        }
        ahne.A = f3;
        if (Math.abs(d6) >= 1.0E-10d) {
            f4 = (float) (a10 / d6);
        } else {
            f4 = 0.0f;
        }
        ahne.B = f4;
        if (d7 >= 1.0E-10d) {
            f5 = (float) (d9 / d7);
        } else {
            f5 = 0.0f;
        }
        ahne.C = f5;
        if (d8 >= 1.0E-10d) {
            f6 = (float) (a12 / d8);
        } else {
            f6 = 0.0f;
        }
        ahne.D = f6;
        ahne.p = (float) ahnd.a(dArr15);
        ahne.q = (float) ahnd.a(dArr18);
        ahne.r = (float) ahnd.a(dArr21);
        ahne.s = (float) ahnd.a(dArr20);
        ahne.t = (float) ahnd.a(dArr19);
        ahne.k = ahnd.b(dArr15);
        ahne.l = ahnd.b(dArr18);
        ahne.m = ahnd.b(dArr21);
        ahne.n = ahnd.b(dArr20);
        ahne.o = ahnd.b(dArr19);
        ahne.f = ahnd.b(dArr15, d4);
        ahne.g = ahnd.b(dArr18, d5);
        ahne.h = ahnd.b(dArr21, d6);
        ahne.i = ahnd.b(dArr20, d7);
        ahne.j = ahnd.b(dArr19, d8);
        double[][] dArr22 = dArr;
        int length2 = dArr22.length;
        int length3 = dArr22[0].length;
        int i2 = length3 % 5;
        int i3 = (length3 - i2) / 5;
        int[] iArr = new int[2];
        iArr[1] = length2;
        iArr[0] = i3;
        double[][] dArr23 = (double[][]) Array.newInstance(double.class, iArr);
        double[] dArr24 = new double[5];
        for (int i4 = 0; i4 < i3; i4++) {
            double[] dArr25 = dArr23[i4];
            int i5 = (i4 * 5) + i2;
            for (int i6 = 0; i6 < length2; i6++) {
                System.arraycopy(dArr22[i6], i5, dArr24, 0, 5);
                dArr25[i6] = ahmx.a(dArr24);
            }
        }
        int length4 = dArr23.length;
        if (length4 > 1) {
            double[] dArr26 = new double[(length4 - 1)];
            int i7 = 0;
            while (i7 < dArr23.length - 1) {
                double[] dArr27 = dArr23[i7];
                int i8 = i7 + 1;
                double[] dArr28 = dArr23[i8];
                double d10 = 0.0d;
                for (int i9 = 0; i9 < dArr27.length; i9++) {
                    d10 += dArr27[i9] * dArr28[i9];
                }
                dArr26[i7] = d10 / Math.sqrt(ahmx.d(dArr27) * ahmx.d(dArr28));
                i7 = i8;
            }
            double a13 = ahmx.a(dArr26);
            ahne.E = (float) a13;
            ahne.F = (float) (ahmx.c(dArr26) - (a13 * a13));
        } else {
            ahne.E = 1.0f;
            ahne.F = 1.0f;
        }
        ActivityRecognitionResult activityRecognitionResult2 = new ActivityRecognitionResult(ahil.a(this.a.g.a.a(ahne)), j, j2, ahnk.PHONE_POSITION_MANCHEGO.am, (Bundle) null);
        ahis ahis = this.a;
        if (ahis.f) {
            activityRecognitionResult = new ActivityRecognitionResult(ahil.a(ahis.g.b.a(ahne)), j, j2, ahnk.PHONE_POSITION_IN_VEHICLE_ORLA.am, (Bundle) null);
        } else {
            activityRecognitionResult = null;
        }
        String valueOf = String.valueOf(activityRecognitionResult2);
        String valueOf2 = String.valueOf(activityRecognitionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 70 + String.valueOf(valueOf2).length());
        sb.append("Primary phone position detection result: ");
        sb.append(valueOf);
        sb.append(", inVehicle position result: ");
        sb.append(valueOf2);
        sb.toString();
        this.a.e.a(activityRecognitionResult2, new ahng(ahne), activityRecognitionResult);
    }

    public final void a(String str) {
        ahis ahis = this.a;
        if (ahis.a) {
            ahis.a = false;
            ahis.e.a(ahip.a(str));
        }
    }

    public final void a(Map map) {
        ahyq ahyq;
        ahyq ahyq2;
        ahyq ahyq3;
        ahis ahis = this.a;
        if (ahis.a) {
            ahis.a = false;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ahyq ahyq4 = (ahyq) map.get(ahup.ACCELEROMETER);
            ahyq ahyq5 = (ahyq) map.get(ahup.BAROMETER);
            ahyq ahyq6 = (ahyq) map.get(ahup.LIGHT);
            ahyq ahyq7 = (ahyq) map.get(ahup.SOUND);
            if (ahyq4 == null) {
                ahyq = ahyq.e;
            } else {
                ahyq = ahyq4;
            }
            if (ahyq5 == null) {
                ahyq2 = ahyq.e;
            } else {
                ahyq2 = ahyq5;
            }
            if (ahyq6 == null) {
                ahyq3 = ahyq.e;
            } else {
                ahyq3 = ahyq6;
            }
            if (ahyq7 == null) {
                ahyq7 = ahyq.e;
            }
            int i = ahyq.b;
            int i2 = ahyq2.b;
            int i3 = ahyq3.b;
            int i4 = ahyq7.b;
            StringBuilder sb = new StringBuilder(131);
            sb.append("onSensorEventsListComposed(), accel.length=");
            sb.append(i);
            sb.append(", baro.length=");
            sb.append(i2);
            sb.append(", light.length=");
            sb.append(i3);
            sb.append(", sound.length=");
            sb.append(i4);
            sb.toString();
            a(currentTimeMillis, elapsedRealtime, ahyq, ahyq2, ahyq3);
        }
    }
}
