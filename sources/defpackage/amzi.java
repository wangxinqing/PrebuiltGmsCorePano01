package defpackage;

/* renamed from: amzi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amzi {
    static int a(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r0 = r0 + r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int b(int r3) {
        /*
            r0 = 2
            int r3 = java.lang.Math.max(r3, r0)
            int r0 = java.lang.Integer.highestOneBit(r3)
            double r1 = (double) r0
            int r1 = (int) r1
            if (r3 <= r1) goto L_0x0013
            int r0 = r0 + r0
            if (r0 > 0) goto L_0x0013
            r3 = 1073741824(0x40000000, float:2.0)
            return r3
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amzi.b(int):int");
    }

    static int a(Object obj) {
        return a(obj != null ? obj.hashCode() : 0);
    }
}
