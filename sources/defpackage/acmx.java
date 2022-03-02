package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.setupdesign.GlifLayout;

/* renamed from: acmx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acmx extends Fragment {
    private static final iwd c = acqa.a("D2D", "UI", "QRCodeFragment");
    public String a;
    public View.OnClickListener b;
    private ImageView d;
    private GlifLayout e;
    private int f;

    /* JADX WARNING: Code restructure failed: missing block: B:319:0x069f, code lost:
        if (r15[r9] == 0) goto L_0x06a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r43) {
        /*
            r42 = this;
            r1 = r42
            r0 = r43
            com.google.android.setupdesign.GlifLayout r2 = r1.e     // Catch:{ avxp -> 0x090a }
            r3 = 0
            r2.b(r3)     // Catch:{ avxp -> 0x090a }
            int r2 = r1.f     // Catch:{ avxp -> 0x090a }
            boolean r4 = r43.isEmpty()     // Catch:{ avxp -> 0x090a }
            if (r4 != 0) goto L_0x08ff
            if (r2 < 0) goto L_0x08de
            avxv r4 = defpackage.avxv.L     // Catch:{ avxp -> 0x090a }
            int r5 = defpackage.avyc.a     // Catch:{ avxp -> 0x090a }
            java.lang.String r5 = "ISO-8859-1"
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x001d:
            int r9 = r43.length()     // Catch:{ avxp -> 0x090a }
            r10 = -1
            r11 = 1
            if (r6 >= r9) goto L_0x0041
            char r9 = r0.charAt(r6)     // Catch:{ avxp -> 0x090a }
            r12 = 48
            if (r9 >= r12) goto L_0x002e
            goto L_0x0034
        L_0x002e:
            r12 = 57
            if (r9 > r12) goto L_0x0034
            r8 = 1
            goto L_0x003e
        L_0x0034:
            int r7 = defpackage.avyc.a(r9)     // Catch:{ avxp -> 0x090a }
            if (r7 != r10) goto L_0x003d
            avxw r6 = defpackage.avxw.BYTE     // Catch:{ avxp -> 0x090a }
            goto L_0x004d
        L_0x003d:
            r7 = 1
        L_0x003e:
            int r6 = r6 + 1
            goto L_0x001d
        L_0x0041:
            if (r7 == 0) goto L_0x0046
            avxw r6 = defpackage.avxw.ALPHANUMERIC     // Catch:{ avxp -> 0x090a }
            goto L_0x004d
        L_0x0046:
            if (r8 == 0) goto L_0x004b
            avxw r6 = defpackage.avxw.NUMERIC     // Catch:{ avxp -> 0x090a }
            goto L_0x004d
        L_0x004b:
            avxw r6 = defpackage.avxw.BYTE     // Catch:{ avxp -> 0x090a }
        L_0x004d:
            avxq r7 = new avxq     // Catch:{ avxp -> 0x090a }
            r7.<init>()     // Catch:{ avxp -> 0x090a }
            int r8 = r6.k     // Catch:{ avxp -> 0x090a }
            r9 = 4
            r7.a(r8, r9)     // Catch:{ avxp -> 0x090a }
            avxq r8 = new avxq     // Catch:{ avxp -> 0x090a }
            r8.<init>()     // Catch:{ avxp -> 0x090a }
            int r12 = r6.ordinal()     // Catch:{ avxp -> 0x090a }
            r13 = 7
            r14 = 10
            r15 = 2
            r3 = 8
            if (r12 == r11) goto L_0x0132
            r11 = 6
            if (r12 == r15) goto L_0x00f6
            if (r12 == r9) goto L_0x00de
            if (r12 != r11) goto L_0x00c7
            java.lang.String r5 = "Shift_JIS"
            byte[] r5 = r0.getBytes(r5)     // Catch:{ UnsupportedEncodingException -> 0x00c0 }
            int r11 = r5.length     // Catch:{ avxp -> 0x090a }
            r12 = 0
        L_0x0078:
            if (r12 >= r11) goto L_0x0175
            byte r15 = r5[r12]     // Catch:{ avxp -> 0x090a }
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r15 = r15 << r3
            int r19 = r12 + 1
            byte r9 = r5[r19]     // Catch:{ avxp -> 0x090a }
            r9 = r9 & 255(0xff, float:3.57E-43)
            r9 = r9 | r15
            r15 = 33088(0x8140, float:4.6366E-41)
            if (r9 < r15) goto L_0x0095
            r15 = 40956(0x9ffc, float:5.7392E-41)
            if (r9 > r15) goto L_0x0095
            r15 = -33088(0xffffffffffff7ec0, float:NaN)
            int r9 = r9 + r15
            goto L_0x00a5
        L_0x0095:
            r15 = 57408(0xe040, float:8.0446E-41)
            if (r9 < r15) goto L_0x00a4
            r15 = 60351(0xebbf, float:8.457E-41)
            if (r9 > r15) goto L_0x00a4
            r15 = -49472(0xffffffffffff3ec0, float:NaN)
            int r9 = r9 + r15
            goto L_0x00a5
        L_0x00a4:
            r9 = -1
        L_0x00a5:
            if (r9 == r10) goto L_0x00b8
            int r15 = r9 >> 8
            int r15 = r15 * 192
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r15 = r15 + r9
            r9 = 13
            r8.a(r15, r9)     // Catch:{ avxp -> 0x090a }
            int r12 = r12 + 2
            r9 = 4
            r15 = 2
            goto L_0x0078
        L_0x00b8:
            avxp r0 = new avxp     // Catch:{ avxp -> 0x090a }
            java.lang.String r2 = "Invalid byte sequence"
            r0.<init>((java.lang.String) r2)     // Catch:{ avxp -> 0x090a }
            throw r0     // Catch:{ avxp -> 0x090a }
        L_0x00c0:
            r0 = move-exception
            avxp r2 = new avxp     // Catch:{ avxp -> 0x090a }
            r2.<init>((java.lang.Throwable) r0)     // Catch:{ avxp -> 0x090a }
            throw r2     // Catch:{ avxp -> 0x090a }
        L_0x00c7:
            avxp r0 = new avxp     // Catch:{ avxp -> 0x090a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ avxp -> 0x090a }
            r2.<init>()     // Catch:{ avxp -> 0x090a }
            java.lang.String r3 = "Invalid mode: "
            r2.append(r3)     // Catch:{ avxp -> 0x090a }
            r2.append(r6)     // Catch:{ avxp -> 0x090a }
            java.lang.String r2 = r2.toString()     // Catch:{ avxp -> 0x090a }
            r0.<init>((java.lang.String) r2)     // Catch:{ avxp -> 0x090a }
            throw r0     // Catch:{ avxp -> 0x090a }
        L_0x00de:
            byte[] r5 = r0.getBytes(r5)     // Catch:{ UnsupportedEncodingException -> 0x00ee }
            int r9 = r5.length     // Catch:{ avxp -> 0x090a }
            r11 = 0
        L_0x00e4:
            if (r11 >= r9) goto L_0x0175
            byte r12 = r5[r11]     // Catch:{ avxp -> 0x090a }
            r8.a(r12, r3)     // Catch:{ avxp -> 0x090a }
            int r11 = r11 + 1
            goto L_0x00e4
        L_0x00ee:
            r0 = move-exception
            r2 = r0
            avxp r0 = new avxp     // Catch:{ avxp -> 0x090a }
            r0.<init>((java.lang.Throwable) r2)     // Catch:{ avxp -> 0x090a }
            throw r0     // Catch:{ avxp -> 0x090a }
        L_0x00f6:
            int r5 = r43.length()     // Catch:{ avxp -> 0x090a }
            r9 = 0
        L_0x00fb:
            if (r9 >= r5) goto L_0x0175
            char r12 = r0.charAt(r9)     // Catch:{ avxp -> 0x090a }
            int r12 = defpackage.avyc.a(r12)     // Catch:{ avxp -> 0x090a }
            if (r12 == r10) goto L_0x012c
            int r15 = r9 + 1
            if (r15 >= r5) goto L_0x0126
            char r15 = r0.charAt(r15)     // Catch:{ avxp -> 0x090a }
            int r15 = defpackage.avyc.a(r15)     // Catch:{ avxp -> 0x090a }
            if (r15 == r10) goto L_0x0120
            int r12 = r12 * 45
            int r12 = r12 + r15
            r15 = 11
            r8.a(r12, r15)     // Catch:{ avxp -> 0x090a }
            int r9 = r9 + 2
            goto L_0x00fb
        L_0x0120:
            avxp r0 = new avxp     // Catch:{ avxp -> 0x090a }
            r0.<init>()     // Catch:{ avxp -> 0x090a }
            throw r0     // Catch:{ avxp -> 0x090a }
        L_0x0126:
            r8.a(r12, r11)     // Catch:{ avxp -> 0x090a }
            r9 = r15
            goto L_0x00fb
        L_0x012c:
            avxp r0 = new avxp     // Catch:{ avxp -> 0x090a }
            r0.<init>()     // Catch:{ avxp -> 0x090a }
            throw r0     // Catch:{ avxp -> 0x090a }
        L_0x0132:
            int r5 = r43.length()     // Catch:{ avxp -> 0x090a }
            r9 = 0
        L_0x0137:
            if (r9 >= r5) goto L_0x0175
            char r11 = r0.charAt(r9)     // Catch:{ avxp -> 0x090a }
            int r11 = r11 + -48
            int r12 = r9 + 2
            if (r12 >= r5) goto L_0x015d
            int r11 = r11 * 100
            int r15 = r9 + 1
            char r15 = r0.charAt(r15)     // Catch:{ avxp -> 0x090a }
            int r15 = r15 + -48
            int r15 = r15 * 10
            int r11 = r11 + r15
            char r12 = r0.charAt(r12)     // Catch:{ avxp -> 0x090a }
            int r12 = r12 + -48
            int r11 = r11 + r12
            r8.a(r11, r14)     // Catch:{ avxp -> 0x090a }
            int r9 = r9 + 3
            goto L_0x0137
        L_0x015d:
            int r9 = r9 + 1
            if (r9 >= r5) goto L_0x016f
            int r11 = r11 * 10
            char r9 = r0.charAt(r9)     // Catch:{ avxp -> 0x090a }
            int r9 = r9 + -48
            int r11 = r11 + r9
            r8.a(r11, r13)     // Catch:{ avxp -> 0x090a }
            r9 = r12
            goto L_0x0137
        L_0x016f:
            r12 = 4
            r8.a(r11, r12)     // Catch:{ avxp -> 0x090a }
            goto L_0x0137
        L_0x0175:
            int r5 = r7.b     // Catch:{ avxp -> 0x090a }
            r9 = 1
            avxz r11 = defpackage.avxz.a((int) r9)     // Catch:{ avxp -> 0x090a }
            int r9 = r6.a(r11)     // Catch:{ avxp -> 0x090a }
            int r11 = r8.b     // Catch:{ avxp -> 0x090a }
            int r5 = r5 + r9
            int r5 = r5 + r11
            avxz r5 = defpackage.avyc.a(r5, r4)     // Catch:{ avxp -> 0x090a }
            int r9 = r7.b     // Catch:{ avxp -> 0x090a }
            int r5 = r6.a(r5)     // Catch:{ avxp -> 0x090a }
            int r9 = r9 + r5
            int r5 = r8.b     // Catch:{ avxp -> 0x090a }
            int r9 = r9 + r5
            avxz r5 = defpackage.avyc.a(r9, r4)     // Catch:{ avxp -> 0x090a }
            avxq r9 = new avxq     // Catch:{ avxp -> 0x090a }
            r9.<init>()     // Catch:{ avxp -> 0x090a }
            r9.a((defpackage.avxq) r7)     // Catch:{ avxp -> 0x090a }
            avxw r7 = defpackage.avxw.BYTE     // Catch:{ avxp -> 0x090a }
            if (r6 == r7) goto L_0x01a7
            int r0 = r43.length()     // Catch:{ avxp -> 0x090a }
            goto L_0x01ab
        L_0x01a7:
            int r0 = r8.a()     // Catch:{ avxp -> 0x090a }
        L_0x01ab:
            int r7 = r6.a(r5)     // Catch:{ avxp -> 0x090a }
            r11 = 1
            int r12 = r11 << r7
            if (r0 >= r12) goto L_0x08c1
            r9.a(r0, r7)     // Catch:{ avxp -> 0x090a }
            r9.a((defpackage.avxq) r8)     // Catch:{ avxp -> 0x090a }
            avxy r0 = r5.a((defpackage.avxv) r4)     // Catch:{ avxp -> 0x090a }
            int r7 = r5.b     // Catch:{ avxp -> 0x090a }
            int r8 = r0.b()     // Catch:{ avxp -> 0x090a }
            int r7 = r7 - r8
            int r8 = r7 << 3
            int r11 = r9.b     // Catch:{ avxp -> 0x090a }
            if (r11 > r8) goto L_0x089f
            r11 = 0
        L_0x01cc:
            r12 = 4
            if (r11 >= r12) goto L_0x01dc
            int r12 = r9.b     // Catch:{ avxp -> 0x090a }
            if (r12 < r8) goto L_0x01d4
            goto L_0x01dc
        L_0x01d4:
            r12 = 0
            r9.a((boolean) r12)     // Catch:{ avxp -> 0x090a }
            int r11 = r11 + 1
            goto L_0x01cc
        L_0x01dc:
            int r11 = r9.b     // Catch:{ avxp -> 0x090a }
            r11 = r11 & r13
            if (r11 > 0) goto L_0x01e2
            goto L_0x01eb
        L_0x01e2:
            if (r11 >= r3) goto L_0x01eb
            r12 = 0
            r9.a((boolean) r12)     // Catch:{ avxp -> 0x090a }
            int r11 = r11 + 1
            goto L_0x01e2
        L_0x01eb:
            int r11 = r9.a()     // Catch:{ avxp -> 0x090a }
            int r11 = r7 - r11
            r12 = 0
        L_0x01f2:
            if (r12 >= r11) goto L_0x0204
            r15 = r12 & 1
            if (r15 != 0) goto L_0x01fb
            r13 = 236(0xec, float:3.31E-43)
            goto L_0x01fd
        L_0x01fb:
            r13 = 17
        L_0x01fd:
            r9.a(r13, r3)     // Catch:{ avxp -> 0x090a }
            int r12 = r12 + 1
            goto L_0x01f2
        L_0x0204:
            int r11 = r9.b     // Catch:{ avxp -> 0x090a }
            if (r11 != r8) goto L_0x0896
            int r8 = r5.b     // Catch:{ avxp -> 0x090a }
            int r0 = r0.a()     // Catch:{ avxp -> 0x090a }
            int r11 = r9.a()     // Catch:{ avxp -> 0x090a }
            if (r11 != r7) goto L_0x088d
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ avxp -> 0x090a }
            r11.<init>(r0)     // Catch:{ avxp -> 0x090a }
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x021d:
            if (r12 >= r0) goto L_0x0529
            r3 = 1
            int[] r10 = new int[r3]     // Catch:{ avxp -> 0x0524 }
            int[] r1 = new int[r3]     // Catch:{ avxp -> 0x0524 }
            if (r12 >= r0) goto L_0x051c
            int r3 = r8 % r0
            r23 = r2
            int r2 = r0 - r3
            int r24 = r8 / r0
            int r25 = r7 / r0
            int r26 = r25 + 1
            r27 = r5
            int r5 = r24 - r25
            r17 = 1
            int r24 = r24 + 1
            r28 = r6
            int r6 = r24 - r26
            if (r5 != r6) goto L_0x0514
            r24 = r4
            int r4 = r2 + r3
            if (r0 != r4) goto L_0x050c
            int r4 = r25 + r5
            int r4 = r4 * r2
            int r29 = r26 + r6
            int r29 = r29 * r3
            int r4 = r4 + r29
            if (r8 != r4) goto L_0x0504
            if (r12 < r2) goto L_0x025a
            r2 = 0
            r10[r2] = r26     // Catch:{ avxp -> 0x0524 }
            r1[r2] = r6     // Catch:{ avxp -> 0x0524 }
            goto L_0x025f
        L_0x025a:
            r2 = 0
            r10[r2] = r25     // Catch:{ avxp -> 0x0524 }
            r1[r2] = r5     // Catch:{ avxp -> 0x0524 }
        L_0x025f:
            r3 = r10[r2]     // Catch:{ avxp -> 0x0524 }
            byte[] r2 = new byte[r3]     // Catch:{ avxp -> 0x0524 }
            int r4 = r15 * 8
            r5 = 0
        L_0x0266:
            if (r5 < r3) goto L_0x04bf
            r4 = 0
            r1 = r1[r4]     // Catch:{ avxp -> 0x0524 }
            int r4 = r3 + r1
            int[] r5 = new int[r4]     // Catch:{ avxp -> 0x0524 }
            r6 = 0
        L_0x0270:
            if (r6 >= r3) goto L_0x027f
            r25 = r0
            byte r0 = r2[r6]     // Catch:{ avxp -> 0x0524 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            r5[r6] = r0     // Catch:{ avxp -> 0x0524 }
            int r6 = r6 + 1
            r0 = r25
            goto L_0x0270
        L_0x027f:
            r25 = r0
            avxu r0 = new avxu     // Catch:{ avxp -> 0x0524 }
            avxs r6 = defpackage.avxs.a     // Catch:{ avxp -> 0x0524 }
            r0.<init>(r6)     // Catch:{ avxp -> 0x0524 }
            if (r1 == 0) goto L_0x04b7
            int r4 = r4 - r1
            if (r4 <= 0) goto L_0x04af
            java.util.List r6 = r0.b     // Catch:{ avxp -> 0x0524 }
            int r6 = r6.size()     // Catch:{ avxp -> 0x0524 }
            r26 = r8
            java.lang.String r8 = "GenericGFPolys do not have same GenericGF field"
            if (r1 >= r6) goto L_0x02ab
            r35 = r3
            r30 = r7
            r29 = r9
            r33 = r10
            r31 = r12
            r34 = r13
            r41 = r14
            r32 = r15
            goto L_0x038d
        L_0x02ab:
            java.util.List r6 = r0.b     // Catch:{ avxp -> 0x0524 }
            int r29 = r6.size()     // Catch:{ avxp -> 0x0524 }
            r30 = r7
            r22 = -1
            int r7 = r29 + -1
            java.lang.Object r6 = r6.get(r7)     // Catch:{ avxp -> 0x0524 }
            avxt r6 = (defpackage.avxt) r6     // Catch:{ avxp -> 0x0524 }
            java.util.List r7 = r0.b     // Catch:{ avxp -> 0x0524 }
            int r7 = r7.size()     // Catch:{ avxp -> 0x0524 }
        L_0x02c3:
            if (r7 > r1) goto L_0x037f
            r29 = r9
            avxt r9 = new avxt     // Catch:{ avxp -> 0x0524 }
            r31 = r12
            avxs r12 = r0.a     // Catch:{ avxp -> 0x0524 }
            r33 = r10
            r32 = r15
            r15 = 2
            int[] r10 = new int[r15]     // Catch:{ avxp -> 0x0524 }
            r15 = 0
            r16 = 1
            r10[r15] = r16     // Catch:{ avxp -> 0x0524 }
            int r15 = r7 + -1
            r34 = r13
            int r13 = r12.f     // Catch:{ avxp -> 0x0524 }
            int r15 = r15 + r13
            r12.a()     // Catch:{ avxp -> 0x0524 }
            int[] r13 = r12.b     // Catch:{ avxp -> 0x0524 }
            r13 = r13[r15]     // Catch:{ avxp -> 0x0524 }
            r15 = 1
            r10[r15] = r13     // Catch:{ avxp -> 0x0524 }
            r9.<init>(r12, r10)     // Catch:{ avxp -> 0x0524 }
            avxs r10 = r6.a     // Catch:{ avxp -> 0x0524 }
            avxs r12 = r9.a     // Catch:{ avxp -> 0x0524 }
            boolean r10 = r10.equals(r12)     // Catch:{ avxp -> 0x0524 }
            if (r10 == 0) goto L_0x0379
            boolean r10 = r6.b()     // Catch:{ avxp -> 0x0524 }
            if (r10 == 0) goto L_0x0302
            r35 = r3
            r41 = r14
            goto L_0x035b
        L_0x0302:
            boolean r10 = r9.b()     // Catch:{ avxp -> 0x0524 }
            if (r10 != 0) goto L_0x0357
            int[] r10 = r6.b     // Catch:{ avxp -> 0x0524 }
            int r12 = r10.length     // Catch:{ avxp -> 0x0524 }
            int[] r9 = r9.b     // Catch:{ avxp -> 0x0524 }
            int r13 = r9.length     // Catch:{ avxp -> 0x0524 }
            int r15 = r12 + r13
            r22 = -1
            int r15 = r15 + -1
            int[] r15 = new int[r15]     // Catch:{ avxp -> 0x0524 }
            r35 = r3
            r3 = 0
        L_0x0319:
            if (r3 < r12) goto L_0x0326
            avxt r3 = new avxt     // Catch:{ avxp -> 0x0524 }
            avxs r6 = r6.a     // Catch:{ avxp -> 0x0524 }
            r3.<init>(r6, r15)     // Catch:{ avxp -> 0x0524 }
            r6 = r3
            r41 = r14
            goto L_0x0362
        L_0x0326:
            r36 = r12
            r12 = r10[r3]     // Catch:{ avxp -> 0x0524 }
            r37 = r10
            r10 = 0
        L_0x032d:
            if (r10 < r13) goto L_0x0336
            int r3 = r3 + 1
            r12 = r36
            r10 = r37
            goto L_0x0319
        L_0x0336:
            int r38 = r3 + r10
            r39 = r3
            r3 = r15[r38]     // Catch:{ avxp -> 0x0524 }
            r40 = r13
            avxs r13 = r6.a     // Catch:{ avxp -> 0x0524 }
            r41 = r14
            r14 = r9[r10]     // Catch:{ avxp -> 0x0524 }
            int r13 = r13.b(r12, r14)     // Catch:{ avxp -> 0x0524 }
            int r3 = defpackage.avxs.a(r3, r13)     // Catch:{ avxp -> 0x0524 }
            r15[r38] = r3     // Catch:{ avxp -> 0x0524 }
            int r10 = r10 + 1
            r3 = r39
            r13 = r40
            r14 = r41
            goto L_0x032d
        L_0x0357:
            r35 = r3
            r41 = r14
        L_0x035b:
            avxs r3 = r6.a     // Catch:{ avxp -> 0x0524 }
            avxt r3 = r3.b()     // Catch:{ avxp -> 0x0524 }
            r6 = r3
        L_0x0362:
            java.util.List r3 = r0.b     // Catch:{ avxp -> 0x0524 }
            r3.add(r6)     // Catch:{ avxp -> 0x0524 }
            int r7 = r7 + 1
            r9 = r29
            r12 = r31
            r15 = r32
            r10 = r33
            r13 = r34
            r3 = r35
            r14 = r41
            goto L_0x02c3
        L_0x0379:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ avxp -> 0x0524 }
            r0.<init>(r8)     // Catch:{ avxp -> 0x0524 }
            throw r0     // Catch:{ avxp -> 0x0524 }
        L_0x037f:
            r35 = r3
            r29 = r9
            r33 = r10
            r31 = r12
            r34 = r13
            r41 = r14
            r32 = r15
        L_0x038d:
            java.util.List r3 = r0.b     // Catch:{ avxp -> 0x0524 }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ avxp -> 0x0524 }
            avxt r3 = (defpackage.avxt) r3     // Catch:{ avxp -> 0x0524 }
            int[] r6 = new int[r4]     // Catch:{ avxp -> 0x0524 }
            r7 = 0
            java.lang.System.arraycopy(r5, r7, r6, r7, r4)     // Catch:{ avxp -> 0x0524 }
            avxt r7 = new avxt     // Catch:{ avxp -> 0x0524 }
            avxs r0 = r0.a     // Catch:{ avxp -> 0x0524 }
            r7.<init>(r0, r6)     // Catch:{ avxp -> 0x0524 }
            r0 = 1
            avxt r6 = r7.a(r1, r0)     // Catch:{ avxp -> 0x0524 }
            avxs r0 = r6.a     // Catch:{ avxp -> 0x0524 }
            avxs r7 = r3.a     // Catch:{ avxp -> 0x0524 }
            boolean r0 = r0.equals(r7)     // Catch:{ avxp -> 0x0524 }
            if (r0 == 0) goto L_0x04a9
            boolean r0 = r3.b()     // Catch:{ avxp -> 0x0524 }
            if (r0 != 0) goto L_0x04a1
            avxs r0 = r6.a     // Catch:{ avxp -> 0x0524 }
            avxt r0 = r0.b()     // Catch:{ avxp -> 0x0524 }
            int r7 = r3.a()     // Catch:{ avxp -> 0x0524 }
            int r7 = r3.a((int) r7)     // Catch:{ avxp -> 0x0524 }
            avxs r8 = r6.a     // Catch:{ avxp -> 0x0524 }
            r8.a()     // Catch:{ avxp -> 0x0524 }
            if (r7 == 0) goto L_0x049b
            int[] r9 = r8.b     // Catch:{ avxp -> 0x0524 }
            int r10 = r8.e     // Catch:{ avxp -> 0x0524 }
            int[] r8 = r8.c     // Catch:{ avxp -> 0x0524 }
            r7 = r8[r7]     // Catch:{ avxp -> 0x0524 }
            int r10 = r10 - r7
            r7 = -1
            int r10 = r10 + r7
            r7 = r9[r10]     // Catch:{ avxp -> 0x0524 }
            r8 = r6
        L_0x03da:
            int r9 = r8.a()     // Catch:{ avxp -> 0x0524 }
            int r10 = r3.a()     // Catch:{ avxp -> 0x0524 }
            if (r9 >= r10) goto L_0x03e5
        L_0x03e4:
            goto L_0x042d
        L_0x03e5:
            boolean r9 = r8.b()     // Catch:{ avxp -> 0x0524 }
            if (r9 != 0) goto L_0x03e4
            int r9 = r8.a()     // Catch:{ avxp -> 0x0524 }
            int r10 = r3.a()     // Catch:{ avxp -> 0x0524 }
            int r9 = r9 - r10
            avxs r10 = r6.a     // Catch:{ avxp -> 0x0524 }
            int r12 = r8.a()     // Catch:{ avxp -> 0x0524 }
            int r12 = r8.a((int) r12)     // Catch:{ avxp -> 0x0524 }
            int r10 = r10.b(r12, r7)     // Catch:{ avxp -> 0x0524 }
            avxt r12 = r3.a(r9, r10)     // Catch:{ avxp -> 0x0524 }
            avxs r13 = r6.a     // Catch:{ avxp -> 0x0524 }
            r13.a()     // Catch:{ avxp -> 0x0524 }
            if (r9 < 0) goto L_0x0427
            if (r10 == 0) goto L_0x041c
            int r9 = r9 + 1
            int[] r9 = new int[r9]     // Catch:{ avxp -> 0x0524 }
            r14 = 0
            r9[r14] = r10     // Catch:{ avxp -> 0x0524 }
            avxt r10 = new avxt     // Catch:{ avxp -> 0x0524 }
            r10.<init>(r13, r9)     // Catch:{ avxp -> 0x0524 }
            goto L_0x041e
        L_0x041c:
            avxt r10 = r13.d     // Catch:{ avxp -> 0x0524 }
        L_0x041e:
            avxt r0 = r0.a((defpackage.avxt) r10)     // Catch:{ avxp -> 0x0524 }
            avxt r8 = r8.a((defpackage.avxt) r12)     // Catch:{ avxp -> 0x0524 }
            goto L_0x03da
        L_0x0427:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ avxp -> 0x0524 }
            r0.<init>()     // Catch:{ avxp -> 0x0524 }
            throw r0     // Catch:{ avxp -> 0x0524 }
        L_0x042d:
            r3 = 2
            avxt[] r6 = new defpackage.avxt[r3]     // Catch:{ avxp -> 0x0524 }
            r3 = 0
            r6[r3] = r0     // Catch:{ avxp -> 0x0524 }
            r0 = 1
            r6[r0] = r8     // Catch:{ avxp -> 0x0524 }
            int[] r0 = r8.b     // Catch:{ avxp -> 0x0524 }
            int r3 = r0.length     // Catch:{ avxp -> 0x0524 }
            int r3 = r1 - r3
            r6 = 0
        L_0x043c:
            if (r6 >= r3) goto L_0x0446
            int r7 = r4 + r6
            r8 = 0
            r5[r7] = r8     // Catch:{ avxp -> 0x0524 }
            int r6 = r6 + 1
            goto L_0x043c
        L_0x0446:
            int r4 = r4 + r3
            int r3 = r0.length     // Catch:{ avxp -> 0x0524 }
            r6 = 0
            java.lang.System.arraycopy(r0, r6, r5, r4, r3)     // Catch:{ avxp -> 0x0524 }
            byte[] r0 = new byte[r1]     // Catch:{ avxp -> 0x0524 }
            r3 = 0
        L_0x044f:
            if (r3 < r1) goto L_0x0485
            avya r3 = new avya     // Catch:{ avxp -> 0x0524 }
            r3.<init>(r2, r0)     // Catch:{ avxp -> 0x0524 }
            r11.add(r3)     // Catch:{ avxp -> 0x0524 }
            r7 = r35
            r6 = r41
            int r14 = java.lang.Math.max(r6, r7)     // Catch:{ avxp -> 0x0524 }
            r8 = r34
            int r13 = java.lang.Math.max(r8, r1)     // Catch:{ avxp -> 0x0524 }
            r0 = 0
            r1 = r33[r0]     // Catch:{ avxp -> 0x0524 }
            int r15 = r32 + r1
            int r12 = r31 + 1
            r1 = r42
            r2 = r23
            r4 = r24
            r0 = r25
            r8 = r26
            r5 = r27
            r6 = r28
            r9 = r29
            r7 = r30
            r3 = 8
            r10 = -1
            goto L_0x021d
        L_0x0485:
            r8 = r34
            r7 = r35
            r6 = r41
            int r4 = r7 + r3
            r4 = r5[r4]     // Catch:{ avxp -> 0x0524 }
            byte r4 = (byte) r4     // Catch:{ avxp -> 0x0524 }
            r0[r3] = r4     // Catch:{ avxp -> 0x0524 }
            int r3 = r3 + 1
            r41 = r6
            r35 = r7
            r34 = r8
            goto L_0x044f
        L_0x049b:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException     // Catch:{ avxp -> 0x0524 }
            r0.<init>()     // Catch:{ avxp -> 0x0524 }
            throw r0     // Catch:{ avxp -> 0x0524 }
        L_0x04a1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ avxp -> 0x0524 }
            java.lang.String r1 = "Divide by 0"
            r0.<init>(r1)     // Catch:{ avxp -> 0x0524 }
            throw r0     // Catch:{ avxp -> 0x0524 }
        L_0x04a9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ avxp -> 0x0524 }
            r0.<init>(r8)     // Catch:{ avxp -> 0x0524 }
            throw r0     // Catch:{ avxp -> 0x0524 }
        L_0x04af:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ avxp -> 0x0524 }
            java.lang.String r1 = "No data bytes provided"
            r0.<init>(r1)     // Catch:{ avxp -> 0x0524 }
            throw r0     // Catch:{ avxp -> 0x0524 }
        L_0x04b7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ avxp -> 0x0524 }
            java.lang.String r1 = "No error correction bytes"
            r0.<init>(r1)     // Catch:{ avxp -> 0x0524 }
            throw r0     // Catch:{ avxp -> 0x0524 }
        L_0x04bf:
            r25 = r0
            r30 = r7
            r26 = r8
            r29 = r9
            r33 = r10
            r31 = r12
            r8 = r13
            r6 = r14
            r32 = r15
            r7 = r3
            r0 = 0
            r3 = 0
        L_0x04d2:
            r9 = 8
            if (r0 < r9) goto L_0x04ee
            byte r0 = (byte) r3     // Catch:{ avxp -> 0x0524 }
            r2[r5] = r0     // Catch:{ avxp -> 0x0524 }
            int r5 = r5 + 1
            r14 = r6
            r3 = r7
            r13 = r8
            r0 = r25
            r8 = r26
            r9 = r29
            r7 = r30
            r12 = r31
            r15 = r32
            r10 = r33
            goto L_0x0266
        L_0x04ee:
            r9 = r29
            boolean r10 = r9.a((int) r4)     // Catch:{ avxp -> 0x0524 }
            if (r10 != 0) goto L_0x04f7
            goto L_0x04fd
        L_0x04f7:
            int r10 = 7 - r0
            r12 = 1
            int r10 = r12 << r10
            r3 = r3 | r10
        L_0x04fd:
            int r4 = r4 + 1
            int r0 = r0 + 1
            r29 = r9
            goto L_0x04d2
        L_0x0504:
            avxp r0 = new avxp     // Catch:{ avxp -> 0x0524 }
            java.lang.String r1 = "Total bytes mismatch"
            r0.<init>((java.lang.String) r1)     // Catch:{ avxp -> 0x0524 }
            throw r0     // Catch:{ avxp -> 0x0524 }
        L_0x050c:
            avxp r0 = new avxp     // Catch:{ avxp -> 0x0524 }
            java.lang.String r1 = "RS blocks mismatch"
            r0.<init>((java.lang.String) r1)     // Catch:{ avxp -> 0x0524 }
            throw r0     // Catch:{ avxp -> 0x0524 }
        L_0x0514:
            avxp r0 = new avxp     // Catch:{ avxp -> 0x0524 }
            java.lang.String r1 = "EC bytes mismatch"
            r0.<init>((java.lang.String) r1)     // Catch:{ avxp -> 0x0524 }
            throw r0     // Catch:{ avxp -> 0x0524 }
        L_0x051c:
            avxp r0 = new avxp     // Catch:{ avxp -> 0x0524 }
            java.lang.String r1 = "Block ID too large"
            r0.<init>((java.lang.String) r1)     // Catch:{ avxp -> 0x0524 }
            throw r0     // Catch:{ avxp -> 0x0524 }
        L_0x0524:
            r0 = move-exception
            r6 = r42
            goto L_0x090c
        L_0x0529:
            r23 = r2
            r24 = r4
            r27 = r5
            r28 = r6
            r30 = r7
            r26 = r8
            r8 = r13
            r6 = r14
            r32 = r15
            if (r7 != r15) goto L_0x0883
            avxq r0 = new avxq     // Catch:{ avxp -> 0x0524 }
            r0.<init>()     // Catch:{ avxp -> 0x0524 }
            r1 = 0
        L_0x0541:
            if (r1 >= r6) goto L_0x0563
            java.util.Iterator r2 = r11.iterator()     // Catch:{ avxp -> 0x0524 }
        L_0x0547:
            boolean r3 = r2.hasNext()     // Catch:{ avxp -> 0x0524 }
            if (r3 == 0) goto L_0x0560
            java.lang.Object r3 = r2.next()     // Catch:{ avxp -> 0x0524 }
            avya r3 = (defpackage.avya) r3     // Catch:{ avxp -> 0x0524 }
            byte[] r3 = r3.a     // Catch:{ avxp -> 0x0524 }
            int r4 = r3.length     // Catch:{ avxp -> 0x0524 }
            if (r1 >= r4) goto L_0x0547
            byte r3 = r3[r1]     // Catch:{ avxp -> 0x0524 }
            r4 = 8
            r0.a(r3, r4)     // Catch:{ avxp -> 0x0524 }
            goto L_0x0547
        L_0x0560:
            int r1 = r1 + 1
            goto L_0x0541
        L_0x0563:
            r1 = 0
        L_0x0564:
            if (r1 >= r8) goto L_0x0586
            java.util.Iterator r2 = r11.iterator()     // Catch:{ avxp -> 0x0524 }
        L_0x056a:
            boolean r3 = r2.hasNext()     // Catch:{ avxp -> 0x0524 }
            if (r3 == 0) goto L_0x0583
            java.lang.Object r3 = r2.next()     // Catch:{ avxp -> 0x0524 }
            avya r3 = (defpackage.avya) r3     // Catch:{ avxp -> 0x0524 }
            byte[] r3 = r3.b     // Catch:{ avxp -> 0x0524 }
            int r4 = r3.length     // Catch:{ avxp -> 0x0524 }
            if (r1 >= r4) goto L_0x056a
            byte r3 = r3[r1]     // Catch:{ avxp -> 0x0524 }
            r4 = 8
            r0.a(r3, r4)     // Catch:{ avxp -> 0x0524 }
            goto L_0x056a
        L_0x0583:
            int r1 = r1 + 1
            goto L_0x0564
        L_0x0586:
            int r1 = r0.a()     // Catch:{ avxp -> 0x0524 }
            r2 = r26
            if (r2 != r1) goto L_0x0859
            avyf r1 = new avyf     // Catch:{ avxp -> 0x0524 }
            r1.<init>()     // Catch:{ avxp -> 0x0524 }
            r2 = r24
            r1.b = r2     // Catch:{ avxp -> 0x0524 }
            r6 = r28
            r1.a = r6     // Catch:{ avxp -> 0x0524 }
            r3 = r27
            r1.c = r3     // Catch:{ avxp -> 0x0524 }
            int r4 = r3.a     // Catch:{ avxp -> 0x0524 }
            r5 = 4
            int r4 = r4 * 4
            r5 = 17
            int r4 = r4 + r5
            avyb r5 = new avyb     // Catch:{ avxp -> 0x0524 }
            r5.<init>(r4, r4)     // Catch:{ avxp -> 0x0524 }
            r4 = 2147483647(0x7fffffff, float:NaN)
            r6 = -1
            r12 = 0
        L_0x05b1:
            r7 = 8
            if (r12 >= r7) goto L_0x076e
            defpackage.avye.a(r0, r2, r3, r12, r5)     // Catch:{ avxp -> 0x0524 }
            r8 = 1
            int r9 = defpackage.avyd.a(r5, r8)     // Catch:{ avxp -> 0x0524 }
            r8 = 0
            int r10 = defpackage.avyd.a(r5, r8)     // Catch:{ avxp -> 0x0524 }
            int r9 = r9 + r10
            byte[][] r8 = r5.a     // Catch:{ avxp -> 0x0524 }
            int r10 = r5.b     // Catch:{ avxp -> 0x0524 }
            int r11 = r5.c     // Catch:{ avxp -> 0x0524 }
            r13 = 0
            r14 = 0
        L_0x05cb:
            r15 = -1
            int r7 = r11 + -1
            if (r13 < r7) goto L_0x073f
            int r14 = r14 * 3
            int r9 = r9 + r14
            byte[][] r7 = r5.a     // Catch:{ avxp -> 0x0524 }
            int r8 = r5.b     // Catch:{ avxp -> 0x0524 }
            int r10 = r5.c     // Catch:{ avxp -> 0x0524 }
            r11 = 0
            r13 = 0
        L_0x05db:
            if (r11 < r10) goto L_0x0632
            int r9 = r9 + r13
            byte[][] r7 = r5.a     // Catch:{ avxp -> 0x0524 }
            int r8 = r5.b     // Catch:{ avxp -> 0x0524 }
            int r10 = r5.c     // Catch:{ avxp -> 0x0524 }
            r11 = 0
            r13 = 0
        L_0x05e6:
            if (r11 < r10) goto L_0x0613
            double r7 = (double) r13     // Catch:{ avxp -> 0x0524 }
            int r10 = r5.c     // Catch:{ avxp -> 0x0524 }
            int r11 = r5.b     // Catch:{ avxp -> 0x0524 }
            int r10 = r10 * r11
            double r10 = (double) r10
            java.lang.Double.isNaN(r7)
            java.lang.Double.isNaN(r10)
            double r7 = r7 / r10
            r10 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            double r7 = r7 + r10
            double r7 = java.lang.Math.abs(r7)     // Catch:{ avxp -> 0x0524 }
            r10 = 4626322717216342016(0x4034000000000000, double:20.0)
            double r7 = r7 * r10
            int r7 = (int) r7     // Catch:{ avxp -> 0x0524 }
            r15 = 10
            int r7 = r7 * 10
            int r9 = r9 + r7
            if (r9 < r4) goto L_0x060b
            goto L_0x060c
        L_0x060b:
            r6 = r12
        L_0x060c:
            if (r9 < r4) goto L_0x060f
            goto L_0x0610
        L_0x060f:
            r4 = r9
        L_0x0610:
            int r12 = r12 + 1
            goto L_0x05b1
        L_0x0613:
            r15 = 10
            r14 = r7[r11]     // Catch:{ avxp -> 0x0524 }
            r19 = r13
            r13 = 0
        L_0x061a:
            if (r13 < r8) goto L_0x0621
            int r11 = r11 + 1
            r13 = r19
            goto L_0x05e6
        L_0x0621:
            byte r15 = r14[r13]     // Catch:{ avxp -> 0x0524 }
            r20 = r4
            r4 = 1
            if (r15 == r4) goto L_0x0629
            goto L_0x062b
        L_0x0629:
            int r19 = r19 + 1
        L_0x062b:
            int r13 = r13 + 1
            r4 = r20
            r15 = 10
            goto L_0x061a
        L_0x0632:
            r20 = r4
            r4 = 0
        L_0x0635:
            if (r4 >= r8) goto L_0x0735
            int r14 = r4 + 6
            if (r14 >= r8) goto L_0x06a4
            r15 = r7[r11]     // Catch:{ avxp -> 0x0524 }
            r19 = r9
            byte r9 = r15[r4]     // Catch:{ avxp -> 0x0524 }
            r24 = r12
            r12 = 1
            if (r9 == r12) goto L_0x0647
        L_0x0646:
            goto L_0x06a8
        L_0x0647:
            int r9 = r4 + 1
            byte r9 = r15[r9]     // Catch:{ avxp -> 0x0524 }
            if (r9 != 0) goto L_0x0646
            int r9 = r4 + 2
            byte r9 = r15[r9]     // Catch:{ avxp -> 0x0524 }
            r12 = 1
            if (r9 != r12) goto L_0x0646
            int r9 = r4 + 3
            byte r9 = r15[r9]     // Catch:{ avxp -> 0x0524 }
            if (r9 != r12) goto L_0x0646
            int r9 = r4 + 4
            byte r9 = r15[r9]     // Catch:{ avxp -> 0x0524 }
            if (r9 != r12) goto L_0x0646
            int r9 = r4 + 5
            byte r9 = r15[r9]     // Catch:{ avxp -> 0x0524 }
            if (r9 != 0) goto L_0x0646
            byte r9 = r15[r14]     // Catch:{ avxp -> 0x0524 }
            r12 = 1
            if (r9 != r12) goto L_0x0646
            int r9 = r4 + 10
            if (r9 >= r8) goto L_0x0687
            int r12 = r4 + 7
            byte r12 = r15[r12]     // Catch:{ avxp -> 0x0524 }
            if (r12 != 0) goto L_0x0687
            int r12 = r4 + 8
            byte r12 = r15[r12]     // Catch:{ avxp -> 0x0524 }
            if (r12 != 0) goto L_0x0687
            int r12 = r4 + 9
            byte r12 = r15[r12]     // Catch:{ avxp -> 0x0524 }
            if (r12 == 0) goto L_0x0682
            goto L_0x0687
        L_0x0682:
            byte r9 = r15[r9]     // Catch:{ avxp -> 0x0524 }
            if (r9 != 0) goto L_0x0687
            goto L_0x06a1
        L_0x0687:
            int r9 = r4 + -4
            if (r9 < 0) goto L_0x0646
            int r12 = r4 + -1
            byte r12 = r15[r12]     // Catch:{ avxp -> 0x0524 }
            if (r12 != 0) goto L_0x0646
            int r12 = r4 + -2
            byte r12 = r15[r12]     // Catch:{ avxp -> 0x0524 }
            if (r12 != 0) goto L_0x0646
            int r12 = r4 + -3
            byte r12 = r15[r12]     // Catch:{ avxp -> 0x0524 }
            if (r12 != 0) goto L_0x0646
            byte r9 = r15[r9]     // Catch:{ avxp -> 0x0524 }
            if (r9 != 0) goto L_0x0646
        L_0x06a1:
            int r13 = r13 + 40
            goto L_0x06a8
        L_0x06a4:
            r19 = r9
            r24 = r12
        L_0x06a8:
            int r9 = r11 + 6
            if (r9 < r10) goto L_0x06ae
            goto L_0x072d
        L_0x06ae:
            r12 = r7[r11]     // Catch:{ avxp -> 0x0524 }
            byte r12 = r12[r4]     // Catch:{ avxp -> 0x0524 }
            r14 = 1
            if (r12 != r14) goto L_0x072d
            int r12 = r11 + 1
            r12 = r7[r12]     // Catch:{ avxp -> 0x0524 }
            byte r12 = r12[r4]     // Catch:{ avxp -> 0x0524 }
            if (r12 != 0) goto L_0x072d
            int r12 = r11 + 2
            r12 = r7[r12]     // Catch:{ avxp -> 0x0524 }
            byte r12 = r12[r4]     // Catch:{ avxp -> 0x0524 }
            r14 = 1
            if (r12 != r14) goto L_0x072d
            int r12 = r11 + 3
            r12 = r7[r12]     // Catch:{ avxp -> 0x0524 }
            byte r12 = r12[r4]     // Catch:{ avxp -> 0x0524 }
            if (r12 != r14) goto L_0x072d
            int r12 = r11 + 4
            r12 = r7[r12]     // Catch:{ avxp -> 0x0524 }
            byte r12 = r12[r4]     // Catch:{ avxp -> 0x0524 }
            if (r12 != r14) goto L_0x072d
            int r12 = r11 + 5
            r12 = r7[r12]     // Catch:{ avxp -> 0x0524 }
            byte r12 = r12[r4]     // Catch:{ avxp -> 0x0524 }
            if (r12 != 0) goto L_0x072d
            r9 = r7[r9]     // Catch:{ avxp -> 0x0524 }
            byte r9 = r9[r4]     // Catch:{ avxp -> 0x0524 }
            r12 = 1
            if (r9 != r12) goto L_0x072d
            int r9 = r11 + 10
            if (r9 >= r10) goto L_0x0708
            int r12 = r11 + 7
            r12 = r7[r12]     // Catch:{ avxp -> 0x0524 }
            byte r12 = r12[r4]     // Catch:{ avxp -> 0x0524 }
            if (r12 != 0) goto L_0x0708
            int r12 = r11 + 8
            r12 = r7[r12]     // Catch:{ avxp -> 0x0524 }
            byte r12 = r12[r4]     // Catch:{ avxp -> 0x0524 }
            if (r12 != 0) goto L_0x0708
            int r12 = r11 + 9
            r12 = r7[r12]     // Catch:{ avxp -> 0x0524 }
            byte r12 = r12[r4]     // Catch:{ avxp -> 0x0524 }
            if (r12 != 0) goto L_0x0708
            r9 = r7[r9]     // Catch:{ avxp -> 0x0524 }
            byte r9 = r9[r4]     // Catch:{ avxp -> 0x0524 }
            if (r9 != 0) goto L_0x0708
        L_0x0707:
            goto L_0x072b
        L_0x0708:
            int r9 = r11 + -4
            if (r9 < 0) goto L_0x072d
            int r12 = r11 + -1
            r12 = r7[r12]     // Catch:{ avxp -> 0x0524 }
            byte r12 = r12[r4]     // Catch:{ avxp -> 0x0524 }
            if (r12 != 0) goto L_0x072d
            int r12 = r11 + -2
            r12 = r7[r12]     // Catch:{ avxp -> 0x0524 }
            byte r12 = r12[r4]     // Catch:{ avxp -> 0x0524 }
            if (r12 != 0) goto L_0x072d
            int r12 = r11 + -3
            r12 = r7[r12]     // Catch:{ avxp -> 0x0524 }
            byte r12 = r12[r4]     // Catch:{ avxp -> 0x0524 }
            if (r12 != 0) goto L_0x072d
            r9 = r7[r9]     // Catch:{ avxp -> 0x0524 }
            byte r9 = r9[r4]     // Catch:{ avxp -> 0x0524 }
            if (r9 != 0) goto L_0x072d
            goto L_0x0707
        L_0x072b:
            int r13 = r13 + 40
        L_0x072d:
            int r4 = r4 + 1
            r9 = r19
            r12 = r24
            goto L_0x0635
        L_0x0735:
            r19 = r9
            r24 = r12
            int r11 = r11 + 1
            r4 = r20
            goto L_0x05db
        L_0x073f:
            r20 = r4
            r24 = r12
            r12 = 0
        L_0x0744:
            r4 = -1
            int r7 = r10 + -1
            if (r12 >= r7) goto L_0x0764
            r4 = r8[r13]     // Catch:{ avxp -> 0x0524 }
            byte r7 = r4[r12]     // Catch:{ avxp -> 0x0524 }
            int r15 = r12 + 1
            byte r4 = r4[r15]     // Catch:{ avxp -> 0x0524 }
            if (r7 != r4) goto L_0x0762
            int r4 = r13 + 1
            r4 = r8[r4]     // Catch:{ avxp -> 0x0524 }
            byte r12 = r4[r12]     // Catch:{ avxp -> 0x0524 }
            if (r7 == r12) goto L_0x075c
            goto L_0x0762
        L_0x075c:
            byte r4 = r4[r15]     // Catch:{ avxp -> 0x0524 }
            if (r7 != r4) goto L_0x0762
            int r14 = r14 + 1
        L_0x0762:
            r12 = r15
            goto L_0x0744
        L_0x0764:
            int r13 = r13 + 1
            r4 = r20
            r12 = r24
            r7 = 8
            goto L_0x05cb
        L_0x076e:
            r1.d = r6     // Catch:{ avxp -> 0x0524 }
            defpackage.avye.a(r0, r2, r3, r6, r5)     // Catch:{ avxp -> 0x0524 }
            r1.e = r5     // Catch:{ avxp -> 0x0524 }
            avyb r0 = r1.e     // Catch:{ avxp -> 0x0524 }
            if (r0 == 0) goto L_0x0851
            int r1 = r0.b     // Catch:{ avxp -> 0x0524 }
            int r2 = r0.c     // Catch:{ avxp -> 0x0524 }
            int r3 = r1 + 8
            int r4 = r2 + 8
            r5 = r23
            int r6 = java.lang.Math.max(r5, r3)     // Catch:{ avxp -> 0x0524 }
            int r5 = java.lang.Math.max(r5, r4)     // Catch:{ avxp -> 0x0524 }
            int r3 = r6 / r3
            int r4 = r5 / r4
            int r3 = java.lang.Math.min(r3, r4)     // Catch:{ avxp -> 0x0524 }
            int r4 = r1 * r3
            int r4 = r6 - r4
            r7 = 2
            int r4 = r4 / r7
            int r8 = r2 * r3
            int r8 = r5 - r8
            int r8 = r8 / r7
            avxr r7 = new avxr     // Catch:{ avxp -> 0x0524 }
            r7.<init>(r6, r5)     // Catch:{ avxp -> 0x0524 }
            r12 = 0
        L_0x07a4:
            if (r12 < r2) goto L_0x07de
            int r0 = r7.b     // Catch:{ avxp -> 0x0524 }
            int r1 = r7.a     // Catch:{ avxp -> 0x0524 }
            int r2 = r1 * r0
            int[] r2 = new int[r2]     // Catch:{ avxp -> 0x0524 }
            r12 = 0
        L_0x07af:
            if (r12 >= r0) goto L_0x07ca
            int r3 = r12 * r1
            r4 = 0
        L_0x07b4:
            if (r4 < r1) goto L_0x07b9
            int r12 = r12 + 1
            goto L_0x07af
        L_0x07b9:
            int r5 = r3 + r4
            boolean r6 = r7.a(r4, r12)     // Catch:{ avxp -> 0x0524 }
            if (r6 != 0) goto L_0x07c3
            r6 = -1
            goto L_0x07c5
        L_0x07c3:
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L_0x07c5:
            r2[r5] = r6     // Catch:{ avxp -> 0x0524 }
            int r4 = r4 + 1
            goto L_0x07b4
        L_0x07ca:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ avxp -> 0x0524 }
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r1, r0, r3)     // Catch:{ avxp -> 0x0524 }
            r6 = r42
            android.widget.ImageView r1 = r6.d     // Catch:{ avxp -> 0x0908 }
            r1.setImageBitmap(r0)     // Catch:{ avxp -> 0x0908 }
            android.widget.ImageView r0 = r6.d     // Catch:{ avxp -> 0x0908 }
            r5 = 0
            r0.setVisibility(r5)     // Catch:{ avxp -> 0x0908 }
            return
        L_0x07de:
            r6 = r42
            r5 = 0
            r10 = r4
            r9 = 0
        L_0x07e3:
            if (r9 < r1) goto L_0x07e9
            int r12 = r12 + 1
            int r8 = r8 + r3
            goto L_0x07a4
        L_0x07e9:
            byte r11 = r0.a(r9, r12)     // Catch:{ avxp -> 0x0908 }
            r13 = 1
            if (r11 == r13) goto L_0x07f5
            r18 = r0
            r17 = 1
            goto L_0x0832
        L_0x07f5:
            if (r8 < 0) goto L_0x0849
            if (r10 < 0) goto L_0x0849
            if (r3 <= 0) goto L_0x0841
            int r11 = r10 + r3
            int r13 = r8 + r3
            int r14 = r7.b     // Catch:{ avxp -> 0x0908 }
            if (r13 > r14) goto L_0x0839
            int r14 = r7.a     // Catch:{ avxp -> 0x0908 }
            if (r11 > r14) goto L_0x0839
            r14 = r8
        L_0x0808:
            if (r14 >= r13) goto L_0x082e
            int r15 = r7.c     // Catch:{ avxp -> 0x0908 }
            int r15 = r15 * r14
            r5 = r10
        L_0x080f:
            if (r5 < r11) goto L_0x0815
            int r14 = r14 + 1
            r5 = 0
            goto L_0x0808
        L_0x0815:
            r18 = r0
            int[] r0 = r7.d     // Catch:{ avxp -> 0x0908 }
            int r19 = r5 >> 5
            int r19 = r15 + r19
            r20 = r0[r19]     // Catch:{ avxp -> 0x0908 }
            r21 = r5 & 31
            r17 = 1
            int r21 = r17 << r21
            r20 = r20 | r21
            r0[r19] = r20     // Catch:{ avxp -> 0x0908 }
            int r5 = r5 + 1
            r0 = r18
            goto L_0x080f
        L_0x082e:
            r18 = r0
            r17 = 1
        L_0x0832:
            int r9 = r9 + 1
            int r10 = r10 + r3
            r0 = r18
            r5 = 0
            goto L_0x07e3
        L_0x0839:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ avxp -> 0x0908 }
            java.lang.String r1 = "The region must fit inside the matrix"
            r0.<init>(r1)     // Catch:{ avxp -> 0x0908 }
            throw r0     // Catch:{ avxp -> 0x0908 }
        L_0x0841:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ avxp -> 0x0908 }
            java.lang.String r1 = "Height and width must be at least 1"
            r0.<init>(r1)     // Catch:{ avxp -> 0x0908 }
            throw r0     // Catch:{ avxp -> 0x0908 }
        L_0x0849:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ avxp -> 0x0908 }
            java.lang.String r1 = "Left and top must be nonnegative"
            r0.<init>(r1)     // Catch:{ avxp -> 0x0908 }
            throw r0     // Catch:{ avxp -> 0x0908 }
        L_0x0851:
            r6 = r42
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ avxp -> 0x0908 }
            r0.<init>()     // Catch:{ avxp -> 0x0908 }
            throw r0     // Catch:{ avxp -> 0x0908 }
        L_0x0859:
            r6 = r42
            avxp r1 = new avxp     // Catch:{ avxp -> 0x0908 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ avxp -> 0x0908 }
            r3.<init>()     // Catch:{ avxp -> 0x0908 }
            java.lang.String r4 = "Interleaving error: "
            r3.append(r4)     // Catch:{ avxp -> 0x0908 }
            r3.append(r2)     // Catch:{ avxp -> 0x0908 }
            java.lang.String r2 = " and "
            r3.append(r2)     // Catch:{ avxp -> 0x0908 }
            int r0 = r0.a()     // Catch:{ avxp -> 0x0908 }
            r3.append(r0)     // Catch:{ avxp -> 0x0908 }
            java.lang.String r0 = " differ."
            r3.append(r0)     // Catch:{ avxp -> 0x0908 }
            java.lang.String r0 = r3.toString()     // Catch:{ avxp -> 0x0908 }
            r1.<init>((java.lang.String) r0)     // Catch:{ avxp -> 0x0908 }
            throw r1     // Catch:{ avxp -> 0x0908 }
        L_0x0883:
            r6 = r42
            avxp r0 = new avxp     // Catch:{ avxp -> 0x0908 }
            java.lang.String r1 = "Data bytes does not match offset"
            r0.<init>((java.lang.String) r1)     // Catch:{ avxp -> 0x0908 }
            throw r0     // Catch:{ avxp -> 0x0908 }
        L_0x088d:
            r6 = r1
            avxp r0 = new avxp     // Catch:{ avxp -> 0x0908 }
            java.lang.String r1 = "Number of bits and data bytes does not match"
            r0.<init>((java.lang.String) r1)     // Catch:{ avxp -> 0x0908 }
            throw r0     // Catch:{ avxp -> 0x0908 }
        L_0x0896:
            r6 = r1
            avxp r0 = new avxp     // Catch:{ avxp -> 0x0908 }
            java.lang.String r1 = "Bits size does not equal capacity"
            r0.<init>((java.lang.String) r1)     // Catch:{ avxp -> 0x0908 }
            throw r0     // Catch:{ avxp -> 0x0908 }
        L_0x089f:
            r6 = r1
            avxp r0 = new avxp     // Catch:{ avxp -> 0x0908 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ avxp -> 0x0908 }
            r1.<init>()     // Catch:{ avxp -> 0x0908 }
            java.lang.String r2 = "data bits cannot fit in the QR Code"
            r1.append(r2)     // Catch:{ avxp -> 0x0908 }
            int r2 = r9.b     // Catch:{ avxp -> 0x0908 }
            r1.append(r2)     // Catch:{ avxp -> 0x0908 }
            java.lang.String r2 = " > "
            r1.append(r2)     // Catch:{ avxp -> 0x0908 }
            r1.append(r8)     // Catch:{ avxp -> 0x0908 }
            java.lang.String r1 = r1.toString()     // Catch:{ avxp -> 0x0908 }
            r0.<init>((java.lang.String) r1)     // Catch:{ avxp -> 0x0908 }
            throw r0     // Catch:{ avxp -> 0x0908 }
        L_0x08c1:
            r6 = r1
            avxp r1 = new avxp     // Catch:{ avxp -> 0x0908 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ avxp -> 0x0908 }
            r2.<init>()     // Catch:{ avxp -> 0x0908 }
            r2.append(r0)     // Catch:{ avxp -> 0x0908 }
            java.lang.String r0 = " is bigger than "
            r2.append(r0)     // Catch:{ avxp -> 0x0908 }
            r0 = -1
            int r12 = r12 + r0
            r2.append(r12)     // Catch:{ avxp -> 0x0908 }
            java.lang.String r0 = r2.toString()     // Catch:{ avxp -> 0x0908 }
            r1.<init>((java.lang.String) r0)     // Catch:{ avxp -> 0x0908 }
            throw r1     // Catch:{ avxp -> 0x0908 }
        L_0x08de:
            r6 = r1
            r5 = r2
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ avxp -> 0x0908 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ avxp -> 0x0908 }
            r1.<init>()     // Catch:{ avxp -> 0x0908 }
            java.lang.String r2 = "Requested dimensions are too small: "
            r1.append(r2)     // Catch:{ avxp -> 0x0908 }
            r1.append(r5)     // Catch:{ avxp -> 0x0908 }
            r2 = 120(0x78, float:1.68E-43)
            r1.append(r2)     // Catch:{ avxp -> 0x0908 }
            r1.append(r5)     // Catch:{ avxp -> 0x0908 }
            java.lang.String r1 = r1.toString()     // Catch:{ avxp -> 0x0908 }
            r0.<init>(r1)     // Catch:{ avxp -> 0x0908 }
            throw r0     // Catch:{ avxp -> 0x0908 }
        L_0x08ff:
            r6 = r1
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ avxp -> 0x0908 }
            java.lang.String r1 = "Found empty contents"
            r0.<init>(r1)     // Catch:{ avxp -> 0x0908 }
            throw r0     // Catch:{ avxp -> 0x0908 }
        L_0x0908:
            r0 = move-exception
            goto L_0x090c
        L_0x090a:
            r0 = move-exception
            r6 = r1
        L_0x090c:
            iwd r1 = c
            r1.a((java.lang.Throwable) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acmx.a(java.lang.String):void");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = Bundle.EMPTY;
        }
        this.a = arguments.getString("deeplinkUrl");
        this.f = getResources().getDimensionPixelSize(R.dimen.smartdevice_qr_size);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.e = (GlifLayout) layoutInflater.inflate(R.layout.smartdevice_qr_code_fragment, viewGroup, false);
        if (azmd.b()) {
            alhf alhf = new alhf(this.e.getContext());
            alhf.a(R.string.smartdevice_action_try_another_way);
            alhf.c = 7;
            alhf.d = 2132018061;
            ((alhe) this.e.a(alhe.class)).b(alhf.a());
        }
        this.e.b(true);
        this.d = (ImageView) this.e.findViewById(R.id.qrCodeView);
        this.e.c(R.string.smartdevice_qrcode_scan_qr);
        if (!TextUtils.isEmpty(this.a)) {
            a(this.a);
        }
        return this.e;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("deeplinkUrl", this.a);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("deeplinkUrl");
            this.a = string;
            if (!TextUtils.isEmpty(string)) {
                a(this.a);
            }
        }
        if (azmd.b()) {
            alhg alhg = ((alhe) this.e.a(alhe.class)).d;
            View.OnClickListener onClickListener = this.b;
            if (onClickListener != null) {
                alhg.f = onClickListener;
                return;
            }
            throw new IllegalStateException("Listener is null");
        }
    }
}
