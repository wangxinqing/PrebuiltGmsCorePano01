package defpackage;

import java.util.Arrays;

/* renamed from: ahot  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahot {
    private static final ahmn[] a = {ahmn.STILL, ahmn.WALKING, ahmn.RUNNING, ahmn.ON_BICYCLE, ahmn.IN_VEHICLE, ahmn.UNKNOWN};
    private final ahos[] b;
    private final float c;

    public ahot(ahos[] ahosArr, float f) {
        this.b = ahosArr;
        this.c = f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: ahos} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: ahos} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: ahos} */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00bb, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List a(java.util.List r18, defpackage.ahmm r19, java.util.List r20) {
        /*
            boolean r0 = r20.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x010e
            ahmn[] r0 = a
            int r2 = r0.length
            r3 = 0
            r5 = r1
            r4 = 0
            r6 = 0
        L_0x000e:
            if (r4 >= r2) goto L_0x002d
            r7 = r0[r4]
            r8 = r18
            int r9 = defpackage.ahmo.a(r8, r7)
            r10 = 50
            if (r9 <= r10) goto L_0x0022
            ahmo r0 = new ahmo
            r0.<init>(r7, r9)
            goto L_0x0032
        L_0x0022:
            if (r9 > r6) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r5 = r7
        L_0x0026:
            if (r9 > r6) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r6 = r9
        L_0x002a:
            int r4 = r4 + 1
            goto L_0x000e
        L_0x002d:
            ahmo r0 = new ahmo
            r0.<init>(r5, r6)
        L_0x0032:
            ahmn r0 = r0.a
            ahmn r2 = defpackage.ahmn.ON_BICYCLE
            if (r0 == r2) goto L_0x004a
            ayee r2 = defpackage.ayee.a
            ayef r2 = r2.a()
            boolean r2 = r2.applyActivityPersonalizationForWalking()
            if (r2 == 0) goto L_0x0049
            ahmn r2 = defpackage.ahmn.WALKING
            if (r0 != r2) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            return r1
        L_0x004a:
            int r0 = r20.size()
            r2 = 0
        L_0x004f:
            if (r2 >= r0) goto L_0x010c
            r4 = r20
            java.lang.Object r5 = r4.get(r2)
            ahot r5 = (defpackage.ahot) r5
            ahos[] r6 = r5.b
            int r7 = r6.length
            if (r7 <= 0) goto L_0x006c
            r6 = r6[r3]
            float[] r6 = r6.a
            int r6 = r6.length
            float[] r7 = r19.a()
            int r7 = r7.length
            if (r6 != r7) goto L_0x006b
            goto L_0x006c
        L_0x006b:
            return r1
        L_0x006c:
            float[] r6 = r19.a()
            float r7 = r5.c
            double r7 = (double) r7
            defpackage.ahmh.e(r6)
            ahos[] r5 = r5.b
            int r9 = r5.length
            r11 = r1
            r10 = 0
        L_0x007b:
            if (r10 >= r9) goto L_0x00c2
            r12 = r5[r10]
            r13 = 0
            r15 = 0
        L_0x0082:
            int r1 = r6.length
            if (r15 >= r1) goto L_0x009c
            r1 = r6[r15]
            float[] r3 = r12.a
            r3 = r3[r15]
            float r1 = r1 - r3
            float r1 = r1 * r1
            r18 = r0
            double r0 = (double) r1
            java.lang.Double.isNaN(r0)
            double r13 = r13 + r0
            int r15 = r15 + 1
            r0 = r18
            r1 = 0
            r3 = 0
            goto L_0x0082
        L_0x009c:
            r18 = r0
            double r0 = java.lang.Math.sqrt(r13)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x00ba
            int r3 = r12.c
            long r13 = (long) r3
            ayee r3 = defpackage.ayee.a
            ayef r3 = r3.a()
            long r16 = r3.personalizationClusterMinSize()
            int r3 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r3 < 0) goto L_0x00ba
            r7 = r0
            r11 = r12
            goto L_0x00bb
        L_0x00ba:
        L_0x00bb:
            int r10 = r10 + 1
            r0 = r18
            r1 = 0
            r3 = 0
            goto L_0x007b
        L_0x00c2:
            r18 = r0
            r0 = 100
            if (r11 == 0) goto L_0x00e7
            boolean r1 = r11.b
            if (r1 == 0) goto L_0x00e7
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            ahmo r3 = new ahmo
            ahmn r5 = defpackage.ahmn.UNKNOWN
            r3.<init>(r5, r0)
            r1.add(r3)
            ahmo r3 = new ahmo
            ahmn r5 = defpackage.ahmn.ON_BICYCLE
            r6 = 0
            r3.<init>(r5, r6)
            r1.add(r3)
            goto L_0x00e9
        L_0x00e7:
            r6 = 0
            r1 = 0
        L_0x00e9:
            if (r1 != 0) goto L_0x00ec
            goto L_0x0104
        L_0x00ec:
            int r3 = r1.size()
            r5 = 2
            if (r3 != r5) goto L_0x0104
            ahmn r3 = defpackage.ahmn.UNKNOWN
            int r3 = defpackage.ahmo.a(r1, r3)
            if (r3 != r0) goto L_0x0104
            ahmn r0 = defpackage.ahmn.ON_BICYCLE
            int r0 = defpackage.ahmo.a(r1, r0)
            if (r0 != 0) goto L_0x0104
            return r1
        L_0x0104:
            int r2 = r2 + 1
            r0 = r18
            r1 = 0
            r3 = 0
            goto L_0x004f
        L_0x010c:
            r0 = 0
            return r0
        L_0x010e:
            r0 = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahot.a(java.util.List, ahmm, java.util.List):java.util.List");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ahot) {
            ahot ahot = (ahot) obj;
            return Arrays.equals(this.b, ahot.b) && this.c == ahot.c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.b)), Float.valueOf(this.c)});
    }

    public final String toString() {
        String arrays = Arrays.toString(this.b);
        float f = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 91);
        sb.append("ActivityPersonalizationFeatureBasedModel clusters: ");
        sb.append(arrays);
        sb.append("; maxDistanceToCentroid: ");
        sb.append(f);
        return sb.toString();
    }
}
