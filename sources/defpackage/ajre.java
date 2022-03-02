package defpackage;

import java.io.Closeable;

/* renamed from: ajre  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajre {
    public static boolean a(Closeable closeable) {
        if (closeable == null) {
            return false;
        }
        try {
            closeable.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        if (r5 != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.io.File r7) {
        /*
            boolean r0 = r7.isDirectory()
            if (r0 != 0) goto L_0x000b
            boolean r7 = r7.delete()
            return r7
        L_0x000b:
            java.io.File[] r0 = r7.listFiles()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x002d
            int r3 = r0.length
            r4 = 0
            r5 = 1
        L_0x0016:
            if (r4 >= r3) goto L_0x002b
            r6 = r0[r4]
            if (r6 != 0) goto L_0x001d
            goto L_0x0028
        L_0x001d:
            if (r5 == 0) goto L_0x0027
            boolean r5 = a((java.io.File) r6)
            if (r5 == 0) goto L_0x0027
            r5 = 1
            goto L_0x0028
        L_0x0027:
            r5 = 0
        L_0x0028:
            int r4 = r4 + 1
            goto L_0x0016
        L_0x002b:
            if (r5 == 0) goto L_0x0034
        L_0x002d:
            boolean r7 = r7.delete()
            if (r7 == 0) goto L_0x0034
            return r2
        L_0x0034:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajre.a(java.io.File):boolean");
    }
}
