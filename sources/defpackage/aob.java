package defpackage;

import android.content.Context;

/* renamed from: aob  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aob implements anu {
    final /* synthetic */ Context a;
    final /* synthetic */ aoc b;

    public aob(Context context, aoc aoc) {
        this.a = context;
        this.b = aoc;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(androidx.slice.SliceItemHolder r10, java.lang.String r11) {
        /*
            r9 = this;
            android.content.Context r0 = r9.a
            aoc r1 = r9.b
            int r2 = r11.hashCode()
            r3 = -1422950858(0xffffffffab2f7e36, float:-6.234764E-13)
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == r3) goto L_0x002f
            r3 = 100313435(0x5faa95b, float:2.3572098E-35)
            if (r2 == r3) goto L_0x0025
            r3 = 100358090(0x5fb57ca, float:2.3636175E-35)
            if (r2 == r3) goto L_0x001b
            goto L_0x0039
        L_0x001b:
            java.lang.String r2 = "input"
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L_0x0039
            r11 = 1
            goto L_0x003a
        L_0x0025:
            java.lang.String r2 = "image"
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L_0x0039
            r11 = 0
            goto L_0x003a
        L_0x002f:
            java.lang.String r2 = "action"
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L_0x0039
            r11 = 2
            goto L_0x003a
        L_0x0039:
            r11 = -1
        L_0x003a:
            r2 = 0
            if (r11 == 0) goto L_0x0063
            java.lang.String r0 = "Cannot serialize action"
            if (r11 == r6) goto L_0x0056
            if (r11 == r5) goto L_0x0044
            return
        L_0x0044:
            int r11 = r1.a
            if (r11 == 0) goto L_0x0050
            if (r11 == r6) goto L_0x004d
            r10.d = r2
            return
        L_0x004d:
            r10.c = r2
            return
        L_0x0050:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r0)
            throw r10
        L_0x0056:
            int r11 = r1.a
            if (r11 == 0) goto L_0x005d
            r10.d = r2
            return
        L_0x005d:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r0)
            throw r10
        L_0x0063:
            int r11 = r1.b
            if (r11 == 0) goto L_0x01c5
            if (r11 == r6) goto L_0x01c2
            atq r11 = r10.c
            android.support.v4.graphics.drawable.IconCompat r11 = (android.support.v4.graphics.drawable.IconCompat) r11
            int r3 = r11.a()
            if (r3 == r5) goto L_0x01be
            r11.b((android.content.Context) r0)
            int r3 = android.os.Build.VERSION.SDK_INT
            r7 = 23
            if (r3 < r7) goto L_0x0086
            android.graphics.drawable.Icon r11 = r11.a((android.content.Context) r0)
            android.graphics.drawable.Drawable r11 = r11.loadDrawable(r0)
            goto L_0x0162
        L_0x0086:
            int r3 = r11.a
            switch(r3) {
                case 1: goto L_0x013b;
                case 2: goto L_0x0103;
                case 3: goto L_0x00eb;
                case 4: goto L_0x00d6;
                case 5: goto L_0x00c3;
                case 6: goto L_0x008d;
                default: goto L_0x008b;
            }
        L_0x008b:
            goto L_0x0148
        L_0x008d:
            java.io.InputStream r3 = r11.c((android.content.Context) r0)
            if (r3 == 0) goto L_0x00c1
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 26
            if (r5 < r6) goto L_0x00ae
            android.graphics.drawable.AdaptiveIconDrawable r5 = new android.graphics.drawable.AdaptiveIconDrawable
            android.graphics.drawable.BitmapDrawable r6 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r3)
            r6.<init>(r0, r3)
            r5.<init>(r2, r6)
            r2 = r5
            goto L_0x0148
        L_0x00ae:
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r3)
            android.graphics.Bitmap r3 = android.support.v4.graphics.drawable.IconCompat.b((android.graphics.Bitmap) r3)
            r2.<init>(r0, r3)
            goto L_0x0148
        L_0x00c1:
            goto L_0x0148
        L_0x00c3:
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r0 = r0.getResources()
            java.lang.Object r3 = r11.b
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            android.graphics.Bitmap r3 = android.support.v4.graphics.drawable.IconCompat.b((android.graphics.Bitmap) r3)
            r2.<init>(r0, r3)
            goto L_0x0148
        L_0x00d6:
            java.io.InputStream r3 = r11.c((android.content.Context) r0)
            if (r3 == 0) goto L_0x00ea
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r3)
            r2.<init>(r0, r3)
            goto L_0x0148
        L_0x00ea:
            goto L_0x0148
        L_0x00eb:
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r0 = r0.getResources()
            java.lang.Object r3 = r11.b
            byte[] r3 = (byte[]) r3
            byte[] r3 = (byte[]) r3
            int r5 = r11.e
            int r6 = r11.f
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeByteArray(r3, r5, r6)
            r2.<init>(r0, r3)
            goto L_0x0148
        L_0x0103:
            java.lang.String r3 = r11.b()
            boolean r7 = android.text.TextUtils.isEmpty(r3)
            if (r7 == 0) goto L_0x0111
            java.lang.String r3 = r0.getPackageName()
        L_0x0111:
            android.content.res.Resources r3 = android.support.v4.graphics.drawable.IconCompat.a((android.content.Context) r0, (java.lang.String) r3)
            int r7 = r11.e     // Catch:{ RuntimeException -> 0x0120 }
            android.content.res.Resources$Theme r0 = r0.getTheme()     // Catch:{ RuntimeException -> 0x0120 }
            android.graphics.drawable.Drawable r2 = defpackage.li.a(r3, r7, r0)     // Catch:{ RuntimeException -> 0x0120 }
            goto L_0x0148
        L_0x0120:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r5]
            int r5 = r11.e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r4] = r5
            java.lang.Object r5 = r11.b
            r3[r6] = r5
            java.lang.String r5 = "Unable to load resource 0x%08x from pkg=%s"
            java.lang.String r3 = java.lang.String.format(r5, r3)
            java.lang.String r5 = "IconCompat"
            android.util.Log.e(r5, r3, r0)
            goto L_0x0148
        L_0x013b:
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r0 = r0.getResources()
            java.lang.Object r3 = r11.b
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            r2.<init>(r0, r3)
        L_0x0148:
            if (r2 == 0) goto L_0x0161
            android.content.res.ColorStateList r0 = r11.g
            if (r0 != 0) goto L_0x0154
            android.graphics.PorterDuff$Mode r0 = r11.i
            android.graphics.PorterDuff$Mode r3 = android.support.v4.graphics.drawable.IconCompat.h
            if (r0 == r3) goto L_0x0161
        L_0x0154:
            r2.mutate()
            android.content.res.ColorStateList r0 = r11.g
            defpackage.ma.a((android.graphics.drawable.Drawable) r2, (android.content.res.ColorStateList) r0)
            android.graphics.PorterDuff$Mode r11 = r11.i
            defpackage.ma.a((android.graphics.drawable.Drawable) r2, (android.graphics.PorterDuff.Mode) r11)
        L_0x0161:
            r11 = r2
        L_0x0162:
            int r0 = r11.getIntrinsicWidth()
            int r2 = r11.getIntrinsicHeight()
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r0 <= r3) goto L_0x017c
            int r2 = r2 * 1000
            double r5 = (double) r2
            double r7 = (double) r0
            java.lang.Double.isNaN(r5)
            java.lang.Double.isNaN(r7)
            double r5 = r5 / r7
            int r2 = (int) r5
            r0 = 1000(0x3e8, float:1.401E-42)
        L_0x017c:
            if (r2 <= r3) goto L_0x018b
            int r0 = r0 * 1000
            double r5 = (double) r0
            double r7 = (double) r2
            java.lang.Double.isNaN(r5)
            java.lang.Double.isNaN(r7)
            double r5 = r5 / r7
            int r0 = (int) r5
            goto L_0x018c
        L_0x018b:
            r3 = r2
        L_0x018c:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r3, r2)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r0)
            int r3 = r2.getWidth()
            int r5 = r2.getHeight()
            r11.setBounds(r4, r4, r3, r5)
            r11.draw(r2)
            java.io.ByteArrayOutputStream r11 = new java.io.ByteArrayOutputStream
            r11.<init>()
            android.graphics.Bitmap$CompressFormat r1 = r1.c
            r2 = 100
            r0.compress(r1, r2, r11)
            r0.recycle()
            byte[] r11 = r11.toByteArray()
            int r0 = r11.length
            android.support.v4.graphics.drawable.IconCompat r11 = android.support.v4.graphics.drawable.IconCompat.a((byte[]) r11, (int) r0)
            goto L_0x01bf
        L_0x01be:
        L_0x01bf:
            r10.c = r11
            return
        L_0x01c2:
            r10.c = r2
            return
        L_0x01c5:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Cannot serialize icon"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aob.a(androidx.slice.SliceItemHolder, java.lang.String):void");
    }
}
