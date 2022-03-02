package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: rg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rg {
    public static Interpolator a(float f, float f2, float f3, float f4) {
        int i = Build.VERSION.SDK_INT;
        return new PathInterpolator(f, f2, f3, f4);
    }
}
