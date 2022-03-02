package defpackage;

import java.util.ArrayList;

/* renamed from: lo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lo {
    private static void a(ArrayList arrayList, char c, float[] fArr) {
        arrayList.add(new ln(c, fArr));
    }

    public static boolean a(ln[] lnVarArr, ln[] lnVarArr2) {
        if (lnVarArr == null || lnVarArr2 == null || lnVarArr.length != lnVarArr2.length) {
            return false;
        }
        for (int i = 0; i < lnVarArr.length; i++) {
            ln lnVar = lnVarArr[i];
            char c = lnVar.a;
            ln lnVar2 = lnVarArr2[i];
            if (c != lnVar2.a || lnVar.b.length != lnVar2.b.length) {
                return false;
            }
        }
        return true;
    }

    static float[] a(float[] fArr, int i) {
        if (i >= 0) {
            int min = Math.min(i, fArr.length);
            float[] fArr2 = new float[i];
            System.arraycopy(fArr, 0, fArr2, 0, min);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0091, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0097, code lost:
        r9.a = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a8 A[Catch:{ NumberFormatException -> 0x00c6 }, LOOP:3: B:25:0x007c->B:43:0x00a8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ae A[Catch:{ NumberFormatException -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00af A[Catch:{ NumberFormatException -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ee A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ac A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ln[] a(java.lang.String r17) {
        /*
            r0 = r17
            if (r0 == 0) goto L_0x0117
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3 = 0
            r4 = 1
            r5 = 0
        L_0x000c:
            int r6 = r17.length()
            if (r4 >= r6) goto L_0x00f5
        L_0x0012:
            int r6 = r17.length()
            r7 = 69
            r8 = 101(0x65, float:1.42E-43)
            if (r4 >= r6) goto L_0x0039
            char r6 = r0.charAt(r4)
            int r9 = r6 + -65
            int r10 = r6 + -90
            int r9 = r9 * r10
            if (r9 <= 0) goto L_0x0031
            int r9 = r6 + -97
            int r10 = r6 + -122
            int r9 = r9 * r10
            if (r9 <= 0) goto L_0x0031
            goto L_0x0036
        L_0x0031:
            if (r6 == r8) goto L_0x0036
            if (r6 == r7) goto L_0x0036
            goto L_0x0039
        L_0x0036:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x0039:
            java.lang.String r5 = r0.substring(r5, r4)
            java.lang.String r5 = r5.trim()
            int r6 = r5.length()
            if (r6 > 0) goto L_0x0049
            goto L_0x00ee
        L_0x0049:
            char r6 = r5.charAt(r3)
            r9 = 122(0x7a, float:1.71E-43)
            if (r6 == r9) goto L_0x00e3
            char r6 = r5.charAt(r3)
            r9 = 90
            if (r6 != r9) goto L_0x005b
            goto L_0x00e3
        L_0x005b:
            int r6 = r5.length()     // Catch:{ NumberFormatException -> 0x00c6 }
            float[] r6 = new float[r6]     // Catch:{ NumberFormatException -> 0x00c6 }
            lm r9 = new lm     // Catch:{ NumberFormatException -> 0x00c6 }
            r9.<init>()     // Catch:{ NumberFormatException -> 0x00c6 }
            int r10 = r5.length()     // Catch:{ NumberFormatException -> 0x00c6 }
            r11 = 1
            r12 = 0
        L_0x006c:
            if (r11 < r10) goto L_0x0075
            float[] r6 = a((float[]) r6, (int) r12)     // Catch:{ NumberFormatException -> 0x00c6 }
            r2 = 0
            goto L_0x00e6
        L_0x0075:
            r9.a = r3     // Catch:{ NumberFormatException -> 0x00c6 }
            r13 = r11
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x007c:
            int r3 = r5.length()     // Catch:{ NumberFormatException -> 0x00c6 }
            if (r13 >= r3) goto L_0x00ac
            char r3 = r5.charAt(r13)     // Catch:{ NumberFormatException -> 0x00c6 }
            r2 = 32
            if (r3 == r2) goto L_0x00a3
            if (r3 == r7) goto L_0x00a1
            if (r3 == r8) goto L_0x00a1
            switch(r3) {
                case 44: goto L_0x00a3;
                case 45: goto L_0x009b;
                case 46: goto L_0x0093;
                default: goto L_0x0091;
            }     // Catch:{ NumberFormatException -> 0x00c6 }
        L_0x0091:
            r15 = 0
            goto L_0x00a6
        L_0x0093:
            if (r14 != 0) goto L_0x0097
            r14 = 1
            goto L_0x0091
        L_0x0097:
            r2 = 1
            r9.a = r2     // Catch:{ NumberFormatException -> 0x00c6 }
            goto L_0x00a3
        L_0x009b:
            if (r13 != r11) goto L_0x009e
            goto L_0x0091
        L_0x009e:
            if (r15 == 0) goto L_0x0097
            goto L_0x0091
        L_0x00a1:
            r15 = 1
            goto L_0x00a6
        L_0x00a3:
            r15 = 0
            r16 = 1
        L_0x00a6:
            if (r16 != 0) goto L_0x00ac
            int r13 = r13 + 1
            r3 = 0
            goto L_0x007c
        L_0x00ac:
            if (r11 < r13) goto L_0x00af
            goto L_0x00bc
        L_0x00af:
            int r2 = r12 + 1
            java.lang.String r3 = r5.substring(r11, r13)     // Catch:{ NumberFormatException -> 0x00c6 }
            float r3 = java.lang.Float.parseFloat(r3)     // Catch:{ NumberFormatException -> 0x00c6 }
            r6[r12] = r3     // Catch:{ NumberFormatException -> 0x00c6 }
            r12 = r2
        L_0x00bc:
            boolean r2 = r9.a     // Catch:{ NumberFormatException -> 0x00c6 }
            if (r2 != 0) goto L_0x00c3
            int r11 = r13 + 1
            goto L_0x00c4
        L_0x00c3:
            r11 = r13
        L_0x00c4:
            r3 = 0
            goto L_0x006c
        L_0x00c6:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "error in parsing \""
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = "\""
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x00e3:
            r2 = 0
            float[] r6 = new float[r2]
        L_0x00e6:
            char r3 = r5.charAt(r2)
            a(r1, r3, r6)
        L_0x00ee:
            int r2 = r4 + 1
            r5 = r4
            r3 = 0
            r4 = r2
            goto L_0x000c
        L_0x00f5:
            int r4 = r4 - r5
            r2 = 1
            if (r4 == r2) goto L_0x00fa
            goto L_0x010a
        L_0x00fa:
            int r2 = r17.length()
            if (r5 >= r2) goto L_0x010a
            char r0 = r0.charAt(r5)
            r2 = 0
            float[] r2 = new float[r2]
            a(r1, r0, r2)
        L_0x010a:
            int r0 = r1.size()
            ln[] r0 = new defpackage.ln[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            ln[] r0 = (defpackage.ln[]) r0
            return r0
        L_0x0117:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lo.a(java.lang.String):ln[]");
    }

    public static ln[] a(ln[] lnVarArr) {
        if (lnVarArr == null) {
            return null;
        }
        ln[] lnVarArr2 = new ln[lnVarArr.length];
        for (int i = 0; i < lnVarArr.length; i++) {
            lnVarArr2[i] = new ln(lnVarArr[i]);
        }
        return lnVarArr2;
    }
}
