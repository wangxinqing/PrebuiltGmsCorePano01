package androidx.slice;

import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class SliceParcelizer {
    /* JADX WARNING: type inference failed for: r3v7, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.slice.Slice read(defpackage.atl r8) {
        /*
            androidx.slice.Slice r0 = new androidx.slice.Slice
            r0.<init>()
            androidx.slice.SliceSpec r1 = r0.c
            r2 = 1
            atq r1 = r8.b((defpackage.atq) r1, (int) r2)
            androidx.slice.SliceSpec r1 = (androidx.slice.SliceSpec) r1
            r0.c = r1
            androidx.slice.SliceItem[] r1 = r0.d
            r3 = 2
            java.lang.Object[] r1 = r8.b((java.lang.Object[]) r1, (int) r3)
            androidx.slice.SliceItem[] r1 = (androidx.slice.SliceItem[]) r1
            r0.d = r1
            java.lang.String[] r1 = r0.e
            r3 = 3
            java.lang.Object[] r1 = r8.b((java.lang.Object[]) r1, (int) r3)
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0.e = r1
            java.lang.String r1 = r0.f
            r3 = 4
            java.lang.String r8 = r8.b((java.lang.String) r1, (int) r3)
            r0.f = r8
            androidx.slice.SliceItem[] r8 = r0.d
            int r8 = r8.length
            int r8 = r8 + -1
        L_0x0034:
            if (r8 < 0) goto L_0x0084
            androidx.slice.SliceItem[] r1 = r0.d
            r3 = r1[r8]
            java.lang.Object r4 = r3.d
            if (r4 == 0) goto L_0x003f
            goto L_0x0081
        L_0x003f:
            r4 = 0
            if (r1 == 0) goto L_0x0074
            boolean r5 = defpackage.anq.a(r1, r3)
            if (r5 == 0) goto L_0x0074
            int r5 = r1.length
            r6 = 0
        L_0x004a:
            if (r6 >= r5) goto L_0x0074
            r7 = r1[r6]
            boolean r7 = defpackage.op.a(r7, r3)
            if (r7 != 0) goto L_0x0057
            int r6 = r6 + 1
            goto L_0x004a
        L_0x0057:
            if (r5 == r2) goto L_0x0072
            java.lang.Class<androidx.slice.SliceItem> r3 = androidx.slice.SliceItem.class
            int r7 = r5 + -1
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r7)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            java.lang.System.arraycopy(r1, r4, r3, r4, r6)
            int r7 = r6 + 1
            int r5 = r5 - r6
            int r5 = r5 + -1
            java.lang.System.arraycopy(r1, r7, r3, r6, r5)
            r1 = r3
            goto L_0x0075
        L_0x0072:
            r1 = 0
            goto L_0x0075
        L_0x0074:
        L_0x0075:
            androidx.slice.SliceItem[] r1 = (androidx.slice.SliceItem[]) r1
            r0.d = r1
            androidx.slice.SliceItem[] r1 = r0.d
            if (r1 != 0) goto L_0x0081
            androidx.slice.SliceItem[] r1 = new androidx.slice.SliceItem[r4]
            r0.d = r1
        L_0x0081:
            int r8 = r8 + -1
            goto L_0x0034
        L_0x0084:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slice.SliceParcelizer.read(atl):androidx.slice.Slice");
    }

    public static void write(Slice slice, atl atl) {
        atl.a(true, false);
        atl.a();
        SliceSpec sliceSpec = slice.c;
        if (sliceSpec != null) {
            atl.a((atq) sliceSpec, 1);
        }
        if (!Arrays.equals(Slice.b, slice.d)) {
            atl.a((Object[]) slice.d, 2);
        }
        if (!Arrays.equals(Slice.a, slice.e)) {
            atl.a((Object[]) slice.e, 3);
        }
        String str = slice.f;
        if (str != null) {
            atl.a(str, 4);
        }
    }
}
