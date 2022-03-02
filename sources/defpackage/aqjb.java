package defpackage;

/* renamed from: aqjb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aqjb implements Comparable {
    public final int c;
    public final double d;
    public final double[] e;

    public aqjb(double d2) {
        this(5, d2);
    }

    public static aqja b(int i) {
        return new aqja(i);
    }

    public final double a(int i) {
        boolean z = true;
        ativ.a(this.e != null);
        if (i >= this.e.length) {
            z = false;
        }
        ativ.a(z);
        return this.e[i];
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        aqjb aqjb = (aqjb) obj;
        int compare = Double.compare(this.d, aqjb.d);
        return compare == 0 ? Integer.compare(this.c, aqjb.c) : compare;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public aqjb(double r3, double r5) {
        /*
            r2 = this;
            r0 = 1
            aqja r0 = b(r0)
            r1 = 0
            r0.a(r1, r5)
            r5 = 7
            r2.<init>((int) r5, (double) r3, (defpackage.aqja) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqjb.<init>(double, double):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public aqjb(double r3, double r5, double r7) {
        /*
            r2 = this;
            r0 = 2
            aqja r0 = b(r0)
            r1 = 0
            r0.a(r1, r5)
            r5 = 1
            r0.a(r5, r7)
            r5 = 6
            r2.<init>((int) r5, (double) r3, (defpackage.aqja) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqjb.<init>(double, double, double):void");
    }

    public aqjb(int i, double d2) {
        this.c = i;
        this.d = d2;
        this.e = null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public aqjb(int r9, double r10, double r12, double r14, double r16) {
        /*
            r8 = this;
            r0 = r9
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 != r3) goto L_0x0008
            r4 = 1
            goto L_0x000d
        L_0x0008:
            if (r0 != r2) goto L_0x000c
            r4 = 1
            goto L_0x000d
        L_0x000c:
            r4 = 0
        L_0x000d:
            r5 = 3
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r6[r1] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r6[r3] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r6[r2] = r7
            java.lang.String r7 = "Position EvidenceType must be one of [%s,%s], but was %s!"
            defpackage.ativ.a(r4, r7, r6)
            aqja r4 = b(r5)
            r5 = r12
            r4.a(r1, r12)
            r5 = r14
            r4.a(r3, r14)
            r5 = r16
            r4.a(r2, r5)
            r1 = r8
            r2 = r10
            r8.<init>((int) r9, (double) r10, (defpackage.aqja) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqjb.<init>(int, double, double, double, double):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public aqjb(int r12, double r13, double r15, double r17, double r19, byte[] r21) {
        /*
            r11 = this;
            r0 = r12
            r1 = 105(0x69, float:1.47E-43)
            r2 = 104(0x68, float:1.46E-43)
            r3 = 103(0x67, float:1.44E-43)
            r4 = 102(0x66, float:1.43E-43)
            r5 = 101(0x65, float:1.42E-43)
            r6 = 100
            r7 = 0
            r8 = 1
            if (r0 != r6) goto L_0x0013
            r9 = 1
            goto L_0x0023
        L_0x0013:
            if (r0 != r5) goto L_0x0017
        L_0x0015:
            r9 = 1
            goto L_0x0023
        L_0x0017:
            if (r0 != r4) goto L_0x001a
            goto L_0x0015
        L_0x001a:
            if (r0 != r3) goto L_0x001d
            goto L_0x0015
        L_0x001d:
            if (r0 != r2) goto L_0x0020
            goto L_0x0015
        L_0x0020:
            if (r0 == r1) goto L_0x0015
            r9 = 0
        L_0x0023:
            r10 = 7
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r10[r7] = r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r10[r8] = r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 2
            r10[r5] = r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 3
            r10[r4] = r3
            r3 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r10[r3] = r2
            r2 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10[r2] = r1
            r1 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r10[r1] = r2
            java.lang.String r1 = "Position EvidenceType must be one of [%s,%s,%s,%s,%s,%s], but was %s!"
            defpackage.ativ.a(r9, r1, r10)
            aqja r1 = b(r4)
            r2 = r15
            r1.a(r7, r2)
            r2 = r17
            r1.a(r8, r2)
            r2 = r19
            r1.a(r5, r2)
            r2 = r11
            r3 = r13
            r11.<init>((int) r12, (double) r13, (defpackage.aqja) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqjb.<init>(int, double, double, double, double, byte[]):void");
    }

    public aqjb(int i, double d2, aqja aqja) {
        this.c = i;
        ativ.a((Object) aqja, (Object) "arrayBuilder must not be null, use alternative constructor.");
        this.d = d2;
        this.e = aqja.a();
    }

    public aqjb(int i, double d2, double[] dArr) {
        this.c = i;
        this.d = d2;
        this.e = dArr;
    }
}
