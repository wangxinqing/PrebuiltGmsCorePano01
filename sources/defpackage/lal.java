package defpackage;

import android.graphics.Bitmap;

/* renamed from: lal  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class lal {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Bitmap.CompressFormat.values().length];
        a = iArr;
        try {
            iArr[Bitmap.CompressFormat.JPEG.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[Bitmap.CompressFormat.PNG.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[Bitmap.CompressFormat.WEBP.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
    }
}
