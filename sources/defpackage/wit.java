package defpackage;

import android.content.Context;
import android.net.Uri;

/* renamed from: wit  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wit extends jfx {
    private final Context a;
    private final wis e;
    private final Uri f;
    private final int g;
    private final int h;

    public wit(Context context, wis wis, Uri uri, int i, int i2) {
        super(9);
        this.e = wis;
        this.a = context;
        this.f = uri;
        this.g = i;
        this.h = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a A[Catch:{ IOException | SecurityException -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            android.content.Context r0 = r1.a
            android.net.Uri r2 = r1.f
            int r3 = r1.g
            int r4 = r1.h
            r5 = 0
            r6 = 1
            java.io.InputStream r7 = defpackage.agyz.a((android.content.Context) r0, (android.net.Uri) r2)     // Catch:{ IOException -> 0x006f, SecurityException -> 0x006d }
            android.graphics.BitmapFactory$Options r8 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x006f, SecurityException -> 0x006d }
            r8.<init>()     // Catch:{ IOException -> 0x006f, SecurityException -> 0x006d }
            r8.inJustDecodeBounds = r6     // Catch:{ IOException -> 0x006f, SecurityException -> 0x006d }
            android.graphics.Rect r9 = new android.graphics.Rect     // Catch:{ IOException -> 0x006f, SecurityException -> 0x006d }
            r9.<init>()     // Catch:{ IOException -> 0x006f, SecurityException -> 0x006d }
            if (r7 != 0) goto L_0x001f
            goto L_0x0025
        L_0x001f:
            android.graphics.BitmapFactory.decodeStream(r7, r9, r8)     // Catch:{ IOException -> 0x006f, SecurityException -> 0x006d }
            r7.close()     // Catch:{ IOException -> 0x006f, SecurityException -> 0x006d }
        L_0x0025:
            int r7 = r8.outHeight     // Catch:{ IOException -> 0x006f, SecurityException -> 0x006d }
            int r10 = r8.outWidth     // Catch:{ IOException -> 0x006f, SecurityException -> 0x006d }
            if (r7 <= r4) goto L_0x002c
            goto L_0x0030
        L_0x002c:
            if (r10 > r3) goto L_0x0030
            r11 = 1
            goto L_0x003f
        L_0x0030:
            int r7 = r7 / 2
            int r10 = r10 / 2
            r11 = 1
        L_0x0035:
            int r12 = r7 / r11
            if (r12 < r4) goto L_0x003f
            int r12 = r10 / r11
            if (r12 < r3) goto L_0x003f
            int r11 = r11 + r11
            goto L_0x0035
        L_0x003f:
            r8.inSampleSize = r11     // Catch:{ IOException -> 0x006f, SecurityException -> 0x006d }
            r3 = 0
            r8.inJustDecodeBounds = r3     // Catch:{ IOException -> 0x006f, SecurityException -> 0x006d }
            java.io.InputStream r3 = defpackage.agyz.a((android.content.Context) r0, (android.net.Uri) r2)     // Catch:{ IOException -> 0x006f, SecurityException -> 0x006d }
            if (r3 == 0) goto L_0x006c
            android.graphics.Matrix r15 = defpackage.wiv.a(r0, r2)     // Catch:{ IOException -> 0x006f, SecurityException -> 0x006d }
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeStream(r3, r9, r8)     // Catch:{ IOException -> 0x006f, SecurityException -> 0x006d }
            if (r10 == 0) goto L_0x006c
            r11 = 0
            r12 = 0
            int r13 = r10.getWidth()     // Catch:{ IOException -> 0x006f, SecurityException -> 0x006d }
            int r14 = r10.getHeight()     // Catch:{ IOException -> 0x006f, SecurityException -> 0x006d }
            r16 = 1
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ IOException -> 0x006f, SecurityException -> 0x006d }
            r3.close()     // Catch:{ IOException -> 0x006a, SecurityException -> 0x0068 }
            goto L_0x0080
        L_0x0068:
            r0 = move-exception
            goto L_0x0070
        L_0x006a:
            r0 = move-exception
            goto L_0x0070
        L_0x006c:
            goto L_0x0080
        L_0x006d:
            r0 = move-exception
            goto L_0x0070
        L_0x006f:
            r0 = move-exception
        L_0x0070:
            jjg r3 = defpackage.vvj.a
            anie r3 = r3.c()
            anih r3 = (defpackage.anih) r3
            r3.a((java.lang.Throwable) r0)
            java.lang.String r0 = "Failed to decode uri %s "
            r3.a((java.lang.String) r0, (java.lang.Object) r2)
        L_0x0080:
            if (r5 == 0) goto L_0x0090
            android.os.Message r0 = android.os.Message.obtain()
            r0.what = r6
            r0.obj = r5
            wis r2 = r1.e
            r2.sendMessage(r0)
            return
        L_0x0090:
            jjg r0 = defpackage.vvj.a
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            android.net.Uri r2 = r1.f
            java.lang.String r3 = "Failed load bitmap from uri %s "
            r0.a((java.lang.String) r3, (java.lang.Object) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wit.run():void");
    }
}
