package defpackage;

import com.android.volley.toolbox.ImageRequest;

/* renamed from: aias  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aias {
    private static final int a = aell.b(180.0d);
    private static final int b = aell.b(90.0d);

    public static int a(int i) {
        return i / ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r3.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(defpackage.aibe r3) {
        /*
            int r0 = r3.d
            r1 = 0
            r2 = 10000000(0x989680, float:1.4012985E-38)
            if (r0 > r2) goto L_0x002c
            int r0 = r3.b
            if (r0 != 0) goto L_0x0012
            int r2 = r3.c
            if (r2 == 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            return r1
        L_0x0012:
            int r2 = b
            if (r0 > r2) goto L_0x002c
            int r0 = r3.b
            int r2 = b
            int r2 = -r2
            if (r0 < r2) goto L_0x002c
            int r0 = r3.c
            int r2 = a
            if (r0 > r2) goto L_0x002c
            int r3 = r3.c
            int r0 = a
            int r0 = -r0
            if (r3 < r0) goto L_0x002c
            r3 = 1
            return r3
        L_0x002c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aias.a(aibe):boolean");
    }

    public static int b(int i) {
        if (i <= 2147483) {
            return i * ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
        }
        return Integer.MAX_VALUE;
    }

    public static int a(aibe aibe, aibe aibe2) {
        return (int) Math.round(aell.a(aibe.b, aibe.c, aibe2.b, aibe2.c));
    }
}
