package defpackage;

import java.util.Collections;
import java.util.Comparator;

/* renamed from: akng  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akng implements akmb {
    private static final Comparator a = Collections.reverseOrder(new akne());
    private final akmb b;
    private final akmb c;
    private final boolean d;
    private final int e;

    public akng(akmb akmb, akmb akmb2, boolean z, int i) {
        this.b = akmb;
        this.c = akmb2;
        this.d = z;
        this.e = i;
    }

    public final String a() {
        return String.format("TwoPass[%s,%s]", new Object[]{this.b.a(), this.c.a()});
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0120 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float[] a(defpackage.akmd r12, java.util.List r13) {
        /*
            r11 = this;
            int r0 = r13.size()
            r1 = 0
            if (r0 == 0) goto L_0x0121
            boolean r2 = r11.d
            if (r2 == 0) goto L_0x000c
            goto L_0x0017
        L_0x000c:
            int r2 = r11.e
            if (r0 > r2) goto L_0x0017
            akmb r0 = r11.c
            float[] r12 = r0.a(r12, r13)
            return r12
        L_0x0017:
            int r2 = r11.e
            int r2 = java.lang.Math.min(r2, r0)
            int r3 = r13.size()
            boolean[] r4 = new boolean[r3]
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            akmb r6 = r11.b
            float[] r6 = r6.a(r12, r13)
            java.util.PriorityQueue r7 = new java.util.PriorityQueue
            int r8 = r13.size()
            java.util.Comparator r9 = a
            r7.<init>(r8, r9)
            int r8 = r6.length
            int r9 = r13.size()
            if (r8 == r9) goto L_0x0059
            akof r2 = defpackage.aklz.a()
            java.lang.String r3 = "Invalid first pass inference helper result."
            r2.d(r3)
            aknf r2 = new aknf
            int r3 = r13.size()
            int r13 = r13.size()
            float[] r13 = new float[r13]
            r2.<init>(r4, r5, r3, r13)
            goto L_0x00b3
        L_0x0059:
            r8 = 0
        L_0x005a:
            int r9 = r13.size()
            if (r8 >= r9) goto L_0x006d
            aknd r9 = new aknd
            r10 = r6[r8]
            r9.<init>(r10, r8)
            r7.add(r9)
            int r8 = r8 + 1
            goto L_0x005a
        L_0x006d:
            r8 = 0
        L_0x006e:
            if (r8 >= r2) goto L_0x0093
            java.lang.Object r9 = r7.poll()
            aknd r9 = (defpackage.aknd) r9
            int r9 = r9.b
            if (r9 >= r3) goto L_0x0080
            r10 = 1
            r4[r9] = r10
            int r8 = r8 + 1
            goto L_0x006e
        L_0x0080:
            akof r2 = defpackage.aklz.a()
            java.lang.String r3 = "Invalid first pass inference helper candidate index."
            r2.d(r3)
            aknf r2 = new aknf
            int r13 = r13.size()
            r2.<init>(r4, r5, r13, r6)
            goto L_0x00b3
        L_0x0093:
            r2 = 0
        L_0x0094:
            int r3 = r13.size()
            if (r2 >= r3) goto L_0x00aa
            boolean r3 = r4[r2]
            if (r3 == 0) goto L_0x00a7
            java.lang.Object r3 = r13.get(r2)
            aklu r3 = (defpackage.aklu) r3
            r5.add(r3)
        L_0x00a7:
            int r2 = r2 + 1
            goto L_0x0094
        L_0x00aa:
            aknf r2 = new aknf
            int r13 = r13.size()
            r2.<init>(r4, r5, r13, r6)
        L_0x00b3:
            int r13 = r2.c
            boolean[] r3 = r2.a
            int r3 = r3.length
            if (r13 == r3) goto L_0x00bb
            goto L_0x0104
        L_0x00bb:
            float[] r3 = r2.d
            int r4 = r3.length
            if (r13 != r4) goto L_0x0104
            akmb r13 = r11.c
            java.util.List r4 = r2.b
            float[] r12 = r13.a(r12, r4)
            r13 = 0
        L_0x00c9:
            int r4 = r2.c
            if (r1 >= r4) goto L_0x0103
            boolean[] r4 = r2.a
            boolean r4 = r4[r1]
            if (r4 == 0) goto L_0x00f7
            int r4 = r12.length
            if (r13 < r4) goto L_0x00e0
            akof r12 = defpackage.aklz.a()
            java.lang.String r13 = "Second pass and first pass scoring results don't match."
            r12.d(r13)
            goto L_0x0111
        L_0x00e0:
            boolean r4 = r11.d
            if (r4 == 0) goto L_0x00f0
            r4 = r3[r1]
            r5 = r12[r13]
            float r5 = defpackage.akoy.a(r5)
            float r4 = r4 + r5
            r3[r1] = r4
            goto L_0x00f4
        L_0x00f0:
            r4 = r12[r13]
            r3[r1] = r4
        L_0x00f4:
            int r13 = r13 + 1
            goto L_0x0100
        L_0x00f7:
            boolean r4 = r11.d
            if (r4 != 0) goto L_0x0100
            r4 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r3[r1] = r4
        L_0x0100:
            int r1 = r1 + 1
            goto L_0x00c9
        L_0x0103:
            goto L_0x0111
        L_0x0104:
            akof r12 = defpackage.aklz.a()
            java.lang.String r13 = "Invalid first pass scoring result."
            r12.d(r13)
            int r12 = r2.c
            float[] r3 = new float[r12]
        L_0x0111:
            int r12 = r3.length
            if (r12 == r0) goto L_0x0120
            akof r12 = defpackage.aklz.a()
            java.lang.String r13 = "Invalid number of 2-pass scoring output"
            r12.d(r13)
            float[] r12 = new float[r0]
            return r12
        L_0x0120:
            return r3
        L_0x0121:
            akof r12 = defpackage.aklz.a()
            java.lang.String r13 = "No candidates to score"
            r12.b(r13)
            float[] r12 = new float[r1]
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akng.a(akmd, java.util.List):float[]");
    }
}
