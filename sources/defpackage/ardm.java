package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ardm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ardm {
    private static final double[][] a;
    private static final double[] b = new double[ardv.b.length];

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ee, code lost:
        r5 = r5 + 1;
        r0 = 0;
     */
    static {
        /*
            int[] r0 = defpackage.ardv.b
            int r0 = r0.length
            r1 = 2
            int[] r2 = new int[r1]
            r3 = 1
            r2[r3] = r0
            r0 = 0
            r4 = 23
            r2[r0] = r4
            java.lang.Class<double> r4 = double.class
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r4, r2)
            double[][] r2 = (double[][]) r2
            a = r2
            int[] r2 = defpackage.ardv.b
            int r2 = r2.length
            double[] r2 = new double[r2]
            b = r2
            r2 = 6
            double[][] r4 = new double[r2][]
            double[] r5 = new double[r2]
            r5 = {4666129985944158208, 4644724143818801152, 4633641066610819072, 4644143601679335424, 4629137466983448576, 4641100153493651456} // fill-array
            r4[r0] = r5
            double[] r5 = new double[r2]
            r5 = {4646166703074443264, 4667546156920733696, 4650863816748302336, 4637722453773123584, 4616189618054758400, 4647644446702174208} // fill-array
            r4[r3] = r5
            double[] r5 = new double[r2]
            r5 = {4634485491540951040, 4646113926516310016, 4665749005165133824, 4633500329122463744, 4607182418800017408, 4648515259911372800} // fill-array
            r4[r1] = r5
            double[] r5 = new double[r2]
            r5 = {4643721389214269440, 4639833516098453504, 4639763147354275840, 4667253686827745280, 4632937379169042432, 4644389892283957248} // fill-array
            r6 = 3
            r4[r6] = r5
            double[] r5 = new double[r2]
            r5 = {4636737291354636288, 4621819117588971520, 4607182418800017408, 4637581716284768256, 4665562088188411904, 4621819117588971520} // fill-array
            r7 = 4
            r4[r7] = r5
            double[] r5 = new double[r2]
            r5 = {4649333296562438144, 4650758263632035840, 4645990781213999104, 4647362971725463552, 4613937818241073152, 4665205846421012480} // fill-array
            r8 = 5
            r4[r8] = r5
            r5 = 0
        L_0x0050:
            r9 = 8
            r10 = 7
            if (r5 < r2) goto L_0x00b6
            r4 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            a((int) r3, (int) r0, (double) r4)
            r11 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            a((int) r3, (int) r3, (double) r11)
            a((int) r3, (int) r10, (double) r11)
            a((int) r3, (int) r9, (double) r11)
            r13 = 4605831338911806259(0x3feb333333333333, double:0.85)
            a((int) r3, (int) r6, (double) r13)
            a((int) r3, (int) r7, (double) r11)
            a((int) r3, (int) r8, (double) r11)
            a((int) r6, (int) r0, (double) r11)
            a((int) r6, (int) r3, (double) r4)
            a((int) r6, (int) r10, (double) r11)
            a((int) r6, (int) r9, (double) r11)
            r3 = 4605741266919258849(0x3feae147ae147ae1, double:0.84)
            a((int) r6, (int) r6, (double) r3)
            a((int) r6, (int) r7, (double) r11)
            a((int) r6, (int) r8, (double) r11)
            double[] r0 = b
            r3 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            java.util.Arrays.fill(r0, r3)
            double[] r0 = b
            r3 = 4624008373662831660(0x402bc71de69ad42c, double:13.8889)
            r0[r1] = r3
            r0[r6] = r3
            r3 = 4622443992037269176(0x40263851eb851eb8, double:11.11)
            r0[r7] = r3
            r0[r8] = r3
            r0[r2] = r3
            r0[r10] = r3
            return
        L_0x00b6:
            if (r5 == 0) goto L_0x00ca
            if (r5 == r3) goto L_0x00c8
            if (r5 == r1) goto L_0x00c6
            if (r5 == r6) goto L_0x00c4
            if (r5 == r7) goto L_0x00c2
            r11 = 7
            goto L_0x00cb
        L_0x00c2:
            r11 = 5
            goto L_0x00cb
        L_0x00c4:
            r11 = 4
            goto L_0x00cb
        L_0x00c6:
            r11 = 6
            goto L_0x00cb
        L_0x00c8:
            r11 = 0
            goto L_0x00cb
        L_0x00ca:
            r11 = 2
        L_0x00cb:
            r12 = r4[r5]
            int r12 = r12.length
            r13 = 0
            r15 = 0
        L_0x00d1:
            if (r15 >= r12) goto L_0x00dc
            r16 = r4[r5]
            r17 = r16[r15]
            double r13 = r13 + r17
            int r15 = r15 + 1
            goto L_0x00d1
        L_0x00dc:
            r9 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r16 = r13 * r9
            double r13 = r13 + r16
            a((int) r11, (int) r8, (double) r9)
            r9 = 0
        L_0x00e9:
            r10 = r4[r5]
            int r0 = r10.length
            if (r9 < r0) goto L_0x00f3
            int r5 = r5 + 1
            r0 = 0
            goto L_0x0050
        L_0x00f3:
            if (r9 == 0) goto L_0x0110
            if (r9 == r3) goto L_0x010e
            if (r9 == r1) goto L_0x010c
            if (r9 == r6) goto L_0x010a
            if (r9 == r7) goto L_0x0107
            if (r9 != r8) goto L_0x0101
            r0 = 4
            goto L_0x0111
        L_0x0101:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L_0x0107:
            r0 = 8
            goto L_0x0111
        L_0x010a:
            r0 = 7
            goto L_0x0111
        L_0x010c:
            r0 = 3
            goto L_0x0111
        L_0x010e:
            r0 = 0
            goto L_0x0111
        L_0x0110:
            r0 = 1
        L_0x0111:
            r17 = r10[r9]
            double r1 = r17 / r13
            a((int) r11, (int) r0, (double) r1)
            int r9 = r9 + 1
            r0 = 0
            r1 = 2
            r2 = 6
            goto L_0x00e9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ardm.<clinit>():void");
    }

    public static double a(int i, ards ards, List list) {
        double d;
        if (ards.b()) {
            double d2 = ards.b;
            if (b[i] < Double.MIN_VALUE) {
                return 1.0E-8d;
            }
        }
        int size = list.size();
        double d3 = 0.0d;
        for (int i2 = 0; i2 < size; i2++) {
            ardq ardq = (ardq) list.get(i2);
            double d4 = a[ardq.a][i];
            double d5 = (double) ardq.b;
            Double.isNaN(d5);
            d3 += d4 * d5;
        }
        double[] dArr = ards.c;
        double d6 = 1.0d;
        if (dArr.length != 0) {
            d = dArr[i];
        } else {
            d = 1.0d;
        }
        double d7 = d3 * d;
        double[] dArr2 = ards.d;
        if (dArr2.length != 0) {
            d6 = dArr2[i];
        }
        return (d7 * d6) / 100.0d;
    }

    public static List a(List list) {
        boolean z;
        Iterator it = list.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                z = false;
                break;
            }
            int i = ((ardq) it.next()).a;
            if (i != 7) {
                if (i == 8) {
                    break;
                }
            } else {
                break;
            }
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ardq ardq = (ardq) it2.next();
            int i2 = ardq.a;
            if (i2 != 2) {
                if (i2 == 6) {
                    arrayList.add(new ardq(5, ardq.b));
                } else if (i2 <= 8) {
                    arrayList.add(ardq);
                } else if (!(i2 == 16 || i2 == 17)) {
                    arrayList.add(new ardq(4, ardq.b));
                }
            } else if (!z) {
                arrayList.add(new ardq(7, ardq.b));
            }
        }
        return arrayList;
    }

    private static void a(int i, int i2, double d) {
        a[i2][i] = d;
    }
}
