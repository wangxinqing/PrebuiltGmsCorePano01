package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;

/* renamed from: ajym  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajym {
    public static ColorStateList a(Context context, aev aev, int i) {
        int f;
        ColorStateList a;
        if (aev.f(i) && (f = aev.f(i, 0)) != 0 && (a = uj.a(context, f)) != null) {
            return a;
        }
        int i2 = Build.VERSION.SDK_INT;
        return aev.e(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = defpackage.uj.b(r1, (r0 = r2.getResourceId(r3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable b(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
        /*
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L_0x0015
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L_0x0015
            android.graphics.drawable.Drawable r1 = defpackage.uj.b(r1, r0)
            if (r1 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            return r1
        L_0x0015:
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajym.b(android.content.Context, android.content.res.TypedArray, int):android.graphics.drawable.Drawable");
    }

    public static ColorStateList a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList a;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (a = uj.a(context, resourceId)) != null) {
            return a;
        }
        int i2 = Build.VERSION.SDK_INT;
        return typedArray.getColorStateList(i);
    }
}
