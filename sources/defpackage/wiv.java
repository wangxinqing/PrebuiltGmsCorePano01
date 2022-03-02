package defpackage;

import android.content.Context;

/* renamed from: wiv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wiv {
    public static wiv a;
    public final Context b;

    public wiv(Context context) {
        this.b = context.getApplicationContext();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r5.b() == false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Matrix a(android.content.Context r4, android.net.Uri r5) {
        /*
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            java.io.InputStream r4 = defpackage.agyz.a((android.content.Context) r4, (android.net.Uri) r5)     // Catch:{ IOException -> 0x0052, AssertionError -> 0x0050 }
            if (r4 != 0) goto L_0x0019
            jjg r4 = defpackage.vvj.a     // Catch:{ IOException -> 0x0052, AssertionError -> 0x0050 }
            anie r4 = r4.c()     // Catch:{ IOException -> 0x0052, AssertionError -> 0x0050 }
            anih r4 = (defpackage.anih) r4     // Catch:{ IOException -> 0x0052, AssertionError -> 0x0050 }
            java.lang.String r1 = "Failed to openInputStream with uri %s"
            r4.a((java.lang.String) r1, (java.lang.Object) r5)     // Catch:{ IOException -> 0x0052, AssertionError -> 0x0050 }
            return r0
        L_0x0019:
            wiq r5 = new wiq     // Catch:{ IOException -> 0x0052, AssertionError -> 0x0050 }
            aio r1 = new aio     // Catch:{ IOException -> 0x0052, AssertionError -> 0x0050 }
            r1.<init>((java.io.InputStream) r4)     // Catch:{ IOException -> 0x0052, AssertionError -> 0x0050 }
            r5.<init>(r1)     // Catch:{ IOException -> 0x0052, AssertionError -> 0x0050 }
            int r1 = r5.a()     // Catch:{ IOException -> 0x0052, AssertionError -> 0x0050 }
            r2 = 180(0xb4, float:2.52E-43)
            if (r1 == r2) goto L_0x002c
            goto L_0x0032
        L_0x002c:
            boolean r2 = r5.b()     // Catch:{ IOException -> 0x0052, AssertionError -> 0x0050 }
            if (r2 != 0) goto L_0x0036
        L_0x0032:
            float r1 = (float) r1     // Catch:{ IOException -> 0x0052, AssertionError -> 0x0050 }
            r0.postRotate(r1)     // Catch:{ IOException -> 0x0052, AssertionError -> 0x0050 }
        L_0x0036:
            boolean r1 = r5.c()     // Catch:{ IOException -> 0x0052, AssertionError -> 0x0050 }
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 == 0) goto L_0x0043
            r0.postScale(r3, r2)     // Catch:{ IOException -> 0x0052, AssertionError -> 0x0050 }
        L_0x0043:
            boolean r5 = r5.b()     // Catch:{ IOException -> 0x0052, AssertionError -> 0x0050 }
            if (r5 == 0) goto L_0x004c
            r0.postScale(r2, r3)     // Catch:{ IOException -> 0x0052, AssertionError -> 0x0050 }
        L_0x004c:
            r4.close()     // Catch:{ IOException -> 0x0052, AssertionError -> 0x0050 }
            goto L_0x0063
        L_0x0050:
            r4 = move-exception
            goto L_0x0053
        L_0x0052:
            r4 = move-exception
        L_0x0053:
            jjg r5 = defpackage.vvj.a
            anie r5 = r5.c()
            anih r5 = (defpackage.anih) r5
            r5.a((java.lang.Throwable) r4)
            java.lang.String r4 = "Failed to get Exif from inputStream."
            r5.a((java.lang.String) r4)
        L_0x0063:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wiv.a(android.content.Context, android.net.Uri):android.graphics.Matrix");
    }
}
