package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;

/* renamed from: ajyu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajyu {
    public static final boolean a = true;
    static final String b = ajyu.class.getSimpleName();
    private static final int[] c = {16842919};
    private static final int[] d = {16843623, 16842908};
    private static final int[] e = {16842908};
    private static final int[] f = {16843623};
    private static final int[] g = {16842913, 16842919};
    private static final int[] h = {16842913, 16843623, 16842908};
    private static final int[] i = {16842913, 16842908};
    private static final int[] j = {16842913, 16843623};
    private static final int[] k = {16842913};
    private static final int[] l = {16842910, 16842919};

    static {
        int i2 = Build.VERSION.SDK_INT;
    }

    private ajyu() {
    }

    private static int a(ColorStateList colorStateList, int[] iArr) {
        int i2;
        if (colorStateList != null) {
            i2 = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i2 = 0;
        }
        if (!a) {
            return i2;
        }
        int alpha = Color.alpha(i2);
        return lk.b(i2, Math.min(alpha + alpha, 255));
    }

    public static ColorStateList b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT >= 22 && Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(l, 0)) != 0) {
            Log.w(b, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        if (!a) {
            int[] iArr = g;
            int[] iArr2 = h;
            int[] iArr3 = i;
            int[] iArr4 = j;
            int[] iArr5 = c;
            int[] iArr6 = d;
            int[] iArr7 = e;
            int[] iArr8 = f;
            return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, k, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{a(colorStateList, iArr), a(colorStateList, iArr2), a(colorStateList, iArr3), a(colorStateList, iArr4), 0, a(colorStateList, iArr5), a(colorStateList, iArr6), a(colorStateList, iArr7), a(colorStateList, iArr8), 0});
        }
        return new ColorStateList(new int[][]{k, StateSet.NOTHING}, new int[]{a(colorStateList, g), a(colorStateList, c)});
    }

    public static boolean a(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i2 : iArr) {
            if (i2 == 16842910) {
                z = true;
            } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
