package defpackage;

import android.content.Context;

/* renamed from: git  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class git extends ijj {
    private static final iwd a = ehv.a("AuthManaged", "PackageIconLoader");
    private final String b;

    public git(Context context, String str) {
        super(context);
        this.b = str;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [android.graphics.Bitmap] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object loadInBackground() {
        /*
            r7 = this;
            iwd r0 = a
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "loadInBackground"
            r0.c(r3, r2)
            r0 = 0
            android.content.Context r2 = r7.getContext()     // Catch:{ IOException -> 0x006a, all -> 0x0068 }
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ IOException -> 0x006a, all -> 0x0068 }
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()     // Catch:{ IOException -> 0x006a, all -> 0x0068 }
            float r2 = r2.density     // Catch:{ IOException -> 0x006a, all -> 0x0068 }
            r3 = 1110441984(0x42300000, float:44.0)
            float r2 = r2 * r3
            int r2 = (int) r2     // Catch:{ IOException -> 0x006a, all -> 0x0068 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x006a, all -> 0x0068 }
            r4 = 13
            r3.<init>(r4)     // Catch:{ IOException -> 0x006a, all -> 0x0068 }
            java.lang.String r4 = "=s"
            r3.append(r4)     // Catch:{ IOException -> 0x006a, all -> 0x0068 }
            r3.append(r2)     // Catch:{ IOException -> 0x006a, all -> 0x0068 }
            java.lang.String r2 = r3.toString()     // Catch:{ IOException -> 0x006a, all -> 0x0068 }
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x006a, all -> 0x0068 }
            java.net.URL r4 = new java.net.URL     // Catch:{ IOException -> 0x006a, all -> 0x0068 }
            java.lang.String r5 = r7.b     // Catch:{ IOException -> 0x006a, all -> 0x0068 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x006a, all -> 0x0068 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x006a, all -> 0x0068 }
            int r6 = r2.length()     // Catch:{ IOException -> 0x006a, all -> 0x0068 }
            if (r6 != 0) goto L_0x004b
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x006a, all -> 0x0068 }
            r2.<init>(r5)     // Catch:{ IOException -> 0x006a, all -> 0x0068 }
            goto L_0x004f
        L_0x004b:
            java.lang.String r2 = r5.concat(r2)     // Catch:{ IOException -> 0x006a, all -> 0x0068 }
        L_0x004f:
            r4.<init>(r2)     // Catch:{ IOException -> 0x006a, all -> 0x0068 }
            java.io.InputStream r2 = r4.openStream()     // Catch:{ IOException -> 0x006a, all -> 0x0068 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x006a, all -> 0x0068 }
            byte[] r2 = defpackage.jlf.a(r3)     // Catch:{ IOException -> 0x0066 }
            int r4 = r2.length     // Catch:{ IOException -> 0x0066 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r2, r1, r4)     // Catch:{ IOException -> 0x0066 }
            defpackage.jjt.a((java.io.Closeable) r3)
            goto L_0x0077
        L_0x0066:
            r2 = move-exception
            goto L_0x006c
        L_0x0068:
            r1 = move-exception
            goto L_0x007f
        L_0x006a:
            r2 = move-exception
            r3 = r0
        L_0x006c:
            iwd r4 = a     // Catch:{ all -> 0x007c }
            java.lang.String r5 = "Couldn't load app icon."
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x007c }
            r4.d(r5, r2, r1)     // Catch:{ all -> 0x007c }
            if (r3 != 0) goto L_0x0078
        L_0x0077:
            return r0
        L_0x0078:
            defpackage.jjt.a((java.io.Closeable) r3)
            return r0
        L_0x007c:
            r0 = move-exception
            r1 = r0
            r0 = r3
        L_0x007f:
            if (r0 == 0) goto L_0x0084
            defpackage.jjt.a((java.io.Closeable) r0)
        L_0x0084:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.git.loadInBackground():java.lang.Object");
    }
}
